package pfa.server.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pfa.server.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

	Optional<Account> findByUserName(String username);
	
	Account findByUserNameAndActive(String username, boolean active);
}