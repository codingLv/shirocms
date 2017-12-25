package com.cms.bean;

import java.util.ArrayList;
import java.util.List;

public class Library_detailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Library_detailsExample() {
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

        public Criteria andLibraryDetailIdIsNull() {
            addCriterion("library_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andLibraryDetailIdIsNotNull() {
            addCriterion("library_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryDetailIdEqualTo(Integer value) {
            addCriterion("library_detail_id =", value, "libraryDetailId");
            return (Criteria) this;
        }

        public Criteria andLibraryDetailIdNotEqualTo(Integer value) {
            addCriterion("library_detail_id <>", value, "libraryDetailId");
            return (Criteria) this;
        }

        public Criteria andLibraryDetailIdGreaterThan(Integer value) {
            addCriterion("library_detail_id >", value, "libraryDetailId");
            return (Criteria) this;
        }

        public Criteria andLibraryDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("library_detail_id >=", value, "libraryDetailId");
            return (Criteria) this;
        }

        public Criteria andLibraryDetailIdLessThan(Integer value) {
            addCriterion("library_detail_id <", value, "libraryDetailId");
            return (Criteria) this;
        }

        public Criteria andLibraryDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("library_detail_id <=", value, "libraryDetailId");
            return (Criteria) this;
        }

        public Criteria andLibraryDetailIdIn(List<Integer> values) {
            addCriterion("library_detail_id in", values, "libraryDetailId");
            return (Criteria) this;
        }

        public Criteria andLibraryDetailIdNotIn(List<Integer> values) {
            addCriterion("library_detail_id not in", values, "libraryDetailId");
            return (Criteria) this;
        }

