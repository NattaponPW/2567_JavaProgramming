public class Barista {
    private String name;
    private char gender;

    Barista() {
        this(null, ' ');
    }

    Barista(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGenderName() {
        if(gender== 'M') return "Male";
        if(gender== 'F') return "Female";
        return "spacebar";
    }

    public String toString() {
        return "Barista: " + getName() + " (" + getGenderName() + ")";
    }
}
