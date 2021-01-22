
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;





public class JavaStreamDemo {
	
	//@Test
	
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhisek");
		names.add("Arjun");
		names.add("Jay");
		names.add("Deep");
		names.add("Kartik");
		
		long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		Stream.of("Abhi","Jay","Rama","Alekhya","Adam").filter(s->s.endsWith("a")).map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		List<String>names1 = Arrays.asList("Abhi","Jay","Rama","Alekhya","Adam");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		Stream<String> newStream =Stream.concat(names.stream(), names1.stream());
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		Assert.assertTrue(flag);
		
		List<Integer> values = Arrays.asList(3,2,2,2,5,7,3,8,9);
		List<Integer> distictvalue = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(distictvalue.get(3));
		
	}
	
	
	

}
