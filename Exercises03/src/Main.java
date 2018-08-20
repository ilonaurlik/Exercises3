import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		try {
			Exercise01 example1 = new Exercise01();
			LocalDate result = example1.mainFunction("20180801", "20180901");
			System.out.println("The later date is " + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Exercise02 example2 = new Exercise02();
			long numberOfDays = example2.mainFunction("20180803", "20190101");
			System.out.println("The number of days between dates is " + numberOfDays);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Exercise03 example3 = new Exercise03();
			long numberOfMinutes = example3.mainFunction("2018/08/03 00:00:00", "2018/08/04 00:00:00");
			System.out.println("The number of minutes between dates is " + numberOfMinutes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Exercise04 example4 = new Exercise04();
		System.out.println(example4.getTimeInSanFrancisco());

		Exercise05 example5 = new Exercise05();
		System.out.println(example5.getTimeInPekin());
		
		Exercise06 example6 = new Exercise06();
		if (example6.isDateTheSame()) {
			System.out.println("The date is the same.");
		} else {
			System.out.println("The date is different");
		}
		
		try {
			Exercise07 example7 = new Exercise07();
			System.out.println(example7.getChicagoDate());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Exercise08 example8 = new Exercise08();
			System.out.println(example8.getDateInPoland());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Exercise09 example9 = new Exercise09();
			long numberOfHours = example9.mainFunction("2018/02/11 00:00:00", "2018/10/15 00:00:00");
			System.out.println("The number of hours between dates is " + numberOfHours);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Exercise10 example10 = new Exercise10();
			if (example10.isBankOpen()) {
				System.out.println("The bank is open.");
			} else {
				System.out.println("The bank is closed.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Exercise11 example11 = new Exercise11();
			long numberOfMinutes = example11.mainFunction("2018/07/29 00:09:00", "2018/08/03 19:40:00");
			System.out.println("The number of minutes: " + numberOfMinutes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
