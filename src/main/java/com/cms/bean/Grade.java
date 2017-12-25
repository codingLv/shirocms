package com.cms.bean;

public class Grade {
    private Integer gradeId;

    private String gradeName;

    private Integer sort;
    

    public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grade(Integer gradeId, String gradeName, Integer sort) {
		super();
		this.gradeId = gradeId;
		this.gradeName = gradeName;
		this.sort = sort;
	}

	public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}