package modules;

public class Animal {
    public String name;
    public String type;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Animal(String name){
        this.name=name;

    }
    @Override
    public boolean equals(Object otherAnimal) {
        if (!(otherAnimal instanceof Animal)) {
            return false;
        }
        else{
            Animal newAnimal=(Animal) otherAnimal;
            return this.getName().equals(newAnimal.getName());

        }
    }
}
