import java.util.Scanner;

public class TurDonusumleri {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//Dizilerde tek veri tipi tutulur
		byte x=45;//127 - 128
		short y= 4650;//32660
		x=(byte) y;
		System.out.println(y+" - "+x);
		int xi=4562;// .0
		double yd=45.862;
		//yd=xi;
		xi=(int)yd;
		System.out.println(xi);
		String a=String.valueOf(yd);
		System.out.println(a);
		System.out.println("Yaşınızı ve Adınızı ve Harf Notu ve aylık kazancınızı giriniz");
		String input=in.nextLine();
		String[] temp=input.split(" ");
		int yas=Integer.valueOf(temp[0]);// Yaş int
		String ad=temp[1];// Ad
		char hn=temp[2].charAt(0);// Harf Notu char - Character
		double maas=Double.valueOf(temp[3]);// gelir double
		System.out.println(ad+" "+yas+" "+hn+" "+maas);
		
	}

}
