package ar.com.ada.opp.override;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;

    public Person() {}
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "El nombre es: " + this.name + "El apellido es: " + this.lastName;
    }
    @Override
    public int hashCode() {
        return -87 * Objects.hash(this.name, this.lastName);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass() ) {
            return false;
        }
        Person that = (Person) obj;
        boolean tmp = this.name.equals(that.name) && this.lastName.equals();
        return tmp;
    }
}
