package com.chung.lms.constant;

/**
 * 图书馆管理系统角色枚举类
 */
public enum RoleEnum {

    SUPER_ADMIN("SUPER_ADMIN", "超级管理员", 0),
    LIBRARIAN("LIBRARIAN", "图书管理员", 1),
    MEMBER("MEMBER", "图书馆会员", 2),
    SYSTEM("SYSTEM", "系统", 3);

    private String code;
    private String desc;
    private Integer value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    RoleEnum(String code, String desc, Integer value) {
        this.code = code;
        this.desc = desc;
        this.value = value;
    }

}
