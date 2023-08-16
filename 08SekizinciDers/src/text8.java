import java.util.Scanner;

public class text8 {

	public static void main(String[] args) {
		// Bakiye sorgulama -------> 1
		// Para �ekmek i�in -------> 2
		// Farkl� hesaba para yat�rmak i�in ------->3
		// ��kmak i�in -------->4
		Scanner scanner = new Scanner(System.in);
		String islemSecenekleri = "Bakiye sorgulama --->1" + "Para �ekmek i�in --->2" + "Para yat�rmak i�in --->3"
				+ "��kmak i�in --->4";

		String aysunKullanici = "aysun";
		String aysunSifre = "1234";
		double aysunBakiye = 2800;
		String aysunIban = "TR 1234";

		String haticeKullanici = "hatice";
		String haticeSifre = "4567";
		double haticeBakiye = 1500;
		String haticeIban = "TR 4567";

		System.out.println("HO�GELD�N�Z.G�R�� YAPMAK �STED���N�Z KULLANICIYI G�REREK DEVAM EDEB�L�RS�N�Z.");
		System.out.print("Kullan�c�:");
		String kullanici = scanner.nextLine();
		System.out.print("�ifre:");
		String sifre = scanner.nextLine();
		//-----------------AYSUN KULLANICISI-------------------------
		if (kullanici.equals(aysunKullanici) && sifre.equals(aysunSifre)) {
			System.out.println("Aysun kullan�c�s�na giri� yapt�n�z.");
			System.out.print(islemSecenekleri);

			System.out.println(" Yapmak istedi�iniz i�lemi tu�lay�n�z");
			int secenek = scanner.nextInt();

			switch (secenek) {
			case 1:
				System.out.println("Bakiyeniz:" + aysunBakiye);
				break;
			case 2:
				System.out.println("�ekmek istedi�iniz tutar� giriniz:");
				double cekTutar = scanner.nextDouble();
				if (cekTutar<= aysunBakiye) {
					aysunBakiye -= cekTutar;
					System.out.println("Para �ekilmi�tir.Yeni bakiyeniz: " + aysunBakiye);
				}
				else {
					System.out.println("Bakiyeniz yetersizdir.");
				}
				break;
			case 3:
				System.out.println("Yat�rmak istedi�iniz tutar� giriniz:");
				double yatTutar = scanner.nextDouble();
				if (yatTutar<= aysunBakiye) {
					System.out.println("Yat�rmak istedi�iniz Iban� giriniz:");
					scanner.nextLine();
					String iban = scanner.nextLine();
					if (iban.equals(haticeIban)) {
						aysunBakiye = aysunBakiye - yatTutar;
						haticeBakiye = haticeBakiye + yatTutar;
						System.out.println("Paran�z yat�r�lm��t�r.Hesab�n�z�n bakiyesi: " + aysunBakiye
								+ " Di�er hesap bakiye: " + haticeBakiye);
					} 
					else {
						System.out.println("Yanl�� Iban girdiniz:");
					}
				}
				else {
					System.out.println("Bakiyeniz yetersizdir.");
				}
			        break;
			case 4:
				System.out.println("��k�� yapt�n�z.�yi g�nler dileriz.");
				break;
			default:
				System.out.println("Yanl�� tu�lama yapt�n�z.");

			}

		} 
		//-------------------------------HAT�CE KULLANICISI----------------------------------------
			else if (kullanici.equals(haticeKullanici) && sifre.equals(haticeSifre)) {
			System.out.println("Hatice kullan�c�s�na giri� yapt�n�z.");
			System.out.print(islemSecenekleri);

			System.out.println(" Yapmak istedi�iniz i�lemi tu�lay�n�z");
			int secenek = scanner.nextInt();

			switch (secenek) {
			case 1:
				System.out.println("Bakiyeniz:" + haticeBakiye);
				break;
			case 2:
				System.out.println("�ekmek istedi�iniz tutar� giriniz:");
				double cekTutar = scanner.nextDouble();
				if (cekTutar<= haticeBakiye) {
					haticeBakiye -= cekTutar;
					System.out.println("Para �ekilmi�tir.Yeni bakiyeniz: " + haticeBakiye);
				}
				else {
					System.out.println("Bakiyeniz yetersizdir.");
				}
				break;
			case 3:
				System.out.println("Yat�rmak istedi�iniz tutar� giriniz:");
				double yatTutar = scanner.nextDouble();
				if (yatTutar<=haticeBakiye) {
					System.out.println("Yat�rmak istedi�iniz Iban� giriniz:");
					scanner.nextLine();
					String iban = scanner.nextLine();
						if (iban.equals(aysunIban)) {
							haticeBakiye = haticeBakiye - yatTutar;
							aysunBakiye = aysunBakiye + yatTutar;
							System.out.println("Paran�z yat�r�lm��t�r.Hesab�n�z�n bakiyesi: " + haticeBakiye
									+ " Di�er hesap bakiye: " + aysunBakiye);
						} 
						else {
							System.out.println("Yanl�� Iban girdiniz:");
						}
				}
				else {
					System.out.println("Bakiyeniz yetersizdir.");
				}
				
			        break;
			case 4:
				System.out.println("��k�� yapt�n�z.�yi g�nler dileriz.");
				break;
			default:
				System.out.println("Yanl�� tu�lama yapt�n�z.");

			}

		} 
		//--------------------------HATALI KULLANICI-------------------------
			else {
			System.out.println("Kullan�c� ad� veya �ifre yanl��.");
		}

	}

}
