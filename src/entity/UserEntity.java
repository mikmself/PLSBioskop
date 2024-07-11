/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import event.UserListener;

/**
 *
 * @author ADMIN
 */
public class UserEntity {
    private Integer id;
    private String nama;
    private String email;
    private String password;
    private UserListener userListener;
 
    public UserEntity(){
        
        
    }
    public UserEntity(String nama, String email, String password){
        this.nama = nama ;
        this.email = email;
        this.password = password;
    }

    public UserListener getUserListener() {
        return userListener;
    }

    public Integer getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUserListener(UserListener userListener) {
        this.userListener = userListener;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
