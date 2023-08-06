package com.example.demo;


import javax.persistence.*;

@Entity
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
    private long id;
    private  String First_name;
    private  String Last_name;
    private String email;
    private  Integer age;

    public Student(long id, String first_name, String last_name, String email, Integer age) {
        this.id = id;
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
