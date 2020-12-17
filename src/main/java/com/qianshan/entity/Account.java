package com.qianshan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private long id;
    private String username;
    private String password;
    private int age;

    public String toString(){
        String s = String.valueOf(this.id)+"+"+this.username+"+"+this.password+"+"+String.valueOf(this.age);
        return s;
    }
}
