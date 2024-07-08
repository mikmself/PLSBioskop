/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;

import entity.MhsEntity;
import model.MhsModel;

/**
 *
 * @author User
 */
public interface MhsListener {
    
    public void onChange(MhsModel mhsModel);
    
    public void onInsert(MhsEntity mhsEntity);
    
    public void onUpdate(MhsEntity mhsEntity);
    
    public void onDelete();
}
