package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public ArrayList<String> calculation() {

		ArrayList<String> fizzBuzzList = new ArrayList<String>();

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				fizzBuzzList.add("FizzBuzz");

			} else if (i % 3 == 0) {
				fizzBuzzList.add("Fizz");

			} else if (i % 5 == 0) {
				fizzBuzzList.add("Buzz");

			} else {
				fizzBuzzList.add(Integer.toString(i));
			}
		 }		
		return fizzBuzzList;
	}
}