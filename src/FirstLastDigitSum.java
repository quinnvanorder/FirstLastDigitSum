public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        else {
            int last =  number % 10;


            int first = 0;
            int tempNumber = number;
            if (tempNumber < 10) {
                first = tempNumber;
            }
            while (tempNumber >= 10) {
                tempNumber = tempNumber / 10;
                first = tempNumber;
            }
                System.out.println("first number is: " + first);
                System.out.println("last number is: " + last);

        int sum = first + last;

            return sum;
        }

    }
}
