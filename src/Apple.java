public class Apple extends Fruit{
    @Override
    public void eat() {
        super.num = 10;
        System.out.println("eat " + num + " Apple");
    }
    // change this line
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        fruit.eat();
    }
}
