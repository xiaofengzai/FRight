package com.fright.service;

import com.fr.common.BusinessException;
import com.fright.model.sys.SysRole;
import com.fright.repository.SysRoleRepository;
import com.fright.viewmodel.role.UpdateRoleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by szty on 2018/6/21.
 */
@Service
public class SysRoleService {
    @Autowired
    private SysRoleRepository roleRepository;

    public void addSysRole(SysRole role){
        roleRepository.save(role);
    }

    public void deleteSysRole(Integer id){
        if(!roleRepository.exists(id))
            throw new BusinessException("该角色不存在");
        roleRepository.delete(id);
    }

    public void toggleSysRole(Integer id){
        SysRole sysRole=roleRepository.findOne(id);
        sysRole.setValid(!sysRole.getValid());
        roleRepository.save(sysRole);
    }

    public void updateSysRole(UpdateRoleRequest request){
        SysRole sysRole=roleRepository.findOne(request.getId());
        if(sysRole==null)
            throw new BusinessException("该角色不存在");
        sysRole.setRoleName(request.getRoleName());
        sysRole.setDescription(request.getDescription());
        roleRepository.save(sysRole);
    }

}
