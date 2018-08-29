package pe.edu.upeu.calculadora;

public interface Main {
    public interface Vista{
        public void mostrarResultado(String r);
    }

    public interface Presentador{
        public void sumar(String a,String b);
        public void restar(String a,String b);
        public void multiplicar(String a,String b);
        public void dividir(String a,String b);
        public void cuadrado(String x);
        public void raiz(String x);
        public void mostrarResultado(String r);
    }

    public interface Modelo{
        public void sumar(String a,String b);
        public void restar(String a,String b);
        public void multiplicar(String a,String b);
        public void dividir(String a,String b);
        public void cuadrado(String x);
        public void raiz(String x);
    }

}
