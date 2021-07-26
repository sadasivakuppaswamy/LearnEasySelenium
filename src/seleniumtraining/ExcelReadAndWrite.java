package seleniumtraining;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class ExcelReadAndWrite {
    public static void main(String... args) throws IOException {
        File file=new File("ExcelTest.xlsx");
        FileInputStream fileInputStream=new FileInputStream(file);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        /*XSSFSheet xssfSheet=xssfWorkbook.createSheet("FirstSheet");
        XSSFRow xssfRow=xssfSheet.createRow(0);
        Cell cell=xssfRow.createCell(0);

        //cell.setCellType();
        cell.setCellValue("name");
        Cell cell1=xssfRow.createCell(1);

        //cell.setCellType();
        cell1.setCellValue("sadasiva");
        Cell cell2=xssfRow.createCell(2);

        //cell.setCellType();
        cell2.setCellValue("E2531");
        FileOutputStream fos=new FileOutputStream(file);
        try {
            xssfWorkbook.write(fos);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/


        XSSFSheet xssfSheet = xssfWorkbook.getSheet("FirstSheet");
        Iterator<Row> rowiterator = xssfSheet.iterator();

        while (rowiterator.hasNext()){
            XSSFRow xssfRow=(XSSFRow) rowiterator.next();
            Iterator<Cell> cells=xssfRow.iterator();
            while (cells.hasNext()){
                System.out.println(cells.next());
            }

        }
        Cell xssfRow=xssfSheet.getRow(0).getCell(2);
        System.out.println(xssfRow);
    }
}
