public class Main {
    public static void main(String[] args) {
        AverageHuman averageHuman = new AverageHuman();
        Dog dog = new AverageDog();

        Dog humanAdapter = new HumanAdapter(averageHuman);

        System.out.println("Human says...");
        averageHuman.speak();

        System.out.println("Dog says...");
        dog.bark();

        System.out.println("HumanAdapter says...");
        humanAdapter.bark();
    }
}
