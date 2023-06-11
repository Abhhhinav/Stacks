package Stacks;
import java.util.Stack;
public class RevString {
   public static String Rev(String str){
     Stack<Character>s = new Stack<>();
     int idx =0;
     while(idx<str.length()){
         s.push(str.charAt(idx));
         idx++;
     }
     StringBuilder result = new StringBuilder("");
     while(!s.isEmpty()){
        char curr = s.pop();
        result.append(curr);
     }
     return result.toString();
}
   public static void main(String[] args) {
      String str = "Abhinav";
      System.out.println(Rev(str));
   }
}
