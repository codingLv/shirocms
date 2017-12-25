package com.cms.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibrarysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LibrarysExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andLibraryIdIsNull() {
            addCriterion("library_id is null");
            return (Criteria) this;
        }

        public Criteria andLibraryIdIsNotNull() {
            addCriterion("library_id is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryIdEqualTo(Integer value) {
            addCriterion("library_id =", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdNotEqualTo(Integer value) {
            addCriterion("library_id <>", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdGreaterThan(Integer value) {
            addCriterion("library_id >", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("library_id >=", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdLessThan(Integer value) {
            addCriterion("library_id <", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdLessThanOrEqualTo(Integer value) {
            addCriterion("library_id <=", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdIn(List<Integer> values) {
            addCriterion("library_id in", values, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdNotIn(List<Integer> values) {
            addCriterion("library_id not in", values, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdBetween(Integer value1, Integer value2) {
            addCriterion("library_id between", value1, value2, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("library_id not between", value1, value2, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdIsNull() {
            addCriterion("library_category_id is null");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdIsNotNull() {
            addCriterion("library_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdEqualTo(Integer value) {
            addCriterion("library_category_id =", value, "libraryCategoryId");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdNotEqualTo(Integer value) {
            addCriterion("library_category_id <>", value, "libraryCategoryId");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdGreaterThan(Integer value) {
            addCriterion("library_category_id >", value, "libraryCategoryId");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("library_category_id >=", value, "libraryCategoryId");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdLessThan(Integer value) {
            addCriterion("library_category_id <", value, "libraryCategoryId");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("library_category_id <=", value, "libraryCategoryId");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdIn(List<Integer> values) {
            addCriterion("library_category_id in", values, "libraryCategoryId");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdNotIn(List<Integer> values) {
            addCriterion("library_category_id not in", values, "libraryCategoryId");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("library_category_id between", value1, value2, "libraryCategoryId");
            return (Criteria) this;
        }

        public Criteria andLibraryCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("library_category_id not between", value1, value2, "libraryCategoryId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Byte value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Byte value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Byte value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Byte value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Byte> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Byte> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andViewTypeIsNull() {
            addCriterion("view_type is null");
            return (Criteria) this;
        }

        public Criteria andViewTypeIsNotNull() {
            addCriterion("view_type is not null");
            return (Criteria) this;
        }

        public Criteria andViewTypeEqualTo(Byte value) {
            addCriterion("view_type =", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotEqualTo(Byte value) {
            addCriterion("view_type <>", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeGreaterThan(Byte value) {
            addCriterion("view_type >", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("view_type >=", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLessThan(Byte value) {
            addCriterion("view_type <", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLessThanOrEqualTo(Byte value) {
            addCriterion("view_type <=", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeIn(List<Byte> values) {
            addCriterion("view_type in", values, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotIn(List<Byte> values) {
            addCriterion("view_type not in", values, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeBetween(Byte value1, Byte value2) {
            addCriterion("view_type between", value1, value2, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("view_type not between", value1, value2, "viewType");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNull() {
            addCriterion("pinyin is null");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNotNull() {
            addCriterion("pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinEqualTo(String value) {
            addCriterion("pinyin =", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotEqualTo(String value) {
            addCriterion("pinyin <>", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThan(String value) {
            addCriterion("pinyin >", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("pinyin >=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThan(String value) {
            addCriterion("pinyin <", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThanOrEqualTo(String value) {
            addCriterion("pinyin <=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLike(String value) {
            addCriterion("pinyin like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotLike(String value) {
            addCriterion("pinyin not like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinIn(List<String> values) {
            addCriterion("pinyin in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotIn(List<String> values) {
            addCriterion("pinyin not in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinBetween(String value1, String value2) {
            addCriterion("pinyin between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotBetween(String value1, String value2) {
            addCriterion("pinyin not between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andShortTitleIsNull() {
            addCriterion("short_title is null");
            return (Criteria) this;
        }

        public Criteria andShortTitleIsNotNull() {
            addCriterion("short_title is not null");
            return (Criteria) this;
        }

        public Criteria andShortTitleEqualTo(String value) {
            addCriterion("short_title =", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotEqualTo(String value) {
            addCriterion("short_title <>", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleGreaterThan(String value) {
            addCriterion("short_title >", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleGreaterThanOrEqualTo(String value) {
            addCriterion("short_title >=", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLessThan(String value) {
            addCriterion("short_title <", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLessThanOrEqualTo(String value) {
            addCriterion("short_title <=", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLike(String value) {
            addCriterion("short_title like", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotLike(String value) {
            addCriterion("short_title not like", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleIn(List<String> values) {
            addCriterion("short_title in", values, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotIn(List<String> values) {
            addCriterion("short_title not in", values, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleBetween(String value1, String value2) {
            addCriterion("short_title between", value1, value2, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotBetween(String value1, String value2) {
            addCriterion("short_title not between", value1, value2, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultIsNull() {
            addCriterion("thumb_default is null");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultIsNotNull() {
            addCriterion("thumb_default is not null");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultEqualTo(String value) {
            addCriterion("thumb_default =", value, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultNotEqualTo(String value) {
            addCriterion("thumb_default <>", value, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultGreaterThan(String value) {
            addCriterion("thumb_default >", value, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_default >=", value, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultLessThan(String value) {
            addCriterion("thumb_default <", value, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultLessThanOrEqualTo(String value) {
            addCriterion("thumb_default <=", value, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultLike(String value) {
            addCriterion("thumb_default like", value, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultNotLike(String value) {
            addCriterion("thumb_default not like", value, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultIn(List<String> values) {
            addCriterion("thumb_default in", values, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultNotIn(List<String> values) {
            addCriterion("thumb_default not in", values, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultBetween(String value1, String value2) {
            addCriterion("thumb_default between", value1, value2, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbDefaultNotBetween(String value1, String value2) {
            addCriterion("thumb_default not between", value1, value2, "thumbDefault");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopIsNull() {
            addCriterion("thumb_app_top is null");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopIsNotNull() {
            addCriterion("thumb_app_top is not null");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopEqualTo(String value) {
            addCriterion("thumb_app_top =", value, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopNotEqualTo(String value) {
            addCriterion("thumb_app_top <>", value, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopGreaterThan(String value) {
            addCriterion("thumb_app_top >", value, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_app_top >=", value, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopLessThan(String value) {
            addCriterion("thumb_app_top <", value, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopLessThanOrEqualTo(String value) {
            addCriterion("thumb_app_top <=", value, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopLike(String value) {
            addCriterion("thumb_app_top like", value, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopNotLike(String value) {
            addCriterion("thumb_app_top not like", value, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopIn(List<String> values) {
            addCriterion("thumb_app_top in", values, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopNotIn(List<String> values) {
            addCriterion("thumb_app_top not in", values, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopBetween(String value1, String value2) {
            addCriterion("thumb_app_top between", value1, value2, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppTopNotBetween(String value1, String value2) {
            addCriterion("thumb_app_top not between", value1, value2, "thumbAppTop");
            return (Criteria) this;
        }

        public Criteria andThumbAppHIsNull() {
            addCriterion("thumb_app_h is null");
            return (Criteria) this;
        }

        public Criteria andThumbAppHIsNotNull() {
            addCriterion("thumb_app_h is not null");
            return (Criteria) this;
        }

        public Criteria andThumbAppHEqualTo(String value) {
            addCriterion("thumb_app_h =", value, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppHNotEqualTo(String value) {
            addCriterion("thumb_app_h <>", value, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppHGreaterThan(String value) {
            addCriterion("thumb_app_h >", value, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppHGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_app_h >=", value, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppHLessThan(String value) {
            addCriterion("thumb_app_h <", value, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppHLessThanOrEqualTo(String value) {
            addCriterion("thumb_app_h <=", value, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppHLike(String value) {
            addCriterion("thumb_app_h like", value, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppHNotLike(String value) {
            addCriterion("thumb_app_h not like", value, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppHIn(List<String> values) {
            addCriterion("thumb_app_h in", values, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppHNotIn(List<String> values) {
            addCriterion("thumb_app_h not in", values, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppHBetween(String value1, String value2) {
            addCriterion("thumb_app_h between", value1, value2, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppHNotBetween(String value1, String value2) {
            addCriterion("thumb_app_h not between", value1, value2, "thumbAppH");
            return (Criteria) this;
        }

        public Criteria andThumbAppWIsNull() {
            addCriterion("thumb_app_w is null");
            return (Criteria) this;
        }

        public Criteria andThumbAppWIsNotNull() {
            addCriterion("thumb_app_w is not null");
            return (Criteria) this;
        }

        public Criteria andThumbAppWEqualTo(String value) {
            addCriterion("thumb_app_w =", value, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbAppWNotEqualTo(String value) {
            addCriterion("thumb_app_w <>", value, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbAppWGreaterThan(String value) {
            addCriterion("thumb_app_w >", value, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbAppWGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_app_w >=", value, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbAppWLessThan(String value) {
            addCriterion("thumb_app_w <", value, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbAppWLessThanOrEqualTo(String value) {
            addCriterion("thumb_app_w <=", value, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbAppWLike(String value) {
            addCriterion("thumb_app_w like", value, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbAppWNotLike(String value) {
            addCriterion("thumb_app_w not like", value, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbAppWIn(List<String> values) {
            addCriterion("thumb_app_w in", values, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbAppWNotIn(List<String> values) {
            addCriterion("thumb_app_w not in", values, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbAppWBetween(String value1, String value2) {
            addCriterion("thumb_app_w between", value1, value2, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbAppWNotBetween(String value1, String value2) {
            addCriterion("thumb_app_w not between", value1, value2, "thumbAppW");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopIsNull() {
            addCriterion("thumb_web_top is null");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopIsNotNull() {
            addCriterion("thumb_web_top is not null");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopEqualTo(String value) {
            addCriterion("thumb_web_top =", value, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopNotEqualTo(String value) {
            addCriterion("thumb_web_top <>", value, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopGreaterThan(String value) {
            addCriterion("thumb_web_top >", value, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_web_top >=", value, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopLessThan(String value) {
            addCriterion("thumb_web_top <", value, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopLessThanOrEqualTo(String value) {
            addCriterion("thumb_web_top <=", value, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopLike(String value) {
            addCriterion("thumb_web_top like", value, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopNotLike(String value) {
            addCriterion("thumb_web_top not like", value, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopIn(List<String> values) {
            addCriterion("thumb_web_top in", values, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopNotIn(List<String> values) {
            addCriterion("thumb_web_top not in", values, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopBetween(String value1, String value2) {
            addCriterion("thumb_web_top between", value1, value2, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebTopNotBetween(String value1, String value2) {
            addCriterion("thumb_web_top not between", value1, value2, "thumbWebTop");
            return (Criteria) this;
        }

        public Criteria andThumbWebHIsNull() {
            addCriterion("thumb_web_h is null");
            return (Criteria) this;
        }

        public Criteria andThumbWebHIsNotNull() {
            addCriterion("thumb_web_h is not null");
            return (Criteria) this;
        }

        public Criteria andThumbWebHEqualTo(String value) {
            addCriterion("thumb_web_h =", value, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebHNotEqualTo(String value) {
            addCriterion("thumb_web_h <>", value, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebHGreaterThan(String value) {
            addCriterion("thumb_web_h >", value, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebHGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_web_h >=", value, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebHLessThan(String value) {
            addCriterion("thumb_web_h <", value, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebHLessThanOrEqualTo(String value) {
            addCriterion("thumb_web_h <=", value, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebHLike(String value) {
            addCriterion("thumb_web_h like", value, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebHNotLike(String value) {
            addCriterion("thumb_web_h not like", value, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebHIn(List<String> values) {
            addCriterion("thumb_web_h in", values, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebHNotIn(List<String> values) {
            addCriterion("thumb_web_h not in", values, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebHBetween(String value1, String value2) {
            addCriterion("thumb_web_h between", value1, value2, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebHNotBetween(String value1, String value2) {
            addCriterion("thumb_web_h not between", value1, value2, "thumbWebH");
            return (Criteria) this;
        }

        public Criteria andThumbWebWIsNull() {
            addCriterion("thumb_web_w is null");
            return (Criteria) this;
        }

        public Criteria andThumbWebWIsNotNull() {
            addCriterion("thumb_web_w is not null");
            return (Criteria) this;
        }

        public Criteria andThumbWebWEqualTo(String value) {
            addCriterion("thumb_web_w =", value, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andThumbWebWNotEqualTo(String value) {
            addCriterion("thumb_web_w <>", value, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andThumbWebWGreaterThan(String value) {
            addCriterion("thumb_web_w >", value, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andThumbWebWGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_web_w >=", value, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andThumbWebWLessThan(String value) {
            addCriterion("thumb_web_w <", value, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andThumbWebWLessThanOrEqualTo(String value) {
            addCriterion("thumb_web_w <=", value, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andThumbWebWLike(String value) {
            addCriterion("thumb_web_w like", value, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andThumbWebWNotLike(String value) {
            addCriterion("thumb_web_w not like", value, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andThumbWebWIn(List<String> values) {
            addCriterion("thumb_web_w in", values, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andThumbWebWNotIn(List<String> values) {
            addCriterion("thumb_web_w not in", values, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andThumbWebWBetween(String value1, String value2) {
            addCriterion("thumb_web_w between", value1, value2, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andThumbWebWNotBetween(String value1, String value2) {
            addCriterion("thumb_web_w not between", value1, value2, "thumbWebW");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPlayTimeIsNull() {
            addCriterion("play_time is null");
            return (Criteria) this;
        }

        public Criteria andPlayTimeIsNotNull() {
            addCriterion("play_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlayTimeEqualTo(String value) {
            addCriterion("play_time =", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeNotEqualTo(String value) {
            addCriterion("play_time <>", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeGreaterThan(String value) {
            addCriterion("play_time >", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("play_time >=", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeLessThan(String value) {
            addCriterion("play_time <", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeLessThanOrEqualTo(String value) {
            addCriterion("play_time <=", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeLike(String value) {
            addCriterion("play_time like", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeNotLike(String value) {
            addCriterion("play_time not like", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeIn(List<String> values) {
            addCriterion("play_time in", values, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeNotIn(List<String> values) {
            addCriterion("play_time not in", values, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeBetween(String value1, String value2) {
            addCriterion("play_time between", value1, value2, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeNotBetween(String value1, String value2) {
            addCriterion("play_time not between", value1, value2, "playTime");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumIsNull() {
            addCriterion("updated_num is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumIsNotNull() {
            addCriterion("updated_num is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumEqualTo(Integer value) {
            addCriterion("updated_num =", value, "updatedNum");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumNotEqualTo(Integer value) {
            addCriterion("updated_num <>", value, "updatedNum");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumGreaterThan(Integer value) {
            addCriterion("updated_num >", value, "updatedNum");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_num >=", value, "updatedNum");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumLessThan(Integer value) {
            addCriterion("updated_num <", value, "updatedNum");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumLessThanOrEqualTo(Integer value) {
            addCriterion("updated_num <=", value, "updatedNum");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumIn(List<Integer> values) {
            addCriterion("updated_num in", values, "updatedNum");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumNotIn(List<Integer> values) {
            addCriterion("updated_num not in", values, "updatedNum");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumBetween(Integer value1, Integer value2) {
            addCriterion("updated_num between", value1, value2, "updatedNum");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_num not between", value1, value2, "updatedNum");
            return (Criteria) this;
        }

        public Criteria andIsOverIsNull() {
            addCriterion("is_over is null");
            return (Criteria) this;
        }

        public Criteria andIsOverIsNotNull() {
            addCriterion("is_over is not null");
            return (Criteria) this;
        }

        public Criteria andIsOverEqualTo(Boolean value) {
            addCriterion("is_over =", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverNotEqualTo(Boolean value) {
            addCriterion("is_over <>", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverGreaterThan(Boolean value) {
            addCriterion("is_over >", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_over >=", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverLessThan(Boolean value) {
            addCriterion("is_over <", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverLessThanOrEqualTo(Boolean value) {
            addCriterion("is_over <=", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverIn(List<Boolean> values) {
            addCriterion("is_over in", values, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverNotIn(List<Boolean> values) {
            addCriterion("is_over not in", values, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverBetween(Boolean value1, Boolean value2) {
            addCriterion("is_over between", value1, value2, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_over not between", value1, value2, "isOver");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIsNull() {
            addCriterion("allow_comment is null");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIsNotNull() {
            addCriterion("allow_comment is not null");
            return (Criteria) this;
        }

        public Criteria andAllowCommentEqualTo(Boolean value) {
            addCriterion("allow_comment =", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotEqualTo(Boolean value) {
            addCriterion("allow_comment <>", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentGreaterThan(Boolean value) {
            addCriterion("allow_comment >", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allow_comment >=", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentLessThan(Boolean value) {
            addCriterion("allow_comment <", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("allow_comment <=", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIn(List<Boolean> values) {
            addCriterion("allow_comment in", values, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotIn(List<Boolean> values) {
            addCriterion("allow_comment not in", values, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_comment between", value1, value2, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_comment not between", value1, value2, "allowComment");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("pv is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("pv is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(Integer value) {
            addCriterion("pv =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(Integer value) {
            addCriterion("pv <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(Integer value) {
            addCriterion("pv >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("pv >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(Integer value) {
            addCriterion("pv <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(Integer value) {
            addCriterion("pv <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<Integer> values) {
            addCriterion("pv in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<Integer> values) {
            addCriterion("pv not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(Integer value1, Integer value2) {
            addCriterion("pv between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(Integer value1, Integer value2) {
            addCriterion("pv not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Byte value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Byte value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Byte value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Byte value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Byte value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Byte> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Byte> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Byte value1, Byte value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Integer value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Integer value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Integer value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Integer value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Integer> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Integer> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(Integer value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(Integer value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(Integer value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(Integer value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(Integer value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<Integer> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<Integer> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(Integer value1, Integer value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andPublishedAtIsNull() {
            addCriterion("published_at is null");
            return (Criteria) this;
        }

        public Criteria andPublishedAtIsNotNull() {
            addCriterion("published_at is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedAtEqualTo(Date value) {
            addCriterion("published_at =", value, "publishedAt");
            return (Criteria) this;
        }

        public Criteria andPublishedAtNotEqualTo(Date value) {
            addCriterion("published_at <>", value, "publishedAt");
            return (Criteria) this;
        }

        public Criteria andPublishedAtGreaterThan(Date value) {
            addCriterion("published_at >", value, "publishedAt");
            return (Criteria) this;
        }

        public Criteria andPublishedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("published_at >=", value, "publishedAt");
            return (Criteria) this;
        }

        public Criteria andPublishedAtLessThan(Date value) {
            addCriterion("published_at <", value, "publishedAt");
            return (Criteria) this;
        }

        public Criteria andPublishedAtLessThanOrEqualTo(Date value) {
            addCriterion("published_at <=", value, "publishedAt");
            return (Criteria) this;
        }

        public Criteria andPublishedAtIn(List<Date> values) {
            addCriterion("published_at in", values, "publishedAt");
            return (Criteria) this;
        }

        public Criteria andPublishedAtNotIn(List<Date> values) {
            addCriterion("published_at not in", values, "publishedAt");
            return (Criteria) this;
        }

        public Criteria andPublishedAtBetween(Date value1, Date value2) {
            addCriterion("published_at between", value1, value2, "publishedAt");
            return (Criteria) this;
        }

        public Criteria andPublishedAtNotBetween(Date value1, Date value2) {
            addCriterion("published_at not between", value1, value2, "publishedAt");
            return (Criteria) this;
        }

        public Criteria andPublishedByIsNull() {
            addCriterion("published_by is null");
            return (Criteria) this;
        }

        public Criteria andPublishedByIsNotNull() {
            addCriterion("published_by is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedByEqualTo(Integer value) {
            addCriterion("published_by =", value, "publishedBy");
            return (Criteria) this;
        }

        public Criteria andPublishedByNotEqualTo(Integer value) {
            addCriterion("published_by <>", value, "publishedBy");
            return (Criteria) this;
        }

        public Criteria andPublishedByGreaterThan(Integer value) {
            addCriterion("published_by >", value, "publishedBy");
            return (Criteria) this;
        }

        public Criteria andPublishedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("published_by >=", value, "publishedBy");
            return (Criteria) this;
        }

        public Criteria andPublishedByLessThan(Integer value) {
            addCriterion("published_by <", value, "publishedBy");
            return (Criteria) this;
        }

        public Criteria andPublishedByLessThanOrEqualTo(Integer value) {
            addCriterion("published_by <=", value, "publishedBy");
            return (Criteria) this;
        }

        public Criteria andPublishedByIn(List<Integer> values) {
            addCriterion("published_by in", values, "publishedBy");
            return (Criteria) this;
        }

        public Criteria andPublishedByNotIn(List<Integer> values) {
            addCriterion("published_by not in", values, "publishedBy");
            return (Criteria) this;
        }

        public Criteria andPublishedByBetween(Integer value1, Integer value2) {
            addCriterion("published_by between", value1, value2, "publishedBy");
            return (Criteria) this;
        }

        public Criteria andPublishedByNotBetween(Integer value1, Integer value2) {
            addCriterion("published_by not between", value1, value2, "publishedBy");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtIsNull() {
            addCriterion("unpublished_at is null");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtIsNotNull() {
            addCriterion("unpublished_at is not null");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtEqualTo(Date value) {
            addCriterion("unpublished_at =", value, "unpublishedAt");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtNotEqualTo(Date value) {
            addCriterion("unpublished_at <>", value, "unpublishedAt");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtGreaterThan(Date value) {
            addCriterion("unpublished_at >", value, "unpublishedAt");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("unpublished_at >=", value, "unpublishedAt");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtLessThan(Date value) {
            addCriterion("unpublished_at <", value, "unpublishedAt");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtLessThanOrEqualTo(Date value) {
            addCriterion("unpublished_at <=", value, "unpublishedAt");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtIn(List<Date> values) {
            addCriterion("unpublished_at in", values, "unpublishedAt");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtNotIn(List<Date> values) {
            addCriterion("unpublished_at not in", values, "unpublishedAt");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtBetween(Date value1, Date value2) {
            addCriterion("unpublished_at between", value1, value2, "unpublishedAt");
            return (Criteria) this;
        }

        public Criteria andUnpublishedAtNotBetween(Date value1, Date value2) {
            addCriterion("unpublished_at not between", value1, value2, "unpublishedAt");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByIsNull() {
            addCriterion("unpublished_by is null");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByIsNotNull() {
            addCriterion("unpublished_by is not null");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByEqualTo(Integer value) {
            addCriterion("unpublished_by =", value, "unpublishedBy");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByNotEqualTo(Integer value) {
            addCriterion("unpublished_by <>", value, "unpublishedBy");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByGreaterThan(Integer value) {
            addCriterion("unpublished_by >", value, "unpublishedBy");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("unpublished_by >=", value, "unpublishedBy");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByLessThan(Integer value) {
            addCriterion("unpublished_by <", value, "unpublishedBy");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByLessThanOrEqualTo(Integer value) {
            addCriterion("unpublished_by <=", value, "unpublishedBy");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByIn(List<Integer> values) {
            addCriterion("unpublished_by in", values, "unpublishedBy");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByNotIn(List<Integer> values) {
            addCriterion("unpublished_by not in", values, "unpublishedBy");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByBetween(Integer value1, Integer value2) {
            addCriterion("unpublished_by between", value1, value2, "unpublishedBy");
            return (Criteria) this;
        }

        public Criteria andUnpublishedByNotBetween(Integer value1, Integer value2) {
            addCriterion("unpublished_by not between", value1, value2, "unpublishedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedAtIsNull() {
            addCriterion("checked_at is null");
            return (Criteria) this;
        }

        public Criteria andCheckedAtIsNotNull() {
            addCriterion("checked_at is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedAtEqualTo(Date value) {
            addCriterion("checked_at =", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtNotEqualTo(Date value) {
            addCriterion("checked_at <>", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtGreaterThan(Date value) {
            addCriterion("checked_at >", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("checked_at >=", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtLessThan(Date value) {
            addCriterion("checked_at <", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtLessThanOrEqualTo(Date value) {
            addCriterion("checked_at <=", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtIn(List<Date> values) {
            addCriterion("checked_at in", values, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtNotIn(List<Date> values) {
            addCriterion("checked_at not in", values, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtBetween(Date value1, Date value2) {
            addCriterion("checked_at between", value1, value2, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtNotBetween(Date value1, Date value2) {
            addCriterion("checked_at not between", value1, value2, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedByIsNull() {
            addCriterion("checked_by is null");
            return (Criteria) this;
        }

        public Criteria andCheckedByIsNotNull() {
            addCriterion("checked_by is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedByEqualTo(Integer value) {
            addCriterion("checked_by =", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByNotEqualTo(Integer value) {
            addCriterion("checked_by <>", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByGreaterThan(Integer value) {
            addCriterion("checked_by >", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("checked_by >=", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByLessThan(Integer value) {
            addCriterion("checked_by <", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByLessThanOrEqualTo(Integer value) {
            addCriterion("checked_by <=", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByIn(List<Integer> values) {
            addCriterion("checked_by in", values, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByNotIn(List<Integer> values) {
            addCriterion("checked_by not in", values, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByBetween(Integer value1, Integer value2) {
            addCriterion("checked_by between", value1, value2, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByNotBetween(Integer value1, Integer value2) {
            addCriterion("checked_by not between", value1, value2, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andLockedAtIsNull() {
            addCriterion("locked_at is null");
            return (Criteria) this;
        }

        public Criteria andLockedAtIsNotNull() {
            addCriterion("locked_at is not null");
            return (Criteria) this;
        }

        public Criteria andLockedAtEqualTo(Date value) {
            addCriterion("locked_at =", value, "lockedAt");
            return (Criteria) this;
        }

        public Criteria andLockedAtNotEqualTo(Date value) {
            addCriterion("locked_at <>", value, "lockedAt");
            return (Criteria) this;
        }

        public Criteria andLockedAtGreaterThan(Date value) {
            addCriterion("locked_at >", value, "lockedAt");
            return (Criteria) this;
        }

        public Criteria andLockedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("locked_at >=", value, "lockedAt");
            return (Criteria) this;
        }

        public Criteria andLockedAtLessThan(Date value) {
            addCriterion("locked_at <", value, "lockedAt");
            return (Criteria) this;
        }

        public Criteria andLockedAtLessThanOrEqualTo(Date value) {
            addCriterion("locked_at <=", value, "lockedAt");
            return (Criteria) this;
        }

        public Criteria andLockedAtIn(List<Date> values) {
            addCriterion("locked_at in", values, "lockedAt");
            return (Criteria) this;
        }

        public Criteria andLockedAtNotIn(List<Date> values) {
            addCriterion("locked_at not in", values, "lockedAt");
            return (Criteria) this;
        }

        public Criteria andLockedAtBetween(Date value1, Date value2) {
            addCriterion("locked_at between", value1, value2, "lockedAt");
            return (Criteria) this;
        }

        public Criteria andLockedAtNotBetween(Date value1, Date value2) {
            addCriterion("locked_at not between", value1, value2, "lockedAt");
            return (Criteria) this;
        }

        public Criteria andLockedByIsNull() {
            addCriterion("locked_by is null");
            return (Criteria) this;
        }

        public Criteria andLockedByIsNotNull() {
            addCriterion("locked_by is not null");
            return (Criteria) this;
        }

        public Criteria andLockedByEqualTo(Integer value) {
            addCriterion("locked_by =", value, "lockedBy");
            return (Criteria) this;
        }

        public Criteria andLockedByNotEqualTo(Integer value) {
            addCriterion("locked_by <>", value, "lockedBy");
            return (Criteria) this;
        }

        public Criteria andLockedByGreaterThan(Integer value) {
            addCriterion("locked_by >", value, "lockedBy");
            return (Criteria) this;
        }

        public Criteria andLockedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("locked_by >=", value, "lockedBy");
            return (Criteria) this;
        }

        public Criteria andLockedByLessThan(Integer value) {
            addCriterion("locked_by <", value, "lockedBy");
            return (Criteria) this;
        }

        public Criteria andLockedByLessThanOrEqualTo(Integer value) {
            addCriterion("locked_by <=", value, "lockedBy");
            return (Criteria) this;
        }

        public Criteria andLockedByIn(List<Integer> values) {
            addCriterion("locked_by in", values, "lockedBy");
            return (Criteria) this;
        }

        public Criteria andLockedByNotIn(List<Integer> values) {
            addCriterion("locked_by not in", values, "lockedBy");
            return (Criteria) this;
        }

        public Criteria andLockedByBetween(Integer value1, Integer value2) {
            addCriterion("locked_by between", value1, value2, "lockedBy");
            return (Criteria) this;
        }

        public Criteria andLockedByNotBetween(Integer value1, Integer value2) {
            addCriterion("locked_by not between", value1, value2, "lockedBy");
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