package com.aincorp.wardrobe.springboot.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Пожалуйста введите ваш емейл адрес")
    @Email(message = "Введите корректный емейл")
    private String email;

    @NotBlank(message = "Введите ваше имя")
    @Size(min=1, message = "Введено не корректное имя")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Пожалуйста введите ваш пароль")
    @Column(name = "password")
    private String password;

    @NotBlank(message = "Пожалуйста введите ваш возраст")
    @Pattern(regexp = "[\\d]{2}")
    private String age;

    @NotBlank(message = "Пожалуйста введите ваш номер телефона (пример 9111111111)")
    @Pattern(regexp = "[\\d]{10}")
    private String phoneNumber;

    @Transient
    private String confirmPassword;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User() {
    }

    public User(@NotBlank(message = "Пожалуйста введите ваш емейл адрес") @Email(message = "Введите корректный емейл") String email, @NotBlank(message = "Введите ваше имя") @Size(min = 2, message = "Введено не корректное имя") String name, @NotBlank(message = "Пожалуйста введите ваш пароль") String password, @NotBlank(message = "Пожалуйста введите ваш возраст") @Pattern(regexp = "[\\d]{2}") String age, @NotBlank(message = "Пожалуйста введите ваш номер телефона") @Pattern(regexp = "[\\d]{7}") String phoneNumber, String confirmPassword, Set<Role> roles) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.confirmPassword = confirmPassword;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
