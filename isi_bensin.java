public class isi_bensin {
	public static void main(String[] args) {
		int isi_bensinSekarang = 76;
		int kapasitas_tangki =50;
		double persentasiBensin = isi_bensinSekarang/ kapasitas_tangki*100;

		if(persentasiBensin >= 75){
			System.out.println("tangki bensin penuh (" + isi_bensinSekarang + "liter " + persentasiBensin + "%");
		}
		else if(persentasiBensin >= 50){
			System.out.println("tangki bensin setengah (" + isi_bensinSekarang + "liter " + persentasiBensin + "%");
		}
		else if(persentasiBensin >= 25){
			System.out.println("tangki bensin hampir habis (" + isi_bensinSekarang + "liter " + persentasiBensin + "%");
		}
		else{
			System.out.println("tangki kosong " + isi_bensinSekarang + "liter " + persentasiBensin + "%");
		}
	}
}
