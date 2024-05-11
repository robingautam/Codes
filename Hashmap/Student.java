package Hashmap;

import java.util.Objects;

public class Student {
    int id;
    String name;
    String email;
    Student(){}

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
      Student st = (Student) o;
      return st.id==this.id && st.email.equals(this.email);
    }

    @Override
    public int hashCode() {
        return this.id+this.email.hashCode()+this.name.hashCode();
    }
}
