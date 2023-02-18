import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int x, Km, Lt;
        Scanner entra = new Scanner(System.in);
        System.out.println("digite el numero de viajes realizados");
        x = entra.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println("cuantos kilometros en el viaje" + i);
            Km = entra.nextInt();
            System.out.println("cuantos litros en el viaje" + i);
            Lt = entra.nextInt();
        }
        entra.close();
    }
}
