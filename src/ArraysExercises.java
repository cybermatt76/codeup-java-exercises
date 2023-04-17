public class ArraysExercises {
    public static void main(String[] args) {
        Person1[] people = { new Person1("Alice"), new Person1("Bob"), new Person1("Charlie") };


        for (Person1 person : people) {
            System.out.println(person.getName());
        }


        people = addPerson(people, new Person1("David"));


        for (Person1 person : people) {
            System.out.println(person.getName());
        }
    }

    public static Person1[] addPerson(Person1[] people, Person1 newPerson) {
        Person1[] newPeople = new Person1[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
        newPeople[people.length] = newPerson;
        return newPeople;
    }
}

class Person1 {
    private String name;

    public Person1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

