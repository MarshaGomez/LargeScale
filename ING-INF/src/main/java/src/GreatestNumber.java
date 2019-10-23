package src;

// Task 1
public class GreatestNumber {
    // State
    private int[] arrayNumber;
    private Integer size;

    // Creation
    public GreatestNumber(int[] arrayNumber, Integer size) {
        this.arrayNumber = new int[size];
        this.arrayNumber = arrayNumber;
        this.size = size;
    }

    // Methods
    public Integer getGreatestNumber() {
        Integer temp = arrayNumber[0];
        for (int i = 0; i < size; i++) {
            if (arrayNumber[i] > temp) {
                temp = arrayNumber[i];
            }
        }
        return temp;
    }

    // Print
    public String toString() {
        String print = "\nTask 1 Complete. \n";
        for (int i = 0; i < size; i++) {
            print = print + "Number " + i + " - Data: " + arrayNumber[i] + "\n";
        }
        return print;
    }
}