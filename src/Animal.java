public abstract class Animal {
    private String name;
    private int age;
    private  String description ;

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public  void show() {
        System.out.println("name : " +  name + ",  age : " + age + ",  height of fly / speed,\"" + description + "\"");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


