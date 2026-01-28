import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten sach :");
        String title= sc.nextLine();

        System.out.print("Nhap ten tac gia :");
        String author= sc.nextLine();

//        System.out.print("Nhap ten the loai :");
//        String genre= sc.nextLine();

        title=normalizeSpaces(title);
        author = normalizeSpaces(author);
//        genre = normalizeSpaces(genre);

        String titleUpperCase=title.toUpperCase();
        String authorUpperCase=author.toUpperCase();
//        String genreUpperCase=genre.toUpperCase();

        System.out.println();
        System.out.println("[" +titleUpperCase+ "] - Tac Gia :" +authorUpperCase);
    }

    public static String normalizeSpaces(String s){
        s= s.trim();
        String result="";
        boolean lastWasSpace = false;

        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch == ' '){
                if(!lastWasSpace){
                    result += ch;
                    lastWasSpace = true;
                }
            }else{
                result += ch;
                lastWasSpace = false;
            }
        }
        return result;
    }

    public static String toTitleCase(String s){
        s = normalizeSpaces(s).toLowerCase();

        if (s.length()==0){
            return s;
        }

        String[] words = s.split(" ");
        String result = " ";

        for (int i = 0; i < words.length ; i++) {
            String w = words[i];

            if (w.length() > 0){
                char first = Character.toUpperCase(w.charAt(0));
                String rest = "";
                if (w.length() > 1){
                    rest += first + rest;
                }
            }
            if (i<words.length-1){
                result += "";
            }
        }
        return result;
    }

}