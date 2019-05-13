package aufgabe0402;

import java.util.ArrayList;
import java.util.List;

public class Fakultaet {

    List<Dozent> dozenten;
    List<Student> studenten;

    public Fakultaet(String name){

        dozenten = new ArrayList<>();
        studenten = new ArrayList<>();
    }
    public void addDozenten(Dozent ... donzenten){

        for (Dozent d:donzenten){
            this.dozenten.add(d);
        }

    }

    public void addStudenten(Student ... studenten){

        for (Student s:studenten){
            this.studenten.add(s);
        }
    }

}
