public class Pet {
    String name;
    int age;
    String species;
    Person owner;

    Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}
