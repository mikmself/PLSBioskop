/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event;

import entity.FilmEntity;
import model.FilmModel;

/**
 *
 * @author ACER
 */
public interface FilmListener {
    public void OnChange(FilmModel filmModel);
    
    public void OnInsert(FilmEntity filmEntity);
    
    public void onUpdate(FilmEntity filmEntity);
    
    public void onDelete();
}
