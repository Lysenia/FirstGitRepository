package oca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Time {
	
	public static void main(String args[]) {
		LocalDate birthday = LocalDate.of(1990,9,12);
		LocalDate birthday2 = LocalDate.of(1990,Month.SEPTEMBER,12);
		
		System.out.println(birthday);
		System.out.println(birthday2);
		
		LocalTime lunch = LocalTime.of(13,20);
		LocalTime dinner = LocalTime.of(13,20,55);
		LocalTime breakfast = LocalTime.of(13,20,55,56);
		
		LocalDateTime bithLukas = LocalDateTime.of(2016,10,11,23,45);
		LocalDateTime bithLukas2 = LocalDateTime.of(2016,Month.OCTOBER,11,23,45,12);
		
		System.out.println(lunch);
		System.out.println(dinner);
		System.out.println(breakfast);
		System.out.println(bithLukas);
		System.out.println(bithLukas2);
		
		LocalDateTime bith = LocalDateTime.of(birthday,dinner);
		
		LocalDateTime now = bithLukas.plusYears(2);
		LocalDateTime now2 = bithLukas.minusDays(12);
		
		Period fifteenDays = Period.ofDays(14);
		Period fifteenWeeks = Period.ofWeeks(15);
		Period fifteenMomths = Period.ofMonths(15);
		Period fifteenYears = Period.ofYears(15);
		Period large = Period.of(1, 1, 1);
		
		
	}

}
