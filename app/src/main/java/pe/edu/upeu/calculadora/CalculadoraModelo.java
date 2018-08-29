package pe.edu.upeu.calculadora;

public class CalculadoraModelo implements Main.Modelo{
    public Main.Presentador presentador;

    public CalculadoraModelo(Main.Presentador presentador){
        this.presentador=presentador;
    }

    @Override
    public void sumar(String a, String b) {
        double x = Double.valueOf(a);
        double y = Double.valueOf(b);
        System.out.println("resultado "+ x+" "+y);
        presentador.mostrarResultado(String.valueOf(x+y));
    }

    @Override
    public void restar(String a, String b) {
        double x = Double.valueOf(a);
        double y = Double.valueOf(b);
        presentador.mostrarResultado(String.valueOf(x-y));
    }

    @Override
    public void multiplicar(String a, String b) {
        double x = Double.valueOf(a);
        double y = Double.valueOf(b);
        presentador.mostrarResultado(String.valueOf(x*y));
    }

    @Override
    public void dividir(String a, String b) {
        double x = Double.valueOf(a);
        double y = Double.valueOf(b);
        if(y==0){
            presentador.mostrarResultado(String.valueOf("Error"));
        }else{
            presentador.mostrarResultado(String.valueOf(x/y));
        }

    }

    @Override
    public void cuadrado(String x) {
        double y = Double.valueOf(x);
        presentador.mostrarResultado(String.valueOf(y*y));
    }

    @Override
    public void raiz(String x) {
        double y = Double.valueOf(x);
        presentador.mostrarResultado(String.valueOf(Math.sqrt(y)));
    }
}
