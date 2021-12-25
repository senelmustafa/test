package StringBuilder;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(6);
		sb.length();//uzunluk verir
		System.out.println(sb.length());
		System.out.println(sb.capacity());//içersine ne yazıldıysa odur
		System.out.println("..........................");
		StringBuilder sb2=new StringBuilder("Java candır");
		
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println("..........................");
		sb2.append(" aysel");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println(sb2);
		
		System.out.println(sb2.charAt(sb2.length()-1));//girilen kelimenin son karakterini yazdırır
		System.out.println(sb2.charAt(0));//ilk indeksini verir
		
		StringBuilder sil=new StringBuilder("Java candır can");
		
		System.out.println(sil.delete(11,15));
		System.out.println(sil.capacity());
		
		StringBuilder karsılastir=new StringBuilder("Java");
		StringBuilder karsılastir2=new StringBuilder("Javp");//a ile p yı karsılastırıyor
		
		System.out.println(karsılastir.equals(karsılastir2));
		System.out.println(karsılastir.compareTo(karsılastir2));
		
	}

}
