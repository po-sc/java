public class Labrador extends Dog {
    public Labrador(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " говорит Гав-Гав!");
    }
}

