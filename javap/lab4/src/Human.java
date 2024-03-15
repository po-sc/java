public class Human implements Nameable {
    private String name;

    Human(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
