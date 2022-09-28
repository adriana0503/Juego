import java.util.Scanner;

public class vspiratas {
   public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String nombre1, nombre2;
      int respuesta, respuesta2;
      personajes jugador1 = null;
      personajes jugador2 = null;
      System.out.println("Bienvenidos a VS entre piratas");
      System.out.println("");
      System.out.println("Dime tu nombre jugador 1");
      nombre1 = leer.next();
      
         System.out.println(nombre1+ " ¿cuál de estos personajes desea utilizar?");

         luffy.tostring();
         barbanegra.tostring();
         shaks.tostring();
         buggy.tostring();
         respuesta = leer.nextInt();

         if (respuesta == 1) {
            jugador1 = new luffy();
            jugador1.resistencia = 1500;
            jugador1.fuerza = 130;
            System.out.println("escogiste a Luffy");
            System.out.println("");

         } else if (respuesta == 2) {
            jugador1 = new barbanegra();
            jugador1.resistencia = 1300;
            jugador1.fuerza = 140;
            System.out.println("escogiste a Barbanegra");
            System.out.println("");

         } else if (respuesta == 3) {
            jugador1 = new shaks();
            jugador1.resistencia = 1600;
            jugador1.fuerza = 170;
            System.out.println("escogiste a Shaks");
            System.out.println("");

         } else if (respuesta == 4) {
            jugador1 = new buggy();
            jugador1.resistencia = 1600;
            jugador1.fuerza = 120;
            System.out.println("escogiste a Buggy");
            System.out.println("");

         } else {
            System.out.println("Solo son 4 personajes");
            System.out.println("");
         }
      
      leer.nextLine();
      // limpiarp();
      System.out.println("Dime tu nombre jugador 2");
      nombre2 = leer.next();
      System.out.println(nombre2+ " ¿cuál de estos personajes desea utilizar?");

      luffy.tostring();
      barbanegra.tostring();
      shaks.tostring();
      buggy.tostring();
      respuesta2 = leer.nextInt();

      if (respuesta2 == 1) {
         jugador2 = new luffy();
         jugador2.resistencia = 1500;
         jugador2.fuerza = 130;
         System.out.println("escogiste a Luffy");
         System.out.println("");

      } else if (respuesta2 == 2) {
         jugador2 = new barbanegra();
         jugador2.resistencia = 1300;
         jugador2.fuerza = 140;
         System.out.println("escogiste a Barbanegra");
         System.out.println("");

      } else if (respuesta2 == 3) {
         jugador2 = new shaks();
         jugador2.resistencia = 1600;
         jugador2.fuerza = 170;
         System.out.println("escogiste a Shaks");
         System.out.println("");

      } else if (respuesta2 == 4) {
         jugador2 = new buggy();
         jugador2.resistencia = 1600;
         jugador2.fuerza = 120;
         System.out.println("escogiste a Buggy");
         System.out.println("");

      } else {
         System.out.println("Solo son 4 personajes");
      }

      do {
         System.out.println("jugador 1");
         jugador1.estado();
         System.out.println(" Jugador2");
         jugador2.estado();
         System.out.println("");
         if(jugador2.resistencia>0){
         pelea(jugador1, jugador2);
         
         System.out.println("jugador 1");
         jugador1.estado();
         System.out.println(" Jugador2");
         jugador2.estado();
         System.out.println("");
         leer.nextLine();
         }
         if(jugador1.resistencia>0){
         pelea(jugador2, jugador1);
         
         System.out.println("jugador 1");
         jugador1.estado();
         System.out.println(" Jugador2");
         jugador2.estado();
         System.out.println("");
         leer.nextLine();
         }
      } while (jugador1.resistencia>0 && jugador2.resistencia>0);
      if (jugador1.resistencia > 0) {
         System.out.println(nombre1+" felicidades has ganado :)");
      } else {
         System.out.println(nombre1+" lamentablemente has perdido :(");
      }
      if (jugador2.resistencia > 0) {
         System.out.println(nombre2+" felicidades has ganado :)");
      }else {
         System.out.println(nombre2+" lamentablemente has perdido :(");
      }

   }

   /*static void limpiarp() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }*/

   static void pelea(personajes uno, personajes dos) {
      uno.resistencia = uno.resistencia - dos.fuerza;
   }

}
