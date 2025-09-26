package beginner.todo.list.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class UserTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
}
