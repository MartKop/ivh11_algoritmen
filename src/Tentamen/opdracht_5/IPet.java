package Tentamen.opdracht_5;

public class IPet {

    public String name;

    public int weight;

    public void eat() {
        System.out.println("Not implemented");
    }

    public void defecate() {
        System.out.println("Not implemented");
    }

    public void makeNoise() {
        System.out.println("Not implemented");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void showDetails() {
        eat();
        defecate();
        makeNoise();
    }
}
