package com.cms.bean;

public class Knowledge_point {
    private Integer knowledgeId;

    private String knowledgeName;
    
    private String picture;

    private Integer subjectId;

    private Integer sort;
    
    private Subject subject;
    
    private Grade grade;
    
    

	

	@Override
	public String toString() {
		return "Knowledge_point [knowledgeId=" + knowledgeId + ", knowledgeName=" + knowledgeName + ", picture="
				+ picture + ", subjectId=" + subjectId + ", sort=" + sort + ", subject=" + subject + ", grade=" + grade
				+ "]";
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Knowledge_point() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Knowledge_point(Integer knowledgeId, String knowledgeName, Integer subjectId, Integer sort, Subject subject,
			Grade grade) {
		super();
		this.knowledgeId = knowledgeId;
		this.knowledgeName = knowledgeName;
		this.subjectId = subjectId;
		this.sort = sort;
		this.subject = subject;
		this.grade = grade;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName == null ? null : knowledgeName.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}