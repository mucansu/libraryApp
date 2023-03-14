package com.example.demo.Entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends Profile{
    private List<Profile> userList = new ArrayList<>();
}
