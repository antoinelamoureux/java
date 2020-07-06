import java.util.Arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		char[][] tab = new char[2][3];
		
		tab[0][0] = 'a';
		tab[0][1] = 'b';
		tab[0][2] = 'c';
		tab[1][0] = 'd';
		tab[1][1] = 'e';
		tab[1][2] = 'f';

		System.out.println(Arrays.deepToString(tab));
		Arrays.asList(tab).stream().forEach(s -> System.out.println(s));
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				System.out.print(tab[i][j]);
			}
		}
		
		System.out.print("\n");
		
		int[][] tab2 = {{1, 8, 5, 7, 8}, {1, 8, 9, 15, 25, 8}, {5, 8, 11, 7, 8, 2}};
		
		for (int[] tab2row : tab2) {
			for (int tab2col: tab2row) {
				System.out.print(tab2col);
			}
		}
		
		System.out.print("\n");
		
		int[][][] tab3 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
		
		for (int i = 0; i < tab3.length; i++) {
			for (int j = 0; j < tab3.length; j++) {
				for (int z = 0; z < tab3.length; z++) {
					System.out.print(tab3[i][j][z]);
				}
			}	
		}

	}

}
