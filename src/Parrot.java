public class Parrot extends Bird implements Prey {
    public Parrot(String name, int age, String description, float heightOfFly) {
    super(name, age, description, heightOfFly);
}
 @Override
    public void show() {
        System.out.println("name : " +  getName() + ",  age : " +getAge() + ",  height of fly ,\"" + getDescription() + "\"");
    }
}
