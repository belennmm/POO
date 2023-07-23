public class Equipo {

    String nombre;
    int goles, tarjetasAmarillas, tarjetasRojas, faltas, juegosGanados, juegosPerdidos,  tiros_de_esquina, posicion, tiros_a_Gol ;

    // asignación
    Equipo(String nombre, int goles, int tarjetasAmarillas, int tarjetasRojas, int faltas, int juegosGanados, int juegosPerdidos, int tiros_de_esquina,  int posicion, int tiros_a_Gol){
        this.nombre = nombre;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.faltas = faltas;
        this.juegosGanados = juegosGanados;
        this.juegosPerdidos = juegosPerdidos;
        this.tiros_de_esquina = tiros_de_esquina;
        this.posicion = posicion;
        this.tiros_a_Gol = tiros_a_Gol;
        this.goles = goles;

    }

    // Get y Set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPosicion() {
        return posicion;
    }
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public int getGoles() {
        return goles;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }
    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }
    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }
    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }
    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    public int getJuegosGanados() {
        return juegosGanados;
    }
    public void setJuegosGanados(int juegosGanados) {
        this.juegosGanados = juegosGanados;
    }
    public int getJuegosPerdidos() {
        return juegosPerdidos;
    }
    public void setJuegosPerdidos(int juegosPerdidos) {
        this.juegosPerdidos = juegosPerdidos;
    }
    public int getTiros_a_Gol() {
        return tiros_a_Gol;
    }
    public void setTiros_a_Gol(int tiros_a_Gol) {
        this.tiros_a_Gol = tiros_a_Gol;
    }

    public int getTiros_de_esquina() {
        return tiros_de_esquina;
    }

    public void setTiros_de_esquina(int tiros_de_esquina) {
        this.tiros_de_esquina = tiros_de_esquina;
    } 

    
}
