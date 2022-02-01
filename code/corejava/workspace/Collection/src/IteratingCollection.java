import java.util.ArrayList;
import java.util.Iterator;

public class IteratingCollection {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(87.67);
		list.add(76.54);
		list.add(55.56);
		list.add(55.61);
		list.add(71.56);
		list.add(65.56);
		list.add(75.87);
		list.add(67.98);
		
		//List<Double> precetages = Arrays.asList(67.56,78.65,98.76,97.45,67.5);
		
		int counter = 0;
		// 1. Using for/enhance for loop
		for(double d : list ) {
			if(d >= 75) {
				counter++;
			}
		}
		System.out.println("Total Dist : " + counter);
		
		counter = 0;
		// 2. Using Iterator interface
		Iterator<Double> it = list.iterator();
		while(it.hasNext()) {
			double d = it.next();
			if(d >= 75) {
				counter++;
			}
		}
		System.out.println("Total Dist : " + counter);
		//it.hasNext() // use to check whether new element is present or not, if present then return true else false
		//it.next() // use to forward cursor to the next value and also get the value.
		
	}
}















