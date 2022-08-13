import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // Dog dog=new Dog();
        //Cat cat = new Cat();
       // Fish fish = new Fish();
       // Bird bird = new Bird();
       // ArrayList<Animal> animals = new ArrayList<>();
       // animals.add(dog);
       // animals.add(cat);
       // animals.add(fish);
       // animals.add(bird);
       // for (Animal animal : animals){
       //     animal.eat();
       // }
       // Dog dog1 = new Dog();
       // dog1.run();
       // Animal animal =dog1;
       // animal.eat();
       // dog1 = (Dog) animal;
       // dog1.run();

        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog dog6 = new Dog();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Bird bird1 = new Bird();
        Fish fish1 = new Fish();
        ArrayList<CanRun> animals = new ArrayList<>();
        animals.add(dog2);
        animals.add(dog3);
        animals.add(cat2);
        animals.add(bird1);
        for (CanRun animal: animals){
            animal.run();
        }


    }
}
