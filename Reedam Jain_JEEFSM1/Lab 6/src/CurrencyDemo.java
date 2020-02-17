import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {

	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		int amount=10000;
		Currency c=Currency.getInstance(locale);
		System.out.println("Using currency code: "+amount+c.getCurrencyCode());
		System.out.println("Using currency symbol: "+amount+c.getSymbol());
		System.out.println("Using currency name: "+c.getDisplayName());

	}

}
