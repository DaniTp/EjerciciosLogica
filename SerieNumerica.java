import java.util.*;
import java.io.*;

//Se resuelve una sucesión del tipo:
//(a+(2^0)*b), (a+(2^0)*b + 2^1*b), ... , (a+(2^0)*b+(2^1)*b+...+(2^(n-1))*b)
//Ejemplo:
//Entrada:
//2
//0 2 10
//5 3 5
//Salida:
//2 6 14 30 62 126 254 510 1022 2046    
//8 14 26 50 98

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if(rango(t, 500,0)){
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
                if(rango(a,50,0) && rango(b,50,0) &&  rango(n, 15, 1)){
                       int res=0;
                       for(int j=0;j<n;j++) {
                          int resElevacion = elevar(2, j)*b;
                          a=a+resElevacion;
                          System.out.print(a+" ");
                       }
                       System.out.println();
                }
        }
        }
        in.close();
        
       
        
    }
    
    public static boolean rango(int n, int rankSup, int rankInf){
        boolean verdad=true;
        if(n<rankInf || n>rankSup){
            verdad= false;
        }
       
        return verdad;
    }
    
    public static int elevar(int n, int tope){
        int res = 1;
        if(tope==0){
         res=1;   
        }else{
        for(int i=0;i<tope;i++){
            res =res*n;
        }
        }
        return res;
    }
    
    
}