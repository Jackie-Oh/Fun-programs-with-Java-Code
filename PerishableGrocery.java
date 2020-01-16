public class PerishableGrocery{


	private String name;
	private double price;
	private int expDate;
	
	public PerishableGrocery(String name,double price,int expDate){
		this.name = name;
		this.price = price;
		this.expDate = expDate;
		}
	
	public int getExpiryDate(){
		return expDate;
		}
		
	public boolean isExpired(int date){
	boolean result  = false;
		if(date > expDate){
			result = true;
			}
		else{
			result = false;
			}
		return result;
	}
	}
			
		