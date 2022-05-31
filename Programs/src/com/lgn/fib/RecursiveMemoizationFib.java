package com.lgn.fib;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class RecursiveMemoizationFib 
{
	
	public static void main(String[] args)
	{
		Instant start = Instant.now();
		Map<Long, Long> mem0 = new HashMap<Long, Long>();
		System.out.println(fib(90, mem0));
		Instant end = Instant.now();
		mem0.forEach((k,v) -> System.out.println(k + " -> " + v));
		System.out.println("Time taken to calculate Fib = "+Duration.between(start, end).toMillis());
	}
	
	private static long fib(long number, Map<Long, Long> memo)
	{
		if(memo.containsKey(number))
			return memo.get(number);
		
		if(number == 1 || number == 2)
			return 1;
		
		memo.put(number, fib(number-1, memo) + fib(number-2, memo));
		
		return memo.get(number);
		
	}

}
