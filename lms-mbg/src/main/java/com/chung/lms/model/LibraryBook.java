package com.chung.lms.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class LibraryBook implements Serializable {
    private Long id;

    @ApiModelProperty(value = "国际标准书号")
    private String isbn;

    @ApiModelProperty(value = "书名")
    private String title;

    @ApiModelProperty(value = "主题")
    private String subject;

    @ApiModelProperty(value = "出版商")
    private String publisher;

    @ApiModelProperty(value = "语言")
    private String language;

    @ApiModelProperty(value = "页数")
    private Integer numberOfPages;

    private Long authorId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", isbn=").append(isbn);
        sb.append(", title=").append(title);
        sb.append(", subject=").append(subject);
        sb.append(", publisher=").append(publisher);
        sb.append(", language=").append(language);
        sb.append(", numberOfPages=").append(numberOfPages);
        sb.append(", authorId=").append(authorId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}