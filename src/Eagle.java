public class Eagle {
    public Eagle(String name, int age, String description, float heightOfFly) {
        super(name, age, description, heightOfFly);
    }

 
    @Override
    public void hunt(Prey prey) {
        System.out.println("Eagle Hunted " + prey.getName());
    }}


