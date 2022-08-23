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







    }
}