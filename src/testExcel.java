import java.io.IOException;


public class testExcel {

	public static void main(String[] args) throws IOException {
		
		ExcelReader excel =new ExcelReader("D:\\udemy prac\\Seleniun raman_excelReader.xlsx");
		String Sheet1name="trainer";
		int rowcount =excel.getRowCount(Sheet1name);
		System.out.println(rowcount);
	}
	
}
