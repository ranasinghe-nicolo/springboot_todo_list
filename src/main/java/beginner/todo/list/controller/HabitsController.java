package beginner.todo.list.controller;
import org.springframework.web.bind.annotation.RestController;
import beginner.todo.list.repository.HabitsRepository;


@RestController 
public class HabitsController {
    private HabitsRepository habitsRepo;

    public HabitsController(HabitsRepository repo) {
        this.habitsRepo = repo;

    }
    
}
