public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("This magic chair conjures a rabbit!");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a magic chair which feels like floating.");
    }
}
