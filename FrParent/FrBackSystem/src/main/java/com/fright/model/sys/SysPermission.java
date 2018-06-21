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
public class SysPermission extends BaseModel {

    private String url;

    private String permissionName;

    private String description;

    private Boolean valid=Boolean.TRUE;

    private Double sortOrder=0.0;
}
