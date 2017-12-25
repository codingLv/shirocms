package com.cms.bean;

public class Subject {
    private Integer subjectId;

    private String subjectName;

    private Integer gradeId;

    private Integer sort;
    //查询科目的同时查询相关的年级信息
    private Grade grade;
    

    @Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", gradeId=" + gradeId + ", sort="
				+ sort + ", grade=" + grade + "]";
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(Integer subjectId, String subjectName, Integer gradeId, Integer sort, Grade grade) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeId = gradeId;
		this.sort = sort;
		this.grade = grade;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}