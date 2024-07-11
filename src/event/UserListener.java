/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package event;
import entity.UserEntity;
import java.sql.Connection;
import model.UserModel;

/**
 *
 * @author ADMIN
 */
public interface UserListener {
    public void OnChange(UserModel userModel);
    
    public void OnInsert(UserModel userModel);
    
    public void onUpdate();
    
    public void onDelete();
}
