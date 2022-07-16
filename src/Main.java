public class Main {

    public static void main(String[] args) {
        int price = 3250; //стоимость билета
        int amount = 20; //количество рублей для одной бонусной мили
        int bonus = price / amount; //количество начисленных миль за купленный билет
        System.out.println("Количество бонусных миль " + bonus);
    }
}
