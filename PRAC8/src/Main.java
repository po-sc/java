public class Main {
    public static void main(String[] args) {
        BoundedWaitList<Integer> boundedList = new BoundedWaitList<>(3);
        boundedList.add(1);
        boundedList.add(2);
        boundedList.add(3);
        boundedList.add(4);  // не добавится из-за ограниченной емкости

        System.out.println(boundedList);

        UnfairWaitList<String> unfairList = new UnfairWaitList<>();
        unfairList.add("A");
        unfairList.add("B");
        unfairList.add("C");
        unfairList.moveToBack("A");

        System.out.println(unfairList);
    }
}
