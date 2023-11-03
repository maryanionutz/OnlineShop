package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class User {

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private int age;
}
