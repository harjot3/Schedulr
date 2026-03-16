package com.programmingnoob.schedulr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduledEvent extends JpaRepository<ScheduledEvent, Long> {
    
}
