
import java.util.Scanner;

public class Vista {
    
Controlador controlador = new Controlador();
    Scanner scan = new Scanner(System.in);

    //-------------------------------------------------------------------------------------------------------------

    public void askData(){
        //----------1
        System.out.print("Ingrese el nombre del Equipo 1: ");
        String nombre = scan.nextLine();
        controlador.equipo1.setNombre(nombre);

        System.out.print("- Ingrese los goles anotados por " + controlador.equipo1.getNombre() + ": ");
        int goles = scan.nextInt();
        controlador.equipo1.setGoles(goles);

        System.out.print("- Ingrese las tarjetas amarillas de " + controlador.equipo1.getNombre() + ": ");
        int tarjetasAmarillas = scan.nextInt();
        controlador.equipo1.setTarjetasAmarillas(tarjetasAmarillas);

        System.out.print("- Ingrese las tarjetas rojas de " + controlador.equipo1.getNombre() + ": ");
        int tarjetasRojas = scan.nextInt();
        controlador.equipo1.setTarjetasRojas(tarjetasRojas);

        System.out.print("- Ingrese las faltas cometidas por " + controlador.equipo1.getNombre() + ": ");
        int faltas = scan.nextInt();
        controlador.equipo1.setFaltas(faltas);

        System.out.print("- Ingrese los juegos ganados de " + controlador.equipo1.getNombre() + ": ");
        int juegosGanados = scan.nextInt();
        controlador.equipo1.setJuegosGanados(juegosGanados);

        System.out.print("- Ingrese los juegos perdidos de " + controlador.equipo1.getNombre() + ": ");
        int juegosPerdidos = scan.nextInt();
        controlador.equipo1.setJuegosPerdidos(juegosPerdidos);

        System.out.print("- Ingrese los tiros de esquina de " + controlador.equipo1.getNombre() + ": ");
        int tirosDeEsquina = scan.nextInt();
        controlador.equipo1.setTiros_de_esquina(tirosDeEsquina);

        System.out.print("- Ingrese la posición de " + controlador.equipo1.getNombre() + ": ");
        int posicion = scan.nextInt();
        controlador.equipo1.setPosicion(posicion);
        
        System.out.print("- Ingrese los tiros a gol hechos por " + controlador.equipo1.getNombre() + ": ");
        int tirosAGol = scan.nextInt();
        controlador.equipo1.setTiros_a_Gol(tirosAGol);
    

        //----------2
        System.out.print("\n" + "Ingrese el nombre del Equipo 2: ");
        scan.nextLine();
        nombre = scan.nextLine();
        controlador.setName2(nombre);

        System.out.print("- Ingrese los goles anotados por " + controlador.equipo2.getNombre() + ": ");
        goles = scan.nextInt();
        controlador.equipo2.setGoles(goles);

         System.out.print("- Ingrese las tarjetas amarillas de " + controlador.equipo2.getNombre() + ": ");
        tarjetasAmarillas = scan.nextInt();
        controlador.equipo2.setTarjetasAmarillas(tarjetasAmarillas);

        System.out.print("- Ingrese las tarjetas rojas de " + controlador.equipo2.getNombre() + ": ");
        tarjetasRojas = scan.nextInt();
        controlador.equipo2.setTarjetasRojas(tarjetasRojas);

        System.out.print("- Ingrese las faltas cometidas por " + controlador.equipo2.getNombre() + ": ");
        faltas = scan.nextInt();
        controlador.equipo2.setFaltas(faltas);

        System.out.print("- Ingrese los juegos ganados de " + controlador.equipo2.getNombre() + ": ");
        juegosGanados = scan.nextInt();
        controlador.equipo2.setJuegosGanados(juegosGanados);

        System.out.print("- Ingrese los juegos perdidos de " + controlador.equipo2.getNombre() + ": ");
        juegosPerdidos = scan.nextInt();
        controlador.equipo2.setJuegosPerdidos(juegosPerdidos);

        System.out.print("- Ingrese los tiros de esquina de " + controlador.equipo2.getNombre() + ": ");
         tirosDeEsquina = scan.nextInt();
        controlador.equipo2.setTiros_de_esquina(tirosDeEsquina);

        System.out.print("- Ingrese la posición de " + controlador.equipo2.getNombre() + ": ");
        posicion = scan.nextInt();
        controlador.equipo2.setPosicion(posicion);
        
        //----------3
        System.out.print("\n"+ "Ingrese el nombre del Equipo 3: ");
        scan.nextLine();
        nombre = scan.nextLine();
        controlador.setName3(nombre);

        System.out.print("- Ingrese los goles anotados por " + controlador.equipo3.getNombre() + ": ");
        goles = scan.nextInt();
        controlador.equipo3.setGoles(goles);

        System.out.print("- Ingrese las tarjetas amarillas de " + controlador.equipo3.getNombre() + ": ");
        tarjetasAmarillas = scan.nextInt();
        controlador.equipo3.setTarjetasAmarillas(tarjetasAmarillas);

        System.out.print("- Ingrese las tarjetas rojas de " + controlador.equipo3.getNombre() + ": ");
        tarjetasRojas = scan.nextInt();
        controlador.equipo3.setTarjetasRojas(tarjetasRojas);

        System.out.print("- Ingrese las faltas cometidas por " + controlador.equipo3.getNombre() + ": ");
        faltas = scan.nextInt();
        controlador.equipo3.setFaltas(faltas);

        System.out.print("- Ingrese los juegos ganados de " + controlador.equipo3.getNombre() + ": ");
        juegosGanados = scan.nextInt();
        controlador.equipo3.setJuegosGanados(juegosGanados);

        System.out.print("- Ingrese los juegos perdidos de " + controlador.equipo3.getNombre() + ": ");
        juegosPerdidos = scan.nextInt();
        controlador.equipo3.setJuegosPerdidos(juegosPerdidos);

        System.out.print("- Ingrese los tiros de esquina de " + controlador.equipo3.getNombre() + ": ");
         tirosDeEsquina = scan.nextInt();
        controlador.equipo3.setTiros_de_esquina(tirosDeEsquina);
        
        System.out.print("- Ingrese la posición de " + controlador.equipo3.getNombre() + ": ");
        posicion = scan.nextInt();
        controlador.equipo3.setPosicion(posicion);
        

        //----------4
        System.out.print("\n" + "Ingrese el nombre del Equipo 4: ");
        scan.nextLine();
        nombre = scan.nextLine();
        controlador.setName4(nombre);

        System.out.print("- Ingrese los goles anotados por " + controlador.equipo4.getNombre() + ": ");
        goles = scan.nextInt();
        controlador.equipo4.setGoles(goles);

        System.out.print("- Ingrese las tarjetas amarillas de " + controlador.equipo4.getNombre() + ": ");
        tarjetasAmarillas = scan.nextInt();
        controlador.equipo4.setTarjetasAmarillas(tarjetasAmarillas);

        System.out.print("- Ingrese las tarjetas rojas de " + controlador.equipo4.getNombre() + ": ");
        tarjetasRojas = scan.nextInt();
        controlador.equipo4.setTarjetasRojas(tarjetasRojas);

        System.out.print("- Ingrese las faltas cometidas por " + controlador.equipo4.getNombre() + ": ");
        faltas = scan.nextInt();
        controlador.equipo4.setFaltas(faltas);

        System.out.print("- Ingrese los juegos ganados de " + controlador.equipo4.getNombre() + ": ");
        juegosGanados = scan.nextInt();
        controlador.equipo4.setJuegosGanados(juegosGanados);

        System.out.print("- Ingrese los juegos perdidos de " + controlador.equipo4.getNombre() + ": ");
        juegosPerdidos = scan.nextInt();
        controlador.equipo4.setJuegosPerdidos(juegosPerdidos);

        System.out.print("- Ingrese los tiros de esquina de " + controlador.equipo4.getNombre() + ": ");
         tirosDeEsquina = scan.nextInt();
        controlador.equipo4.setTiros_de_esquina(tirosDeEsquina);

        System.out.print("- Ingrese la posición de " + controlador.equipo4.getNombre() + ": ");
        posicion = scan.nextInt();
        controlador.equipo4.setPosicion(posicion);
        
        
        
        //----------5
        System.out.print("\n" +"Ingrese el nombre del Equipo 5: ");
        scan.nextLine();
        nombre = scan.nextLine();
        controlador.setName5(nombre);

        System.out.print("- Ingrese los goles anotados por " + controlador.equipo5.getNombre() + ": ");
        goles = scan.nextInt();
        controlador.equipo5.setGoles(goles);

        System.out.print("- Ingrese las tarjetas amarillas de " + controlador.equipo5.getNombre() + ": ");
        tarjetasAmarillas = scan.nextInt();
        controlador.equipo5.setTarjetasAmarillas(tarjetasAmarillas);

        System.out.print("- Ingrese las tarjetas rojas de " + controlador.equipo5.getNombre() + ": ");
        tarjetasRojas = scan.nextInt();
        controlador.equipo5.setTarjetasRojas(tarjetasRojas);

        System.out.print("- Ingrese las faltas cometidas por " + controlador.equipo5.getNombre() + ": ");
        faltas = scan.nextInt();
        controlador.equipo5.setFaltas(faltas);

        System.out.print("- Ingrese los juegos ganados de " + controlador.equipo5.getNombre() + ": ");
        juegosGanados = scan.nextInt();
        controlador.equipo5.setJuegosGanados(juegosGanados);

        System.out.print("- Ingrese los juegos perdidos de " + controlador.equipo5.getNombre() + ": ");
        juegosPerdidos = scan.nextInt();
        controlador.equipo5.setJuegosPerdidos(juegosPerdidos);

        System.out.print("- Ingrese los tiros de esquina de " + controlador.equipo5.getNombre() + ": ");
         tirosDeEsquina = scan.nextInt();
        controlador.equipo5.setTiros_de_esquina(tirosDeEsquina);

        System.out.print("- Ingrese la posición de " + controlador.equipo5.getNombre() + ": ");
        posicion = scan.nextInt();
        controlador.equipo5.setPosicion(posicion);
        
        
    }

