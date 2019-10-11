package com.mod.Entity;

import javax.persistence.*;

@Entity
@Table(name="mentor_calendar")
public class MentorCalendar {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="calendar_id")
    private Integer calendarId;
    @Column(name="time_slot")
    private String timeSlot;
    @Column(name="mentor_id")
    private Integer mentorId;
    @Column(name="slot_status")
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
