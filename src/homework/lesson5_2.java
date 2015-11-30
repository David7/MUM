package homework;

class Computer
{
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	
	public int getRamSize() {
		return ramSize;
	}
	public int getDiskSize() {
		return diskSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	public double computePower() {
		return ramSize*processorSpeed;
	}
	Computer(String manufacturer,String processor,int ramSize,int diskSize,double processorSpeed)
	{
		this.manufacturer=manufacturer;  
		this.processor=processor;     
		this.ramSize=ramSize;       
		this.diskSize=diskSize;      
		this.processorSpeed=processorSpeed;
	}
}
class NoteBook extends Computer
{
	double height;
	double width;
	double weight;	
	double screensize()
	{
		return height*width;
	}
	NoteBook(String manufacturer,String processor,int ramSize,int diskSize,double processorSpeed,double height,double width)
	{
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		this.height=height;
		this.width=width;
	}
}

public class lesson5_2 {

	public static void main(String[] args) {
		Computer mComputer=new Computer("IBM","I7",8,500,2400.0);
		NoteBook mNoteBook=new NoteBook("TCL","I5",4,500,1800.0,15.0,25.0);
		System.out.println("Power:"+mNoteBook.computePower());
		System.out.println("Screen Size:"+mNoteBook.screensize());
		

	}

}
