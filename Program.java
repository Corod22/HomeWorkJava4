//import java.util.ArrayList;
public class Program {
    public static void main(String[] args) {
        // Пример использования
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        appleBox2.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2: " + appleBox2.getWeight());
        System.out.println("Вес orangeBox: " + orangeBox.getWeight());

        System.out.println("Сравнение appleBox1 и appleBox2: " + appleBox1.compare(appleBox2));
        System.out.println("Сравнение appleBox1 и orangeBox: " + appleBox1.compare(orangeBox));

        appleBox1.transferFruitsTo(appleBox2);

        System.out.println("Вес appleBox1 после пересыпания: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2 после пересыпания: " + appleBox2.getWeight());
    }
}