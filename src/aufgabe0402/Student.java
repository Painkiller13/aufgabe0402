package aufgabe0402;

import java.util.ArrayList;

public class Student extends Mitglied {

    ArrayList<Kurs> kurse;
    String matrikelnummer;

    public Student (String name, String matrikelnummer){

        super(name);
        this.matrikelnummer = matrikelnummer;
        kurse = new ArrayList<>();

    }

    @Override
    public String toString() {
        return super.toString()+"(MatrikelNr.:"+matrikelnummer+")(Kurse: { "+KursName()+"})";
    }

    public void addKurs (Kurs kurs){

        kurse.add(kurs);

    }

    public String KursName(){

        String result="";

        for(Kurs k: kurse){
            result+=k.getName()+" ";
        }
            return result;
    }


}
