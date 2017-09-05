
package project;

import static weka.core.Utils.log2;


public class sid {
      double z[]={0,0,0,0,0};
    double p[]={0,0,0,0,0},q[]={0,0,0,0,0},ps=0,qs=0,dp=0,dq=0;
    double a[]=main.returnarr();
      double b[][] =main.returnarr2();
      public double[] cal()
      {
          for(int l=0;l<5;l++)
          {
              for(int j=0;j<5;j++)
              {
                  ps=ps+a[j];
                  qs=qs+b[l][j];
              }
              for(int i=0;i<5;i++)
              {
                  
               p[i]= a[i]/ps;
               q[i]=b[l][i]/qs;   
              }
              dp=dp+p[l]*log2(p[l]/q[l]);
              dq=dq+q[l]*log2(q[l]/p[l]);
              z[l]=dp+dq;
          }
          return z;
      }
}
