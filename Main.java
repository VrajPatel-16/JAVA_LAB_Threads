public class Main {
 
     public static void main(String[] args) {
         System.out.println("Cricket Match Begins!");
 
         MatchManager manager = new MatchManager();
         manager.startMatch();
 
         System.out.println("Live from the stadium...");
     }
 }