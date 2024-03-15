public class Bulldog extends Dog {
    public Bulldog(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " говорит Буф-Буф!");
    }
}