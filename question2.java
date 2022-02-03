// A three-digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
// E.g.- 153 is an Armstrong number because (1^3)+(5^3)+(3^3) = 153.
// Write all Armstrong numbers between 100 and 1000,
// if the sum of all the Armstrong numbers between 100 and 1000
// are greater than non-Armstrong numbers from 100-200
// then write all Armstrong numbers  from 100 to 1000  in Text File in sorted order
// ( No built-in function to be used for Sorting )
// else create an array and store the numbers in the array with their ASCII equivalent.

import java.io.FileWriter;

public class armstrong {
    public static void main(String[] args) {
        int sumOfArmstrongNumbers = 0;
        int sumOfNonArmstrongNumbers = 0;
        int counter = 0;
        int j = 0;

        char armStrongWithAsciiValues[] = new char[0];
        // Finding sum of ArmStrong numbers
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                sumOfArmstrongNumbers += i;
                // counting the armstrong numbers for the array initialization
                counter++;
            }
        }

        // Finding sum of non armstrong numbers
        for (int i = 100; i < 200; i++) {
            sumOfNonArmstrongNumbers += i;
        }

        if (sumOfArmstrongNumbers > sumOfNonArmstrongNumbers) {
            try {
                // Writing armstrong numbers to file, and they will already be sorted
                FileWriter fileWriter = new FileWriter("./armstrong.txt");
                for (int i = 100; i < 1000; i++) {
                    if (isArmstrong(i)) {
                        fileWriter.write(i + "\n");
                    }
                }
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            armStrongWithAsciiValues = new char[counter];
            for (int i = 100; i < 1000; i++) {
                if (isArmstrong(i)) {
                  char ch = (char) i;
                  armStrongWithAsciiValues[j] = ch;
                  j++;
                }
            }
        }

        System.out.println("Printing the ASCII values from array");
          for (int i=0; i<counter; i++){
              System.out.println(armStrongWithAsciiValues[i] + " ");
          }
    }

    // This function checks if the given number is armstrong or not
    public static boolean isArmstrong(int num) {
        // Convert the number into string
        String numInString = String.valueOf(num);
        int sum = 0;

        // the loop repeats for
        for (int i = 0; i < numInString.length(); i++) {
            // get single character from the string
            char singleNum = numInString.charAt(i);
            // convert the single character into number again
            int numericValueOfSingleNum = Character.getNumericValue(singleNum);
            // getting cube of that number
            int cubeOfNumericValueOfSingleNum = numericValueOfSingleNum * numericValueOfSingleNum * numericValueOfSingleNum;
            // adding that cube to sum
            sum += cubeOfNumericValueOfSingleNum;
        }

        // now sum contains the sum of all individual numbers e.g. for 153, sum = 1 + 5 + 3
        // if the original number(num) will be equal to sum
        // it means that the number is armstrong
        if (num == sum) {
            return true;
        }
        return false;
    }
}
