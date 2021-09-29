package b19_design_pattern.practice.object_pool;

public class Taxi {
    private String name;

    public Taxi(String s){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "name='" + name + '\'' +
                '}';
    }
}
