package homework8;

public class Main {

    public static void main(String[] args) {

        Author frankGerbert = new Author("Frank", "Gerbert");
        System.out.println("frankGerbert = " + frankGerbert.getName()+" "+frankGerbert.getSurname());

        Author ivanTurgenev = new Author("Ivan", "Turgenev");
        System.out.println("ivanTurgenev = " + ivanTurgenev.getName()+" "+ivanTurgenev.getSurname());

        Book duna = new Book("Duna",frankGerbert,1965);
        System.out.println("duna = " +  frankGerbert.getName() + " " + frankGerbert.getSurname()+ " '" + duna.getTitle() + "' (" + duna.getYear()+")");

        Book mumu = new Book("Mumu", ivanTurgenev, 1852);
        System.out.println("mumu = " +  ivanTurgenev.getName() + " " + ivanTurgenev.getSurname()+ " '" + mumu.getTitle() + "' (" + mumu.getYear()+")");

        duna.setYear(2021);
        System.out.println("duna (new release) = " +  frankGerbert.getName() + " " + frankGerbert.getSurname()+ " '" + duna.getTitle() + "' (" + duna.getYear()+")");

    }
}
