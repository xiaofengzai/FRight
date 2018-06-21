package com.fright.controller;

import com.fr.common.BusinessException;
import com.fr.utils.ApiBeanUtils;
import com.fright.common.ResultModel;
import com.fright.model.sys.SysRole;
import com.fright.service.SysRoleService;
import com.fright.viewmodel.role.AddRoleRequest;
import com.fright.viewmodel.role.UpdateRoleRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by szty on 2018/6/19.
 */
@RestController
@RequestMapping("/roles")
@Api(value = "角色管理接口")
class RoleController extends BaseController{
    @Autowired
    private SysRoleService sysRoleService;

    @ApiOperation(value = "添加角色")
    @PostMapping(value = "/add")
    public ResultModel addRole(@Validated @RequestBody AddRoleRequest request, BindingResult result) {
        if (result.hasErrors())
            return ValidateFailResult(result);
        SysRole sysRole= ApiBeanUtils.copyProperties(request,SysRole.class);
        sysRoleService.addSysRole(sysRole);
        return ResultModel.SuccessResult();
    }

    @ApiOperation(value = "删除角色")
    @PostMapping(value = "/{id}/delete")
    public ResultModel delete(@PathVariable("id") Integer id) {
        if(id==null)
            throw new BusinessException("请传有效的ID");
        sysRoleService.deleteSysRole(id);
        return ResultModel.SuccessResult();
    }

    @ApiOperation(value = "角色禁用/取消禁用")
    @PostMapping(value = "/{id}/toggle")
    public ResultModel toggle(@PathVariable("id") Integer id) {
        if(id==null)
            throw new BusinessException("请传有效的ID");
        sysRoleService.toggleSysRole(id);
        return ResultModel.SuccessResult();
    }

    @ApiOperation(value = "更新角色信息")
    @PostMapping(value = "/update")
    public ResultModel updateRole(@Validated @RequestBody UpdateRoleRequest request, BindingResult result) {
        if (result.hasErrors())
            return ValidateFailResult(result);
        sysRoleService.updateSysRole(request);
        return ResultModel.SuccessResult();
    }


}