package src;

// Task 3
public class RetrieveElement {
    // State
    private String[] arrayString;
    private Integer size;

    // Creation
    public RetrieveElement(String[] arrayString, Integer size) {
        this.arrayString = new String[size];
        this.arrayString = arrayString;
        this.size = size;
    }

    // Methods
    public String getFirstElement() {
        return arrayString[0];
    }

    public String getElementByIndex(Integer index) {
        if (index < size) {
            return arrayString[index];
        } else {
            return null;
        }
    }

    // Print
    public String toString() {
        String print = "\nTask 3 Complete. \n";
        for (int i = 0; i < size; i++) {
            print = print + "Number " + i + " - Data: " + arrayString[i] + "\n";
        }
        return print;
    }
}