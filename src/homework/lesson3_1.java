package homework;

class Television {

	private final String MANUFACTURHR;
	private final int SCREEN_SIZE;
	private boolean powcrOn;
	private int channel;
	private int volume;
	
	public Television(String band, int size)
	{
		MANUFACTURHR=band;
		SCREEN_SIZE=size;
	}

	public void power() {
		powcrOn=true;
	}
	public void setChannel(int station) {
		this.channel = station;
	}

	public void increaseVolume() {
		volume++;
	}

	public void decreaseVolume() {
		volume--;
	}
	public int getVolume() {
		return this.volume;
	}
	public int getChannel() {
		return this.channel;
	}
	public String getManufacturhr() {
		return this.MANUFACTURHR;
	}

	public int getScreeSize() {
		return SCREEN_SIZE;
	}
}

public class lesson3_1 {
	public static void main(String[] args) {
		Television mTV=new Television("TCL",42);
		mTV.power();
		mTV.setChannel(12);
		mTV.increaseVolume();
		mTV.increaseVolume();
		mTV.increaseVolume();
		
		System.out.printf("My TV info: Manufacture: %s, Screen Size:%d\nNow it's on Channel: %s, Volume: %d ", mTV.getManufacturhr(),mTV.getScreeSize(),mTV.getChannel(),mTV.getVolume());
		mTV.decreaseVolume();
		mTV.setChannel(23);
		System.out.printf("\nNow volume is: %d, and it's on : %d Channel", mTV.getVolume(),mTV.getChannel());
		
	}
}
