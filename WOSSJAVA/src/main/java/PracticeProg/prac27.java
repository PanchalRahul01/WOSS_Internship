package PracticeProg;

public class prac27 {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "dabc";

        if (isRotation(str1, str2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }

    static boolean isRotation(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;



        String temp = s1 + s1;

        return temp.contains(s2);
    }
}
