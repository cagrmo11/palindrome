import java.util.*;
import javax.swing.JOptionPane;

public class Palindrome {
  
  public static void main( String [] args ) {
    
    boolean run = true;
    while(run){
      Scanner scan = new Scanner( System.in );      
      String s = JOptionPane.showInputDialog(null, "Palidrome Machine \nEnter a word, phrase, or sentence: " );
      if(s == null){
        System.exit(0);
      }     
      JOptionPane.showMessageDialog(null,palidrome(s.trim(), s.trim(), 0, s.trim().length()-1));
    }    
  }
  
  public static String palidrome(String o, String s, int start, int end){
    String sCut = s.replaceAll("\\W", "");
    if(sCut != s){
      end = sCut.length()-1;
    }
    if(start > end){
      return "Yes, \"" + o + "\" is a palindrome.";
    }else if(sCut.toLowerCase().charAt(start) != sCut.toLowerCase().charAt(end)){
      return "No, \"" + o + "\" is not a palindrome.";
    }else{
      return palidrome(o, sCut, start+1, end-1);
    }    
  }
  
}
