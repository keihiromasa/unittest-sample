package org.keihiromasa.example;

import java.util.Calendar;

public class SomeClass1 {

	public SomeClass1() {
	}

	public boolean isAMNow() {
		Calendar calendar = Calendar.getInstance();
		return Calendar.AM == calendar.get(Calendar.AM_PM);
	}
}
