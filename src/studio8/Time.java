package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int mins;
	private boolean format;
	/**
	 * constructor to create time object in 24 hour format
	 * @param hour hour value from 0 to 23
	 * @param mins minute value from 0 to 59
	 */
	public Time(int hour, int mins) {
		this.hour = hour;
		this.mins = mins;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return mins;
	}
	
	


	public String toString() {
		return "Time [hour=" + hour + ", mins=" + mins + "]";
	}

	public static void main(String[] args) {
		Time noon = new Time(12,0);
		Time midnight = new Time(0,0);
		Time due = new Time(23,59);
		System.out.println(noon.toString());
		System.out.println(midnight.toString());
		System.out.println(due.toString());
 
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, mins);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && mins == other.mins;
	}

}