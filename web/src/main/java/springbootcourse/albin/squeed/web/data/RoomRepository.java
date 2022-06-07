package springbootcourse.albin.squeed.web.data;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootcourse.albin.squeed.web.models.Room;

public interface RoomRepository  extends JpaRepository<Room, Long> {
}
