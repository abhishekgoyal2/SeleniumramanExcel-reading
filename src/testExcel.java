import java.io.IOException;


public class testExcel {

	public static void main(String[] args) throws IOException {
		
		ExcelReader excel =new ExcelReader("D:\\udemy prac\\Seleniun raman_excelReader.xlsx");
		String Sheetname="trainer";
		excel.getRowCount(Sheetname);
		System.out.println(excel.getRowCount(Sheetname));
		System.out.println(excel.getColumnCount(Sheetname));
		System.out.println(excel.getCellData("trainer", "username", 1));
		System.out.println(excel.getCellData("trainer", "username", 2));
		System.out.println(excel.setCellData("trainer", "username", 3, "ankur"));
		excel.addSheet("Selenium training");

	}
	
}
