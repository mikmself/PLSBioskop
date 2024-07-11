/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package event;

import entity.JadwalEntity;
import model.JadwalModel;

/**
 *
 * @author ACER
 */
public interface JadwalListener {
    public void OnChange(JadwalModel JadwalModel);
    
    public void OnInsert(JadwalEntity JadwalEntitiy);
    
    public void onUpdate(JadwalEntity JadwalEntitiy);
    
    public void onDelete();
}