    //--------------------------------------------------------------------------------------------------------------

    public void mostrarGoles(){
        int goles = controlador.calcGoles();
        System.out.println("- Total de goles: " + goles);
    }

    public void showTiros_de_esquina(){
        int tiros_de_esquina = controlador.calcTirosEsquina();
        System.out.println("- Total de tiros de esquina:  " + tiros_de_esquina);
    }

    public void showTarjetasAmarillas(){
        int tarjetasAmarillas = controlador.calcTarjetasAmarillas();
        System.out.println("- Total de tarjetas amarillas: " + tarjetasAmarillas);
    }

    public void showTarjetasRojas(){
        int tarjetasRojas = controlador.calcTarjetasRojas();
        System.out.println("- Total de tarjetas rojas: " + tarjetasRojas);
    }


    //--------------------------estadísticas por equipo-------------------------------------------------------------

    public void mostrarEquipo(){
        boolean x = false;

        while (!x) {
            System.out.print("\n" +"¿Qué equipo desea mostrar? 1, 2, 3, 4 o 5 " +"\n" +"Ingrese una opción o 'x' para salir: ");
            int opcion = scan.nextInt();
            scan.nextLine();

            if(opcion == 1){ // ciclo para designar el equipo a mostrar 
                 System.out.println("\n" +"----Equipo 1----");
                Equipo team = controlador.equipo1;
                teaminfo(team);
            }
            else if (opcion == 2){
               System.out.println("\n" +"----Equipo 2----");
                Equipo team = controlador.equipo2;
                teaminfo(team); 
            }
            else if (opcion == 3){
                System.out.println("\n" +"----Equipo 3----");
                Equipo team = controlador.equipo3;
                teaminfo(team); 
            }
            else if (opcion == 4){
                System.out.println("\n" +"----Equipo 4----");
                Equipo team = controlador.equipo4;
                teaminfo(team); 
            }
            else if (opcion == 5){
                System.out.println("\n" +"----Equipo 5----");
                Equipo team = controlador.equipo5;
                teaminfo(team); 
            }
            else{
                System.out.println("\n" + "La opción ingresada no es válida.");
            }

        }
    }
            
    private void teaminfo(Equipo team){ // asignar info del equipo seleccionado
        String name = team.getNombre();
        System.out.println("Nombre: " + name);

        int goles = team.getGoles();
        System.out.println("Goles: " +  goles);

        int tarjetasAmarillas = team.getTarjetasAmarillas();
        System.out.println("Tarjetas amarillas: " + tarjetasAmarillas);

        int tarjetasRojas = team.getTarjetasRojas();
        System.out.println("Tarjetas rojas: " +tarjetasRojas);

        int faltas = team.getFaltas();
        System.out.println("Faltas: " + faltas);

        int juegosGanados = team.getJuegosGanados();
        System.out.println("Juegos ganados: " + juegosGanados);

        int juegosPerdidos = team.getJuegosPerdidos();
        System.out.println("Juegos perdidos: " +  juegosPerdidos);

        int tirosDeEsquina = team.getTiros_de_esquina();
        System.out.println("Tiros de esquina: " + tirosDeEsquina);

        int posicion = team.getPosicion();
        System.out.println("Posición: " +posicion);

        int tirosAGol = team.getTiros_a_Gol();
        System.out.println("Tiros a gol: " + tirosAGol);

    }

}
    



    

