package springbootcourse.albin.squeed.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springbootcourse.albin.squeed.web.models.Room;
import springbootcourse.albin.squeed.web.services.RoomService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", this.roomService.getAllRooms());
        return "rooms";
    }
}
