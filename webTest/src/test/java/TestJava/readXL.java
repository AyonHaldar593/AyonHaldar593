package TestJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readXL {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\ayonh\\OneDrive\\Desktop\\test.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		Iterator<Row> rowit = sheet.iterator();
		while(rowit.hasNext()) {
			Row row = rowit.next();
			Iterator<Cell> cellIt = row.iterator();
			while(cellIt.hasNext()) {
				Cell cell = cellIt.next();
				System.out.println(cell.toString());
			}
		}
		
	}

}

