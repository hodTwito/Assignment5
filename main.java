
public class main {

	public static void main(String[] args) {
		Product sudoku = new ProductInStorageSmall("Sudoku", 1, 150);
		Product mastermind = new ProductInStorageMedium ("Mastermind", 2, 250);
		Product assignment4 = new ProductInStorageSmall("Encapsulation!",3,200);
		Product robot = new ProductInStorageLarge("Spy Robot", 4, 400);
		Product bamba = new ProductInStorageSmall("Bamba Nuget", 5, 150);
		Product matritza = new ProductInStorageLarge("Nadia", 6, 400);
		Product unicorn = new ProductInStorageMedium("Assignment4",7,300);
		Product princess = new ProductInStorageSmall("Zelda", 8, 100);
		Product curitza = new ProductInStorageSmall("Curitza", 9, 70);
		Product queue = new ProductInStorageLarge("Kwewe", 10, 360);
		Product skateboard = new ProductInStorageMedium("Skateboard",11,300);
		Product salsa = new ProductInStorageSmall("Salsa", 12, 100);
		Product hero = new ProductInStorageSmall("Link", 13, 102);
		Product hezi = new ProductInStorageMedium ("Radar", 14, 250);
		Product support = new ProductInStorageSmall("confidence",15,200);
		Product gimel = new ProductInStorageLarge("Dorms", 16, 400);
		Product micro = new ProductInStorageMedium ("Microwave", 14, 250);
		//clients
		Client haim = new VIPClient("Haim","Reyes",1);
		Client david = new VIPClient("David","Fadida",5);
		Client nadia = new Client("Nadia","Gurevitch",8);
		Client igor = new Client("Igor","Partnov",6);
		Client tal = new VIPClient("tal","Achi-Tzvi",420);
		Client yael = new Client("Yael","Mahtov",42);
		Client barak = new VIPClient("Barak","Menachem",23);
		//Links Of Products
		Link link1 = new Link(sudoku);
		Link link2 = new Link(mastermind);
		Link link3 = new Link(robot);
		Link link4 = new Link(assignment4);
		Link link5 = new Link(bamba);
		Link link6 = new Link(matritza);
		Link link7 = new Link(unicorn);
		Link link8 = new Link(matritza);
		Link link9 = new Link(princess);
		Link link10 = new Link(queue);
		Link link11 = new Link(skateboard);
		Link link12 = new Link(salsa);
		Link link13 = new Link(hero);
		//Links of Clients
		Link linka = new Link(haim);
		Link linkb = new Link(david);
		Link linkc = new Link(nadia);
		Link linkd = new Link(igor);
		Link linke = new Link(tal);
		Link linkf = new Link(yael);
		Link linkg = new Link(barak);

		//linkeslists
		LinkedList products1 = new LinkedList();
		LinkedList clients1 = new LinkedList();



		//products1.add(salsa);
		//products1.add(assignment4);
		//products1.add(robot);
		//	System.out.println(products1);

		haim.addProduct(robot);
		haim.addProduct(sudoku);
		haim.addProduct(micro);
		haim.addProduct(bamba);
		//	System.out.println(haim);

		david.addProduct(queue);
		david.addProduct(matritza);
		david.addProduct(salsa);
		//	System.out.println(david);

		clients1.add(haim);
		clients1.add(david);
		//		System.out.println(haim);
		System.out.println(clients1.toString());

		//System.out.println(products1.toString());
		//System.out.println(clients1);
		Comparator comp = new ClientNameComparator();
		clients1.sortBy(comp);
		//System.out.println(clients1);
	}

}
