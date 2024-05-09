public class Task4 {

    public static void main(String[] args) {
        String string = "abc123";                                     // Задача: перевернуть строку

//        StringBuilder builder = new StringBuilder(string);          // через StringBuilder
//        System.out.println(builder.reverse());

        char[] strChar = string.toCharArray();                        // через цикл

        for (int i = string.length() - 1; i >= 0; i--) {
            strChar[strChar.length - 1 - i] = string.charAt(i);
        }
        String reverseStr = new String(strChar);
        System.out.println(reverseStr);
    }

}
