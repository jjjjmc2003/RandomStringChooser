import java.util.List;
import java.util.ArrayList;
import java.util.Random;

// Declare a public RandomStringChooser class
public class RandomStringChooser {

/** Declare any fields (instance variables) **/
ArrayList<String> wordList;
Random random;
/** Declare any constructors */
public RandomStringChooser(String[] words) {
    random = new Random();
    wordList = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
        wordList.add(words[i]);
        System.out.println(words[i]);
    }
}


/** Write the getNext method */
    public String getNext() {
        if (wordList.size() == 0) {
            return "NONE";
        }
        int currentRandom = random.nextInt(wordList.size());
        String currentString = wordList.remove(currentRandom);
        return currentString;
    }


/** This is a main method for testing the class */
public static void main(String[] args)
{
    System.out.println("It should print the words in the array in a random order and then NONE twice");
    String[] wordArray = {"The", "week", "ends", "the", "week", "begins"};
    RandomStringChooser sChooser = new RandomStringChooser(wordArray);
    for (int k = 0; k < 10; k++)
    {
        System.out.println(sChooser.getNext() + " ");
    }

} // end of main

} // end of class