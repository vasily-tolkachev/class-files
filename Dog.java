package module_1_java_8;

public class Dog extends Animal {

    @Override
    public void play() {
        System.out.println("Dog plays");
    }

    @Override
    public void voice() {
        System.out.println("Barks");
    }
}
