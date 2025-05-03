package javaPractice;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.Iterator;

public class FileReading {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/Testdata/Data Source.xlsx");
            XSSFWorkbook workbook= new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet=workbook.getSheetAt(1);
            Object [][] objects = new Object[3][3];
//            System.out.println(sheet.getRow(3));
            System.out.println(sheet.getRow(3).getCell(0));
            Iterator<Row> row=sheet.rowIterator();

//            while (row.hasNext()){
//                row.hasNext();
//            }
            workbook.close();
            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
