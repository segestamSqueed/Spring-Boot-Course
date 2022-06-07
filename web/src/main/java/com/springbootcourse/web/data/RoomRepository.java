package com.springbootcourse.web.data;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springbootcourse.web.models.Room;

public interface RoomRepository  extends JpaRepository<Room, Long> {
}
