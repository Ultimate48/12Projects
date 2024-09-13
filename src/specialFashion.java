import java.util.Scanner;

public class specialFashion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s = sc.nextLine();
        s = s + " ";
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String newS = "";
        int space, z = 1;
        String word;

        for(int i = 0; i < s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                space = s.indexOf(" ", i);
                word = s.substring(i, space);
                if(z == a || z == b){
                    newS += updateWord(word) + " ";
                }
                else
                    newS += word + " ";
                z++;
                i = space;
            }
        }
        System.out.println(newS);
        sc.close();
    }

    static String updateWord(String word){
        String newWord = "";
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 90)
                newWord += (char)65;
            else if(word.charAt(i) == 122)
                newWord += (char)97;
            else
                newWord += (char)(word.charAt(i) + 1);
        }
        return newWord;
    }
}
