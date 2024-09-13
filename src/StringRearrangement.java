public class StringRearrangement {

    public static void main(String str){
        str = str.trim();
        str = str.substring(0, str.length() - 1);

        while(str.contains("  "))
            str = str.replace("  ", " ");

        String[] words = str.split(" ");

        sort(words);

        String result = "";
        for(String word : words)
            result += word + " ";

        System.out.println(result.trim() + ".");
    }

    static void sort(String[] words){
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[i].length() < words[j].length() || (words[i].length() == words[j].length() && words[i].compareToIgnoreCase(words[j]) > 0)){
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
    }
}
