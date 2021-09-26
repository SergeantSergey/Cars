package bus.people;

public class Student implements People {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "student " + name;
    }
}
