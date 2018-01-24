package com.brianchang.web.models;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class Timer {
	private Date start;
	private Date stop;
	
	//Getting start and stop
	public Date getStart() {
		return start;
	}

		public Date getStop() {
		return stop;
	}
	
	//Setting start and stop
	public void setStart() {
		this.start = new Date();
	}

	public void setStop() {
		this.stop = new Date();
	}

	//Get the total running time, after start and stop.
	public String getTotal() {
		//subtract stop from start, result is a long type integer.
		long total_time_elapsed = stop.getTime() - start.getTime();
		//take the result of total_time_elapsed and translate it into seconds away from milliseconds.
		long seconds = TimeUnit.MILLISECONDS.toSeconds(total_time_elapsed);
		//Turn them into minutes and seconds
		long min = seconds/60;
		long sec = seconds%60;
		// total = 00m00s;
		String total = Long.toString(min) + "m" + Long.toString(sec) + "s";
		return total;
	}
	
	//IGNORE ***************
	//Get the current running time, after start for monitoring.
	//Static method because this method will belong to the class, no need
	//for instance.
	//will look like this: Timer.getCurrent(Instance of Timer);
//	public static String getCurrent(Timer time) {
//		Date now = new Date();
//		Date start =time.getStart();
//		
//		if(start == null) {
//			start = new Date();
//		}
//		
//		long difference = now.getTime() - start.getTime();
//		long seconds = TimeUnit.MILLISECONDS.toSeconds(difference);
//		long min = seconds/60;
//		long sec = seconds%60;
//		
//		String runningTime = Long.toString(min) + "m" + Long.toString(sec) + "s";
//		return runningTime;
//	}
	
	
}
