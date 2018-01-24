package com.brianchang.web.models;

import java.util.Random;

public abstract class RandomWord {
	public static String generateRandomWord(int wordLength) {
	    Random r = new Random(); // Initialize a Random Number Generator with SysTime as the seed
	    StringBuilder sb = new StringBuilder(wordLength); //String builder is an object that is a mutable sequence of characters.
	    
	    for(int i = 0; i < wordLength; i++) { // For each letter in the word
	    	// adding "a" to r.nextInt causes the integer generated to start at the numeric value of "a" that is stored in memory.
	        char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Type cast the random words into Char.
	        													//Generate a letter between a and z
	        
	        sb.append(tmp); // Add it to the String
	    }
	    return sb.toString();
	}
}
