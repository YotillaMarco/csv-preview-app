package com.exasol.csv.workshop;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.inject.Model;

@Model
public class PersonModel {

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String middleName;

    @Getter
    @Setter
    private String lastName;
}