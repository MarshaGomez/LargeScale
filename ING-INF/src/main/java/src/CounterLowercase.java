package src;

// Task 2
public class CounterLowercase {
    // State
    private String sentence;

    // Creation
    public CounterLowercase(String sentence) {
        this.sentence = sentence;
    }

    // Methods
    public Integer getCounterVowels() {
        String word = sentence.replaceAll(" ", "");
        String[] arrayWord = word.split("");
        Integer counter = 0;
        for (int i = 0; i < arrayWord.length; i++) {
            if (arrayWord[i].equals("a") || arrayWord[i].equals("e") || arrayWord[i].equals("i")
                    || arrayWord[i].equals("o") || arrayWord[i].equals("u")) {
                counter += 1;
            }
        }
        return counter;
    }

    // Print
    public String toString() {
        return String.format("\nTask 2 Complete. \nSentence: %s", sentence);
    }
}