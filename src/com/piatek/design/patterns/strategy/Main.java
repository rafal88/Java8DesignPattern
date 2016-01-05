package com.piatek.design.patterns.strategy;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Strategy> strategies = Arrays.asList(
				() -> {System.out.println("First strategies implementation");},
				() -> {System.out.println("Second strategies implementaion");}
				);
		
		strategies.forEach((strategy) -> strategy.performTask());
		
	}
	
}
