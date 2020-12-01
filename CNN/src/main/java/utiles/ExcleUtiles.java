package utiles;

import common.WebAPI;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Iterator;

public class ExcleUtiles extends WebAPI {

//    public static void main(String[] args) throws IOException {
//        getRowCount();
//    }
//   public static void getRowCount() throws IOException {
//
//       try{
//          String  FILENAME=System.getProperty("user.dir") ;
//           XSSFWorkbook workbook= new XSSFWorkbook(FILENAME+"/excle/New OpenDocument Spreadsheet.xls");
//       XSSFSheet sheet=workbook.getSheet("Sheet1");
//    int rowCount=  sheet.getPhysicalNumberOfRows();
//           System.out.println("number of raws:"+rowCount);
//   }catch (Exception exp){
//           System.out.println(exp.getMessage());
//           System.out.println(exp.getCause());
//          // exp.printStackTrace();
//       }
//   }



   public static final String FILE_NAME = System.getProperty("user.dir") + "/excle/data.xlsx";

    /**
     * This method is to read Excel file based on sheet Index Number
     */
    public static void readExcelFile(String fileName, int sheetNumber) {
        try {
            FileInputStream inputStream = new FileInputStream(new File(fileName));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);
            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();

                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + " ");

                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue());
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found Exception");

        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("Input Output Exception");
        }

    }




}

















