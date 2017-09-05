
package project;

import static java.lang.Math.acos;

public class sam{
     double c[] = {0,0,0,0,0};
     public double d;
     double p,t,u;
       double a[]=main.returnarr();
        double b[][]=main.returnarr2();
//sample already in db
    public double[] cal()
     {
       for(int k=0;k<5;k++)
        {
             for(int i=0;i<5;i++)
        {      
                    p=p+a[i]*b[k][i];
                    t=t+a[i]*a[i];
                    u=u+b[k][i]*b[k][i];
        }   
            d=acos(p/((Math.sqrt(t))*(Math.sqrt(u))));
            c[k]=d;
        }
        return c;
     }
}
