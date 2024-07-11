/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eror;

/**
 *
 * @author ADMIN
 */
public class UserException  extends Exception{
    public UserException(String par, Exception e){
        
    }
    public UserException(String msg){
        super(msg);
    }
}
