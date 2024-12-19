public class Dog extends Cat{
    public void sound (){
        System.out.println("Gaw gaw");
    }
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.sound();

    }
}
