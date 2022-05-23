package Aula4;

public class Codigo {
    public static void main(String[] args) {
        String a = "Educar";
        String b = "Ação";
        b = geraStr(a, b);
        System.out.println(b);
    }
    public static String geraStr(String a, String b) {
        String s = "";
        //s = a.concat(b.substring(1, 3));
        for (int i = 0; i <= a.length()-1; i++) {
            char c = a.charAt(i);
            int x = (int)Math.pow(3,3);
            s += Character.toString(c);
        }
        return s.concat(b.substring(1, 4));
    }
}