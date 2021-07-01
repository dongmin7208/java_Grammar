package vending;

public class Main {
	public static void main(String[] args) {
		VendingMachine vm = 
				new VendingMachine();
		String[] itemName = new String[] {
				"콜라", "사이다", "포카리스웨트"
		};
		int[] price = new int[] {
				600, 500, 1000
		};
		int[] num = new int[] {
				2, 3, 1
		};
		
		Item[] items = new Item[3];
		for(int i = 0; i < items.length; i++) {
			items[i] = new Item();
			items[i].itemName = itemName[i];
			items[i].itemPrice = price[i];
		}
		//vm.printMenu();
		System.out.println("====================");
		vm.setItems(items, num);
		vm.printMenu();
		System.out.println("====================");
		vm.setItemChange("환타", 700, 4, 0);
		vm.printMenu();
		System.out.println("====================");		
		vm.inputCoin(300);
		System.out.println(vm.inputMenu(1));
		System.out.println(vm.getChange());
		System.out.println("====================");		
		vm.inputCoin(400);
		System.out.println(vm.inputMenu(1));
		System.out.println(vm.getChange());
		System.out.println("====================");
		System.out.println(vm.getCoinBox());
		vm.printMenu();
		System.out.println("====================");
		vm.inputCoin(5000);
		System.out.println(vm.inputMenu(2));
		System.out.println(vm.getChange());
		vm.printMenu();
		System.out.println("====================");		
		vm.setItemNumChange(2, 5);
		vm.printMenu();
		System.out.println("====================");
		vm.inputCoin(1100);
		System.out.println(vm.inputMenu(2));
		System.out.println(vm.getChange());
		vm.printMenu();
	}
}
