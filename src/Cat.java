public class Cat extends Animal{
    public void sound(){
        System.out.println("Meow...");
    }

    public static void main(String[] args) {
        Animal animal = new Cat();

        animal.sound();

    }
}
