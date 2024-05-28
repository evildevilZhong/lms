package com.chung.lms.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class LibraryBookItem implements Serializable {
    @ApiModelProperty(value = "书籍藏本id")
    private Long id;

    @ApiModelProperty(value = "最近被借日期")
    private Date borrowedDate;

    @ApiModelProperty(value = "租借到期日期")
    private Date dueDate;

    @ApiModelProperty(value = "书籍价格")
    private String price;

    @ApiModelProperty(value = "书籍状态")
    private String status;

    @ApiModelProperty(value = "最近借阅人id")
    private Long borrowMemberId;

    @ApiModelProperty(value = "图书二维码识别码")
    private String barcode;

    @ApiModelProperty(value = "书籍id")
    private Long libraryBookId;

    @ApiModelProperty(value = "书籍存放位置")
    private String location;

    private Long reservationMemberId;

    @ApiModelProperty(value = "预约到期时间")
    private Date reservationDueDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getBorrowMemberId() {
        return borrowMemberId;
    }

    public void setBorrowMemberId(Long borrowMemberId) {
        this.borrowMemberId = borrowMemberId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getLibraryBookId() {
        return libraryBookId;
    }

    public void setLibraryBookId(Long libraryBookId) {
        this.libraryBookId = libraryBookId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getReservationMemberId() {
        return reservationMemberId;
    }

    public void setReservationMemberId(Long reservationMemberId) {
        this.reservationMemberId = reservationMemberId;
    }

    public Date getReservationDueDate() {
        return reservationDueDate;
    }

    public void setReservationDueDate(Date reservationDueDate) {
        this.reservationDueDate = reservationDueDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", borrowedDate=").append(borrowedDate);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append(", borrowMemberId=").append(borrowMemberId);
        sb.append(", barcode=").append(barcode);
        sb.append(", libraryBookId=").append(libraryBookId);
        sb.append(", location=").append(location);
        sb.append(", reservationMemberId=").append(reservationMemberId);
        sb.append(", reservationDueDate=").append(reservationDueDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}