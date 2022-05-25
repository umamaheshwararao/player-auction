package com.playerauction.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")

public class User {
	private String userId;
    private String name;
    private int age;
    private String password;
    

}
