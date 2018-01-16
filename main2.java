
public class main2 {
	public static void main(String[] args) {
//		Comparator nameComp = new ClientNameComparator();
//		Client yossi = new Client("Yossi", "Cohen", 1);
//		Client aviC = new Client("Avi", "Cohen", 2);
//		Client aviA = new Client("Avi", "Avraham", 3);
//		System.out.println(nameComp.compare(aviA, yossi) < 0);   // returns true
//		System.out.println(nameComp.compare(yossi, aviC) > 0);   // returns true
//		System.out.println(nameComp.compare(aviC, yossi) > 0);   // returns false 
		
//		Comparator totalPriceComp = new ClientTotalProductsPriceComparator();
//		Product domino = new ProductInStore ("Domino", 1, 150);
//		Product mastermind= new ProductInStore ("Mastermind", 2, 250);
//		Client yossi = new Client("Yossi","Choen",1);
//		Client avi = new Client("Avi","Choen",2);
//		yossi.addProduct(domino);
//		yossi.addProduct(mastermind);
//		avi.addProduct(domino);
//		System.out.println(totalPriceComp .compare(yossi,avi) > 0);   // returns false
//		System.out.println(totalPriceComp .compare(avi,yossi) > 0);   // returns true
		
		
		
		Comparator comp = new ClientTotalProductsAndShippingPriceComparator();  
		// same product – different client types 
		Product sudoku = new ProductInStorageSmall("Sudoku", 1, 150);
		Client regularClient = new Client("Yossi", "Cohen", 1);
		regularClient.addProduct(sudoku);
		Client vipClient = new VIPClient("Avi", "Cohen", 2);
		vipClient.addProduct(sudoku);
		System.out.println(comp.compare(regularClient,vipClient) < 0);   //  returns true (vipClient has a 50% discount on total shipping price – regularClient pays more in total) 
		
		 
		Product mastermind = new ProductInStorageMedium ("Mastermind", 2, 250);
		Product robot = new ProductInStorageLarge("Spy Robot", 2, 400); 

		 
		regularClient = new Client("Yossi", "Cohen", 1);
		vipClient = new VIPClient("Avi", "Cohen", 2);
		regularClient.addProduct(sudoku);
		regularClient.addProduct(mastermind); vipClient.addProduct(robot); // regularClient total shipping = sudoku(150 + 150*0.05[rounded down]) + mastermind(250 + 250*0.07[rounded down]) = 424 // regularClient total shipping = robot(400 + (400*0.10) * 0.5) = 420    157 +  
		System.out.println(comp.compare(regularClient, vipClient) < 0);   // returns true (vipClient total shipping price is 420, regularClient is 424 – regularClient pays more)
	}
}
