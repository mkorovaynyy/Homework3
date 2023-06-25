public class Main {
    static final int  GRAM_IN_KILOGRAM = 1000;
    static final int GRAM_IN_MILLILITER = 105;
    static final int MONTH_IN_YEAR = 12;
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
        System.out.println("Задача 1");
        int a = 5;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 6;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 7;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 8L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 9.1F;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 10.1D;
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12F;
        long b = 987_678_965_549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int countLp = 23;
        int countAs = 27;
        int countEa = 30;
        int countPaper = 480;
        int countPaperPerStudent = countPaper / (countLp + countAs + countEa);
        System.out.println("На каждого ученика рассчитано " + countPaperPerStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int efficiencyPerMin = 16/2;
        int efficiencyPerTwentyMin = efficiencyPerMin * 20;
        int efficiencyPerDay = efficiencyPerMin * 60 * 24;
        int efficiencyPerThreeDay = efficiencyPerDay * 3;
        int efficiencyPerMonth = efficiencyPerDay * 30;
        System.out.println("За 20 минут машина произвела " + efficiencyPerTwentyMin + " штук бутылок");
        System.out.println("За сутки машина произвела " + efficiencyPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела" + efficiencyPerThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела" + efficiencyPerMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int sumCount = 120;
        int countWhitePerOffice = 2;
        int countBrownPerOffice = 4;
        int countOffice = sumCount / ( countBrownPerOffice + countWhitePerOffice);
        int sumCountWhite = countOffice * countWhitePerOffice;
        int sumCountBrown = countOffice * countBrownPerOffice;
        System.out.println("В школе, где " + countOffice + " классов, нужно " + sumCountWhite + " банок белой краски и "
                + sumCountBrown + " банок коричневой краски");
    }
    public static void task6() {
        int countBananas = 5;
        int weightBananasGram = 80;
        int countMilk = 200;
        int countIceCream = 2;
        int weightIceCreamGram = 100;
        int countEggs = 4;
        int weightEggsGram = 70;
        int netWeightGr = countBananas * weightBananasGram + countMilk * GRAM_IN_MILLILITER + countIceCream * weightIceCreamGram +
                countEggs * weightEggsGram;
        int netWeightKg = netWeightGr / GRAM_IN_KILOGRAM;
        System.out.println("Вес завтрака в граммах " + netWeightGr);
        System.out.println("Вес завтрака в килограммах " + netWeightKg);
    }
    public static void task7() {
        System.out.println("Задача 7");
        int sumWeightToLoseKg = 7;
        int firstWeightToLoseGrPerDay = 250;
        int secondWeightToLoseGrPerDay = 500;
        int firstCountDay = (sumWeightToLoseKg * GRAM_IN_KILOGRAM) / firstWeightToLoseGrPerDay;
        int secondCountDay = (sumWeightToLoseKg * GRAM_IN_KILOGRAM) / secondWeightToLoseGrPerDay;
        System.out.println("Eсли спортсмен будет терять каждый день по 250 грамм потеря 7кг займет " + firstCountDay + " дней");
        System.out.println("Eсли спортсмен будет терять каждый день по 500 грамм потеря 7кг займет " + secondCountDay + " дней");
    }
    public static void task8() {
        System.out.println("Задача 8");
        float costMashaPerMonth = 67760.0F;
        float costDenisPerMonth = 83690.0F;
        float costKristinaPerMonth = 76230.0F;
        float indexZp = 1.1F;
        float currentZpMashaForTheYear = costMashaPerMonth * MONTH_IN_YEAR;
        float currentZpDenisForTheYear = costDenisPerMonth * MONTH_IN_YEAR;
        float currentZpKristinaForTheYear = costKristinaPerMonth * MONTH_IN_YEAR;
        float zpMashaForTheYearAfterInd = currentZpMashaForTheYear * indexZp;
        float zpDenisForTheYearAfterInd = currentZpDenisForTheYear * indexZp;
        float zpKristinaForTheYearAfterInd = currentZpKristinaForTheYear * indexZp;
        float salaryDifferenceMasha = zpMashaForTheYearAfterInd - currentZpMashaForTheYear;
        float salaryDifferenceDenis = zpDenisForTheYearAfterInd - currentZpDenisForTheYear;
        float salaryDifferenceKristina = zpKristinaForTheYearAfterInd - currentZpKristinaForTheYear;
        System.out.println("Маша теперь получает " + zpMashaForTheYearAfterInd + " рублей. Годовой доход вырос на " + salaryDifferenceMasha +
                " рублей");
        System.out.println("Денис теперь получает " + zpDenisForTheYearAfterInd + " рублей. Годовой доход вырос на " + salaryDifferenceDenis +
                " рублей");
        System.out.println("Кристина теперь получает " + zpKristinaForTheYearAfterInd + " рублей. Годовой доход вырос на " + salaryDifferenceKristina +
                " рублей");
    }
}