package com.pet.project.OnlineLibrary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "CHAR(36)")
    private String id;

    private String email;

    @Column(name = "actual_email")
    private String actualEmail;

    private String password;

    @Column(name = "name")
    private String firstName;

    @Column(name = "surname")
    private String lastName;

    private String patronymic;

    private String phone;

    @Column(name = "block")
    private boolean blocked;

    private boolean active;

    @Column(name = "nickname")
    private String nickName;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column(name = "registration_code")
    private String registrationCode;
}
