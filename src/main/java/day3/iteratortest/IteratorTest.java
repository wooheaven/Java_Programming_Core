package day3.iteratortest;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("SDS");
		hSet.add("LG");
		hSet.add("SK");
		hSet.add("LG");

		System.out.println("저장된 데이터 수: " + hSet.size());

		// for(int i=0; i<hSet.size(); i++){
		// System.out.println(hSet.get(i));
		// }

		Iterator<String> itr = hSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
