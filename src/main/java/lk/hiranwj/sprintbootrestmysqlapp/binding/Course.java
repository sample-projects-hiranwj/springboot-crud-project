package lk.hiranwj.sprintbootrestmysqlapp.binding;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "course_details")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    private String name;
    private Double price;
}
