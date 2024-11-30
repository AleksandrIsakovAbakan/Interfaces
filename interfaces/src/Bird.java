public class Bird implements Swimmable, Flyable{

    public String name;
    public int age;

    @Override
    public void fly() {
        System.out.println("Большинство видов умеет летать.");
    }

    @Override
    public void swim() {
        System.out.println("Некоторые виды могут плавать и нырять.");
    }
}
