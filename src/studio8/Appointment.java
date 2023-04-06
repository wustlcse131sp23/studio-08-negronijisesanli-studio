package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	/**
	 * create new appointment
	 * @param date date 
	 * @param time time
	 */
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	public static void main(String[] args) {
		Date newyear = new Date(1,1,2000,true);
    	Date today = new Date(4,6,2023,false);
    	Date easter = new Date(4,9,2023,true);
    	Date lindsey = new Date(11,9,2001,true);
    	Date marcus = new Date(4,26,2004,true);
    	Date temi = new Date(11,10,2004,true);
    	Date freedom = new Date(6,28,2000, true);
    	Time noon = new Time(12,0);
		Time midnight = new Time(0,0);
		Time due = new Time(23,59);
		Appointment hw = new Appointment(easter,due);
		Appointment party = new Appointment(lindsey,midnight);
		HashSet<Appointment> calendar = new HashSet<Appointment>();
		calendar.add(hw);
		calendar.add(party);
		System.out.println(calendar);
	}
	
	

}
