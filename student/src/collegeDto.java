import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class collegeDto implements Comparable<collegeDto>{
	
	private String name;
	private int rollNumber;
	@Override
	public int compareTo(collegeDto o) {
	
		return 0;
	}
	
	
	

}
