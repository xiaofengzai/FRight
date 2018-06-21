package com.fright.repository;

/**
 * Created by szty on 2018/6/20.
 */

import com.fright.model.sys.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Integer> {
    SysUser findByUsername(String username);
}