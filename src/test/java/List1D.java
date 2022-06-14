import java.awt.List;
import java.util.ArrayList;

public class List1D
{
	public static void main(String[] args) {
		java.util.List<String> li = new ArrayList<String>();
		li.add("suresh");
		li.add("suresh@gamil.com");
		li.add("pollachi");
		System.out.println(li);
		String x = li.get(2);
		System.out.println(x);
	}

}
