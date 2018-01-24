package com.brianchang.web.models;

import java.util.Random;

public class RandomNumber {
	
	public static Integer generateNumber() {
		Random r = new Random();
		int low = 1;
		int high = 100;
		Integer result = r.nextInt(high-low) + low;
		return result;
	}

}
