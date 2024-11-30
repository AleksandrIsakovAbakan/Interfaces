public class Human implements Swimmable, Flyable{

    public String name;
    public int age;

    @Override
    public void fly() {
        System.out.println("Умеет летать на дельтаплане.");
    }

    @Override
    public void swim() {
        System.out.println("Умеет плавать техникой брасс.");
    }
}
