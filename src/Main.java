import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
public class Main{
    public static void main(String[] args) {

        /*
        List<Integer> integers = new ArrayList<>();  // asa creezi o lista cu 10 elemente
        Random rand = new Random( System.currentTimeMillis());
        for(int i=0;i<10;i++) {
            integers.add(rand.nextInt());
        }


        int min = integers.get(0);    // get(0) = primul element
        int max = integers.get(0);

        for(var x : integers ) {
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
        System.out.printf(" Minimul este: %d\nMaximul este: %d\n", min, max);
     }
}
*/


// Calculati intr-o variabila suma a 2 numere random:
/*
public class Main{
    public static void main(String[] args) {
        int min = 5;
        int max = 25;
        int suma = min + max;

        for(int i=0; i<1; i++) {
            System.out.println( (int) (Math.random()*suma) );
        }
    }
}
*/

/*
public class Main {
 /*
    public static void main(String[] args) {
        Car myCar = new Car("Black", 210.25, 5);
        myCar.start();
    }
}
/*

 */

public class Main{
    public static void main (String[]args){
      /*  // input de la tastatura:
            int x;
            Scanner tastatura = new Scanner(System.in);
            System.out.println("Introduceti valoarea lui x:");
            x = tastatura.nextInt();
            System.out.println(x); */
        List<Persoana>  persoane = new ArrayList<>();
        persoane.add(new Student("florin", "ionel", 29, 9.3));
        persoane.add(new Persoana("Flesar", "Radu", 31));
        persoane.add(new Student("Florinel", "Ionel", 30, 10,"Stiinte economice"));



        int sumaVarste = 0;
        for(var p : persoane){
            sumaVarste+= p.getVarsta();
        }


        int sumaVarstePeroane = 0, nrPersoane = 0;
        for(var p : persoane){
            if(!(p instanceof Student)){
                sumaVarstePeroane += p.getVarsta();
                nrPersoane++;
            }
        }

        double media = 1.0*sumaVarste/persoane.size();
        double mediaStudenti = 1.0* sumaVarstePeroane / nrPersoane;



        int mediaNotelorStudenti = 0, nrStudenti = 0;
        for(var p : persoane){
            if (p instanceof Student ){
                mediaNotelorStudenti += ((Student)p).Media;
                nrStudenti++;
            }
        }
        double mediaNotelorSt = 1.0* mediaNotelorStudenti/ nrStudenti;



        System.out.println("Media varstei este: " + media);
        System.out.println("Media varstei persoane este: " + mediaStudenti);
        System.out.println("Media notelor studentilor este: " + mediaNotelorStudenti);





            }
    }



