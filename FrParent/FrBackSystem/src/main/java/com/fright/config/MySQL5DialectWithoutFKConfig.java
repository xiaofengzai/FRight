package com.fright.config;

/**
 * Created by szty on 2018/6/20.
 */
public class MySQL5DialectWithoutFKConfig extends org.hibernate.dialect.MySQL5Dialect {
    @Override
    public String getAddForeignKeyConstraintString(String constraintName, String[] foreignKey, String referencedTable, String[] primaryKey, boolean referencesPrimaryKey) {
        return "" ;
    }
}
