package que20;


abstract  class Vehicle {
	int speed=20;
	long distance=90;
 public 	Vehicle(){
	 System.out.println("This is default constructor of vehicle");
		}
	Vehicle(int s,long d){
		this.speed=s;
		this.distance=d;
		System.out.println("This is parametric constructor of vehicle");
		}
	abstract void run();
	abstract void stop();
	public void fuel(int n) {
		System.out.println("fiel tank size"+n);
		}
	public void fuel(float f,String s) {
		System.out.println("Average per litre"+f+s);
		}
	public void fuel(char ch,int n) {
		System.out.println("Reserve fuel in fuel tank is"+n+ch);
	}
	}
	
class TwoWheeler extends Vehicle{
	int speed=40;
	long distance=150L;
	int no_of_tyre=2;
	public TwoWheeler() {
		super();
		System.out.println("This is default constructor of twowheeler");
	}
	void run() {
		System.out.println(" 2 wheeler runs");
	}
	void stop() {
		System.out.println("2 wheeler stops");
	}
	void display() {
		System.out.println(speed+" "+distance+" "+no_of_tyre);
	}
	}
class ThreeWheeler extends Vehicle{
		int speed=54;
		long distance=160L;
		int no_of_tyre=3;
		public ThreeWheeler() {
			super();
			System.out.println("This is default constructor of threewheeler");
		}
		void run() {
			System.out.println(" 3 wheeler runs");
		}
		void stop() {
			System.out.println("3 wheeler stops");
		}
		void display() {
			System.out.println(speed+" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance);
		}
}
class FourWheeler extends Vehicle{
			int speed=60;
			long distance=250L;
			int no_of_tyre=4;
			public FourWheeler() 
			{
				super();
				System.out.println("This is default constructor of fourwheeler");
			}
			void run() {
				System.out.println(" 4 wheeler runs");
			}
			void stop() {
				System.out.println("4 wheeler stops");
			}
			void display() {
				System.out.println(speed+" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance);
			}}

			class EightWheeler extends Vehicle{
				int speed=65;
				long distance=350L;
				int no_of_tyre=8;
				public EightWheeler() {
					super();
					System.out.println("This is default constructor of Eightwheeler");
				}
				void run() {
					System.out.println(" 8 wheeler runs");
				}
				void stop() {
					System.out.println("8 wheeler stops");
				}
				void display() {
					System.out.println(speed+" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance);
				}
		
			}
			public class Assignment1{
				public static void main(String[] args) {
					TwoWheeler v=new TwoWheeler();
					ThreeWheeler v2=new ThreeWheeler();
					FourWheeler v3=new FourWheeler();
					EightWheeler v4=new EightWheeler();
					v.run();
					v.display();
					v.stop();
					
					v2.run();
					v2.display();
					v2.stop();
					
					v3.run();
					v3.display();
					v3.stop();
					
					v4.run();
					v4.display();
					v4.stop();
				}
				
			}
	
	


