/*
 */
package entidades;

/**
 *
 * @author Paulo
 */
public class ahorcado {
    //Atributos
    int longitud;
    char[] letras = new char[longitud];
    private int cantLetrasEncontradas;
    private int cantJugadasMaximas;    

    public ahorcado() {
    }

    public ahorcado(int longitud, int cantLetrasEncontradas, int cantJugadasMaximas) {
        this.longitud = longitud;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public char[] getLetras() {
        return letras;
    }

    public void setLetras(char[] letras) {
        this.letras = letras;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    @Override
    public String toString() {
        return "ahorcado{" + "longitud=" + longitud + ", letras=" + letras + ", cantLetrasEncontradas=" + cantLetrasEncontradas + ", cantJugadasMaximas=" + cantJugadasMaximas + '}';
    }
    
  
}
