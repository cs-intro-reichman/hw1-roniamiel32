// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int h = 0;
		String amPm = "";
		if (hours == 12) {
			h = 12;
			amPm = "PM";
		} else {
			if (hours > 12) {
				h = hours - 12;
				amPm = "PM";
			} else {
				h = hours;
				amPm = "AM";
			}
		}
		if (minutes < 10) {
			System.out.println(h + ":0" + minutes + " " + amPm);
		} else {
			System.out.println(h + ":" + minutes + " " + amPm);
		}
	}
}
