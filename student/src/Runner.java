import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		
		List<collegeDto> list = new ArrayList<collegeDto>();
		
		collegeDto dto = new collegeDto("ulaga", 2);
		collegeDto dto1 = new collegeDto("kiran", 3);
		collegeDto dto2 = new collegeDto("shuheb",1);
		
		
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		
		Comparator<collegeDto> comp = new Comparator<collegeDto>() {

			@Override
			public int compare(collegeDto dto1, collegeDto dto2) {
				if(dto1.getRollNumber()>dto2.getRollNumber()) {
					System.out.println("-------");
					return 1;
				}
				return -1;
			}
			
		};
		Collections.sort(list,comp);
		for(Object obj :list) {
			System.out.println(obj);
		}
		
		

	}

}
