package Strings;

public class ReverseString {

    public static String reverse(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println(reverse(input)); 
    }
}
