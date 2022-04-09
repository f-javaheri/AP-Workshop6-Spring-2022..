public class Cheetah extends Mammal implements Hunter  {
    public Cheetah(String name, int age, String description, float speed) {
    super(name, age, description, speed);
}

   
    @Override
    public void hunt(Prey p) {
        System.out.println("Cheeta Hunted " + prey.getName());
        
    }
     @Override
    public void show() {
        System.out.println("name : " +  getName() + ",  age : " +getAge() + ",  height of fly ,\"" + getDescription() + ",getSpeed()"\"");
    }
}


