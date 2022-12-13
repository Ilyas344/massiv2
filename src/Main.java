public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int minMoney = 999999999;
        int maxMoney = 0;
        double averageSum = 0;
        int[] arr = generateRandomArray();
        int sumMoney = 0;
        for (int sum : arr) {
            sumMoney += sum;
            minMoney = Math.min(sum, minMoney);
            maxMoney = Math.max(sum, maxMoney);
            averageSum = (double) sumMoney / arr.length;
        }

        System.out.println("Задание 1");
        System.out.println("Сумма трат за месяц составила " + sumMoney + " рублей");
        System.out.println("\nЗадание 2");
        System.out.println("Минимальная сумма трат за день составила " + minMoney + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxMoney + " рублей");
        System.out.println("\nЗадание 3");
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageSum);

    }

    public static void task2() {
        System.out.println("\n\nЗадание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}