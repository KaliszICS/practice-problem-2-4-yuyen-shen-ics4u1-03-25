public class PracticeProblem {

	public static void main(String args[]) {
		selectionSortName(new String[] {"Bob", "Helen", "Alex"}, new int[] {19, 20, 16});

	}

	//q1
	public static void selectionSortName(String[] names1, int[] ages1) {
		if (names1.length > 1) {
			for (int a = 0; a < names1.length; a++) {
				int smallest = a;
				for (int b = a + 1; b < names1.length; b++) {
					if ((names1[b]).compareToIgnoreCase(names1[smallest]) < 0) {
					smallest = b;
					}
				}
				String temp = names1[smallest];
				names1[smallest] = names1[a];
				names1[a] = temp;
				int temp0 = ages1[smallest];
				ages1[smallest] = ages1[a];
				ages1[a] = temp0;

			}
		}
	}

	//q2
	public static void selectionSortAge(String[] names2, int[] ages2) {
		if (names2.length > 1) {
			for (int a = 0; a < ages2.length; a++) {
				int smallest = a;
				for (int b = a + 1; b < ages2.length; b++) {
					if ((ages2[b]) < (ages2[smallest])) {
					smallest = b;
					}
				}
				String temp = names2[smallest];
				names2[smallest] = names2[a];
				names2[a] = temp;
				int temp0 = ages2[smallest];
				ages2[smallest] = ages2[a];
				ages2[a] = temp0;

			}
		}
	}

	

}
