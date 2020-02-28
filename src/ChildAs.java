
public class ChildAs extends Parent{
	//intialize
	double Mu;
	double D;
	double As;
	double m;
	//initalize 
	double A;
	double B;
	double C;
	double dis;
	double r1;
	double r2;
	//initalize
	double mmax;
	double Asmax;
	double AsminB;
	double AsminS;
	double Asmin1B;
	double Asmin2B;
	int bool;
			
	public ChildAs(String x ,String y ,String z , String w , String j) {
		super(x,y,z,w);
		Mu = Double.parseDouble(j)* Math.pow(10, 6);		
	}
	public double calculateAs(){

		A = 0.5 * 1.9468 * Math.pow(fy, 2);
		B = (-1) *fy * fcu;
		C = 1.15 * fcu * Mu /(b*Math.pow(d,2));
		
		dis = Math.pow(B, 2) - 4*A*C;
		if (dis >0) {
			r1 = (-B + Math.sqrt(dis)) / (2*A);
			r2 = (-B - Math.sqrt(dis)) / (2*A);
			if (r1 >0 && r1 <= .04) {
				m = r1;
			}
			else if (r2 >0 && r2 <= .04){
				m = r2;
				As = m * b * d;
			}
			else {
				As = -1 ;
			}
		}
		return As;

	}
	public void BeamAsMinMax(){
		//Asmax
		mmax = 189*fcu/(690*fy+ Math.pow(fy, 2));
		Asmax = mmax*b*d;
		//Asmin
		Asmin1B = 0.225*Math.sqrt(fcu)*b*d/fy;
		Asmin2B = 1.3 * As;
		if (Asmin1B > Asmin2B) {
			AsminB = Asmin2B;
		}
		else {
			AsminB = Asmin1B;
		}
			
	}
	public void SlabAsMinMax(){
		//Asmax
		mmax = 189*fcu/(690*fy+ Math.pow(fy, 2));
		Asmax = mmax*b*d;
		//Asmin
		AsminS = 0.6*b*d/fy;
		
	}
	public int checkAsS(){
		if (As> AsminS && As<Asmax) {
			bool = 1;
		}
		else if (As<AsminS) {
			bool = 2;
		}
		else if (As > Asmax) {
			bool =  0;
		}
		return bool;
	}
	public int checkAsB(){
		if (As> AsminB && As<Asmax) {
			bool = 1;
		}
		else if (As<AsminB) {
			bool = 2;
		}
		else if (As > Asmax) {
			bool =  0;
		}
		return bool;
	}
}
