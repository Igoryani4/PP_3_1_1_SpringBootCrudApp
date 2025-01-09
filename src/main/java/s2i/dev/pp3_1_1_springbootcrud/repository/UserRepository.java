package s2i.dev.pp3_1_1_springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import s2i.dev.pp3_1_1_springbootcrud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
