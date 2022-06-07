package com.springbootcourse.web.services;

import org.springframework.stereotype.Service;
import com.springbootcourse.web.data.RoomRepository;
import com.springbootcourse.web.models.Room;

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

    public Room getById(long id) {
        return repository.findById(id).get();
    }
}
