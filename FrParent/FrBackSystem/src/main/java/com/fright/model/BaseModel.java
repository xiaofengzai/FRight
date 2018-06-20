package com.fright.model;

import com.fright.model.sys.SysUser;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel extends BaseEntity {
    @Column(name = "creator_id",updatable = false,length = 36)
    @CreatedBy
    private Integer creatorId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id",insertable = false,updatable = false)
    private SysUser creator;

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public SysUser getCreator() {
        return creator;
    }

    public void setCreator(SysUser creator) {
        this.creator = creator;
        if(creator!=null){
            creatorId=creator.getId();
        }
    }
}
