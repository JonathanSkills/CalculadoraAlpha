package pe.edu.upeu.calculadora;

public class CalculadoraPresentador implements Main.Presentador {
    public Main.Modelo modelo;
    public Main.Vista vista;

    public  CalculadoraPresentador(Main.Vista vista){
        this.vista=vista;
        modelo=new CalculadoraModelo(this);
    }

    @Override
    public void sumar(String a, String b) {
        if(vista!=null){
            modelo.sumar(a,b);
        }
    }

    @Override
    public void restar(String a, String b) {
        if(vista!=null){
            modelo.restar(a,b);
        }
    }

    @Override
    public void multiplicar(String a, String b) {
        if(vista!=null){
            modelo.multiplicar(a,b);
        }
    }

    @Override
    public void dividir(String a, String b) {
        if(vista!=null){
            modelo.dividir(a,b);
        }
    }

    @Override
    public void cuadrado(String x) {
        if(vista!=null){
            modelo.cuadrado(x);
        }
    }

    @Override
    public void raiz(String x) {
        if(vista!=null){
            modelo.raiz(x);
        }
    }

    @Override
    public void mostrarResultado(String r) {
        if(vista!=null){
            vista.mostrarResultado(r);
        }
    }
}
