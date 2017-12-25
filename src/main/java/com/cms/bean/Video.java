package com.cms.bean;

public class Video {
    private Integer videoId;

    private String videoName;

    private String videoSrc;

    private Integer knowledgeId;

    private Integer sort;

    private String clarity;

    private String codeCheck;

    private String introduction;

    private String duration;

    private String picture;
    
    private Grade grade;
    
    private Subject subject;
        
    private Knowledge_point konwledge_point;
    
    

    @Override
	public String toString() {
		return "Video [videoId=" + videoId + ", videoName=" + videoName + ", videoSrc=" + videoSrc + ", knowledgeId="
				+ knowledgeId + ", sort=" + sort + ", clarity=" + clarity + ", codeCheck=" + codeCheck
				+ ", introduction=" + introduction + ", duration=" + duration + ", picture=" + picture + ", grade="
				+ grade + ", subject=" + subject + ", konwledge_point=" + konwledge_point + "]";
	}

	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Video(Integer videoId, String videoName, String videoSrc, Integer knowledgeId, Integer sort, String clarity,
			String codeCheck, String introduction, String duration, String picture, Grade grade, Subject subject,
			Knowledge_point konwledge_point) {
		super();
		this.videoId = videoId;
		this.videoName = videoName;
		this.videoSrc = videoSrc;
		this.knowledgeId = knowledgeId;
		this.sort = sort;
		this.clarity = clarity;
		this.codeCheck = codeCheck;
		this.introduction = introduction;
		this.duration = duration;
		this.picture = picture;
		this.grade = grade;
		this.subject = subject;
		this.konwledge_point = konwledge_point;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Knowledge_point getKonwledge_point() {
		return konwledge_point;
	}

	public void setKonwledge_point(Knowledge_point konwledge_point) {
		this.konwledge_point = konwledge_point;
	}

	public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoSrc() {
        return videoSrc;
    }

    public void setVideoSrc(String videoSrc) {
        this.videoSrc = videoSrc == null ? null : videoSrc.trim();
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getClarity() {
        return clarity;
    }

    public void setClarity(String clarity) {
        this.clarity = clarity == null ? null : clarity.trim();
    }

    public String getCodeCheck() {
        return codeCheck;
    }

    public void setCodeCheck(String codeCheck) {
        this.codeCheck = codeCheck == null ? null : codeCheck.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}