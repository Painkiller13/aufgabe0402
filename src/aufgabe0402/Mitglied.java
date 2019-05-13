package aufgabe0402;

public class Mitglied {

    String name;

    public Mitglied(){

    }

    public Mitglied(String name){
        this.name = name;

    }

    public String getName(String name){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
