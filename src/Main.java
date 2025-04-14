public class Main {
    public static void main(String[] args) {
        // Общие данные для задач 1-3
        int[] payments = {5000, 8000, 3000, 15000, 2000};

        // Задача 1: Сумма всех выплат
        int totalSum = 0;
        for (int payment : payments) {
            totalSum += payment;
        }
        System.out.println("1. Сумма трат за месяц составила " + totalSum + " рублей");

        // Задача 2: Минимальная и максимальная траты
        int minPayment = payments[0];
        int maxPayment = payments[0];
        for (int payment : payments) {
            if (payment < minPayment) minPayment = payment;
            if (payment > maxPayment) maxPayment = payment;
        }
        System.out.println("2. Минимальная сумма трат за неделю составила " + minPayment +
                " рублей. Максимальная сумма трат за неделю составила " + maxPayment + " рублей");

        // Задача 3: Среднее значение трат
        double averagePayment = (double)totalSum / payments.length;
        System.out.println("3. Средняя сумма трат за месяц составила " + averagePayment + " рублей");

        // Задача 4: Разворот имени
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(String.valueOf(reverseFullName));
        }
    }
