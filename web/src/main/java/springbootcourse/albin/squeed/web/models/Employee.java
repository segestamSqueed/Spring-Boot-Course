package springbootcourse.albin.squeed.web.models;

import java.util.UUID;

public class Employee {
    private UUID id;
    private String firstName;
    private  String lastName;
    private Position position;


    public Employee() {
    }

    public Employee(UUID id, String firstName, String lastName, Position position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position.toString();
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
