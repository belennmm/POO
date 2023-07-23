

public class Torneo {
    
    public static void main(String[] args) throws Exception {
        Vista vista = new Vista();
        System.out.println("TORNEO" + "\n"); 
        vista.askData();
        System.out.println("__________________________________________");
        System.out.println("\n" +"     RESUMEN DEL TORNEO" + "\n"); 
        vista.mostrarGoles();
        vista.showTiros_de_esquina();
        vista.showTarjetasAmarillas();
        vista.showTarjetasRojas();
        System.out.println("__________________________________________");
        System.out.println("\n" + "     ESTADÍSTICAS POR EQUIPO"); 
        vista.mostrarEquipo();
    }
}
