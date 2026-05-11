/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package includeClass;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author mona
 */
public class TableColumAigneer {
    // ຈັດໃຫ້ຖັນທີ່ລະບຸຢູ່ກາງ
    public static void alignCenter(JTable table, int... columns) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int col : columns) {
            table.getColumnModel().getColumn(col).setCellRenderer(centerRenderer);
        }
    }

    // ຈັດໃຫ້ຖັນທີ່ລະບຸຢູ່ຂວາ
    public static void alignRight(JTable table, int... columns) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        for (int col : columns) {
            table.getColumnModel().getColumn(col).setCellRenderer(rightRenderer);
        }
    }
    
    public static void alignLeft(JTable table, int... columns) {
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.LEFT);
        for (int col : columns) {
            table.getColumnModel().getColumn(col).setCellRenderer(leftRenderer);
        }
    }
}
