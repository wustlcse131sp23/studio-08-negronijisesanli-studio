package studio8;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	/**
	 * create date object
	 * @param month month in int
	 * @param day day value between 1 and 31
	 * @param year year 
	 * @param holiday boolean is holiday (true)
	 */
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
	
	
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", holiday=" + holiday + "]";
	}

	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getYear() {
		return year;
	}
	
	public boolean getHoliday() {
		return holiday;
	}
	
    public static void main(String[] args) {
    	Date newyear = new Date(1,1,2000,true);
    	Date today = new Date(4,6,2023,false);
    	Date easter = new Date(4,9,2023,true);
    	Date lindsey = new Date(11,9,2001,true);
    	Date marcus = new Date(4,26,2004,true);
    	Date temi = new Date(11,10,2004,true);
    	Date freedom = new Date(6,28,2000, true);
//    	System.out.println(newyear);
//    	System.out.println(today.toString());
//    	System.out.println(easter.toString());
//    	System.out.println(lindsey.toString());
//    	System.out.println(marcus.toString());
//    	System.out.println(temi.toString());
//    	System.out.println(freedom.toString());
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(freedom);
    	list.add(temi);
    	list.add(lindsey);
    	list.add(marcus);
    	list.add(easter);
    	list.add(freedom);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(freedom);
    	set.add(temi);
    	set.add(lindsey);
    	set.add(marcus);
    	set.add(easter);
    	set.add(freedom);
    	System.out.println(set);
    	System.out.println(freedom.hashCode());
    	System.out.println(easter.hashCode());
    	System.out.println(marcus.hashCode());

    }


	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
