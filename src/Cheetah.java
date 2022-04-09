public class Cheetah extends Mammal implements Hunter  {
    public Cheetah(String name, int age, String description, float speed) {
    super(name, age, description, speed);
}

   
    @Override
    public void hunt(Prey prey) {
        System.out.println("Cheeta Hunted " + prey.getName());
    }
}


