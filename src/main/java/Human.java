public class Human {
    private String name;
    private String surname;

    public Human(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            throw new RuntimeException("Длина имени должна быть больше либо равна трём. Длина переданного имени (" + name + ") равна " + name.length() + ".");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
