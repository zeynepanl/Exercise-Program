
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("İdaman programına hoşgeldiniz..");
		String hareketler="burpee\n"
				+"pushup\n"
				+"situp\n"
				+"squat\n";
		System.out.println(hareketler);
		
		System.out.println("Bir idman oluşturun");
		System.out.println("Burpee sayısı:");
		int burpee=scanner.nextInt();
		System.out.println("Pushup sayısı:");
		int pushup=scanner.nextInt();
		System.out.println("Situp sayısı:");
		int situp=scanner.nextInt();
		System.out.println("Squat sayısı:");
		int squat=scanner.nextInt();
		
		scanner.nextLine();
		
		İdman idman=new İdman(burpee,pushup,situp,squat);
		System.out.println("İdmanınız başlıyor");
		while(idman.idmanBittiMi()==false) {
			System.out.println("Yapmak istediğiniz haraket türünü seçin:");
			String tur=scanner.nextLine();
			System.out.println("Bu hareketten kaç tane yapacaksınız:");
			int sayi=scanner.nextInt();
			scanner.nextLine();
			idman.HareketYap(tur, sayi);
			
		}
		System.out.println("İdmanı başarıyla bitirdin.");
		
		
		
		

	}

}
