public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(12000));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        } else {
            long localMinutes = minutes % 60;
            long hours = minutes / 60;
            return hours + "h " + localMinutes + "m " + seconds + "s";
        }
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        } else {
            long localSeconds = seconds % 60;
            long minutes = seconds / 60;
            return getDurationString(minutes, localSeconds);
        }
    }
}
