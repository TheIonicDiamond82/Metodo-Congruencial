
package metodo_congruencial;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
  López Chaparro Kevin Manuel
  Leyva González Jesús Nahel
  Peñuelaz Leyva Luis Alberto
  Uriarte Avelar Jesus Eduardo
*/
public class Metodo_Congruencial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List nums = new ArrayList();
		int a = 0, i = 0;
                System.out.println("\nEquipó #5");
		do {
			System.out.print("Ingrese el valor de A (Debe ser impar y no divisible entre 3 y 5): ");
			a = scn.nextInt();
		} while (a % 2 == 0 || a % 3 == 0 || a % 5 == 0);
		System.out.println("Variable x");
		System.out.println("1.- Introducir valor por teclado");
		System.out.println("2.- Generar valor random");
		System.out.print("Ingrese la opción: ");
		int opt = scn.nextInt();
		int x;
		if (opt == 1) {
			System.out.print("Ingrese el valor de X: ");
			x = scn.nextInt();
		} else {
			x = (int) (Math.random() * 9999);
		}
		int c = 0;
		do {
			System.out.print("Introtuzca un valor de C (C % 200 = 21): ");
			c = scn.nextInt();
		} while (c % 200 != 21);
		System.out.println("Variable M");
		System.out.println("1.- Introducir valor al azar");
		System.out.println("2.- Que cumpla la regla");
		System.out.print("Seleccione la opción a utilizar: ");
		opt = scn.nextInt();
		int m = 0;
		int divi;
		do {
			divi=0;
			if (opt == 1) {
				m = (int) (Math.random() * 32748);
			} else {
				System.out.print("Ingrese el valor de M (debe ser primo, el mas grande posible"
                                        + "\ny que sea menor que p^d-1 donde p = 10: ");
				m = scn.nextInt();
			}
			for(int j=1;j<m;j++) {
				if(m%j==0)
					divi++;
			}
		}while(divi>1);
		System.out.println("n\tx\tax+c\t(ax+c)/m\txn+1");
		while (!nums.contains(x)) {
			System.out.println(i + "\t" + x + "\t" + (a * x + c) + "\t" + ((a * x + c) + "/" + m) + "\t" + ((a * x + c) % m));
			nums.add(x);
			x = (a * x + c) % m;
			i++;
		}
		x=(a * x + c) % m;
		System.out.println(x + " se repite en la posicion "+nums.indexOf(x));
	}

}
