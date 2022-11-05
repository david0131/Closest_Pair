package Lab_ClosestPair_FinalVersion;

import static java.lang.Math.sqrt;

//@author escorciaad

public class Lab_ClosestPair_FinalVersion {
      
        public static void main(String[] args) {
            int N=2*(int)(Math.random()*4+3);
            System.out.println("Numero de puntos: "+N);
            int [][] coords = new int[N][2];
            System.out.println("|x||y|");
            for (int x=0; x < coords.length; x++) {
                for (int y=0; y < coords[x].length; y++) {
                    coords[x][y] = (x*2)+(int)(Math.random()*5+1);
                }
            }for (int x=0; x < coords.length; x++) {
                for (int y=0; y < coords[x].length; y++) {
                   System.out.print("|"+coords[x][y] ); System.out.print("|");   
                }System.out.print("\n");
            }System.out.println("____________________________");            
            //int [][] coords = {
               // {3, 3},
               // {2, 4},
               // {10, 8},
               // {13, 5},
               // {16, 4},
             //   {15, 3}
           // };
        //
            
            Lab_ClosestPair_FinalVersion dismin = new Lab_ClosestPair_FinalVersion();
            
            System.out.println(dismin.ClosestPair(N, coords));
        }
        
        
        public double ClosestPair(int N, int coords[][]){
            int i=0, j=0, primero, segundo, primero1, segundo1, primero2, segundo2;
            double dl_min = Double.POSITIVE_INFINITY;
            double dr_min = Double.POSITIVE_INFINITY;
            double dc_min = Double.POSITIVE_INFINITY;
            double d;
            
            for (i = 0; i <= N-2; i++){
               for (j = i+1; j  < N; j++){
                  if(i<(N/2) & j<(N/2)+1){
                   d = (double)distance(coords,i,j);
                    if(d < dl_min){
                        primero = i;
                        segundo = j;
                        dl_min = d;
                        System.out.println("la distancia minima izquierda actual es "+dl_min);
                    }
                  }
                  if(i>(N/2) & j>(N/2)+1){
                    d = (double)distance(coords,i,j);
                    if(d < dr_min){
                        primero1 = i;
                        segundo1 = j;
                        dr_min = d;
                        System.out.println("la distancia minima derecha actual es "+dr_min);
                    }  
                  }
                  if(i>=(N/2)-2 & j<(N/2)+2){
                    d = (double)distance(coords,i,j);
                    if(d < dc_min){
                        primero2 = i;
                        segundo2 = j;
                        dc_min = d;
                        System.out.println("la distancia minima central actual es "+dc_min);
                    }  
                  }
               }
            }
            if (dl_min<=dr_min & dl_min<=dc_min){
                System.out.println("_______________________________________________");
                System.out.print("LA DISTANCIA MINIMA ES: ");
            return  dl_min; 
            }
            if (dr_min<=dl_min & dr_min<=dc_min){
                System.out.println("_______________________________________________");
                System.out.print("LA DISTANCIA MINIMA ES: ");
                return  dr_min; 
            }
            if (dc_min<=dr_min & dc_min<=dl_min){
                System.out.println("_______________________________________________");
                System.out.print("LA DISTANCIA MINIMA ES: ");
            }return  dc_min;
        }
    
        public double distance(int coords[][], int i, int j){
            int x1, y1, x2, y2;
            System.out.println("i="+i);
            System.out.println("j="+j);
            x1 = coords[i][0];
            x2 = coords[j][0];
            y1 = coords[i][1];
            y2 = coords[j][1];
            
            double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
            System.out.println("la distancia entre los putnos actuales es: "+d);
            return d;
            
        }
}