package aufgabe0402;

public class Main {
    public static void main(String[] args) {
        // Fakultät anlegen
        Fakultaet eti = new Fakultaet("ETI");

        // 2 Kurse anlegen
        Kurs pt1 = new Kurs("PT-1");
        Kurs pt2 = new Kurs("PT-2");

        // 2 Dozenten anlegen
        Dozent hartmann = new Dozent("Prof. Hartmann");
        Dozent pieper = new Dozent("Dr.-Ing. Pieper");
        eti.addDozenten(hartmann, pieper);

        // 2 Studierende anlegen
        Student adam = new Student("Adam", "M001");
        Student eva = new Student("Eva", "M002");
        eti.addStudenten(adam, eva);

        pt1.setDozent(hartmann);
        pt2.setDozent(pieper);
        hartmann.addKurs(pt1);
        pieper.addKurs(pt2);

        pt1.einschreiben(adam, eva);
        pt2.einschreiben(adam, eva);

        // Eva und ihre Kurse auf der Konsole ausgeben
        System.out.println(eva);
        //Eva (MatrikelNr.: M002) (Kurse: { PT-1 PT-2 })

        // einen Kurs auf der Konsole ausgeben
        System.out.println(pt2);
        // PT-2 mit Dr.-Ing. Pieper

        // einen Dozenten auf der Konsole ausgeben
        System.out.println(hartmann);
        //Prof. Hartmann (Kurse: { PT-1 })
    }
}