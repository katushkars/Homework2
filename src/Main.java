public class Main {
    public static void main(String[] args) {

        //Задание 1
        var cat = 7;
        byte box =1;
        short box2 = 200;
        int box3 = 2147483646;
        long box4 = 999999999999999L;
        float box5 =1.9f;
        double box6 = 56.88;
        System.out.println(box6);

        //Задание 2
        double boxer1=78.2;
        double boxer2=82.7;
        double allBoxerWeight = boxer1+boxer2;
        double weightDefference = boxer1-boxer2;
        System.out.println("Общий вес боксеров " + allBoxerWeight);
        System.out.println("Разница в весе первого и второго боксера "+ weightDefference);

        //Задание 3
        byte banan = 5;
        int bananWeight = banan *80;
        int milk = 200;
        double milkWeight = milk*1.05;
        byte iceCream = 2;
        int iceCreamWeight = iceCream*100;
        byte egg = 4;
        int eggWeight = egg*70;
        double breakfastWeight = bananWeight+milkWeight+iceCreamWeight+eggWeight;
        double breakfastWeightKg= breakfastWeight/1000;
        System.out.println("Общий вес завтрака в граммах "+breakfastWeight);
        System.out.println("Общий вес завтрака в кг "+breakfastWeightKg);

        //задание 4
        int excessWeight = 7;
        int excessWeightGram = excessWeight*1000;
        int day250=excessWeightGram/250;
        int day500=excessWeightGram/500;
        int dayAverage = (day500+day250)/2;
        System.out.println("Если сбрасывать по 250 гр, то спортсмену понадобиться  "+day250+ " дней");
        System.out.println("Если сбрасывать по 500 гр, то спортсмену понадобиться  "+day500+ " дней");
        System.out.println("В среднем спортсмену понадобиться  "+dayAverage+ " дней");

        //Задание 5
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKristina = 76230;
        double zpMashaNew = zpMasha*1.1;
        double zpDenisNew = zpDenis*1.1;
        double zpKristinaNew = zpKristina*1.1;
        int year = 12;
        double differenceZpMasha = (zpMashaNew-zpMasha)*year;
        double differenceZpDenis = (zpDenisNew-zpDenis)*year;
        double differenceZpKristina = (zpKristinaNew-zpKristina)*year;
        System.out.println("Маша теперь получает  "+zpMashaNew+ " рублей. Годовой доход вырос на " +differenceZpMasha+ " рублей");
        System.out.println("Денис теперь получает  "+zpDenisNew+ " рублей. Годовой доход вырос на " +differenceZpDenis+ " рублей");
        System.out.println("Кристина теперь получает  "+zpKristinaNew+ " рублей. Годовой доход вырос на " +differenceZpKristina+ " рублей");







    }
}