package com.example.demo;


import javax.persistence.*;

@Entity(name = "Student")
@Table(
        name = "student",
        uniqueConstraints = {
                @UniqueConstraint(name = "unique_student_mail", columnNames = "email")
        }
)
public class Student {

    @Id

    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    @Column(
            name =  "id",
            updatable = false
    )
    private long id;

    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition =  "TEXT"
    )
    private  String First_name;
    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition =  "TEXT"
    )
    private  String Last_name;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition =  "TEXT"
    )
    private String email;

    @Column(name = "age", nullable = false)
    private  Integer age;

    public Student(String first_name, String last_name, String email, Integer age) {
        First_name = first_name;
        Last_name = last_name;
        this.email = email;
        this.age = age;
    }

    public Long getId(){
        return  id;
    }
    public void setId(long id){
        this.id = id;
    }
    public  String getFirst_name(){
        return  First_name;
    }
    public void setFirst_name(String firstName){
        this.First_name = firstName;
    }
    public  String getLast_name(){
        return  Last_name;
    }
    public void setLast_name(String lastName){
        this.Last_name = lastName;
    }

    public  String getEmail(){
        return  email;
    }


    public void setEmail(String email){
        this.email = email;
    }
    public  Integer getAge(){
        return  age;
    }
    public  void  setAge(Integer age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", First_name='" + First_name + '\'' +
                ", Last_name='" + Last_name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
