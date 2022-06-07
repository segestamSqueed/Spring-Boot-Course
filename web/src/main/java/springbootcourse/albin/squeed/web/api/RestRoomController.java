package springbootcourse.albin.squeed.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootcourse.albin.squeed.web.models.Room;
import springbootcourse.albin.squeed.web.services.RoomService;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RestRoomController {
    private final RoomService roomService;

    public RestRoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }
}
