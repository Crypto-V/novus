package week2.personCreator;

public class App {

    public static void main(String[] args) {
        var person1 = new Person("James Peterson", (byte) 34,180,73.5F);
        var person2 = new Person();
        person2.setName("Bob Thornley");
        person2.setAge((byte)25);
        person2.setHeight(171);
        person2.setWeight(68.2F);

        System.out.println(person1.getName()+", "+person1.getAge()+", "+person1.getHeight()+"cm, "+person1.getWeight()+"lbs.");
        System.out.println(person2);



    }
}
