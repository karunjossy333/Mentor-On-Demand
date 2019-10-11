package com.mod.Repository;

import com.mod.Entity.MentorCalendar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MentorCalendarRepo extends CrudRepository<MentorCalendar, Integer> {
    @Query(value="select * from mentor_calendar m where m.time_slot = ?1 && m.mentor_id = ?2 && m.slot_status = true",nativeQuery = true)
    MentorCalendar getCalender(String timeSlot, Integer mentorId);
}
