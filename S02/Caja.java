public class Caja<T> {
    // atributo generico de lo que contiene
    private T contenido;
    // coonstructor
    public Caja(T contenido){
        this.contenido = contenido;
    }
    // retorne elemento generico
    public T getContenido(){
        return contenido;
    }
    //setter generico
    public void setContenido(T contenido){
        this.contenido = contenido;
    }
}

// public Caja() {super()}; // constructor por defecto

// public static<T> void ponEncaja (T ele, Caja<T>caja) {
// caja.pon(ele)}

// caja manzanas ya no es generica
// Elementos por buena practica E
// T hace referencia a un solo tipo de dato

// parentesis angulares

// clase si es o no generica define si uso o no los parentesis angularess

// <V extends comparable> {}

// clase Bolsa -> bolsita

/*
comment grande
 */






