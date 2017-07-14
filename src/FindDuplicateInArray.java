import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArray {
	public int repeatedNumber(final List<Integer> a) {
	    int size = a.size();
	    int repeat = -1;
	    Set<Integer> unique = new HashSet<>();
	    for(int i = 0; i < size; i++) {
	        if(unique.add(a.get(i))) {
	            continue;
	        } else repeat = a.get(i);
	    }
	    return repeat;
	}
}
