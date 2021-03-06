package Assignment2;

public abstract class FullRotate {
	public static void main(String []args){

		String[][][] image={
				{       {"p1","p1","p1"},
						{"p2","p2","p2"},
						{"p3","p3","p3"}},

				{       {"p4","p4","p4"},
						{"p5","p5","p5"},
						{"p6","p6","p6"} },

				{       {"p7","p7","p7"},
						{"p8","p8","p8"},
						{"p9","p9","p9"} }

		};


		for (int i = 0; i< 3; i++) {
			for (int j =0; j<3; j++) {
				System.out.print("[");
				for (int k = 0; k <3; k++) {
					System.out.print(image[i][j][k]+",");
				}
				System.out.print("] ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Image rotated 180 degree to left: ");
		System.out.println();
           System.out.println("_____________");
		for (int i = 2; i>=0; i--) {
			for (int j =2; j>=0; j--) {
				if(j==2){
					System.out.print("|");
				}
				System.out.print("[");

				for (int k = 2; k>=0; k--) {
					System.out.print(image[i][j][k]+",");
				}

				System.out.print("]");
			}

			System.out.println("|");
		}
		System.out.println("----------------------------------");

	}

}