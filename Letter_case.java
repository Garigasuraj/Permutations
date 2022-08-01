import java.util.*;

class Letter_case {
    static void permutation(String str, String out){
       // base condition
       if(str.length() == 0){
           System.out.println(out);
           return;
       }
       char ch = str.charAt(0);
       if(Character.isLowerCase(ch)){
           permutation(str.substring(1), out+Character.toUpperCase(ch));
       }
       if( Character.isUpperCase(ch)){
           permutation(str.substring(1), out+Character.toLowerCase(ch));
       }
       else 
       permutation(str.substring(1), out+ch);
    }
	public static void main (String[] args) {
	    Scanner Sc = new Scanner(System.in);
	    String str = Sc.next();
	    String out ="";
	    
	    permutation(str,out);
	}
}
