public class Fish implements Swimmable, Flyable{

    public String name;
    public int age;

    @Override
    public void swim() {
        System.out.println("Плавает в воде");
    }

    @Override
    public void fly() {
        System.out.println("Некоторые виды могут выпрыгнуть из воды и чуть-чуть пролететь.");
    }
}
