import java.time.LocalDate;
import Abstracts.BaseLogger;
import Adapters.MernisServiceAdapter;
import Concrete.StarBucksCustomerManager;
import Concrete.Logs.DataBaseLogger;
import Concrete.Logs.EmailLogger;
import Entities.Customer;


public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 	
      	
		
		BaseLogger [] loggers= {new DataBaseLogger(),new EmailLogger()};
		

        
		
		// hoca her ne kadar new lemeyi sevmesede allah affetsin alayýný newledik...
		 new StarBucksCustomerManager(
				 new MernisServiceAdapter(),
				 loggers). save(
						 new Customer(123,
								 "abuziddin",
								 "daldeviren",
								 LocalDate.of(1900,01,01),
								 "00000000007"));
		
		
	}}