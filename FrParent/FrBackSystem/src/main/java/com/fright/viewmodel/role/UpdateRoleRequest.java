package com.fright.viewmodel.role;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by szty on 2018/6/21.
 */
@ApiModel
@Data
public class UpdateRoleRequest {
    @ApiModelProperty(value = "角色ID")
    @NotBlank(message = "角色ID不能为空")
    private Integer id;
    @ApiModelProperty(value = "角色名称")
    @NotBlank(message = "角色名称不能为空")
    private String roleName;
    @ApiModelProperty(value = "角色描述")
    @NotBlank(message = "角色描述不能为空")
    private String description;
}
