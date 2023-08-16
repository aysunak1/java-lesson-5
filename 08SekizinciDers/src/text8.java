import java.util.Scanner;

public class text8 {

	public static void main(String[] args) {
		// Bakiye sorgulama -------> 1
		// Para çekmek için -------> 2
		// Farklý hesaba para yatýrmak için ------->3
		// Çýkmak için -------->4
		Scanner scanner = new Scanner(System.in);
		String islemSecenekleri = "Bakiye sorgulama --->1" + "Para çekmek için --->2" + "Para yatýrmak için --->3"
				+ "Çýkmak için --->4";

		String aysunKullanici = "aysun";
		String aysunSifre = "1234";
		double aysunBakiye = 2800;
		String aysunIban = "TR 1234";

		String haticeKullanici = "hatice";
		String haticeSifre = "4567";
		double haticeBakiye = 1500;
		String haticeIban = "TR 4567";

		System.out.println("HOÞGELDÝNÝZ.GÝRÝÞ YAPMAK ÝSTEDÝÐÝNÝZ KULLANICIYI GÝREREK DEVAM EDEBÝLÝRSÝNÝZ.");
		System.out.print("Kullanýcý:");
		String kullanici = scanner.nextLine();
		System.out.print("Þifre:");
		String sifre = scanner.nextLine();
		//-----------------AYSUN KULLANICISI-------------------------
		if (kullanici.equals(aysunKullanici) && sifre.equals(aysunSifre)) {
			System.out.println("Aysun kullanýcýsýna giriþ yaptýnýz.");
			System.out.print(islemSecenekleri);

			System.out.println(" Yapmak istediðiniz iþlemi tuþlayýnýz");
			int secenek = scanner.nextInt();

			switch (secenek) {
			case 1:
				System.out.println("Bakiyeniz:" + aysunBakiye);
				break;
			case 2:
				System.out.println("Çekmek istediðiniz tutarý giriniz:");
				double cekTutar = scanner.nextDouble();
				if (cekTutar<= aysunBakiye) {
					aysunBakiye -= cekTutar;
					System.out.println("Para çekilmiþtir.Yeni bakiyeniz: " + aysunBakiye);
				}
				else {
					System.out.println("Bakiyeniz yetersizdir.");
				}
				break;
			case 3:
				System.out.println("Yatýrmak istediðiniz tutarý giriniz:");
				double yatTutar = scanner.nextDouble();
				if (yatTutar<= aysunBakiye) {
					System.out.println("Yatýrmak istediðiniz Ibaný giriniz:");
					scanner.nextLine();
					String iban = scanner.nextLine();
					if (iban.equals(haticeIban)) {
						aysunBakiye = aysunBakiye - yatTutar;
						haticeBakiye = haticeBakiye + yatTutar;
						System.out.println("Paranýz yatýrýlmýþtýr.Hesabýnýzýn bakiyesi: " + aysunBakiye
								+ " Diðer hesap bakiye: " + haticeBakiye);
					} 
					else {
						System.out.println("Yanlýþ Iban girdiniz:");
					}
				}
				else {
					System.out.println("Bakiyeniz yetersizdir.");
				}
			        break;
			case 4:
				System.out.println("Çýkýþ yaptýnýz.Ýyi günler dileriz.");
				break;
			default:
				System.out.println("Yanlýþ tuþlama yaptýnýz.");

			}

		} 
		//-------------------------------HATÝCE KULLANICISI----------------------------------------
			else if (kullanici.equals(haticeKullanici) && sifre.equals(haticeSifre)) {
			System.out.println("Hatice kullanýcýsýna giriþ yaptýnýz.");
			System.out.print(islemSecenekleri);

			System.out.println(" Yapmak istediðiniz iþlemi tuþlayýnýz");
			int secenek = scanner.nextInt();

			switch (secenek) {
			case 1:
				System.out.println("Bakiyeniz:" + haticeBakiye);
				break;
			case 2:
				System.out.println("Çekmek istediðiniz tutarý giriniz:");
				double cekTutar = scanner.nextDouble();
				if (cekTutar<= haticeBakiye) {
					haticeBakiye -= cekTutar;
					System.out.println("Para çekilmiþtir.Yeni bakiyeniz: " + haticeBakiye);
				}
				else {
					System.out.println("Bakiyeniz yetersizdir.");
				}
				break;
			case 3:
				System.out.println("Yatýrmak istediðiniz tutarý giriniz:");
				double yatTutar = scanner.nextDouble();
				if (yatTutar<=haticeBakiye) {
					System.out.println("Yatýrmak istediðiniz Ibaný giriniz:");
					scanner.nextLine();
					String iban = scanner.nextLine();
						if (iban.equals(aysunIban)) {
							haticeBakiye = haticeBakiye - yatTutar;
							aysunBakiye = aysunBakiye + yatTutar;
							System.out.println("Paranýz yatýrýlmýþtýr.Hesabýnýzýn bakiyesi: " + haticeBakiye
									+ " Diðer hesap bakiye: " + aysunBakiye);
						} 
						else {
							System.out.println("Yanlýþ Iban girdiniz:");
						}
				}
				else {
					System.out.println("Bakiyeniz yetersizdir.");
				}
				
			        break;
			case 4:
				System.out.println("Çýkýþ yaptýnýz.Ýyi günler dileriz.");
				break;
			default:
				System.out.println("Yanlýþ tuþlama yaptýnýz.");

			}

		} 
		//--------------------------HATALI KULLANICI-------------------------
			else {
			System.out.println("Kullanýcý adý veya þifre yanlýþ.");
		}

	}

}
