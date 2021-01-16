import java.util.Objects;

public final class Astronauts extends Human implements Phys {
    private String name;
    public Astronauts(String name) {
        super(name);
    }


    public void firstSkill() {
        System.out.println(getName() + " intimidate relocation to " + Location.anotherHotel);
    }

    public void secondSkill() {
        System.out.println(getName() + " live free ");
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Astronauts astronauts = (Astronauts) o;
        return Objects.equals(name, astronauts.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return "Astronauts{" + "name='" + name + '\'' + '}';
    }
}
