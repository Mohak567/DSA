public class Determine_If_String_Halves_Are_Alike {
    public static boolean halvesAreAlike(String s) {
        String fhalf = s.substring(0, (s.length() / 2)).toLowerCase();
        String shalf = s.substring((s.length() / 2), s.length()).toLowerCase();
        int fvov = 0;
        int svov = 0;
        for (int i = 0; i < fhalf.length(); i++) {
            if (fhalf.charAt(i) == 'a' || fhalf.charAt(i) == 'e' || fhalf.charAt(i) == 'i' || fhalf.charAt(i) == 'o'
                    || fhalf.charAt(i) == 'u') {
                fvov++;
            }
        }
        for (int i = 0; i < shalf.length(); i++) {
            if (shalf.charAt(i) == 'a' || shalf.charAt(i) == 'e' || shalf.charAt(i) == 'i' || shalf.charAt(i) == 'o'
                    || shalf.charAt(i) == 'u') {
                svov++;
            }
        }
        return (fvov == svov ? true : false);
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
}