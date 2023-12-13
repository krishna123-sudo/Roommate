package com.LifeLine.Roommate;


import com.LifeLine.Roommate.all.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    private Room room;

    @Autowired

    public RoomController(Room room) {
        this.room = room;
    }
    @GetMapping("/getreport")
    public String RoomMeMaze(){
        return room.RoomMeMaze();
    }

}
