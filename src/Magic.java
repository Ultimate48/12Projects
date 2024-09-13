public class Magic {
    public static void main(String str) {
        if(isMagic(str))
            System.out.println("MAGIC WORD");
        else
            System.out.println("NOT A MAGIC WORD");
    }

    static boolean isMagic(String str){
        int c = 0;
        int ch = str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(ch == str.charAt(i) - 1)
                c++;
            ch = str.charAt(i);
        }
        return c == 2;
    }
}
