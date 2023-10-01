public class Main {
    public static void main(String[] args) {

        int total = 0;
        int invest = 15_000;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total/100;
            total = total + invest;
            System.out.println("Месяц "+month+", сумма накоплений равна "+total+" рублей");
            month = month + 1;
        }
        System.out.println();

        int n = 1;
        while (n <= 10) {
            System.out.print(n+" " );
            n = n+1;
        }
        System.out.println();
        while (n >= 1) {
            if (n > 10) {
                n = n-1;
                continue;
            }
            System.out.print(n+" ");
            n = n-1;
        }
        System.out.println();
        System.out.println();

        int population = 12_000_000;
        int mortalityRate = 8;
        int year = 2023;
        while (year <= 2033) {
            System.out.println("Год "+year+", численность населения составляет "+population);
            year = year + 1;
            int birthRate = population / 1_000 * 17;
            population = population + birthRate - mortalityRate;
        }
        System.out.println();

        int investment = 15_000;
        int totalOutCome = investment;
        int monthNumber = 0;
        while (totalOutCome <= 12_000_000) {
            System.out.println("Месяц "+monthNumber+", сумма накоплений равна "+totalOutCome+" рублей");
            totalOutCome = totalOutCome * 107/100;
            monthNumber = monthNumber + 1;
        }
        System.out.println("Месяц "+monthNumber+", сумма накоплений равна "+totalOutCome+" рублей");
        System.out.println();

        int investmentAgain = 15_000;
        int totalOutComeAgain = investmentAgain;
        int monthNumberAgain = 0;
        while (totalOutComeAgain <= 12_000_000) {
            if (monthNumberAgain % 6 == 0) {
                System.out.println("Месяц " + monthNumberAgain + ", сумма накоплений равна "
                        + totalOutComeAgain + " рублей");
            }
            totalOutComeAgain = totalOutComeAgain * 107/100;
            monthNumberAgain = monthNumberAgain + 1;
        }
        System.out.println("Месяц "+monthNumberAgain+", сумма накоплений равна "+totalOutComeAgain+" рублей");
        System.out.println();

        int investment1 = 15_000;
        int totalOutCome1 = investment1;
        int monthNumber1 = 0;
        while (monthNumber1 <= 108) {
            if (monthNumber1 % 6 == 0) {
                System.out.println("Месяц " + monthNumber1 + ", сумма накоплений равна "
                        + totalOutCome1 + " рублей");
            }
            totalOutCome1 = totalOutCome1 + totalOutCome1 * 7/100;
            monthNumber1 = monthNumber1 + 1;
        }
        System.out.println();

        int friday = 6;
        int dayOfWeek = 1;
        for (;dayOfWeek <= 31; dayOfWeek++) {
            if (dayOfWeek == friday) {
                System.out.println("Сегодня пятница, "+friday+"-е число. Необходимо подготовить отчет");
                friday = friday + 7;
            }
        }
        System.out.println();

        int yearOfComet = 0;
        int year1 = 0;
        int cicleOfComet = 79;
        int myYear = 2023;
        int cometInPast = myYear - 200;
        int cometInFuture = myYear + 100;
        for (; year1 <= cometInFuture; year1++) {
            if (year1 == yearOfComet) {
                yearOfComet = yearOfComet + cicleOfComet;
                if (year1 >= cometInPast) {
                    System.out.println(year1);
                }
            }
        }

    }
}