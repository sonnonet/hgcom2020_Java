package headfirst;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public MyDate(int day, int month, int year) 
	{
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public void setDay(int day)
	{
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (day <0 || day >31) {
				isValid = false;
			}
			else {
				this.day = day;
			}
			break;
		case 4: case 6: case 9: case 11:
			if (day <0 || day >30) {
				isValid = false;
			}
			else {
				this.day = day;
			}
			break;
		case 2:
			if (( ( year % 4 ==0 &&  year % 100 !=0 ) || year % 400 ==0)){  //������ ���
				if (day <0 || day >29) {
					isValid = false;
				} 
				else {
					this.day = day;
				}
			}
			else {
				if (day <0 || day >28) {
					isValid = false;
				} 
				else {
					this.day = day;
				}
			}
			break;
		default:
			isValid = false;
	}
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public void setMonth(int month)
	{
		this.month = month;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	
	}
	public int getDay()
	{
		return day;
	}
	public String isValid() 
	{
		if(isValid)
		{
			return "��ȿ�� ��¥�Դϴ�.";
		}
		else
		{
			return "��ȿ���� �ʴ� ��¥�Դϴ�.";
		}
	}
}
