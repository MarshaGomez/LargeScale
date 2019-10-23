package src;

// Task 0
public class PrintWord {
    // State
    private String word;

    // Creation
    public PrintWord(String word) {
        this.word = word;
    }

    // Methods
    // Print
    public String toString() {
        return String.format("\nTask 0 Complete. \nText: %s", word);
    }
}