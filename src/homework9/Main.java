package homework9;

public class Main {

    public static void main(String[] args) {

        //homework8 version

        homework9.Author frankGerbert = new homework9.Author("Frank", "Gerbert");
        System.out.println("frankGerbert = " + frankGerbert.getName()+" "+frankGerbert.getSurname());

        homework9.Author ivanTurgenev = new Author("Ivan", "Turgenev");
        System.out.println("ivanTurgenev = " + ivanTurgenev.getName()+" "+ivanTurgenev.getSurname());

        homework9.Book duna = new homework9.Book("Duna",frankGerbert,1965);
        System.out.println("duna = " +  frankGerbert.getName() + " " + frankGerbert.getSurname()+ " '" + duna.getTitle() + "' (" + duna.getYear()+")");

        homework9.Book mumu = new Book("Mumu", ivanTurgenev, 1852);
        System.out.println("mumu = " +  ivanTurgenev.getName() + " " + ivanTurgenev.getSurname()+ " '" + mumu.getTitle() + "' (" + mumu.getYear()+")");

        duna.setYear(2021);
        System.out.println("duna (new release) = " +  frankGerbert.getName() + " " + frankGerbert.getSurname()+ " '" + duna.getTitle() + "' (" + duna.getYear()+")");

        //homework9 version

        duna.setYear(1965);
        System.out.println(frankGerbert);
        System.out.println(ivanTurgenev);
        System.out.println(duna);
        System.out.println(mumu);
        duna.setYear(2021);
        System.out.println(duna);

        Book otcyIDeti = new Book("Otci i deti", ivanTurgenev, 1862);
        System.out.println(otcyIDeti);

        System.out.println(frankGerbert.equals(frankGerbert));
        System.out.println(frankGerbert.equals(ivanTurgenev));
        System.out.println(duna.equals(duna));
        System.out.println(duna.equals(mumu));
        System.out.println(otcyIDeti.equals(otcyIDeti));
        System.out.println(otcyIDeti.equals(mumu));




    }
}
