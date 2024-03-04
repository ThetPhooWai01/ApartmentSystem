package mm.com.mytel.apartmentSystem.Repo;

import mm.com.mytel.apartmentSystem.Entity.Customer;
import mm.com.mytel.apartmentSystem.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface RoomRepo extends JpaRepository<Room, Integer> {
    Optional<Room> findById(Integer roomNo);

}
