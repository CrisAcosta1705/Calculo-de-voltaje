package CalculoVoltaje;

import java.util.Scanner;

public class CalculoVoltaje {
   public static void main(String[] args) {
      Scanner tc = new Scanner(System.in); 
      
      System.out.print("Ingrese los voltajes que desee ingresar: ");
      int cantidad = tc.nextInt();
      
      double[] voltajes = new double[cantidad];
      
      
      for (int i = 0; i < cantidad; i++) {
         System.out.print("Ingrese el voltaje [" + (i+1) + "]: ");
         voltajes[i] = tc.nextDouble();
      }

      
      double promedio = 0;
      for (int i = 0; i < cantidad; i++) {
         promedio += voltajes[i];
      }
      promedio /= cantidad;

      
      double voltajeMayor = voltajes[0];
      double voltajeMenor = voltajes[0];
      for (int i = 1; i < cantidad; i++) {
         if (voltajes[i] > voltajeMayor) {
            voltajeMayor = voltajes[i];
         }
         if (voltajes[i] < voltajeMenor) {
            voltajeMenor = voltajes[i];
         }
      }

      
      System.out.println("Voltaje promedio: " + promedio);
      System.out.println("Voltaje mayor: " + voltajeMayor);
      System.out.println("Voltaje menor: " + voltajeMenor);
   }
}
