package co.develhope.Hibernate00;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "FK_students")
    private Student student_id;
    @ManyToOne
    @JoinColumn(name = "FK_classes")
    private Class class_id;
}
