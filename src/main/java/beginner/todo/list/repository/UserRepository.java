package beginner.todo.list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import beginner.todo.list.model.UserTest;

@Repository
public interface UserRepository extends JpaRepository<UserTest, Integer> {
    UserTest findByUsername(String username);
    UserTest findByEmail(String email);
    
}