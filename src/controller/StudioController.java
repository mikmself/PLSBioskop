package controller;

import javax.swing.JOptionPane;
import model.StudioModel;
import view.StudioVIew;
public class StudioController {
    private StudioModel studioModel;

    public void setStudioModel(StudioModel studioModel) {
        this.studioModel = studioModel;
    }
    
    public void resetStudio(StudioVIew studioView){
        studioModel.resetStudio();
    }
    
    public void onInsert(StudioVIew studioView){
        String id = studioView.getTxtID().getText();
        String nomorStudio = studioView.getTxtNomor().getText();
        
        if (id.trim().equals("")) {
            JOptionPane.showMessageDialog(studioView, "ID tidak boleh kosong");
        } else if (nomorStudio.trim().equals("")) {
            JOptionPane.showMessageDialog(studioView, "Nomor Studio tidak boleh kosong");
        } else {
            try {
                int nomorStudioInt = Integer.parseInt(nomorStudio);
                studioModel.setNomor_studio(nomorStudioInt);
                
                studioModel.insertStudio();
                JOptionPane.showMessageDialog(studioView, "Data studio berhasil dimasukkan");
                studioModel.resetStudio();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(studioView, "Nomor Studio harus berupa angka");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(studioView, "Error ke database: " + e.getMessage());
            }
        }
    }
}
