public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cot", 7, 10.0);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Wagamama", 2, 5.0);
        cat2.printCatInfo();
        cat2.introduce();
    }
}