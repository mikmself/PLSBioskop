/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;
import entity.UserEntity;
import eror.UserException;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface UserService {
    public void InsertUser(UserEntity studio) throws UserException ;
    
    public void UpdateUser(UserEntity studio) throws UserException;
     
    public void DeleteUser(Integer id) throws UserException;
        
    public List<UserEntity> SelectAllUser() throws UserException;
    
    public void findUser(UserEntity user) throws UserException;
    
}
