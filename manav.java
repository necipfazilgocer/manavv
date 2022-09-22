package manav;
import java.util.Scanner;
import java.util.Scanner;

public class manav {

	public static void main(String[] args) {
		double elma,armut,domates,muz,patlican,ELMA,ARMUT,DOMATES,MUZ,PATLICAN,toplam;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Kaç kilo elma aldınız? ");
		elma=scanner.nextInt();
		ELMA=2.14*elma;
		System.out.print("Kaç kilo armut aldınız? ");
		armut=scanner.nextInt();
		ARMUT=3.67*armut;
		System.out.print("Kaç kilo domates aldınız? ");
		domates=scanner.nextInt();
		DOMATES=1.11*domates;
		System.out.print("Kaç kilo muz aldınız? ");
		muz=scanner.nextInt();
		MUZ=0.95*muz;
		System.out.print("Kaç kilo patlican aldınız? ");
		patlican=scanner.nextInt();
		PATLICAN=5*patlican;
		toplam=ELMA+ARMUT+DOMATES+MUZ+PATLICAN;
		System.out.println(elma+ "kg elma tutarı= "+ELMA);
		System.out.println(armut+ "kg armut tutarı= "+ARMUT);
		System.out.println(domates+ "kg domates tutarı= "+DOMATES);
		System.out.println(muz+ "kg muz tutarı= "+MUZ);
		System.out.println(patlican+ "kg patlican tutarı= "+PATLICAN);
		System.out.println("Toplam tutar="+toplam);
		
		

	}

}
