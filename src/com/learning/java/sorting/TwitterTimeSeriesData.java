package com.learning.java.sorting;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TwitterTimeSeriesData {
	public static String getmonth(int month) {
		if (month >= 1 && month < 10)
			return "0" + Integer.toString(month);
		return Integer.toString(month);
	}
	public static String getNextDay(String s) {
		String date[] = s.split("-");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		month++;
		if (month == 12) {
			year++;
			month = 1;
		}
		return Integer.toString(year) + "-" + getmonth(month);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		HashMap<String, HashMap<String, Integer>> map = new HashMap<String, HashMap<String, Integer>>();

		String requestPeriod[] = sc.nextLine().replaceAll("\\s+","").split(",");
		requestPeriod[0] += "-01";


		LocalDate start = LocalDate.parse(requestPeriod[0], dtf);
		LocalDate end = LocalDate.parse(getNextDay(requestPeriod[1]) + "-01", dtf);

		sc.nextLine();

		while (sc.hasNextLine()) {
			String data[] = sc.nextLine().replaceAll("\\s+","").split(",");
			if (data[0].isEmpty())
				break;
			LocalDate d = LocalDate.parse(data[0], dtf);
			
			if (!(d.isAfter(start) && d.isBefore(end))) {
				continue;
			}

			String month = d.getYear() + "-" + getmonth(d.getMonthValue());
			HashMap<String, Integer> categoryMap;
			if (!map.containsKey(month)) {
				categoryMap = new HashMap<String, Integer>();
				map.put(month, categoryMap);
			} else {
				categoryMap = map.get(month);
			}

			if (categoryMap.containsKey(data[1])) {
				categoryMap.put(data[1], categoryMap.get(data[1]) + Integer.parseInt(data[2]));
			} else {
				categoryMap.put(data[1], Integer.parseInt(data[2]));
			}
		}

		List<String> keyList = new ArrayList<String>(map.keySet());
		Collections.sort(keyList);

		for (int i = keyList.size() - 1; i >= 0; i--) {
			HashMap<String, Integer> categoryMap = map.get(keyList.get(i));
			System.out.print(keyList.get(i) + ", ");
			ArrayList<String> list = new ArrayList<String>(categoryMap.keySet());
			Collections.sort(list);
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + ", " + categoryMap.get(list.get(j)));
				if (j != list.size() - 1)
					System.out.print(", ");
			}
			System.out.println();
		}
	}
}
