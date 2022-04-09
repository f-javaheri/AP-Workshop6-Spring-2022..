public class Girafe extends Mammal implements Prey {
    public Girafe(String name, int age, String description, float speed) {
    super(name, age, description, speed);
}
     @Override
    public void show() {
        System.out.println("name : " +  getName() + ",  age : " +getAge() + ",  height of fly ,\"" + getDescription() + "\"");
    }
      @Override
    Public String getName(){return name;}
}
