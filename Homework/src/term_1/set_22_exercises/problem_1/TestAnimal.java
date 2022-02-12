package term_1.set_22_exercises.problem_1;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greets();
        Dog dog1 = new Dog();
        dog1.greets();
        BigDog bigDog1 = new BigDog();
        bigDog1.greets();

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greets();
        Animal animal2 = new Dog();
        animal2.greets();
        Animal animal3 = new BigDog();
        animal3.greets();
        //Animal animal4 = new Animal();
    }
}


