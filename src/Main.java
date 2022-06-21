public class Main {
    public static void main(String[] args) {

        int ticket = 12_511; // Стоимость билета
        int bonus = 20; // Количество рублей за которые начисляется 1 миля

        int mili = ticket / bonus; // Расчёт количества бонусных милль
        System.out.println("количество бонусных милль: " + mili); // Вывод результата на экран
    }
}