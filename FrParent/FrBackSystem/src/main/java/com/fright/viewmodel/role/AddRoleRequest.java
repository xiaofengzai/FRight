package com.fright.viewmodel.role;

import com.fr.utils.enums.EnumValue;
import com.fright.enums.RoleTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by szty on 2018/6/21.
 */
@ApiModel
@Data
public class AddRoleRequest {
    @ApiModelProperty(value = "角色名称")
    @NotBlank(message = "角色名称不能为空")
    private String roleName;
    @ApiModelProperty(value = "角色描述")
    @NotBlank(message = "角色描述不能为空")
    private String description;
    @ApiModelProperty(value = "角色类型(0:系统管理员,10:管理员,20:普通用户)")
    @EnumValue(enumClass = RoleTypeEnum.class)
    private Integer roleType;

}
