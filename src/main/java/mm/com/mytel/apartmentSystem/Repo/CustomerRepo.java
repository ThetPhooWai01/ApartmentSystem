package mm.com.mytel.apartmentSystem.Repo;

import mm.com.mytel.apartmentSystem.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
