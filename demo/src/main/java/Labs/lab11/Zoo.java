package Labs.lab11;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    HashMap<String, Integer> animalMap = null;
    String[] originalAnimals = {"Zebra", "Lion", "Buffalo"};
    String[] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};

    public Zoo () {
        animalMap = new HashMap<>();
        addAnimals(originalAnimals);
        addAnimals(newAnimals);
    }

    void addAnimals(String[] animals) {
        for (String animal : animals) {
            if (animalMap.containsKey(animal)) {
                animalMap.put(animal, animalMap.get(animal) + 1);
            } else {
                animalMap.put(animal, 1);
            }
        }
    }

    void displayAnimalData() {
        for (Map.Entry<String, Integer> entry : animalMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}

