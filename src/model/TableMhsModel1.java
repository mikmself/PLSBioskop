/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.MhsEntity;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class TableMhsModel1 extends AbstractTableModel{

    private List<MhsEntity> list= new ArrayList<>();

    public void setList(List<MhsEntity> list) {
        this.list = list;
    }
    
    
    public boolean add(MhsEntity saya)
    {
        try {
            return list.add(saya);
        } finally {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    
    }
     public  MhsEntity get(int kamu)
    {
        return list.get(kamu);
    
    }
      public MhsEntity set(int dia, MhsEntity anda)
    {
     try {
            return list.set(dia,anda);
        } finally {
            fireTableCellUpdated(dia,dia);
        }
    }
       public MhsEntity remove(int i)
    {
        try {
            return list.remove(i);
        } finally {
            fireTableRowsDeleted(i, i);
        }
    
    }

    @Override
    public String getColumnName(int i) {
  
    switch(i)
    {
        case 0: return "KODE";
        case 1: return "NIM";
        case 2: return "NAMA";
        case 3: return "FAKULTAS";
        case 4: return "PRODI";
        case 5: return "NOHP";
        case 6: return "EMAIL";
        default:return null;
    
    }
    
    
    }
       
       
    
    
    
    @Override
    public int getRowCount() {
  
        return list.size();
    }

    @Override
    public int getColumnCount() {
        
        return 7;
    
    }

    @Override
    public Object getValueAt(int a, int b) {
   
        switch(b)
        {
            case 0: return list.get(b).getKode();
             case 1: return list.get(b).getNim();
              case 2: return list.get(b).getNama();
               case 3: return list.get(b).getFakultas();
                case 4: return list.get(b).getProdi();
                 case 5: return list.get(b).getNohp();
                  case 6: return list.get(b).getEmail();
            default: return null;
        
        
        }
    
    }
    
}
