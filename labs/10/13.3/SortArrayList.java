import java.util.ArrayList;
public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Number>();
		list.add(1);
		list.add(45);
		list.add(60);
		list.add(4.2);
		list.add(100);
		list.add(2);
		list.add(4);
		list.add(6);
		sort(list);
		for (int k = 0; k < list.size(); k++) {
			System.out.print(list.get(k) + " ");
		}
	}

	public static void sort(ArrayList<Number> list) {
		int count = list.size();
		for (int j = 0; j < count; j++) {
			for (int i = 0; i < count - 1; i++) {
				if (list.get(i).doubleValue() > list.get(i + 1).doubleValue()) {
					Number temp1 = list.get(i);
					Number temp2 = list.get(i + 1);
					list.set(i, temp2);
					list.set(i + 1, temp1);
				}
			}
		}
	}

}
