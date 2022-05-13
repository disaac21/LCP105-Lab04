package lab4p2_danieljuarez;

public class SuperiorSpiderman extends Personaje {

    public SuperiorSpiderman() {
        super();
    }

    public SuperiorSpiderman(String nombre, double puntosataque, double puntosvida, String nombreuniverso) {
        super(nombre, puntosataque, puntosvida, nombreuniverso);
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
    
    public double Ataque(){
        
        return 0;
    }

}
