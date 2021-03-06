package ch10;

public class BirthDay {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day > 0 && day < 32) {
				isValid = true;
			}
			else {
				isValid = false;
			}
			break;
		case 2: 
			if(day > 0 && day < 30) {
				isValid = true;
			}
			else {
				isValid = false;
			}
			break;	
		case 4: case 6: case 9: case 11: 
			if(day > 0 && day < 31) {
				isValid = true;
			}
			else {
				isValid = false;
			}
			break; 
		default:
			isValid = false;
		}
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;	
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
}
