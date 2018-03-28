package Tentamen.opdracht_5;

public class main {

    public static void main(String[] args) {
        HolidayCare<Dog> dogCare = new HolidayCare<>();
        dogCare.addPet(new Dog("Sparky", 35));
        dogCare.addPet(new Dog("Benno", 20));
        dogCare.addPet(new Dog("Fifi", 40));
        dogCare.addPet(new Dog("Johnny", 41));
        dogCare.addPet(new Dog("Doggy", 32));
        HolidayCare<Cat> catCare = new HolidayCare<>();
        catCare.addPet(new Cat("cat 1", 10));
        catCare.addPet(new Cat("cat 2", 14));
        catCare.addPet(new Cat("cat 3", 12));
        catCare.addPet(new Cat("cat 4", 11));
        catCare.addPet(new Cat("cat 5", 13));
        HolidayCare<Fish> fishCare = new HolidayCare<>();
        fishCare.addPet(new Fish("Fish 1", 1));
        fishCare.addPet(new Fish("Fish 2", 2));
        fishCare.addPet(new Fish("Fish 3", 3));
        fishCare.addPet(new Fish("Fish 4", 2));
        fishCare.addPet(new Fish("Fish 5", 2));
        HolidayCare<GPig> gPigCare = new HolidayCare<>();
        gPigCare.addPet(new GPig("GPig 1", 5));
        gPigCare.addPet(new GPig("GPig 2", 8));
        gPigCare.addPet(new GPig("GPig 3", 6));
        gPigCare.addPet(new GPig("GPig 4", 10));
        gPigCare.addPet(new GPig("GPig 5", 1));
        HolidayCare<Rabbit> rabbitCare = new HolidayCare<>();
        rabbitCare.addPet(new Rabbit("Rabbit 1", 3));
        rabbitCare.addPet(new Rabbit("Rabbit 2", 3));
        rabbitCare.addPet(new Rabbit("Rabbit 3", 5));
        rabbitCare.addPet(new Rabbit("Rabbit 4", 4));
        rabbitCare.addPet(new Rabbit("Rabbit 5", 2));

        System.out.println("Sorting dogs by weight");
        dogCare.showAllSorted();
        System.out.println("");

        System.out.println("Finding dog by name 'Fifi'");
        dogCare.showDetails("Fifi");
        System.out.println("");

        System.out.println("Finding cat by name 'cat 2'");
        catCare.showDetails("cat 2");
        System.out.println("");
    }
}
