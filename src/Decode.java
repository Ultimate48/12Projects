import java.util.Scanner;

public class Decode {
    static int[] all = new int[53];
    public static void main(String[] args) {
        int word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code");
        String s = sc.next();
        String message = "";
        int l = 65, u = 97;
        for(int i = 0; i < 26; i++){
            all[i] = l + i;
            all[i + 26] = u + i;
        }
        all[52] = 32;
        while(!s.isEmpty()){
            if(check(s.substring(0, 2))){
                word = Integer.parseInt(s.substring(0, 2));
                message += (char)word;
                s = s.substring(2);
            }
            else if(check(s.substring(0, 3))){
                word = Integer.parseInt(s.substring(0, 3));
                message += (char)word;
                s = s.substring(3);
            }
            else
                s = s.substring(2);
        }
        while(message.contains("  "))
            message = message.replace("  ", " ");

        System.out.println(format(message));
    }

    static String format(String s){
        String newS = "", word;
        int space;
        s = s.trim() + " ";
        for(int i = 0; i < s.length(); i++){
            space = s.indexOf(" ", i);
            word = s.substring(i, space);
            newS += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
            i = space;
        }

        return newS;
    }

    static boolean check(String s){
        int n = Integer.parseInt(s);
        for(int i = 0; i < 53; i++){
            if(n == all[i])
                return true;
        }
        return false;
    }
}
