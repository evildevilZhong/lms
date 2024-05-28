package com.chung.lms.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class LibraryCheckoutHistory implements Serializable {
    private Long id;

    @ApiModelProperty(value = "借出日期")
    private Date borrowedDate;

    @ApiModelProperty(value = "借阅人会员id")
    private Long borrowMemberId;

    @ApiModelProperty(value = "藏本id")
    private Long bookItemId;

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

    public Long getBorrowMemberId() {
        return borrowMemberId;
    }

    public void setBorrowMemberId(Long borrowMemberId) {
        this.borrowMemberId = borrowMemberId;
    }

    public Long getBookItemId() {
        return bookItemId;
    }

    public void setBookItemId(Long bookItemId) {
        this.bookItemId = bookItemId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", borrowedDate=").append(borrowedDate);
        sb.append(", borrowMemberId=").append(borrowMemberId);
        sb.append(", bookItemId=").append(bookItemId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}