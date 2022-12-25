package ma.enset.comptecqrses.query.repositories;


import ma.enset.comptecqrses.query.entitie.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

}

