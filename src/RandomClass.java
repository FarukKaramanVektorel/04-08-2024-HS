import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		String[] katilimcilar= {"Yıldız Tilbe","Sezen Aksu",
				"Ferdi Tayfur","Emirhan İğrek","Müslüm Gürses",
				"Orhan Gencebay"};
		Random random=new Random();
		int index=random.nextInt(katilimcilar.length);
		// 0 1 2 3 4 5
		System.out.println("Kazanan : "+katilimcilar[index]);
		
		int sayi=random.nextInt(21)+20;
		System.out.println(sayi);
		// 1 - 49 
		int[] kazananNo=new int[6];
		//0 - 45
		//1 - 
		
		double rSayi=random.nextDouble();
		System.out.println(rSayi);
		long rLSayi=random.nextLong();
		System.out.println(rLSayi);
		boolean rBool=random.nextBoolean();
		System.out.println(rBool);
		double rG=random.nextGaussian();
		System.out.println(rG);
		
	}

}
