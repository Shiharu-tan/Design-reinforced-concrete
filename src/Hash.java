import java.util.HashMap;

public class Hash {
	public double hash(String k) {
		int key = Integer.parseInt(k);
		HashMap <Integer , Double> map = new HashMap<>();
		map.put(6, 28.3);
		map.put(8, 50.3);
		map.put(10, 79.0);
		map.put(13, 133.0);
		map.put(16, 201.0);
		map.put(19, 284.0);
		map.put(22, 380.0);
		map.put(25, 491.0);
		map.put(28, 616.0);
		map.put(32, 804.0);
		map.put(38, 1134.0);
		map.put(40, 1257.0);
		
		return map.get(key);
	}
}
