public class Vehicle {
    private String name;
    private String type;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

