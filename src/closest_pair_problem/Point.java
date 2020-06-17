package closest_pair_problem;


import java.util.ArrayList;
public class Point{
    
    
    public double x;
    public double y;
    
	
    
    public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
    
    public  Point(double x, double y)
    {
        
        this.x=x;
        this.y=y;
        
    }
    //DÝSTANCE 
    private static double distance(Point a, Point b){
		double dx = a.x - b.x;
		double dy = a.y - b.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	//BRUTE FORCE
    public static Point[] getClosestPair (Point [] noktalarP)
    {
        if(noktalarP.length<2)
        {
            return null;
        }
       else if(noktalarP.length==2)
        {
          return noktalarP;
        }
        else
        {
        ArrayList<Point> liste = new ArrayList<Point>();
        double min=Double.MAX_VALUE;
        for(int i=0;i<noktalarP.length;i++){
          for(int j=i+1;j<noktalarP.length;j++)
             {
                  double dis=distance(noktalarP[i],noktalarP[j]);
                 if(dis<min)
                 {
                     min=dis;
                     liste.clear();
                     liste.add(noktalarP[i]);
                     liste.add(noktalarP[j]);
                 }
                 else if(dis==min)
                 {
                     liste.add(noktalarP[i]);
                     liste.add(noktalarP[j]);
                 }
             }
        }
        
        
           Point[] res=new Point[liste.size()];
           
           for (int i = 0; i < liste.size(); i++)
            {
                res[i] = liste.get(i);
            }
        
        return res;
        }
    
    
}
     
}
