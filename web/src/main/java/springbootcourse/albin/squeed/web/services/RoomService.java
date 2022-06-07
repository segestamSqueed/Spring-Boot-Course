package springbootcourse.albin.squeed.web.services;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import springbootcourse.albin.squeed.web.data.RoomRepository;
import springbootcourse.albin.squeed.web.models.Room;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private final RoomRepository repository;

    public RoomService(RoomRepository repository) {
        this.repository = repository;
    }

    public List<Room> getAllRooms() {
        return repository.findAll();
    }

}
