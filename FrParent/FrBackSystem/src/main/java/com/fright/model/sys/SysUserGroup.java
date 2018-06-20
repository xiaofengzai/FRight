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
public class SysUserGroup extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "group_id",nullable = false)
    protected Integer groupId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", insertable = false, updatable = false)
    private SysGroup group;

    @Column(name = "user_id",nullable = false)
    protected Integer userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private SysUser user;
}
