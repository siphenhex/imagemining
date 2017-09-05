
package project;

import java.awt.List;
import java.util.ArrayList;

public class sca {
      
    public double z,w,s;
  private  double q=0,r=0,p=0,t=0,u=0;
   public double c[]={0,0,0,0,0};//result
   double a[] = main.returnarr();
       double b[][] = main.returnarr2(); 
      
       public double[] cal(){
     int n=5;
     for(int f=0;f<5;f++)
     {
     for(int k=0;k<n;k++)
     {
         q=q+a[k];
         r=r+b[f][k];     
     }
        for(int i=0;i<n;i++)
        {      
                    p=p+a[i]*b[f][i];
                    t=t+a[i]*a[i];
                    u=u+b[f][i]*b[f][i];
        }   
         s=n*p-(q*r);//numerator
                 double m=Math.sqrt((n*t-q*q)*((n*u)-r*r));//denominator
                 z=Math.acos((s/m+1)/2);
         c[f]=z;     //sca value array
     }
     return c;
}
}

