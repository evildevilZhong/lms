package com.chung.lms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryBookItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LibraryBookItemExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateIsNull() {
            addCriterion("borrowed_date is null");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateIsNotNull() {
            addCriterion("borrowed_date is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateEqualTo(Date value) {
            addCriterion("borrowed_date =", value, "borrowedDate");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateNotEqualTo(Date value) {
            addCriterion("borrowed_date <>", value, "borrowedDate");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateGreaterThan(Date value) {
            addCriterion("borrowed_date >", value, "borrowedDate");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("borrowed_date >=", value, "borrowedDate");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateLessThan(Date value) {
            addCriterion("borrowed_date <", value, "borrowedDate");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateLessThanOrEqualTo(Date value) {
            addCriterion("borrowed_date <=", value, "borrowedDate");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateIn(List<Date> values) {
            addCriterion("borrowed_date in", values, "borrowedDate");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateNotIn(List<Date> values) {
            addCriterion("borrowed_date not in", values, "borrowedDate");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateBetween(Date value1, Date value2) {
            addCriterion("borrowed_date between", value1, value2, "borrowedDate");
            return (Criteria) this;
        }

        public Criteria andBorrowedDateNotBetween(Date value1, Date value2) {
            addCriterion("borrowed_date not between", value1, value2, "borrowedDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNull() {
            addCriterion("due_date is null");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNotNull() {
            addCriterion("due_date is not null");
            return (Criteria) this;
        }

        public Criteria andDueDateEqualTo(Date value) {
            addCriterion("due_date =", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotEqualTo(Date value) {
            addCriterion("due_date <>", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThan(Date value) {
            addCriterion("due_date >", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("due_date >=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThan(Date value) {
            addCriterion("due_date <", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThanOrEqualTo(Date value) {
            addCriterion("due_date <=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIn(List<Date> values) {
            addCriterion("due_date in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotIn(List<Date> values) {
            addCriterion("due_date not in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateBetween(Date value1, Date value2) {
            addCriterion("due_date between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotBetween(Date value1, Date value2) {
            addCriterion("due_date not between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdIsNull() {
            addCriterion("borrow_member_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdIsNotNull() {
            addCriterion("borrow_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdEqualTo(Long value) {
            addCriterion("borrow_member_id =", value, "borrowMemberId");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdNotEqualTo(Long value) {
            addCriterion("borrow_member_id <>", value, "borrowMemberId");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdGreaterThan(Long value) {
            addCriterion("borrow_member_id >", value, "borrowMemberId");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("borrow_member_id >=", value, "borrowMemberId");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdLessThan(Long value) {
            addCriterion("borrow_member_id <", value, "borrowMemberId");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("borrow_member_id <=", value, "borrowMemberId");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdIn(List<Long> values) {
            addCriterion("borrow_member_id in", values, "borrowMemberId");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdNotIn(List<Long> values) {
            addCriterion("borrow_member_id not in", values, "borrowMemberId");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdBetween(Long value1, Long value2) {
            addCriterion("borrow_member_id between", value1, value2, "borrowMemberId");
            return (Criteria) this;
        }

        public Criteria andBorrowMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("borrow_member_id not between", value1, value2, "borrowMemberId");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdIsNull() {
            addCriterion("library_book_id is null");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdIsNotNull() {
            addCriterion("library_book_id is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdEqualTo(Long value) {
            addCriterion("library_book_id =", value, "libraryBookId");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdNotEqualTo(Long value) {
            addCriterion("library_book_id <>", value, "libraryBookId");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdGreaterThan(Long value) {
            addCriterion("library_book_id >", value, "libraryBookId");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("library_book_id >=", value, "libraryBookId");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdLessThan(Long value) {
            addCriterion("library_book_id <", value, "libraryBookId");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdLessThanOrEqualTo(Long value) {
            addCriterion("library_book_id <=", value, "libraryBookId");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdIn(List<Long> values) {
            addCriterion("library_book_id in", values, "libraryBookId");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdNotIn(List<Long> values) {
            addCriterion("library_book_id not in", values, "libraryBookId");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdBetween(Long value1, Long value2) {
            addCriterion("library_book_id between", value1, value2, "libraryBookId");
            return (Criteria) this;
        }

        public Criteria andLibraryBookIdNotBetween(Long value1, Long value2) {
            addCriterion("library_book_id not between", value1, value2, "libraryBookId");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdIsNull() {
            addCriterion("reservation_member_id is null");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdIsNotNull() {
            addCriterion("reservation_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdEqualTo(Long value) {
            addCriterion("reservation_member_id =", value, "reservationMemberId");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdNotEqualTo(Long value) {
            addCriterion("reservation_member_id <>", value, "reservationMemberId");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdGreaterThan(Long value) {
            addCriterion("reservation_member_id >", value, "reservationMemberId");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reservation_member_id >=", value, "reservationMemberId");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdLessThan(Long value) {
            addCriterion("reservation_member_id <", value, "reservationMemberId");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("reservation_member_id <=", value, "reservationMemberId");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdIn(List<Long> values) {
            addCriterion("reservation_member_id in", values, "reservationMemberId");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdNotIn(List<Long> values) {
            addCriterion("reservation_member_id not in", values, "reservationMemberId");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdBetween(Long value1, Long value2) {
            addCriterion("reservation_member_id between", value1, value2, "reservationMemberId");
            return (Criteria) this;
        }

        public Criteria andReservationMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("reservation_member_id not between", value1, value2, "reservationMemberId");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateIsNull() {
            addCriterion("reservation_due_date is null");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateIsNotNull() {
            addCriterion("reservation_due_date is not null");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateEqualTo(Date value) {
            addCriterion("reservation_due_date =", value, "reservationDueDate");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateNotEqualTo(Date value) {
            addCriterion("reservation_due_date <>", value, "reservationDueDate");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateGreaterThan(Date value) {
            addCriterion("reservation_due_date >", value, "reservationDueDate");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("reservation_due_date >=", value, "reservationDueDate");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateLessThan(Date value) {
            addCriterion("reservation_due_date <", value, "reservationDueDate");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateLessThanOrEqualTo(Date value) {
            addCriterion("reservation_due_date <=", value, "reservationDueDate");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateIn(List<Date> values) {
            addCriterion("reservation_due_date in", values, "reservationDueDate");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateNotIn(List<Date> values) {
            addCriterion("reservation_due_date not in", values, "reservationDueDate");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateBetween(Date value1, Date value2) {
            addCriterion("reservation_due_date between", value1, value2, "reservationDueDate");
            return (Criteria) this;
        }

        public Criteria andReservationDueDateNotBetween(Date value1, Date value2) {
            addCriterion("reservation_due_date not between", value1, value2, "reservationDueDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}