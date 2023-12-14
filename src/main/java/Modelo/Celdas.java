
package Modelo;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author SENA
 */
public class Celdas extends DefaultTableCellRenderer{
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        c.setForeground(new java.awt.Color(0,0,0));
        c.setFont(new java.awt.Font("Verdana",0,12));
        
        if (value instanceof JButton){
           JButton btn = (JButton)value;
           btn.setBorderPainted(false);
           btn.setContentAreaFilled(false);
           return btn;
        }
        
        if (value instanceof JLabel){
            JLabel lbl = (JLabel)value;
            table.setRowHeight(52);
            lbl.setFont(new java.awt.Font("Verdana",0,12));
            return lbl;
        }
        
        return c;
        
    }        
}
