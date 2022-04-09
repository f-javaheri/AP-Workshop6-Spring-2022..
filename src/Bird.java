public abstract class Bird extends Animal  {
    private float heightOfFly ;

    public Bird(String name, int age, String description, float heightOfFly) {
        super(name, age, description);
        this.heightOfFly = heightOfFly;
    }

    /**
     * show animals  information
     */
    @Override
    public void show() {
        System.out.println("name : " +  getName() + ",  age : " +getAge() + ",  height of fly ,\"" + getDescription() + "\"");
    }

    public float getHeightOfFly() {
        return heightOfFly;
    }

    public void setHeightOfFly(float heightOfFly) {
        this.heightOfFly = heightOfFly;
    }
}


