package stringProgrammes;
import java.util.Arrays;

public class  Anagrams{
    public static void main(String[] args) {

      
      String s1 = "listen";
      String s2 = "silent";
      if(s1.length()==s2.length()){
          char[]  ch1 = s1.toLowerCase().toCharArray();
          char[]  ch2 = s2.toLowerCase().toCharArray();  
          
          Arrays.sort(ch1);
          Arrays.sort(ch2);
          
          if(Arrays.equals(ch1,ch2)){
              System.out.print(s1+" and "+s2+" Anagrams");
          }
          else{
              System.out.print("not Anagrams");
          }
      }
   
    }
}