        public Criteria andLibraryDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("library_detail_id between", value1, value2, "libraryDetailId");
            return (Criteria) this;
        }

        public Criteria andLibraryDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("library_detail_id not between", value1, value2, "libraryDetailId");
            return (Criteria) this;
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

        public Criteria andDramatitleIsNull() {
            addCriterion("dramatitle is null");
            return (Criteria) this;
        }

        public Criteria andDramatitleIsNotNull() {
            addCriterion("dramatitle is not null");
            return (Criteria) this;
        }

        public Criteria andDramatitleEqualTo(String value) {
            addCriterion("dramatitle =", value, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andDramatitleNotEqualTo(String value) {
            addCriterion("dramatitle <>", value, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andDramatitleGreaterThan(String value) {
            addCriterion("dramatitle >", value, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andDramatitleGreaterThanOrEqualTo(String value) {
            addCriterion("dramatitle >=", value, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andDramatitleLessThan(String value) {
            addCriterion("dramatitle <", value, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andDramatitleLessThanOrEqualTo(String value) {
            addCriterion("dramatitle <=", value, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andDramatitleLike(String value) {
            addCriterion("dramatitle like", value, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andDramatitleNotLike(String value) {
            addCriterion("dramatitle not like", value, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andDramatitleIn(List<String> values) {
            addCriterion("dramatitle in", values, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andDramatitleNotIn(List<String> values) {
            addCriterion("dramatitle not in", values, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andDramatitleBetween(String value1, String value2) {
            addCriterion("dramatitle between", value1, value2, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andDramatitleNotBetween(String value1, String value2) {
            addCriterion("dramatitle not between", value1, value2, "dramatitle");
            return (Criteria) this;
        }

        public Criteria andVideoIsNull() {
            addCriterion("video is null");
            return (Criteria) this;
        }

        public Criteria andVideoIsNotNull() {
            addCriterion("video is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEqualTo(String value) {
            addCriterion("video =", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotEqualTo(String value) {
            addCriterion("video <>", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThan(String value) {
            addCriterion("video >", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThanOrEqualTo(String value) {
            addCriterion("video >=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThan(String value) {
            addCriterion("video <", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThanOrEqualTo(String value) {
            addCriterion("video <=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLike(String value) {
            addCriterion("video like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotLike(String value) {
            addCriterion("video not like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoIn(List<String> values) {
            addCriterion("video in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotIn(List<String> values) {
            addCriterion("video not in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoBetween(String value1, String value2) {
            addCriterion("video between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotBetween(String value1, String value2) {
            addCriterion("video not between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andMdstringIsNull() {
            addCriterion("mdstring is null");
            return (Criteria) this;
        }

        public Criteria andMdstringIsNotNull() {
            addCriterion("mdstring is not null");
            return (Criteria) this;
        }

        public Criteria andMdstringEqualTo(String value) {
            addCriterion("mdstring =", value, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMdstringNotEqualTo(String value) {
            addCriterion("mdstring <>", value, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMdstringGreaterThan(String value) {
            addCriterion("mdstring >", value, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMdstringGreaterThanOrEqualTo(String value) {
            addCriterion("mdstring >=", value, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMdstringLessThan(String value) {
            addCriterion("mdstring <", value, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMdstringLessThanOrEqualTo(String value) {
            addCriterion("mdstring <=", value, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMdstringLike(String value) {
            addCriterion("mdstring like", value, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMdstringNotLike(String value) {
            addCriterion("mdstring not like", value, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMdstringIn(List<String> values) {
            addCriterion("mdstring in", values, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMdstringNotIn(List<String> values) {
            addCriterion("mdstring not in", values, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMdstringBetween(String value1, String value2) {
            addCriterion("mdstring between", value1, value2, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMdstringNotBetween(String value1, String value2) {
            addCriterion("mdstring not between", value1, value2, "mdstring");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIsNull() {
            addCriterion("movie_type is null");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIsNotNull() {
            addCriterion("movie_type is not null");
            return (Criteria) this;
        }

        public Criteria andMovieTypeEqualTo(String value) {
            addCriterion("movie_type =", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotEqualTo(String value) {
            addCriterion("movie_type <>", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeGreaterThan(String value) {
            addCriterion("movie_type >", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeGreaterThanOrEqualTo(String value) {
            addCriterion("movie_type >=", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLessThan(String value) {
            addCriterion("movie_type <", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLessThanOrEqualTo(String value) {
            addCriterion("movie_type <=", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLike(String value) {
            addCriterion("movie_type like", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotLike(String value) {
            addCriterion("movie_type not like", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIn(List<String> values) {
            addCriterion("movie_type in", values, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotIn(List<String> values) {
            addCriterion("movie_type not in", values, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeBetween(String value1, String value2) {
            addCriterion("movie_type between", value1, value2, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotBetween(String value1, String value2) {
            addCriterion("movie_type not between", value1, value2, "movieType");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andDetailSortIsNull() {
            addCriterion("detail_sort is null");
            return (Criteria) this;
        }

        public Criteria andDetailSortIsNotNull() {
            addCriterion("detail_sort is not null");
            return (Criteria) this;
        }

        public Criteria andDetailSortEqualTo(Integer value) {
            addCriterion("detail_sort =", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortNotEqualTo(Integer value) {
            addCriterion("detail_sort <>", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortGreaterThan(Integer value) {
            addCriterion("detail_sort >", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_sort >=", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortLessThan(Integer value) {
            addCriterion("detail_sort <", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortLessThanOrEqualTo(Integer value) {
            addCriterion("detail_sort <=", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortIn(List<Integer> values) {
            addCriterion("detail_sort in", values, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortNotIn(List<Integer> values) {
            addCriterion("detail_sort not in", values, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortBetween(Integer value1, Integer value2) {
            addCriterion("detail_sort between", value1, value2, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_sort not between", value1, value2, "detailSort");
            return (Criteria) this;
        }

        public Criteria andChapterIsNull() {
            addCriterion("chapter is null");
            return (Criteria) this;
        }

        public Criteria andChapterIsNotNull() {
            addCriterion("chapter is not null");
            return (Criteria) this;
        }

        public Criteria andChapterEqualTo(Integer value) {
            addCriterion("chapter =", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterNotEqualTo(Integer value) {
            addCriterion("chapter <>", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterGreaterThan(Integer value) {
            addCriterion("chapter >", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter >=", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterLessThan(Integer value) {
            addCriterion("chapter <", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterLessThanOrEqualTo(Integer value) {
            addCriterion("chapter <=", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterIn(List<Integer> values) {
            addCriterion("chapter in", values, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterNotIn(List<Integer> values) {
            addCriterion("chapter not in", values, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterBetween(Integer value1, Integer value2) {
            addCriterion("chapter between", value1, value2, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter not between", value1, value2, "chapter");
            return (Criteria) this;
        }

        public Criteria andPlaytimeIsNull() {
            addCriterion("playtime is null");
            return (Criteria) this;
        }

        public Criteria andPlaytimeIsNotNull() {
            addCriterion("playtime is not null");
            return (Criteria) this;
        }

        public Criteria andPlaytimeEqualTo(String value) {
            addCriterion("playtime =", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeNotEqualTo(String value) {
            addCriterion("playtime <>", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeGreaterThan(String value) {
            addCriterion("playtime >", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("playtime >=", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeLessThan(String value) {
            addCriterion("playtime <", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeLessThanOrEqualTo(String value) {
            addCriterion("playtime <=", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeLike(String value) {
            addCriterion("playtime like", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeNotLike(String value) {
            addCriterion("playtime not like", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeIn(List<String> values) {
            addCriterion("playtime in", values, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeNotIn(List<String> values) {
            addCriterion("playtime not in", values, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeBetween(String value1, String value2) {
            addCriterion("playtime between", value1, value2, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeNotBetween(String value1, String value2) {
            addCriterion("playtime not between", value1, value2, "playtime");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andActorsIsNull() {
            addCriterion("actors is null");
            return (Criteria) this;
        }

        public Criteria andActorsIsNotNull() {
            addCriterion("actors is not null");
            return (Criteria) this;
        }

        public Criteria andActorsEqualTo(String value) {
            addCriterion("actors =", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotEqualTo(String value) {
            addCriterion("actors <>", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsGreaterThan(String value) {
            addCriterion("actors >", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsGreaterThanOrEqualTo(String value) {
            addCriterion("actors >=", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsLessThan(String value) {
            addCriterion("actors <", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsLessThanOrEqualTo(String value) {
            addCriterion("actors <=", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsLike(String value) {
            addCriterion("actors like", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotLike(String value) {
            addCriterion("actors not like", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsIn(List<String> values) {
            addCriterion("actors in", values, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotIn(List<String> values) {
            addCriterion("actors not in", values, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsBetween(String value1, String value2) {
            addCriterion("actors between", value1, value2, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotBetween(String value1, String value2) {
            addCriterion("actors not between", value1, value2, "actors");
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

        public Criteria andAssetIdIsNull() {
            addCriterion("asset_id is null");
            return (Criteria) this;
        }

        public Criteria andAssetIdIsNotNull() {
            addCriterion("asset_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssetIdEqualTo(String value) {
            addCriterion("asset_id =", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotEqualTo(String value) {
            addCriterion("asset_id <>", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdGreaterThan(String value) {
            addCriterion("asset_id >", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdGreaterThanOrEqualTo(String value) {
            addCriterion("asset_id >=", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLessThan(String value) {
            addCriterion("asset_id <", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLessThanOrEqualTo(String value) {
            addCriterion("asset_id <=", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLike(String value) {
            addCriterion("asset_id like", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotLike(String value) {
            addCriterion("asset_id not like", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdIn(List<String> values) {
            addCriterion("asset_id in", values, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotIn(List<String> values) {
            addCriterion("asset_id not in", values, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdBetween(String value1, String value2) {
            addCriterion("asset_id between", value1, value2, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotBetween(String value1, String value2) {
            addCriterion("asset_id not between", value1, value2, "assetId");
            return (Criteria) this;
        }

        public Criteria andGenreIsNull() {
            addCriterion("genre is null");
            return (Criteria) this;
        }

        public Criteria andGenreIsNotNull() {
            addCriterion("genre is not null");
            return (Criteria) this;
        }

        public Criteria andGenreEqualTo(String value) {
            addCriterion("genre =", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreNotEqualTo(String value) {
            addCriterion("genre <>", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreGreaterThan(String value) {
            addCriterion("genre >", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreGreaterThanOrEqualTo(String value) {
            addCriterion("genre >=", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreLessThan(String value) {
            addCriterion("genre <", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreLessThanOrEqualTo(String value) {
            addCriterion("genre <=", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreLike(String value) {
            addCriterion("genre like", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreNotLike(String value) {
            addCriterion("genre not like", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreIn(List<String> values) {
            addCriterion("genre in", values, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreNotIn(List<String> values) {
            addCriterion("genre not in", values, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreBetween(String value1, String value2) {
            addCriterion("genre between", value1, value2, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreNotBetween(String value1, String value2) {
            addCriterion("genre not between", value1, value2, "genre");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNull() {
            addCriterion("season is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNotNull() {
            addCriterion("season is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonEqualTo(String value) {
            addCriterion("season =", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotEqualTo(String value) {
            addCriterion("season <>", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThan(String value) {
            addCriterion("season >", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("season >=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThan(String value) {
            addCriterion("season <", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThanOrEqualTo(String value) {
            addCriterion("season <=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLike(String value) {
            addCriterion("season like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotLike(String value) {
            addCriterion("season not like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonIn(List<String> values) {
            addCriterion("season in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotIn(List<String> values) {
            addCriterion("season not in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonBetween(String value1, String value2) {
            addCriterion("season between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotBetween(String value1, String value2) {
            addCriterion("season not between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageIsNull() {
            addCriterion("subtitle_language is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageIsNotNull() {
            addCriterion("subtitle_language is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageEqualTo(String value) {
            addCriterion("subtitle_language =", value, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageNotEqualTo(String value) {
            addCriterion("subtitle_language <>", value, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageGreaterThan(String value) {
            addCriterion("subtitle_language >", value, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle_language >=", value, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageLessThan(String value) {
            addCriterion("subtitle_language <", value, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageLessThanOrEqualTo(String value) {
            addCriterion("subtitle_language <=", value, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageLike(String value) {
            addCriterion("subtitle_language like", value, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageNotLike(String value) {
            addCriterion("subtitle_language not like", value, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageIn(List<String> values) {
            addCriterion("subtitle_language in", values, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageNotIn(List<String> values) {
            addCriterion("subtitle_language not in", values, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageBetween(String value1, String value2) {
            addCriterion("subtitle_language between", value1, value2, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andSubtitleLanguageNotBetween(String value1, String value2) {
            addCriterion("subtitle_language not between", value1, value2, "subtitleLanguage");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andWritersIsNull() {
            addCriterion("writers is null");
            return (Criteria) this;
        }

        public Criteria andWritersIsNotNull() {
            addCriterion("writers is not null");
            return (Criteria) this;
        }

        public Criteria andWritersEqualTo(String value) {
            addCriterion("writers =", value, "writers");
            return (Criteria) this;
        }

        public Criteria andWritersNotEqualTo(String value) {
            addCriterion("writers <>", value, "writers");
            return (Criteria) this;
        }

        public Criteria andWritersGreaterThan(String value) {
            addCriterion("writers >", value, "writers");
            return (Criteria) this;
        }

        public Criteria andWritersGreaterThanOrEqualTo(String value) {
            addCriterion("writers >=", value, "writers");
            return (Criteria) this;
        }

        public Criteria andWritersLessThan(String value) {
            addCriterion("writers <", value, "writers");
            return (Criteria) this;
        }

        public Criteria andWritersLessThanOrEqualTo(String value) {
            addCriterion("writers <=", value, "writers");
            return (Criteria) this;
        }

        public Criteria andWritersLike(String value) {
            addCriterion("writers like", value, "writers");
            return (Criteria) this;
        }

        public Criteria andWritersNotLike(String value) {
            addCriterion("writers not like", value, "writers");
            return (Criteria) this;
        }

        public Criteria andWritersIn(List<String> values) {
            addCriterion("writers in", values, "writers");
            return (Criteria) this;
        }

        public Criteria andWritersNotIn(List<String> values) {
            addCriterion("writers not in", values, "writers");
            return (Criteria) this;
        }

        public Criteria andWritersBetween(String value1, String value2) {
            addCriterion("writers between", value1, value2, "writers");
            return (Criteria) this;
        }

        public Criteria andWritersNotBetween(String value1, String value2) {
            addCriterion("writers not between", value1, value2, "writers");
            return (Criteria) this;
        }

        public Criteria andProviderIsNull() {
            addCriterion("provider is null");
            return (Criteria) this;
        }

        public Criteria andProviderIsNotNull() {
            addCriterion("provider is not null");
            return (Criteria) this;
        }

        public Criteria andProviderEqualTo(String value) {
            addCriterion("provider =", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotEqualTo(String value) {
            addCriterion("provider <>", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThan(String value) {
            addCriterion("provider >", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThanOrEqualTo(String value) {
            addCriterion("provider >=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThan(String value) {
            addCriterion("provider <", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThanOrEqualTo(String value) {
            addCriterion("provider <=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLike(String value) {
            addCriterion("provider like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotLike(String value) {
            addCriterion("provider not like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderIn(List<String> values) {
            addCriterion("provider in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotIn(List<String> values) {
            addCriterion("provider not in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderBetween(String value1, String value2) {
            addCriterion("provider between", value1, value2, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotBetween(String value1, String value2) {
            addCriterion("provider not between", value1, value2, "provider");
            return (Criteria) this;
        }

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andIosAddrIsNull() {
            addCriterion("ios_addr is null");
            return (Criteria) this;
        }

        public Criteria andIosAddrIsNotNull() {
            addCriterion("ios_addr is not null");
            return (Criteria) this;
        }

        public Criteria andIosAddrEqualTo(String value) {
            addCriterion("ios_addr =", value, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andIosAddrNotEqualTo(String value) {
            addCriterion("ios_addr <>", value, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andIosAddrGreaterThan(String value) {
            addCriterion("ios_addr >", value, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andIosAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ios_addr >=", value, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andIosAddrLessThan(String value) {
            addCriterion("ios_addr <", value, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andIosAddrLessThanOrEqualTo(String value) {
            addCriterion("ios_addr <=", value, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andIosAddrLike(String value) {
            addCriterion("ios_addr like", value, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andIosAddrNotLike(String value) {
            addCriterion("ios_addr not like", value, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andIosAddrIn(List<String> values) {
            addCriterion("ios_addr in", values, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andIosAddrNotIn(List<String> values) {
            addCriterion("ios_addr not in", values, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andIosAddrBetween(String value1, String value2) {
            addCriterion("ios_addr between", value1, value2, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andIosAddrNotBetween(String value1, String value2) {
            addCriterion("ios_addr not between", value1, value2, "iosAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrIsNull() {
            addCriterion("android_addr is null");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrIsNotNull() {
            addCriterion("android_addr is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrEqualTo(String value) {
            addCriterion("android_addr =", value, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrNotEqualTo(String value) {
            addCriterion("android_addr <>", value, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrGreaterThan(String value) {
            addCriterion("android_addr >", value, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrGreaterThanOrEqualTo(String value) {
            addCriterion("android_addr >=", value, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrLessThan(String value) {
            addCriterion("android_addr <", value, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrLessThanOrEqualTo(String value) {
            addCriterion("android_addr <=", value, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrLike(String value) {
            addCriterion("android_addr like", value, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrNotLike(String value) {
            addCriterion("android_addr not like", value, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrIn(List<String> values) {
            addCriterion("android_addr in", values, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrNotIn(List<String> values) {
            addCriterion("android_addr not in", values, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrBetween(String value1, String value2) {
            addCriterion("android_addr between", value1, value2, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andAndroidAddrNotBetween(String value1, String value2) {
            addCriterion("android_addr not between", value1, value2, "androidAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrIsNull() {
            addCriterion("web_addr is null");
            return (Criteria) this;
        }

        public Criteria andWebAddrIsNotNull() {
            addCriterion("web_addr is not null");
            return (Criteria) this;
        }

        public Criteria andWebAddrEqualTo(String value) {
            addCriterion("web_addr =", value, "webAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrNotEqualTo(String value) {
            addCriterion("web_addr <>", value, "webAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrGreaterThan(String value) {
            addCriterion("web_addr >", value, "webAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrGreaterThanOrEqualTo(String value) {
            addCriterion("web_addr >=", value, "webAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrLessThan(String value) {
            addCriterion("web_addr <", value, "webAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrLessThanOrEqualTo(String value) {
            addCriterion("web_addr <=", value, "webAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrLike(String value) {
            addCriterion("web_addr like", value, "webAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrNotLike(String value) {
            addCriterion("web_addr not like", value, "webAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrIn(List<String> values) {
            addCriterion("web_addr in", values, "webAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrNotIn(List<String> values) {
            addCriterion("web_addr not in", values, "webAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrBetween(String value1, String value2) {
            addCriterion("web_addr between", value1, value2, "webAddr");
            return (Criteria) this;
        }

        public Criteria andWebAddrNotBetween(String value1, String value2) {
            addCriterion("web_addr not between", value1, value2, "webAddr");
            return (Criteria) this;
        }

        public Criteria andLiveStatusIsNull() {
            addCriterion("live_status is null");
            return (Criteria) this;
        }

        public Criteria andLiveStatusIsNotNull() {
            addCriterion("live_status is not null");
            return (Criteria) this;
        }

        public Criteria andLiveStatusEqualTo(String value) {
            addCriterion("live_status =", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotEqualTo(String value) {
            addCriterion("live_status <>", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusGreaterThan(String value) {
            addCriterion("live_status >", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("live_status >=", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusLessThan(String value) {
            addCriterion("live_status <", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusLessThanOrEqualTo(String value) {
            addCriterion("live_status <=", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusLike(String value) {
            addCriterion("live_status like", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotLike(String value) {
            addCriterion("live_status not like", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusIn(List<String> values) {
            addCriterion("live_status in", values, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotIn(List<String> values) {
            addCriterion("live_status not in", values, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusBetween(String value1, String value2) {
            addCriterion("live_status between", value1, value2, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotBetween(String value1, String value2) {
            addCriterion("live_status not between", value1, value2, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
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