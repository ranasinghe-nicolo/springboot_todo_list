package beginner.todo.list.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")

public class TaskTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String nameTask;
    private String description;
    private String type;

    private Date dueDate;
    private Date inputDate;

    private Boolean status;

    // array description 

    @ManyToOne
    private UserTest user;

    // start setters and getters

    //nameTask
    public String getnameTask() {
        return nameTask;
    }

    public void setnameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    //description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    //end setters and getters

}
