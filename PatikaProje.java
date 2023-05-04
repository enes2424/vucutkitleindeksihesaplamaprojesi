import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
		double boy = input.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz: ");
		int kilo = input.nextInt();
		System.out.println("Vücut Kitle İndeksiniz: " + kilo / (boy * boy));
	}

}
