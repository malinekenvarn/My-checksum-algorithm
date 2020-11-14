import java.util.Arrays;
import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int length;
        String bankNumber;

        do {
            System.out.println("Please enter a 10 digit number: ");
            bankNumber = input.nextLine();
            length = bankNumber.length();

        }while(length!=10);

        input.close();

        extendAccount (bankNumber);
    }



    public static void extendAccount (String bankNumber) {

        int[] extendedBankNumber = new int[11];

        for(int i=0; i<bankNumber.length(); i++) {
            extendedBankNumber[i]= Character.getNumericValue(bankNumber.charAt(i));
        }

        for(int i=1; i<=9; i++) {
            extendedBankNumber[10]=i;
            if(allowed(checkSum(extendedBankNumber))) {
                break;
            }
        }

        if(allowed(checkSum(extendedBankNumber))){
            System.out.println("The extended bank number (11 digits): ");
            System.out.println(Arrays.toString(extendedBankNumber));
        }else {
            System.out.println("The number you have entered could not be extended. Please try again");
        }
    }




    public static int checkSum(int [] extendedBankNumber) {

        int N = 0;
        int number;

        for(int i=0;i<extendedBankNumber.length; i++) {
            number = extendedBankNumber[i];
            if(i%2==0) {
                N=N+number;
            }else {
                N=N+f(number);
            }
        }
        return N;
    }




    public static int f(int number) {

        number = number*2;
        int rest, sum=0;


        while(number> 0){
            rest = number % 10;
            sum = sum + rest;
            number = number / 10;
        }
        return sum;
    }


    public static boolean allowed(int N) {

        if(N%10==0) {
            return true;
        }else return false;
    }

}

