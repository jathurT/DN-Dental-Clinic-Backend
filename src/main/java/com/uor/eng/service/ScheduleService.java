package com.uor.eng.service;

import com.uor.eng.payload.ScheduleDTO;

import java.util.List;

public interface ScheduleService {
  ScheduleDTO createSchedule(ScheduleDTO scheduleDTO);
  List<ScheduleDTO> getAllSchedules();
  ScheduleDTO getScheduleById(Long id);
}
