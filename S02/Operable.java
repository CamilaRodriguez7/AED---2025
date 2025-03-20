public interface Operable<N extends Number>{ // si o si mi tipo de dato generico deberia ser un numero para podere
    // realizar operaciones con el
    public N suma(N operando1, N operando2);
    public N resta(N operando1, N operando2);
    public N producto(N operando1, N operando2);
    public N division(N operando1, N operando2);

}
