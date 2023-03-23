import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Book> books = new ArrayList<>();

        Book a = new Book();
        a.setTitle("Tu ir Aš");
        a.setPages(500);
        a.setReleaseYear(1998);

        Book b = new Book();
        b.setTitle("Visada ir Visur");
        b.setPages(252);
        b.setReleaseYear(2022);

        Book c = new Book();
        b.setTitle("Mažasis Princas ");
        b.setPages(252);
        b.setReleaseYear(2000);


        Book d = new Book("Autoriu šešėlis", 500, 1993);
        Book e = new Book("Stovumas  ", 30, 1980);
        Book f = new Book("Laivavedybos pagrindai", 350, 1993);


        books.add(a);
        books.add(b);
        books.add(c);
        books.add(d);
        books.add(e);
        books.add(f);

        System.out.println("-------------------------------");

        System.out.print(books);

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        System.out.println("----------------------------2------------------------");



        ArrayList<Plant> plants = new ArrayList<>();

        Plant aa = new Plant();
        aa.setTitle("Rožė. ");
        aa.setTitleLatin("Rosa. ");
        aa.setAnnualPerennial(false);
        aa. setPlantContinent("Kinija. ");
        aa. setHeightAdultPlantInMeters(7);
        aa. setEdibleInedible(true);

        Plant aa2 = new Plant();
        aa2.setTitle("Triskiautė žibuoklė. ");
        aa2.setTitleLatin("Hepatica nobilis. ");
        aa2.setAnnualPerennial(true);
        aa2. setPlantContinent("Europa. ");
        aa2. setHeightAdultPlantInMeters(0.25);
        aa2. setEdibleInedible(false);

        Plant aa3 = new Plant("Saulėgrąža","Helianthus", true ,"Europa",
                Math.round(3), true  );




        plants.add(aa);
        plants.add(aa2);
        plants.add(aa3);



        for (int i = 0; i <plants.size(); i++) {
            System.out.println(plants.get(i));

        }















    }























}


//  Sukurti klasę Book.
//     Properties: title, pages, releaseYear
//    visi properties turi būti inkapsuliuoti.
//   sukurti 3 objektus su reikšmėmis naudojantis tuščiu konstruktoriu, ir tris naudojantis pilnu konstuktoriu.
//    sudėti juos į knygų masyvą.(arrayList)
//    prasukti ciklą per masyvą ir atspausdinti knygas (naudojam toString() overidintą metodą)


//   Sukurti klasę Plant
//     Visi laukai turi būti private, turėti getterius ir setterius.
//    konstruktoriai - 2. tuščias ir su visais fieldais.
//     ToString()