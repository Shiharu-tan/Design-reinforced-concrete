
public class ChildAsD extends ChildAs{
	
	public ChildAsD(String x , String y ,String z , String w , String j) {
		super(x,y,z,w,j);
	}
	public double calculate_d(){
		d = 11 * Math.sqrt(Mu/(b*fy));
		return d;
	}	

}




