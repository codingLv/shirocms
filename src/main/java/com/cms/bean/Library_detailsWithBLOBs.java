package com.cms.bean;

public class Library_detailsWithBLOBs extends Library_details {
    private String playurl;

    private String note;

    public String getPlayurl() {
        return playurl;
    }

    public void setPlayurl(String playurl) {
        this.playurl = playurl == null ? null : playurl.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}