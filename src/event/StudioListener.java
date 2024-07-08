package event;

import entity.StudioEntity;
import java.sql.Connection;
import model.StudioModel;

public interface StudioListener {
    public void OnChange(StudioModel StudioModel);
    
    public void OnInsert(StudioEntity StudioEntitiy);
    
    public void onUpdate(StudioEntity StudioEntitiy);
    
    public void onDelete();
}
