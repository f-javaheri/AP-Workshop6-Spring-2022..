public class Cheetah extends Mammal implements Hunter  {
    public Cheetah(String name, int age, String description, float speed) {
    super(name, age, description, speed);
}

    /**
     * show  information  about  hunts  of hunter animals
     * @param prey
     */
    @Override
    public void hunt(Prey prey) {
        System.out.println("Cheeta Hunted " + prey.getName());
    }
}


