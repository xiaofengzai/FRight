package com.fright.model.sys;

import com.fright.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by szty on 2018/6/20.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleGroup extends BaseModel {
    @Column(name = "group_id",nullable = false)
    protected Integer groupId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", insertable = false, updatable = false)
    private SysGroup group;

    @Column(name = "role_id",nullable = false)
    protected Integer roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    private SysRole role;
}
