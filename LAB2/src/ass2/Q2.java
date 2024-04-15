package ass2;
class Dog {
    String name;
    String breed;
}

public class Q2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        dog1.breed = "Labrador";

        Dog dog2 = new Dog();
        dog2.name = "Buddy";
        dog2.breed = "Golden Retriever";

        System.out.println("Before:");
        System.out.println("Dog 1: Name - " + dog1.name + ", Breed - " + dog1.breed);
        System.out.println("Dog 2: Name - " + dog2.name + ", Breed - " + dog2.breed);

        dog1.name = "Charlie";
        dog2.breed = "Poodle";

        System.out.println("After:");
        System.out.println("Dog 1: Name - " + dog1.name + ", Breed - " + dog1.breed);
        System.out.println("Dog 2: Name - " + dog2.name + ", Breed - " + dog2.breed);
    }
}

