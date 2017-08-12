
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Gigasecond {

		private final LocalDateTime input;
		public Gigasecond(LocalDateTime inputDateTime){
			input = inputDateTime;
		}
		public Gigasecond(LocalDate inputDate){
			input = inputDate.atTime(0,0);
		}
		public LocalDateTime getDate(){
			return input.plusSeconds((long) Math.pow(10,9));
		}		
	}
