package com.fright.repository;

/**
 * Created by szty on 2018/6/20.
 */

import com.fright.model.sys.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysRoleRepository extends JpaRepository<SysRole, Integer> {
}