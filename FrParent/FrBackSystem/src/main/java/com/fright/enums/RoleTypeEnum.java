package com.fright.enums;

import com.fr.utils.enums.EnumMessage;

/**
 * Created by szty on 2018/6/21.
 */
public enum   RoleTypeEnum implements EnumMessage<Integer> {
    SysAdmin(0,"系统管理员"),
    Admin(10,"管理员"),
    Plain(20,"普通用户");

    private Integer value;
    private String displayName;
    RoleTypeEnum(Integer value,String displayName){
        this.value = value;
        this.displayName = displayName;
    }
    @Override
    public Integer getValue() {
        return value;
    }
    @Override
    public String getDisplayName() {
        return displayName;
    }
}
