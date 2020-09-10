import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if((str.charAt(i) == 'a') || (str.charAt(i) == 'b') || (str.charAt(i) == 'c')) {
                count++;
            }
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {

        return ((str.indexOf("the") >= 0) || (str.indexOf("The") >= 0));

    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        
        String str2 = "";
        for(int i = str.length()-1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        } 

        return (str.equals(str2));

    }
    
    
    public static void main(String[] args) {
        //Initiate Scanner
        Scanner scan = new Scanner(System.in);

        //Gather user String input
        System.out.println("Please enter a string: ");
        String input = scan.nextLine();

        //Print input's ABC count
        System.out.println("Your string has " + countABC(input) + " A, B, or C's");

        //Print input's containsThe() boolean
        if(containsThe(input)) {
            System.out.println("Your string DOES contain the");
        } else {
            System.out.println("Your string DOES NOT contain the");
        }
        
        //Print input's isPalindrome() boolean
        if(isPalindrome(input)) {
            System.out.println("Your string IS a palindrome");
        } else {
            System.out.println("Your string IS NOT a palindrome");
        }

        //Close resources
        scan.close();
    }
}
