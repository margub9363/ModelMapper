package org.example.model;

public class PersonDTO {

    String fullName;
    int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
