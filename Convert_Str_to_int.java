public class Convert_Str_to_int {// using inbuild function
    public static int atoi(String str) {
        int a;
        try {
            a = Integer.parseInt(str);
        } catch (Exception e) {
            return -1;
        }
        return a;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(atoi(str) + 1);// +1 for checking
    }
}
