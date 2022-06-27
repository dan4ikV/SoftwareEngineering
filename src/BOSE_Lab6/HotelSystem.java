package BOSE_Lab6;

import java.util.LinkedList;

public class HotelSystem {
    private LinkedList<Room> rooms;

    public HotelSystem() {
        rooms = new LinkedList<>();
    }

    public LinkedList<Room> freeSingleRooms(){
        LinkedList<Room> ret = new LinkedList<>();
        for(Room room : rooms){
            if(room.getType() && room.isFree()){
                ret.add(room);
            }
        }
        return ret;
    }

    public LinkedList<Room> freeDoubleRooms(){
        LinkedList<Room> ret = new LinkedList<>();
        for(Room room : rooms){
            if(!room.getType() && room.isFree()){
                ret.add(room);
            }
        }
        return ret;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }
}
