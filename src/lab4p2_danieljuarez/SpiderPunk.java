package lab4p2_danieljuarez;

public class SpiderPunk extends Personaje {

    public SpiderPunk() {
        super();
    }
    
    public SpiderPunk(String string, double d, double d1, String string1) {
        super(string, d, d1, string1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPuntosataque() {
        return puntosataque;
    }

    public void setPuntosataque(double puntosataque) {
        this.puntosataque = puntosataque;
    }

    public double getPuntosvida() {
        return puntosvida;
    }

    public void setPuntosvida(double puntosvida) {
        this.puntosvida = puntosvida;
    }

    public String getNombreuniverso() {
        return nombreuniverso;
    }

    public void setNombreuniverso(String nombreuniverso) {
        this.nombreuniverso = nombreuniverso;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    public double Ataque(Personaje p){
        
        return 0;
    }
    
}
