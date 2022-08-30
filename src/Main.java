public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Tarçın", "Golden Retriever", 4);
        dog.information();
        System.out.println("************************************");
        Bird bird = new Bird("Cicikuş", "Papağan", 9);
        bird.information();
        System.out.println("************************************");
        Cat cat = new Cat("Sıdıka", "Tekir", 1);
        cat.information();
        System.out.println("************************************");



    }
}
