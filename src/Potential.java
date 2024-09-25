import java.util.Scanner;

public class Potential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String word = sc.nextLine();

        word = word.trim();
        char ch = word.charAt(word.length() - 1);
        if(ch == '.' || ch == '?' || ch == '!' || ch == ','){
            word = word.substring(0, word.length() - 1);
        }

        String[] words = word.split(" ");
        int[] potentials = new int[words.length];

        for(int i = 0 ; i < words.length ; i++){
            potentials[i] = potential(words[i]);
        }

        // Sort the potentials AND the words
        for(int i = 0 ; i < potentials.length ; i++){
            for(int j = i + 1 ; j < potentials.length ; j++){
                if(potentials[i] > potentials[j]){
                    int temp = potentials[i];
                    potentials[i] = potentials[j];
                    potentials[j] = temp;

                    String tempWord = words[i];
                    words[i] = words[j];
                    words[j] = tempWord;
                }
            }
        }

        for(int i = 0 ; i < words.length ; i++){
            System.out.print(words[i] + " ");
        }

    }

    static int potential(String word){
        int potential = 0;
        word = word.toUpperCase();
        for(int i = 0 ; i < word.length() ; i++){

            potential += word.charAt(i) - 64;
        }
        return potential;
    }
}
