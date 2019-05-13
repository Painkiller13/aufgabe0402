package aufgabe0402;


import java.util.ArrayList;
import java.util.List;

public class Kurs {

    private Dozent dozent;
    List<Student> studenten;
    String name;

    public Kurs(String name){

        studenten = new ArrayList<>();
        this.name =name;


    }

    public void setDozent(Dozent dozent){

        this.dozent = dozent;

    }

    public Dozent getDozent(){

        return this.dozent;

    }

    public  void einschreiben(Student ... studenten){
        for (Student s:studenten){
            this.studenten.add(s);
            s.addKurs(this);
        }

    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name+" mit "+getDozent();
    }
}
