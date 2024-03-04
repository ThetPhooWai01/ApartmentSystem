package mm.com.mytel.apartmentSystem.Service;

import mm.com.mytel.apartmentSystem.Dto.RoomDto;
import mm.com.mytel.apartmentSystem.Entity.Room;
import mm.com.mytel.apartmentSystem.Repo.BaseResponse;
import mm.com.mytel.apartmentSystem.Repo.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    private RoomRepo roomRepo;

    public BaseResponse saveRoom(RoomDto roomDto) {
        Room room = new Room();
        room.setRoomType(roomDto.getRoomType());
        room.setArea(roomDto.getArea());
        room.setStatus(roomDto.getStatus());
        room.setCustomerId(roomDto.getCustomerId());
        return new BaseResponse("", roomRepo.save(room), "");

    }

    public BaseResponse getRoom(Integer roomNo) {
        Optional<Room> room = roomRepo.findById(roomNo);
        if (!room.isPresent()) {
            return new BaseResponse("", null, "");
        }
        return new BaseResponse("", room.get(), "");
    }

    public BaseResponse deleteRoom(Integer roomNo) {
        Optional<Room> room = roomRepo.findById(roomNo);
        if (room.isPresent()) {
            Room room1 = new Room();
            roomRepo.delete(room1);
            return new BaseResponse("", null, "");

        } else {
            return new BaseResponse("", null, "");
        }
    }

    public BaseResponse updateRoom(RoomDto roomDto, Integer roomNo){
        Optional<Room> room=roomRepo.findById(roomNo);
        if(room.isPresent()){
            Room room1=new Room();
            room1.setArea(roomDto.getArea());
            room1.setRoomType(roomDto.getRoomType());
            room1.setStatus(roomDto.getStatus());
            return new BaseResponse("",roomRepo.save(room1),"");
        }else{
            return new BaseResponse("",null,"");
        }
    }

}
