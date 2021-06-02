package be.intecbrussel;


import java .util.Scanner;

public class IntArrayApp {
    private int[] isSorted;
    private Scanner scan = new Scanner(System.in);
    private int[] userNumber;

    private void generateUserNumbers() {
        System.out.println("PLease fill numbers");
        for (int i = 0; i < userNumber.length; i++) {
            userNumber[i] = scan.nextInt();
        }
        for (int i = 0; i < userNumber.length; i++) {
            for (int j = 0; j < userNumber[i]; j++) {
                if (isSorted[j] < isSorted[i]) {

                }
            }
        }


    }
}