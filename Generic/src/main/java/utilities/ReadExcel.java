package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadExcel {

    private static final String FILE_NAME = System.getProperty("user.dir") + "/DataTest/TestExcelFile.xlsx";
    public static List<String> emails= new ArrayList<>();
    public static List<String> passwords= new ArrayList<>();
    //public static int arrayIndex =0;
    public static int excelIndex =1;

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
                        if (excelIndex%2==0){
                            passwords.add(currentCell.getStringCellValue());
                            excelIndex++;
                        }else{
                            emails.add(currentCell.getStringCellValue());
                            excelIndex++;
                        }
//                        System.out.print(currentCell.getStringCellValue() + "");
                        //emails.add(currentCell.getStringCellValue());

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
