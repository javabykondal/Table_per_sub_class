package org.example;


import javax.persistence.*;

@Entity
@Table(name = "Records")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sid")
    private int id;
    @Column(name = "RollNumber")
    private String Roll;
    @Column(name = "Name")
    private String Name;

    public Student()
    {

    }
    public Student(String roll, String name) {
        Roll = roll;
        Name = name;
    }

    public Student(int id, String roll, String name) {
        this.id = id;
        Roll = roll;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String roll) {
        Roll = roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Roll='" + Roll + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
