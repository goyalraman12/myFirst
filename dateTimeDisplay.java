import java.text.SimpleDateFormat;  
import java.util.Date;  
class CurrentDateTimeExample1 {  
public static void main(String[] args) {  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    System.out.println("Current Date and Time are: "+formatter.format(date));  
}  
} 