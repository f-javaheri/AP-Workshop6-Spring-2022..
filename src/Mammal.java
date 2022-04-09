public abstract class Mammal extends Animal {
    private float speed ;

    public Mammal(String name, int age, String description, float speed) {
        super(name, age, description);
        this.speed = speed;
    }

  
    @Override
    public void show() {
        System.out.println("name : " +  getName() + ",  age : " + getAge() + ", speed,\"" + getDescription() + "\"");
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}


