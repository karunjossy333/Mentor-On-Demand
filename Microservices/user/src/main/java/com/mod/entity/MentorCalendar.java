package com.mod.entity;

import javax.persistence.*;

public class MentorCalendar {

    private Integer calendarId;
    private String timeSlot;
    private Integer mentorId;
    private Boolean slotStatus;

    public MentorCalendar() {
    }

    public MentorCalendar(String timeSlot, Integer mentorId, Boolean slotStatus) {
        this.timeSlot = timeSlot;
        this.mentorId = mentorId;
        this.slotStatus = slotStatus;
    }

    public Integer getCalendarId() {
        return calendarId;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public Integer getMentorId() {
        return mentorId;
    }

    public void setMentorId(Integer mentorId) {
        this.mentorId = mentorId;
    }

    public Boolean getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(Boolean slotStatus) {
        this.slotStatus = slotStatus;
    }
}
