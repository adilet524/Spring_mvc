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
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private String courseName;
     private int duration;
    @ManyToOne
    private Company company;

    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "courseList", cascade = {CascadeType.MERGE, CascadeType.REMOVE} )
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Group> groupList;

    @OneToOne(mappedBy = "course",
            cascade = CascadeType.REMOVE)
    private Teacher teacher;



}
