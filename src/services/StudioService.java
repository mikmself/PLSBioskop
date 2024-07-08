package services;

import entity.StudioEntity;
import eror.StudioException;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface StudioService {
    public void InserStudio(StudioEntity studio) throws StudioException;
    
    public void UpdateStudio(StudioEntity studio) throws StudioException;
     
    public void DeleteStudio(Integer id) throws StudioException;
      
    public StudioEntity getByKode(Integer id) throws StudioException;
       
    public StudioEntity getByNama(String nama) throws StudioException;
        
    public List<StudioEntity> SelectAllStudio() throws StudioException;
}
