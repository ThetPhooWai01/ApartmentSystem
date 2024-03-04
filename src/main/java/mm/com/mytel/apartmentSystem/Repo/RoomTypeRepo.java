package mm.com.mytel.apartmentSystem.Repo;

import mm.com.mytel.apartmentSystem.Entity.Customer;
import mm.com.mytel.apartmentSystem.Entity.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomTypeRepo extends JpaRepository<RoomType, String> {
}
