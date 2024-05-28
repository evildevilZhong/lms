package com.chung.lms.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class LibraryMember implements Serializable {
    private Long id;

    @ApiModelProperty(value = "账户id")
    private Long umsId;

    @ApiModelProperty(value = "会员生效时间")
    private Date dateOfMembership;

    @ApiModelProperty(value = "书籍借阅列表")
    private String booksOfCheckout;

    @ApiModelProperty(value = "会员状态")
    private Integer active;

    @ApiModelProperty(value = "会员二维码识别码")
    private String barcode;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUmsId() {
        return umsId;
    }

    public void setUmsId(Long umsId) {
        this.umsId = umsId;
    }

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public String getBooksOfCheckout() {
        return booksOfCheckout;
    }

    public void setBooksOfCheckout(String booksOfCheckout) {
        this.booksOfCheckout = booksOfCheckout;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", umsId=").append(umsId);
        sb.append(", dateOfMembership=").append(dateOfMembership);
        sb.append(", booksOfCheckout=").append(booksOfCheckout);
        sb.append(", active=").append(active);
        sb.append(", barcode=").append(barcode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}