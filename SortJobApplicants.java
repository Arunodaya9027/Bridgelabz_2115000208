import java.util.*;

class Heap {
	private ArrayList<Integer> list;
	public Heap() {
		list = new ArrayList<>();
	}

	public void Add(int item) {
		list.add(item);
		upheapify(list.size() - 1);
	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (list.get(pi) < list.get(ci)) {
			int temp = list.get(pi);
			list.set(pi, list.get(ci));
			list.set(ci, temp);
			upheapify(pi);
		}
	}

	public int remove() {
		int removed = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.set(list.size() - 1, removed);
		list.remove(list.size() - 1);
		downheapify(0);
		return removed;
	}

	private void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int min = pi;
		if (lci < list.size() && list.get(lci) > list.get(min)) 
			min = lci;

		if (rci < list.size() && list.get(rci) > list.get(min)) 
			min = rci;

		if (min != pi) {
			int temp = list.get(pi);
			list.set(pi, list.get(min));
			list.set(min, temp);
			downheapify(min);
		}
	}
}

public class SortJobApplicants {
    public static void heapSort(int[] salaries) {
        Heap heap = new Heap();
        for (int salary : salaries) 
            heap.Add(salary);
        for (int i = salaries.length-1; i>=0; i--) 
            salaries[i] = heap.remove();
    }

    private static void display(int[] salaries) {
        for (int salary : salaries) 
            System.out.print(salary + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int totalJobAppicants;
        Scanner input = new Scanner(System.in);
        totalJobAppicants = input.nextInt();
        int[] salaries = new int[totalJobAppicants];
        for(int i=0; i<totalJobAppicants; i++)
            salaries[i] = input.nextInt();

        System.out.println("Applicants Salaries before Sorting:");
        display(salaries);

        heapSort(salaries); 

        System.out.println("Applicants Salaries after Heap Sort:");
        display(salaries);
        input.close();
    }
}