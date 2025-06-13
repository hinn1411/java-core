import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Person implements Comparable<Person>, Cloneable {
    private int age;
    private String name;

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone(); // Shallow copy
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Department implements Cloneable {
    private String name;
    private List<Person> employees;

    @Override
    public Department clone() {
        try {
            Department cloneDepartment = (Department) super.clone();
            // Deep copy for mutable fields
            cloneDepartment.employees = new ArrayList<>();
            for (Person employee: employees) {
                // We don't need to deep copy Person because all fields are primitive
                // If there is a reference field, we have to deep copy Person
                cloneDepartment.employees.add(employee.clone());
            }
            return cloneDepartment;

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person base, Person other) {
        return Integer.compare(base.getAge(), other.getAge());
    }
}





public class Interface2 {

    Comparator<Person> byAge = (base, other) -> Integer.compare(base.getAge(), other.getAge());
    Comparator<Person> byName = (base, other) -> base.getName().compareTo(other.getName());
    Comparator<Person> byAgeThenName = Comparator.comparingInt(Person::getAge)
            .thenComparing(Person::getName);

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Collections.sort(people);

        List<Person> otherPeople = new ArrayList<>();
        Collections.sort(otherPeople, new AgeComparator()); // Sort by age

    }
}
