import java.util.ArrayList;
import java.util.Scanner;


public class Hangman {
    private String word=" ";
    private String hint;
    private int numOfTrials;
    private static int MAX_TRIALS=5;
    
    public Hangman(String description, String word,String hint){
        this.word=word;
        this.hint=hint;
        
    }
    
    char[] wordList= new char[word.length()];
    Scanner scan=new Scanner(System.in);
    public void play(){
        char letter='b';
        String temp="";
        int index=0;
        String guess="";
       //turn word into ArrayList
       
       
       for(int i=0; i< wordList.length;i++){
           wordList[i]=word.charAt(i);
       }
       //make the display array ready
       ArrayList<Character> guessList = new ArrayList<Character>();
       for(int i=0; i< word.length();i++){
           if(word.charAt(i)==' ')
               guessList.add(' ');
           else
               guessList.add('-');
       }
       
       for(; numOfTrials<MAX_TRIALS;numOfTrials++) {
           if(numOfTrials==0)
               System.out.println("Hint: "+ hint);
           
           
              
           for(int i=0; i<word.length();i++){
               System.out.print(guessList.get(i));
           }
           System.out.println("");
           System.out.println("you have "+ (5-numOfTrials)+" left");
           System.out.println("enter your letter");
           
           temp=scan.next();
           
           if(temp.length()>1){
               throw new ArithmeticException("more than one letter has been entered"); 
           }
           else{
           letter=temp.charAt(0);
           
            if(letter=='#'){
               System.out.println("enter your guess");
               scan.nextLine();
               guess=scan.nextLine();
               if(guess.equals(word)){
                   //increment points 30-5*numOfTrials
                   System.out.println("You won # points");
               }
               else{
                   System.out.println("you lost");
                   System.out.println("the answer is "+ word);
               }
               break;
           }
           
           
           for(int i=0;i<word.length();i++){
               if(guessList.get(i)=='-' ||guessList.get(i)==' ' ){
                if(word.charAt(i)==letter){
                   index=i;
                   guessList.set(i, letter);
               }
            }
           }
           
           if(numOfTrials==4){
               System.out.println("=================");
               System.out.println("enter your guess");
               
               guess=scan.next();
               if(word.equals(guess)){
                   //increment points
                   System.out.println("You won 5 points");
               }
               else{
                   System.out.println("you lost");
                   System.out.println("the answer is "+ word);
               }
                   
            }   
           }
       }
    }
}
