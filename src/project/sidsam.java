
package project;

import static java.lang.Math.sin;
import static java.lang.Math.tan;


public class sidsam {
     double d[]={0,0,0};
    double e[]={0,0,0};
    public double[] cal()
    {
   sam obj = new sam();
   sid ojb = new sid();
   obj.cal();
   ojb.cal();
   for(int i=0;i<3;i++)
   {
       double k = (obj.c[i]);
       double p = ojb.z[i];
       d[i]=p*tan(k);
       e[i]=p*sin(k);
   }
   return d;
    }
    
}
