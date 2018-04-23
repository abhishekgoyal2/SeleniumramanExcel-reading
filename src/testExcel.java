import java.io.IOException;

import org.apache.log4j.Logger;


public class testExcel {

	public static void main(String[] args) throws IOException {
		
		Logger log =Logger.getLogger("devpinbyLoger");
		ExcelReader excel =new ExcelReader("D:\\udemy prac\\Seleniun raman_excelReader.xlsx");
		String Sheetname="trainer";
		
		log.debug("getting row count");
		excel.getRowCount(Sheetname);
		System.out.println(excel.getRowCount(Sheetname));
		log.debug("getting row count");
		
		System.out.println(excel.getColumnCount(Sheetname));
		log.debug("gettign sheet name ");
		System.out.println(excel.getCellData("trainer", "username", 1));
		
		log.debug("gettign data ");
		System.out.println(excel.getCellData("trainer", "username", 2));
		
		log.debug("gettign data ");
//		System.out.println(excel.setCellData("trainer", "username", 5, "ankur5"));
//		excel.addSheet("Selenium training");

	}
	
}
