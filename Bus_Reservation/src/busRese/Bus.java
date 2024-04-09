package busRese;

public class Bus {

	   // these private element, to access we are going to add a public get and set
	private boolean ac;
	private int capa;
	private String from;
	private String to;
	
	//constructor buys and initialize it from the object
	
	//when object takes the input and then we are intializing here
	Bus( boolean acc , int cap,String fro,String too){
		
		
		this.ac = acc;
		this.capa = cap;
		this.from = fro;
		this.to = too;
		
	}
	
	//get is used getting the data and set is used to set ie(change or update the data)
	
	public int getCapacity(){  //accessor method
		return capa; 
	}
	public boolean isAc(){
		return ac;
	}
	
	public String getfromm(){
		return from;
	}
	public String gettooo(){
		return to;
	}
	
	public void setAC(boolean acc){
		ac = acc;              // it will take the input and set it 
	}
	public void setCapacity(int cap){  //mutator method
		capa = cap;
	}
	//we cannot able to change the busno..
	
	
	//first itself we printing the bus details
	
	public void displauBusInfo(){
		System.out.println( " AC :   "+ ac + " Capacity :   "+capa + " From :   "+from+" To :   "+to);
	}

}
