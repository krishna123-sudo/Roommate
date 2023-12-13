package com.LifeLine.Roommate.all;

import com.LifeLine.Roommate.all.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomSpecs implements Room {
        @Override
        public String RoomMeMaze(){
            return "Bht mast Mahol hai Bhai Divu is the most handsome guy " +
                    " Rattu is an incont guys " +
                    "aur ham wo hai jinke pas kuch nahi haii";
        }
}
