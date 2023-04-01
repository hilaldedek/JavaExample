import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        String word;
        var scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        word = scanner.nextLine();
        word = word.toLowerCase();
        /*System.out.println(word);*/
        boolean palindrome=true;
        for(int i=0;i<word.length();i++){
            var letterReverse = String.valueOf(word.charAt((word.length()-1)-i));
            var letter = String.valueOf(word.charAt(i));

            if(!letter.equals(letterReverse)){
                System.out.println("not palindrome");
                palindrome=false;
                break;
            }
            else{
                palindrome=true;
                continue;
            }
        }
        if(palindrome){
            System.out.println("palindrome");
        }
    }
}
