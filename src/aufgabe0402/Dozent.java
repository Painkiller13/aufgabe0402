package aufgabe0402;

import java.util.ArrayList;
import java.util.List;

public class Dozent extends Mitglied {

    List<Kurs> kurse;

    public Dozent(String name){

        super(name);
        kurse = new ArrayList<>();
    }

    public void addKurs(Kurs kurs){

        kurse.add(kurs);
    }

    public String KursName(){

        String result="";

        for(Kurs k: kurse){
            result+=k.getName()+" ";
        }
        return result;
    }

    @Override
    public String toString() {
        return name+" (Kurs: { "+KursName()+"})";
    }

    public String getName(){
        return name;
    }
}
