package Labs.lab07;

public class Lab7 {
    public void start() {
        int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };

        System.out.println("Sum of numbers = " + sumNumbers(numbers));
        System.out.println("Average of numbers = " + avgNumbers(numbers));
        System.out.println("Min number = " + minNumbers(numbers));
        System.out.println("Max number = " + maxNumbers(numbers));
        System.out.println("Index = " + indexNumbers(numbers, 0));

        sort(numbers);
        for (int n : numbers) {
            System.out.print(n + " ");
        }

    }

    public int sumNumbers(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public double avgNumbers(int[] numbers) {
        double avg = sumNumbers(numbers) / numbers.length;
        return avg;
    }

    public int minNumbers(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public int maxNumbers(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int indexNumbers(int[] numbers, int numberValue) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberValue) {
                return i;
            }
        }
        return -1;
    }


    public void sort(int[] numbers) {
        for (int pass = 0; pass < numbers.length - 1; pass++) {
            for (int i = 0; i < numbers.length - 1 - pass; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

}
