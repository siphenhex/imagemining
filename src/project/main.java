
package project;

import java.util.Arrays;
import com.mathworks.engine.MatlabEngine;

public class main {
  
    public  static double a[];//from preprocessing of image to sca
    public static double b[][];
    static double[] returnarr() {
return a;
    }
      static double[][] returnarr2() {
return b;
    }
    public static void main(String[] args) throws Exception{
        
        MatlabEngine eng = MatlabEngine.startMatlab();
        eng.eval("myimfcn");
        b =eng.getVariable("yarr");
        a=eng.getVariable("yred");
        eng.close();
           sca obj=new sca();
           obj.cal();
            System.out.println("array of sca  " + Arrays.toString(obj.c) + "\n");
            sam ob = new sam();
            ob.cal();
            
            System.out.println("array of sam " + Arrays.toString(ob.c) + "\n");           
            sid o = new sid();
            o.cal();
            
            System.out.println("array of sid " + Arrays.toString(o.z) + "\n");
       
            sidsca i = new sidsca();
            i.cal();
            System.out.println("array of sidsca in tan  " + Arrays.toString(i.d) +"\n");
            
            System.out.println("array of sidsca in  sin  " + Arrays.toString(i.e) +"\n");
            
            sidsam j= new sidsam();
            j.cal();
            
            System.out.println("array of sidsam in tan " + Arrays.toString(j.d) +"\n");
            
            System.out.println("array of sidsam in sin " + Arrays.toString(j.e) + "\n");
    }
    
}
