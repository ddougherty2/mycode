// Dog inherits from Animal
public class Dog extends Animal {
    public Dog(String name) {
        super(name);   // this calls the constructor from animal and passes name
    }

    // this is polymorphism, we are overriding makeSound so it works uniquely for Dog objects
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
 
    public void play() {
        System.out.println("Playing fetch");
    }
}

