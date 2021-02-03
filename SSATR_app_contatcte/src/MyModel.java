import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DoubleD
 */
// creez un model pentru a afisa contactele intr-un tabel in form

public class MyModel extends AbstractTableModel{
    
    private String[] columns;
    private Object[][] rows;
    
    public MyModel(){}
    
    public MyModel(Object[][] data, String[] columnsName){
        
        this.columns = columnsName;
        this.rows = data;
        
    }
            
    public Class getColumnsClass(int col){
        // indexul coloanei imagine este 8
        if (col == 8){ return Icon.class; }
        else {
            return getValueAt(0, col).getClass();
        }
    }
        
    @Override
    public int getRowCount() {        
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {        
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnsIndex) {        
        return this.rows[rowIndex][columnsIndex];
    }
    
    @Override
    public String getColumnName(int col){
        return  this.columns[col];
    }
}
