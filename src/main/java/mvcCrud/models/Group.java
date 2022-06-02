package mvcCrud.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "group1")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private String groupName;
     private String dateOfStart;
     private String dateOfFinish;

    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Course> courseList;

    @OneToMany(mappedBy = "groups", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Student> students;

    @ManyToOne
    private Company company;


}
