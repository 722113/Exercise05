public class Cat extends Animal{

    String name;
    @Override
    public void Sound(){
        System.out.println("Meow Meow");
    }
    @Override
    public void Eat(){
        System.out.println(name + "ate cat food");
    }


    public void Eat(String mousename){

        System.out.println(name + " ate " + mousename);
    }
}
