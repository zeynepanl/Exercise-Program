
public class İdman {
	private int burpee_sayisi;
	private int pushup_sayisi;
	private int situp_sayisi;
	private int squat_sayisi;
	
	public İdman(int burpee_sayisi,int pushup_sayisi,int situp_sayisi,int squat_sayisi) {
		this.burpee_sayisi=burpee_sayisi;
		this.pushup_sayisi=pushup_sayisi;
		this.situp_sayisi=situp_sayisi;
		this.squat_sayisi=squat_sayisi;
	}
	
	public void HareketYap(String hareket_türü,int sayi) {
		if(hareket_türü.equals("burpee")) {
			burpeeYap(sayi);
		}
		else if(hareket_türü.equals("pushup")) {
			pushupYap(sayi);
	    }
		else if(hareket_türü.equals("situp")) {
			situpYap(sayi);
		}
		else if(hareket_türü.equals("squat")) {
			squatYap(sayi);
		}
	}
	
	public void burpeeYap(int sayi) {
		if(sayi==0) {
			System.out.println("Yapacak burpee kalmadı");
		}
		else if(burpee_sayisi-sayi<0) {
			System.out.println("Tebrikler hedeflediğin burpee geçtin.");
			burpee_sayisi=0;
			System.out.println("kalan burpee:"+burpee_sayisi);
		}
		else {
			burpee_sayisi-=sayi;
			System.out.println("kalan burpee:"+burpee_sayisi);
		}
	}
	
	public void pushupYap(int sayi) {
		if(sayi==0) {
			System.out.println("Yapacak pushup kalmadı");
		}
		else if(pushup_sayisi-sayi<0) {
			System.out.println("Tebrikler hedeflediğin pushup geçtin.");
			pushup_sayisi=0;
			System.out.println("kalan pushup:"+pushup_sayisi);
		}
		else {
			pushup_sayisi-=sayi;
			System.out.println("kalan pushup:"+pushup_sayisi);
			
		}
	}
	
	public void situpYap(int sayi) {
		if(sayi==0) {
			System.out.println("Yapacak situp kalmadı");
		}
		else if(situp_sayisi-sayi<0) {
			System.out.println("Tebrikler hedeflediğin situp geçtin.");
			situp_sayisi=0;
			System.out.println("kalan situp:"+situp_sayisi);
		}
		else {
			situp_sayisi-=sayi;
			System.out.println("kalan situp:"+situp_sayisi);
		}
	}
	
	
	public void squatYap(int sayi) {
		if(sayi==0) {
			System.out.println("Yapacak squat kalmadı");
		}
		else if(squat_sayisi-sayi<0) {
			System.out.println("Tebrikler hedeflediğin squat geçtin.");
			squat_sayisi=0;
			System.out.println("kalan squat:"+squat_sayisi);
		}
		else {
			squat_sayisi-=sayi;
			System.out.println("kalan burpee:"+squat_sayisi);
			
		}
	}
	
	public boolean idmanBittiMi() {
		
		return (burpee_sayisi==0)&&(pushup_sayisi==0)&&(situp_sayisi==0)&&(squat_sayisi==0); 
		
	}
}
