import java.util.Objects;
public abstract class Human {
    private Location location = Location.CITY;
    private String name;
    public Human(String name) {
        this.name = name;
    }

    public void changeLocation(Location loc) {
        this.location = loc;
        System.out.println(this.name + " position now is " + loc );
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
