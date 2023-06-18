package org.example;

import org.example.model.Person;
import org.example.model.PersonDTO;
import org.example.model.User;
import org.example.model.UserDTO;
import org.modelmapper.ModelMapper;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ModelMapper modelMapper = new ModelMapper();
        User user = new User();
        user.setFirstName("Margub");
        user.setLastName("Rahman");
        user.setAge(28);

//        Mapping for fullName is not success here
        UserDTO userDTO = modelMapper.map(user,UserDTO.class);
        System.out.println(user);
        System.out.println(userDTO);

        System.out.println();
        System.out.println("####################");
        System.out.println();

//Custom Mapping


        Person person2 = new Person();
        person2.setFirstName("Tannu");
        person2.setLastName("Rahman");
        person2.setAge(28);

        ModelMapper modelMapper2 = new ModelMapper();
       modelMapper2.typeMap(Person.class,PersonDTO.class).addMapping(Person::createFullName,PersonDTO::setFullName);



        PersonDTO personDTO2 = modelMapper2.map(person2,PersonDTO.class);
        System.out.println(person2);
        System.out.println(personDTO2);

    }
}