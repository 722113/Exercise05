package Main;

import model.Animal;
import model.Cat;
import model.Dog;
import model.Mouse;

public class Exercise05
{
    public static void main(String[] args)
    {
//        Animal doesnt Compile = new Animal("", 0); // Cannot instantiate Animal
        Cat fuzzy = new Cat("Fuzzy", 10);
        Animal dog = new Dog("Bernard", 2); // polymorphism
        Mouse mouse = new Mouse("Oliver", 1);

        System.out.println(fuzzy.getName());
        System.out.println(fuzzy.getAge());
        System.out.println(mouse.getAge());

        dog.setAge(3);
        System.out.println(dog.getAge());

        fuzzy.sound();
        dog.sound();
        mouse.sound();

        dog.eat();
        mouse.eat();
        fuzzy.eat();
        fuzzy.eat(mouse);

//        dog.setName(""); // No setters for name. This line must not compile
    }
}
