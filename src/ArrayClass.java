import java.util.Arrays;

public class ArrayClass {
	public static void main(String[] args) {
		int[] numbers= {4,1,0,-89,985};
		String[] names= {"Şakir","İhsan","Ünsal","Ömer","Zeynep","Mahmut","Ayşe","Bülent"};
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(names));
		Arrays.sort(numbers);
		Arrays.sort(names);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.binarySearch(names, "Şakir"));
		int[] numbers2=new int[5];
		Arrays.fill(numbers2, 85);
		System.out.println(Arrays.toString(numbers2));
		numbers2=Arrays.copyOf(numbers2, 5);
		System.out.println(Arrays.toString(numbers2));
		String[][] adsoyad= {
				{"Ayşe","Veli","Murtaza"},
				{"Keskin","Deli","Döner"},
				{"Yozgat","Kırıkkale","Çorum"}};
		System.out.println(Arrays.deepToString(adsoyad));
		
		int[] numbers3= {4,5,6,7};
		int[] numbers4=numbers3;
		System.out.println(Arrays.toString(numbers4));
		int a=78;
		int b=a;
		a=92;
		System.out.println(b);
		numbers3[0]=965;
		numbers3[1]=966;
		numbers3[2]=967;
		numbers3[3]=968;
		System.out.println(Arrays.toString(numbers4));
		String ad="murtaza";
		
		
		
	}

}
