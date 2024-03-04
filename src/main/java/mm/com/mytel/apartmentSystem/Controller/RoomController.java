package mm.com.mytel.apartmentSystem.Controller;

import mm.com.mytel.apartmentSystem.Dto.RoomDto;
import mm.com.mytel.apartmentSystem.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping
    public ResponseEntity<?> saveRoom(@RequestBody @Validated RoomDto roomDto){
        return ResponseEntity.ok(roomService.saveRoom(roomDto));
    }

}
