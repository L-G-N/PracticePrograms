package com.lgn.fib;

import java.time.Duration;
import java.time.Instant;

public class RecursiveFib 
{
	
	public static void main(String[] args)
	{
		Instant start = Instant.now();
		System.out.println(fib(50));
		Instant end = Instant.now();
		System.out.println("Time taken to find the FIB :: "+Duration.between(start, end).toMillis());
	}
	
	private static long fib(long n)
	{
		if(n == 1 || n == 2)
			return 1;
		
		return fib(n-1) + fib(n-2);
	}

}
