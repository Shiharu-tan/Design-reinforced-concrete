
public class ChildMu extends Parent {
	//Initialize variables
	double Mu;
	double D;
	double As;
	double m;

	public ChildMu(String x ,String y ,String z , String w , String j) {
		super(x,y,z,w);
		As = Double.parseDouble(j);		
	}
	public Double calculateMu(){
		//calculate m
		 m = As/(b*d);
		 D = 1.9468 * m * fy / fcu ;
		 Mu = b*d*d*m*fy*(1-.5*D)/1.15;
		 Mu = Mu /Math.pow(10, 6);
		 return Mu;		
	}
	}


