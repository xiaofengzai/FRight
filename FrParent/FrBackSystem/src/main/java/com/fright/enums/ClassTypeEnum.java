package com.fright.enums;

import com.fr.utils.enums.EnumMessage;

/**
 * Created by szty on 2018/6/21.
 */
public enum  ClassTypeEnum implements EnumMessage<Integer> {
    String(1,"java.lang.String"),
    Integer(2,"java.lang.Integer"),
    Long(3,"java.lang.Long")
    ;

    private Integer value;
    private String displayName;
    ClassTypeEnum(Integer value,String displayName){
        this.value = value;
        this.displayName = displayName;
    }
    @Override
    public Integer getValue() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }
}
