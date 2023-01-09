import java.util.ArrayList;

public class Shiritori {
    
    ArrayList<String> words = new ArrayList<String>();
    boolean game_over;

    public void play(String word){

        System.out.println("\nTrying to add " + word);

        if (words.size() == 0){
            words.add(word);
        }

        else{
            String previous_word = words.get(words.size() - 1);
            char previous_word_last_letter = previous_word.charAt(previous_word.length()-1);

            if (word.charAt(0) != previous_word_last_letter){
                game_over = true;
                System.out.println("\n");
                System.out.println(word+" does not start with an " + previous_word_last_letter);
                System.out.println("You have lost the game");
                System.out.println("The last word list you had:");
                System.out.println(words);
            }
            
            else if (words.contains(word)) {
                game_over = true;
                System.out.println("\n");
                System.out.println(word+" has already been used");
            } 
            else if (game_over){
                System.out.println("\n");
                System.out.println("Game over. You can not play anymore.");

            }
             
            else{
                words.add(word);
            }
        }
    }

    public void printWords(){
        System.out.println("\nRelevant word list:");
        System.out.println(words);
    }

    public void restart(){
        System.out.println("\n");
        System.out.println("The game has been restarted");
        System.out.println("The last word list you had:");
        System.out.println(words);
        game_over = false;
        words = new ArrayList<String>();
    }
}