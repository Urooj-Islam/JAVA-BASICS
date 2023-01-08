/*n array of 10 integer numbers then write the code
 to find the largest and smallest number
from that array*/

public class w3e1 {
    public static void main(String[] args) {
        int numbers[] = {55,32,45,105,83,53,89,39,50};
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}