/*
JpaRepository is an interface in Spring Data JPA that makes working with databases much easier. 
It is built on top of the JPA (Java Persistence API) and provides all the basic methods you need for handling data.

With JpaRepository, you don’t need to write SQL queries for common operations like:

Saving data
Updating data
Deleting data
Fetching data
*/
package com.programmingnoob.schedulr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programmingnoob.schedulr.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
