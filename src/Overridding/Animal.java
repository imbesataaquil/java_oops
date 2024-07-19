import java.util.Scanner;

public static class Animal {
    void makeSound(){
        System.out.println("the animal makes a sound ");
    }
}
 public static class Dog extends Animal{
    void makeSound(){
        System.out.println("the dog barks ");
    }
}
public static class Cat extends Animal{
    void makeSound(){
        System.out.println("the cat meows");
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("select animal : 1 for dog and 2 for cat");
        int select= sc.nextInt();

        Animal animal;

        if(select==1){
            animal=new Dog();
        } else if (select==2) {
            animal=new Cat();
        }else {
            animal=new Animal();
        }

        animal.makeSound();
    }

