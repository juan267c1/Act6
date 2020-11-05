
package actividadesjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Actividad6 {
    
  
public static Scanner sc= new Scanner(System.in); 
public static void main(String[] args)throws IOException{
BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); 
ArrayList<Integer> grades= new ArrayList<Integer>();
  String name;
  int ave=0;
  
  System.out.println("Ingrese el nombre del estudiante: ");
  name=lector.readLine();
  System.out.println("Ingresar  la calificacion 1");
  grades.add(sc.nextInt());
  System.out.println("Ingresar la calificacion 2");
  grades.add(sc.nextInt());
  System.out.println("Ingresar la calificacion 3");
  grades.add(sc.nextInt());
  System.out.println("Ingresar la calificacion 4");
  grades.add(sc.nextInt());
  System.out.println("Ingresar la calificacion 5");
  grades.add(sc.nextInt());
  
  
  
  
  
  for(int i : grades){
      ave += i;
  }
      
  System.out.println("Nombre: "+name);
  System.out.println("Promedio: "+(ave/5));
  if((ave/5)<=50){
      System.out.println("Calificacion: F");
  }
  else if((ave/5)>=51&&(ave/5)<=60){
       System.out.println("Calificacion: E");  
  }
  else if((ave/5)>=61&&(ave/5)<=70){
       System.out.println("Calificacion: D");  
  }else if((ave/5)>=71&&(ave/5)<=80){
       System.out.println("Calificacion: C");  
  }else if((ave/5)>=81&&(ave/5)<=90){
       System.out.println("Calificacion: B");  
  }else if((ave/5)>=91&&(ave/5)<=100){
       System.out.println("Calificacion: A");  
  }
    

}
}
    
}
