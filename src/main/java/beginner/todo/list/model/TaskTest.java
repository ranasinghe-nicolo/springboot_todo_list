package beginner.todo.list.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")

public class TaskTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String nameTask;
    Date dueDate;
    Date inputDate;
    String status;

    // start setters and getters

    //nameTask
    public String getnameTask() {
        return nameTask;
    }

    public void setnameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    //dueDate
    public Date dueDatel() {
        return dueDate;
    }

    public void dueDatel(Date dueDate) {
        this.dueDate = dueDate;
    }

    //inputDate
    public Date getInputDate() {
        return inputDate;
    }
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    //status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    //end setters and getters

}
