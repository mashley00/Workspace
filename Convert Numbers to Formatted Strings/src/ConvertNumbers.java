import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ConvertNumbers {
	public static void main(String[] args) {
/*		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		// NumberFormat.getCurrencyInstance();

		double price = 49.51;
		// String priceFormatted = currency.format(price);
		String priceFormatted = NumberFormat.getCurrencyInstance().format(price);
		System.out.println(price);

		/*
		//double discountPercent = .2;
		NumberFormat percent = NumberFormat.getPercentInstance();
		String discountPercentFormatted = percent.format(discountPercent);
		System.out.println(discountPercent);
*/
		float i = 4;
		double d = 4.5;
		i += d;
		System.out.println(i);

		double x = Math.random() * 10000;
		// long result = Math.round(x);
		System.out.println(x);
		long result = (long) x;
		System.out.println(result);
		// System.out.println(result);

		// salesTax = salesTax.setScale(2, RoundingMode.HALF_UP);
		// long salesTax = (long) 4.999;
		
		//double discountAmount = .24;
		
	//	discountAmount = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();
		//System.out.println(discountAmount);
		
		double subtotal = 100.05;
		double discountPercent = .1;
		double discountAmount = subtotal  * discountPercent;
		double totalBeforeTax = subtotal - discountAmount;
		System.out.println(totalBeforeTax);
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		String formattedMessage =
				"Subtotal:		" + currency.format(subtotal) +"\n"
			+	"Discount percent:	" + percent.format(discountPercent) +"\n"
			+	"Discount amount:	" + currency.format(discountAmount) +"\n"
			+	"Total before tax:	" +currency.format(totalBeforeTax) + "\n";
		
		System.out.println(formattedMessage);
		
		LocalDate currentDate=LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		
		System.out.println(currentDate);
		System.out.println(currentTime);
		System.out.println(currentDateTime);
		
		
		LocalDate halloween1 = LocalDate.of(2015,  Month.OCTOBER, 31);
		LocalDate halloween3 = LocalDate.parse("2015-10-31");
		
			System.out.println(halloween1);
			System.out.println(halloween3);
		
		
	}
}
