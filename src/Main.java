public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("... Task 1 ...");
        int capital = 0;
        int month = 0;
        int contribution = 15000;
        while (capital < 2_459_000) {
            month++;
            capital += contribution;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей.", month, capital);
            System.out.println();
        }
    }
    public static void task2() {
        System.out.println("... Task 2 ...");
        int number = 1;
        while (number < 11) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        number--;
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("... Task 3 ...");
        int population = 12_000_000;
        int natality = 17; // на 1000 человек
        int mortalityRate = 8;
        for (int i = 1; i < 11; i++) {
            population += (population / 1000) * natality;
            population -= mortalityRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }
    public static void task4() {
        System.out.println("... Task 4 ...");
        int capital = 15000;
        int month = 0;
        while (capital < 12_000_000) {
            month++;
            capital += capital*0.07;
            System.out.println("Месяц " + month + ", количество накоплений " + capital + " руб.");
        }
    }
    public static void task5() {
        System.out.println("... Task 5 ...");
        int capital = 15000;
        int month = 0;
        while (capital < 12_000_000) {
            month++;
            capital += capital*0.07;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", количество накоплений " + capital + " руб.");
        }
    }
    public static void task6() {
        System.out.println("... Task 6 ...");
        int capital = 15000;
        for (int month = 1; month <= (9 * 12); month++) {
            capital += capital*0.07;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", количество накоплений " + capital + " руб.");
        }
    }
    public static void task7() {
        System.out.println("... Task 7 ...");
        int firstFriday = 4;
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }
    public static void task8() {
        System.out.println("... Task 8 ...");
        int startYear = 2023 - 200, endYear = 2023 + 100, year = startYear;
        while (year <= endYear) {
            if (year % 79 == 0) System.out.println(year);
            year++;
        }
    }
}