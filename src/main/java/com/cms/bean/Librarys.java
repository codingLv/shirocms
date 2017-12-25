package com.cms.bean;

import java.util.Date;

public class Librarys {
    private Integer libraryId;

    private Integer libraryCategoryId;

    private Byte typeId;

    private Byte viewType;

    private String title;

    private String pinyin;

    private String shortTitle;

    private String tags;

    private String thumbDefault;

    private String thumbAppTop;

    private String thumbAppH;

    private String thumbAppW;

    private String thumbWebTop;

    private String thumbWebH;

    private String thumbWebW;

    private String description;

    private String playTime;

    private Integer totalNum;

    private Integer updatedNum;

    private Boolean isOver;

    private Boolean allowComment;

    private Integer commentCount;

    private Integer pv;

    private Integer sort;

    private Byte score;

    private String code;

    private Boolean status;

    private Integer siteId;

    private Date createdAt;

    private Integer createdBy;

    private Date updatedAt;

    private Integer updatedBy;

    private Date publishedAt;

    private Integer publishedBy;

    private Date unpublishedAt;

    private Integer unpublishedBy;

    private Date checkedAt;

    private Integer checkedBy;

    private Date lockedAt;

    private Integer lockedBy;
    
    

    @Override
	public String toString() {
		return "Librarys [libraryId=" + libraryId + ", libraryCategoryId=" + libraryCategoryId + ", typeId=" + typeId
				+ ", viewType=" + viewType + ", title=" + title + ", pinyin=" + pinyin + ", shortTitle=" + shortTitle
				+ ", tags=" + tags + ", thumbDefault=" + thumbDefault + ", thumbAppTop=" + thumbAppTop + ", thumbAppH="
				+ thumbAppH + ", thumbAppW=" + thumbAppW + ", thumbWebTop=" + thumbWebTop + ", thumbWebH=" + thumbWebH
				+ ", thumbWebW=" + thumbWebW + ", description=" + description + ", playTime=" + playTime + ", totalNum="
				+ totalNum + ", updatedNum=" + updatedNum + ", isOver=" + isOver + ", allowComment=" + allowComment
				+ ", commentCount=" + commentCount + ", pv=" + pv + ", sort=" + sort + ", score=" + score + ", code="
				+ code + ", status=" + status + ", siteId=" + siteId + ", createdAt=" + createdAt + ", createdBy="
				+ createdBy + ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy + ", publishedAt=" + publishedAt
				+ ", publishedBy=" + publishedBy + ", unpublishedAt=" + unpublishedAt + ", unpublishedBy="
				+ unpublishedBy + ", checkedAt=" + checkedAt + ", checkedBy=" + checkedBy + ", lockedAt=" + lockedAt
				+ ", lockedBy=" + lockedBy + "]";
	}

	public Integer getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(Integer libraryId) {
        this.libraryId = libraryId;
    }

    public Integer getLibraryCategoryId() {
        return libraryCategoryId;
    }

    public void setLibraryCategoryId(Integer libraryCategoryId) {
        this.libraryCategoryId = libraryCategoryId;
    }

    public Byte getTypeId() {
        return typeId;
    }

    public void setTypeId(Byte typeId) {
        this.typeId = typeId;
    }

    public Byte getViewType() {
        return viewType;
    }

    public void setViewType(Byte viewType) {
        this.viewType = viewType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle == null ? null : shortTitle.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getThumbDefault() {
        return thumbDefault;
    }

    public void setThumbDefault(String thumbDefault) {
        this.thumbDefault = thumbDefault == null ? null : thumbDefault.trim();
    }

    public String getThumbAppTop() {
        return thumbAppTop;
    }

    public void setThumbAppTop(String thumbAppTop) {
        this.thumbAppTop = thumbAppTop == null ? null : thumbAppTop.trim();
    }

    public String getThumbAppH() {
        return thumbAppH;
    }

    public void setThumbAppH(String thumbAppH) {
        this.thumbAppH = thumbAppH == null ? null : thumbAppH.trim();
    }

    public String getThumbAppW() {
        return thumbAppW;
    }

    public void setThumbAppW(String thumbAppW) {
        this.thumbAppW = thumbAppW == null ? null : thumbAppW.trim();
    }

    public String getThumbWebTop() {
        return thumbWebTop;
    }

    public void setThumbWebTop(String thumbWebTop) {
        this.thumbWebTop = thumbWebTop == null ? null : thumbWebTop.trim();
    }

    public String getThumbWebH() {
        return thumbWebH;
    }

    public void setThumbWebH(String thumbWebH) {
        this.thumbWebH = thumbWebH == null ? null : thumbWebH.trim();
    }

    public String getThumbWebW() {
        return thumbWebW;
    }

    public void setThumbWebW(String thumbWebW) {
        this.thumbWebW = thumbWebW == null ? null : thumbWebW.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPlayTime() {
        return playTime;
    }

    public void setPlayTime(String playTime) {
        this.playTime = playTime == null ? null : playTime.trim();
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getUpdatedNum() {
        return updatedNum;
    }

    public void setUpdatedNum(Integer updatedNum) {
        this.updatedNum = updatedNum;
    }

    public Boolean getIsOver() {
        return isOver;
    }

    public void setIsOver(Boolean isOver) {
        this.isOver = isOver;
    }

    public Boolean getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(Boolean allowComment) {
        this.allowComment = allowComment;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Integer getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(Integer publishedBy) {
        this.publishedBy = publishedBy;
    }

    public Date getUnpublishedAt() {
        return unpublishedAt;
    }

    public void setUnpublishedAt(Date unpublishedAt) {
        this.unpublishedAt = unpublishedAt;
    }

    public Integer getUnpublishedBy() {
        return unpublishedBy;
    }

    public void setUnpublishedBy(Integer unpublishedBy) {
        this.unpublishedBy = unpublishedBy;
    }

    public Date getCheckedAt() {
        return checkedAt;
    }

    public void setCheckedAt(Date checkedAt) {
        this.checkedAt = checkedAt;
    }

    public Integer getCheckedBy() {
        return checkedBy;
    }

    public void setCheckedBy(Integer checkedBy) {
        this.checkedBy = checkedBy;
    }

    public Date getLockedAt() {
        return lockedAt;
    }

    public void setLockedAt(Date lockedAt) {
        this.lockedAt = lockedAt;
    }

    public Integer getLockedBy() {
        return lockedBy;
    }

    public void setLockedBy(Integer lockedBy) {
        this.lockedBy = lockedBy;
    }
}