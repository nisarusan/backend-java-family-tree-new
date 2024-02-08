import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    String middleName;
    String lastName;
    char sex;
    int age;
    Person mother;
    Person father;
    List<Person> siblings;
    List<Person> children;
    List<Pet> pets;

    public Person(String name, String lastName, int age, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.children = new ArrayList<>();
        this.siblings = new ArrayList<>();
        this.pets = new ArrayList<>();
    }

    public Person(String name, String middleName, String lastName, int age, char sex) {
        this(name, lastName, age, sex);
        this.middleName = middleName;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        System.out.println(middleName);
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        System.out.println(lastName);
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void addChild(Person child) {
        System.out.println(child);
        children.add(child);
    }

    public void addSiblings(Person sibling) {
        siblings.add(sibling);
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public List<String> getChildren() {
    List<String> childrenNames = new ArrayList<>();
        for (Person child : children) {
            childrenNames.add(child.getName());
        }
        return childrenNames;
    }

//    public List<Person> getGrandChildren() {
//        List<Person> grandChildren = new ArrayList<>();
//        for (Person child : children) {
//        }
//        System.out.println(grandChildren);
//        return grandChildren;
//    }

}
