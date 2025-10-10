package beginner.todo.list.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beginner.todo.list.model.Habit;

@Repository
public interface HabitsRepository extends JpaRepository<Habit, Long> {
    Habit findByName(String name);
    Habit findByFrequency(String frequency);
    List<Habit> findByStartDate(LocalDate startDate);
    
}
