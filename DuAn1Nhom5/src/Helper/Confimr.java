/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.awt.Component;
import java.awt.Frame;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author long
 */
public class Confimr {

    public static String Role = null;
    public static String MaNhanVien = null;

    public static void alert(Component parent, String message) {

        JOptionPane.showMessageDialog(parent, message, "Hệ thống Thông Báo", JOptionPane.INFORMATION_MESSAGE);

    }

    public static boolean confirm(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Hệ thống Thông Báo",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;

    }

    public static String prompt(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message,
                "Hệ thống Thông Báo", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void Export(JTable table, Frame frame) {
//                FileOutputStream excelFos = null;
//                HSSFWorkbook excelJTableExport = null;
//                BufferedOutputStream   excelBos = null;
//                try {
//        
//                    //Choosing Saving Location
//                    //Set default location to C:\Users\Authentic\Desktop or your preferred location
//                    JFileChooser excelFileChooser = new JFileChooser("C:\\Users\\Authentic\\Desktop");
//                    //Dialog box title
//                    excelFileChooser.setDialogTitle("Save As ..");
//                    //Filter only xls, xlsx, xlsm files
//                    FileNameExtensionFilter fnef = new FileNameExtensionFilter("Files", "xls", "xlsx", "xlsm");
//                    //Setting extension for selected file names
//                    excelFileChooser.setFileFilter(fnef);
//                    int chooser = excelFileChooser.showSaveDialog(frame);
//                    //Check if save button has been clicked
//                    if (chooser == JFileChooser.APPROVE_OPTION) {
//                        //If button is clicked execute this code
//                        excelJTableExport = new HSSFWorkbook();
//                        HSSFSheet excelSheet = excelJTableExport.createSheet("Jtable Export");
//                        //Loop through the jtable columns and rows to get its values
//                        for (int i = 0; i < table.getModel().getRowCount(); i++) {
//                            HSSFRow excelRow = excelSheet.createRow(i);
//                            for (int j = 0; j < table.getModel().getColumnCount(); j++) {
//                                HSSFCell excelCell = excelRow.createCell(j);
//        
//                                excelCell.setCellValue(table.getModel().getValueAt(i, j).toString());
//                                System.out.println(excelCell);
//                            
//        
//                            }
//                        }
//                        excelFos = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xls");
//                        excelBos = new BufferedOutputStream(excelFos);
//                        excelJTableExport.write(excelBos);
//                      
//                        JOptionPane.showMessageDialog(frame, "Exported Successfully");
//                    }
//        
//                } catch (FileNotFoundException ex) {
//                    JOptionPane.showMessageDialog(null, ex);
//                    ex.printStackTrace();
//                } catch (IOException ex) {
//                    JOptionPane.showMessageDialog(null, ex);
//                    ex.printStackTrace();
//                } finally {
//                    try {
//                        if (excelFos != null) {
//                            excelFos.close();
//                        }
//                        if (excelBos != null) {
//                            excelBos.close();
//                        }
//                        if (excelJTableExport != null) {
//                            excelJTableExport.close();
//                        }
//                    } catch (IOException ex) {
//                        JOptionPane.showMessageDialog(null, ex);
//                        ex.printStackTrace();
//                    }
//                }
//            }

        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                File out = new File(file + ".xls");
                try (OutputStreamWriter bwrite = new OutputStreamWriter(new FileOutputStream(out), StandardCharsets.UTF_8)) {
                  
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        bwrite.write(table.getColumnName(j) + "\t");
                    }
                    bwrite.write("\n");
                    // Lay du lieu dong
                    for (int j = 0; j < table.getRowCount(); j++) {
                        for (int k = 0; k < table.getColumnCount(); k++) {
                            bwrite.write(table.getValueAt(j, k) + "\t");
                        }
                        bwrite.write("\n");
                    }
                }
                JOptionPane.showMessageDialog(null, "Lưu file thành công!");
            } catch (Exception e2) {
                e2.printStackTrace();
                JOptionPane.showMessageDialog(null, "Lỗi khi lưu file!");
            }
        }
    }
}
