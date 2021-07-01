package basket;

public class BasketCounter {
	private Counter[] scoreCounters;
	private Counter[] goalCounters;
	
	public BasketCounter() {
		init();
	}
	
	public void init() {
		this.scoreCounters = new Counter[4];
		this.goalCounters = new Counter[4];
		
		for(int i = 0; i < scoreCounters.length; i++) {
			this.scoreCounters[i] = new Counter(i+1);
			this.goalCounters[i] = new Counter();
		}
	}
	
	public void setHandicap(int score) {
		this.scoreCounters[3].setCount(score);
	}
	
	public void setGoal(int g) {
		if(g < 0 || g > 2)
			return;
		this.scoreCounters[g].increment();
		this.goalCounters[g].increment();
		
		this.scoreCounters[3].increment(g+1);
		this.goalCounters[3].increment();
	}
	
	public int getGoalCount(int g) {
		return this.goalCounters[g].getCount();
	}
	
	public int getScoreCount(int g) {
		return this.scoreCounters[g].getCount();
	}
	
	public int getTotalGoalCount() {
		return this.goalCounters[3].getCount();
	}
	
	public int getTotalScoreCount() {
		return this.scoreCounters[3].getCount();
	}

}
