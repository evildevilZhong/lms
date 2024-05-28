package com.chung.lms.constant;


/**
 * 馆藏书籍状态枚举类
 */
public enum BookItemStatusEnum {

    AVAILABLE("AVAILABLE", "可借阅", 0),
    RESERVED("RESERVED", "已预约", 1),
    LOANED("LOANED", "已借出", 2),
    LOST("LOST", "已丢失", 3);

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

    BookItemStatusEnum(String code, String desc, Integer value) {
        this.code = code;
        this.desc = desc;
        this.value = value;
    }

}
