public class Duck extends Dog{
    public void sound(){
        System.out.println("quack quack");
    }

    public static void main(String[] args) {
        Animal animal = new Duck();

        animal.sound();

    }
}
