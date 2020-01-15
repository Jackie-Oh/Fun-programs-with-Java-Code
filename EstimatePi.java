/**
A program to estimate value of pi.
@author Jackie Omekara.
*/
import java.lang.Math;
import java.util.Random;
import java.text.NumberFormat;

public class EstimatePi{

	public static void main(String args[]){

	double hits=0;
	double pi;
	int count=0;
	int var =0;
	final double points =1000;
	double sum=0;
	double mean;
	double standev=0;
	final double N =100;

NumberFormat fmt = NumberFormat.getNumberInstance();
fmt.setMinimumFractionDigits(5);

double pi_values[] = new double[100];



while(count<100){
	while(var<1000){
		double x_value =Math.random() ;
		double y_value = Math.random() ;
		double dist = Math.sqrt(Math.pow(x_value,2)+ Math.pow(y_value,2));

	if(dist<=1) {
		hits++;
	}
     var++;


   
}

	pi_values[count]= 4*(hits)/points;
	sum+= pi_values[count];
 
	 hits = 0;

	count++;
	var = 0;
}

    mean =sum/N;


for(int j=0;j<=99;j++){
	standev += Math.pow((pi_values[j]-mean),2);
	}
	standev =standev/(N-1);
	standev =Math.sqrt(standev);



System.out.println("Mean value of pi: " +fmt.format(mean));
System.out.println("Standard deviation: "+fmt.format(standev));


}
}
