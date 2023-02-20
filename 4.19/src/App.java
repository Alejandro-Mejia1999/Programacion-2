import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double arti1, arti2, arti3, arti4, Total, pago;
        int x, cantA, y;
        int[] cont = new int[3];

        arti1 = 239.99;
        arti2 = 129.75;
        arti3 = 99.95;
        arti4 = 350.89;
        Total = 0.0;
        Scanner entra = new Scanner(System.in);
        String vendedor;
        System.out.println("digite el nombre del vendedor");
        vendedor = entra.nextLine();
        System.out.println("cuantos articulos vendio");
        cantA = entra.nextInt();
        for (int i = 0; i < cantA; i++) {
            System.out.println("que articulo vendio");
            y = entra.nextInt();
            switch (y) {
                case 1:
                    Total += arti1;
                    cont[0]++;
                    break;

                case 2:
                    Total += arti2;
                    cont[1]++;
                    break;
                case 3:
                    Total += arti3;
                    cont[2]++;
                    break;
                case 4:
                    Total += arti4;
                    cont[3]++;
                    break;
                default:
                    System.out.println("el producto no se encuentra");
            }

        }
        pago = 200 + (Total * 0.09);
        System.out.println("desea ver el produto vendido");
        System.out.println("1. si");
        System.out.println("0. no");
        x = entra.nextInt();
        if (x == 1) {
            System.out.println(vendedor + " realizo las siguientes ventas");
            System.out.println("producto 1 vendio" + cont[0]);
            System.out.println("product  2 vendio" + cont[1]);
            System.out.println("producto 3 vendio" + cont[2]);
            System.out.println("producto 4 vendio" + cont[3]);
            System.out.println("el total de venta: " + Total);
            System.out.println("el pago de: " + vendedor + " es " + pago);

        }
        System.out.println("desea salir");
        System.out.println("1. no");
        System.out.println("0. si");
        x = entra.nextInt();

        entra.close();
    }
}
