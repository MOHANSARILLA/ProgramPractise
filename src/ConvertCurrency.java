import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.NumberFormatter;

public class ConvertCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=new Scanner(System.in).nextDouble();
		
		NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat nf2=NumberFormat.getCurrencyInstance();
		NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		System.out.println(nf.format(d));
		System.out.println(nf1.format(d));
		System.out.println(new StringBuffer(nf2.format(d)).replace(0, 1, "Rs."));
		System.out.println(nf3.format(d));

	}

}
