package mm.com.mytel.apartmentSystem.Repo;

import mm.com.mytel.apartmentSystem.Entity.Customer;
import mm.com.mytel.apartmentSystem.Entity.Debit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebitRepo extends JpaRepository<Debit, Integer> {
}
