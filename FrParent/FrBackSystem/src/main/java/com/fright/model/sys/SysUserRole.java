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
public class SysUserRole extends BaseModel {
    @Column(name = "role_id",nullable = false)
    protected Integer roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    private SysRole role;

    @Column(name = "user_id",nullable = false)
    protected Integer userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private SysUser user;
}
