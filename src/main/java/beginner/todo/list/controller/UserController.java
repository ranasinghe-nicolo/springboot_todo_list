package beginner.todo.list.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import beginner.todo.list.model.UserTest;
import beginner.todo.list.repository.UserRepository;



@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<UserTest> getUsers() {
        return userRepository.findAll();
    }
    
    @PostMapping("/users")
    public UserTest addUser(@RequestBody UserTest newUser) {
        if (newUser.getHabits().size() > 0)
            newUser.getHabits().forEach(habit -> {
                habit.setUser(newUser);

                if (habit.getCompletions() != null)
                    habit.getCompletions().forEach(completion -> completion.setHabit(habit));
            });

        return userRepository.save(newUser);
    }

    @DeleteMapping("/users")
    public ResponseEntity<Void> deleteUser(@RequestBody UserTest user) {
        UserTest usrDel = null;

        if (usert.getId() != null)
            usrDel = userRepository.findById(user.getId()).get();
        else if (user.getUsername() != null)
            usrDel = userRepository.findByUsername(user.getUsername());
        else if (user.getEmail() != null)
            usrDel = userRepository.findByEmail(user.getEmail());

        if (usrDel == null)
            return ResponseEntity.notFound().build();

        userRepository.delete(usrDel);
        return ResponseEntity.noContent().build();
    }
    
}