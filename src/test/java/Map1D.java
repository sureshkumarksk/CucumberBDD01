import java.util.LinkedHashMap;
import java.util.Map;

public class Map1D {
	public static void main(String[] args) {
		Map<String, String> mp = new LinkedHashMap<String, String>();
		mp.put("name", "suresh");
		mp.put("mail", "suresh@gamil");
		mp.put("address", "pollachi");
		System.out.println(mp);
		String string = mp.get("address");
		System.out.println(string);
		
	}

}
