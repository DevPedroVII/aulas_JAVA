package helper;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Utils {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	static NumberFormat nf = new DecimalFormat("R$ #,#0.00", 
			new DecimalFormatSymbols(new Locale("pt","BR")));

}
