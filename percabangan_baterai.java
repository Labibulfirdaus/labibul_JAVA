public class percabangan_baterai {
	public static void main(String[] args) {
		int baterai =100;
		int pesentasi_persen = baterai;

		if(baterai == 100){
			System.out.println("baterai penuh ");
			System.out.println("baterai saat ini\t: "+pesentasi_persen+"%");
		}
		else if(baterai >= 0 && baterai <=99){
			System.out.println("baterai tidak penuh");
			System.out.println("baterai saat ini\t: "+pesentasi_persen+"%");
		}
		else{
			System.out.println("yang anda inputkan ngawur");
		}
	}
}
