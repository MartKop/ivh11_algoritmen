package Tentamen.opdracht_5;

import java.util.*;

public class HolidayCare<T extends IPet>
{
    protected HashMap<String, T> animals = new HashMap<>();

    public void addPet(T animal) {
        animals.put(animal.name, animal);
    }

    public void showAllSorted() {
        List<T> tempList = new ArrayList<>();
        for (Map.Entry<String, T> entry : animals.entrySet()) {
            tempList.add(entry.getValue());
        }

        tempList.sort(new WeightSorter());

        for (T animal : tempList) {
            System.out.println(animal.name + " is size " + animal.weight);
        }
    }

    public void showDetails(String name) {
        T animal =  animals.get(name);
        System.out.println(animal.name + " is a " + animal.getClass() + " and weights " + animal.weight);
        animal.showDetails();
    }
}
