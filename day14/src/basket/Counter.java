package basket;

public class Counter {
	private int interval;
	private int count;
	
	public Counter() {
		interval = 1;
	}
	
	public Counter(int interval) {
		this.interval = interval;
	}
	
	public void increment() {
		count += interval;
	}
	
	public void increment(int n) {
		count += n;
	}
	
	public void decrement() {
		count -= interval;
	}

	public void decrement(int n) {
		count -= n;
	}
	
	public int getInterval() {
		return interval;
	}
	
	public void setInterval(int interval) {
		this.interval = interval;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
