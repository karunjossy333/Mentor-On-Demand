package com.mod.service;

import com.mod.Entity.MentorCalendar;
import com.mod.Repository.MentorCalendarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MentorCalendarService {
    @Autowired
    private MentorCalendarRepo mcr;

    public List<MentorCalendar> getCalendar() {
        List<MentorCalendar> ls=new ArrayList<>();
        mcr.findAll().forEach(ls::add);
        return ls;
    }

    public MentorCalendar getCalendar(String timeSlot, Integer mentorId) {
        return mcr.getCalender(timeSlot, mentorId);
    }

	public void addCalendar(MentorCalendar mc) {
		mcr.save(mc);
	}

	public void updateCalendar(MentorCalendar md) {
		mcr.save(md);
	}

	public void deleteCalendar(Integer id) {
		mcr.deleteById(id);
	}
}
