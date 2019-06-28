public class SecondsAndMinutesChallenge {

    private static final String INVALID_MESSAGE = "Invalid value";
    private static final long SECONDS_IN_MINUTE_MINUTES_IN_HOUR = 60;

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_MESSAGE;
        } else {
            long localMinutes = minutes % SECONDS_IN_MINUTE_MINUTES_IN_HOUR;
            long hours = minutes / SECONDS_IN_MINUTE_MINUTES_IN_HOUR;

            // add 0 if hours >=0 and hours <=9
            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            // add 0 if localMinutes >=0 and localMinutes <=9
            String minutesString = localMinutes + "m";
            if (localMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            // add 0 if seconds >=0 and seconds <=9
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return hoursString + " " + minutesString + " " + secondsString;
        }
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_MESSAGE;
        } else {
            long localSeconds = seconds % SECONDS_IN_MINUTE_MINUTES_IN_HOUR;
            long minutes = seconds / SECONDS_IN_MINUTE_MINUTES_IN_HOUR;
            return getDurationString(minutes, localSeconds);
        }
    }
}
