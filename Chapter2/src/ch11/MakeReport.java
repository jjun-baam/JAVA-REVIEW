package ch11;

public class MakeReport {

	StringBuffer buffer = new StringBuffer();
	
	private String line = "=========================================================\n";
	private String title = "이름\t\t주소\t\t\t    전화번호\n";
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody() {
		buffer.append("Jjun baam\t");
		buffer.append("Gyeonggi Ansan\t\t");
		buffer.append("    010-1234-9253\n");
		
		buffer.append("Dda Bi\t\t");
		buffer.append("Gyeonggi gwangmyeong\t");
		buffer.append("    010-5678-9101\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
