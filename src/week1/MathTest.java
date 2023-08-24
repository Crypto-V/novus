package week1;

/**
 * This was made just to demonstrate teh static concept
 * **/

public class MathTest {

    public static int publicCounter = 0;
    public int counter = 0;

    public MathTest() {
        publicCounter++;
        counter++;
    }

    public static class test {

        public static void main(String[] args) {
            MathTest t1 = new MathTest();
            MathTest t2 = new MathTest();
            MathTest t3 = new MathTest();
            MathTest t4 = new MathTest();
            MathTest t5 = new MathTest();

            System.out.println("That's the static variable, which can be accessed using the class name, it is not dependent on the object. "+ publicCounter);
            System.out.println("That's class variable, it is accessible only through the instance of the class. "+ t1.counter);
        }
    }
}
