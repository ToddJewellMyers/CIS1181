//Todd J Myers 
// 06/18/2020
//project6 
//CIS1181
// anagram a word using recursion 


package pp6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Permute 
{
   // swap characters
   static String swap(String str, int i, int j){
       char characters;
       char[] array = str.toCharArray();
       characters = array[i];
       array[i] = array[j];
       array[j] = characters;
       return String.valueOf(array);
   }
   // print permutations of the string
   static void permute(String str,int less,int more)
   {
       if(less == more)
           System.out.println(str);

       int i;
       for(i = less; i<=more; i++){
           str = swap(str,less,i);
           permute(str, less+1,more);
           str = swap(str,less,i);
       }
   }
   public static void main(String[] args)
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String word;
       System.out.print("Enter a word: ");
       try{
    	   word = br.readLine();
      }catch (Exception e){
          
           return;
       }
       
       permute(word,0,word.length()-1);
   }
}