package week2.personCreator;

public class Person {

    private String name;
    private byte age;
    private int height;
    private float weight;

    public Person() {
    }

    public Person(String name, byte age, int height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name+", "+this.age+", "+this.height+"cm, "+this.weight+"lbs.";
    }
}
