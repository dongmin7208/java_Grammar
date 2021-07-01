package vending;

public class VendingMachine {
	Item[] items = new Item[3];
	int[] itemNum = new int[3];
	int inputCoin = 0;	//투입금액
	int coinBox = 0;	//총 수익금액
	int change = 0;	//거스름돈
	
	void setItems(Item[] its, int[] in) {
		for(int i = 0; i < items.length; i++) {
			items[i] = its[i];
			itemNum[i] = in[i];
		}
	}
	void setItemChange(Item it, int itemIndex, int num) {
		items[itemIndex] = it;
		itemNum[itemIndex] = num;
	}
	
	void setItemChange(String in, int pr, int num, int itemIndex) {
		Item item = new Item();
		item.itemName = in;
		item.itemPrice = pr;
		setItemChange(item, itemIndex, num);
	}
	
	int getCoinBox() {
		return coinBox;
	}

	void setItemNumChange(int itemIndex, int num) {
		itemNum[itemIndex] = num;
	}
	
	void inputCoin(int coin) {
		if(inputCoin == 0)
			inputCoin = coin;
		else
			inputCoin += coin;
		change += coin;
	}
	
	String inputMenu(int index) {
		String ret = null;
		if(inputCoin >= items[index].itemPrice && itemNum[index] != 0) {
			ret = new String(items[index].itemName);
			coinBox += inputCoin;
			change = inputCoin - items[index].itemPrice;
			if(change != 0) {
				coinBox -= change;
			}
			inputCoin = 0;
			itemNum[index]--;
		}
		return ret;
	}
	
	int getChange() {
		int ret = change;
		change = 0;
		return ret;
	}
	
	void printMenu() {
		System.out.println("메뉴");
		for(int i = 0; i < items.length; i++) {
			System.out.print(items[i].itemName + ":" + items[i].itemPrice + "(" + itemNum[i] + ")");
			if(itemNum[i] == 0) {
				System.out.println("[매진]");
			}
			System.out.println();
		}
	}
}
