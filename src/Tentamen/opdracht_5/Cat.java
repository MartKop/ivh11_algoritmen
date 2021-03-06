package Tentamen.opdracht_5;

public class Cat extends IPet {
    @Override
    public void eat() {
        System.out.println(this.name + " is eating...");
    }

    @Override
    public void defecate() {
        System.out.println(this.name + " is defecating...");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name + " makes sound: 'Miauw Miauw'");
    }

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
