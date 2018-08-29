package pe.edu.upeu.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements Main.Vista{
    private Main.Presentador presentador;
    ImageButton uno, dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero,ce,raiz,cuadrado,back,suma,resta,multiplicacion,division,igual,point;
    TextView txtnumero,txtalternativo;
    String opcion = "";
    String primerNumero="";
    Boolean operacion = false;
    Boolean resultado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador = new CalculadoraPresentador(this);
        uno = (ImageButton) findViewById(R.id.uno);
        dos = (ImageButton) findViewById(R.id.dos);
        tres = (ImageButton) findViewById(R.id.tres);
        cuatro = (ImageButton) findViewById(R.id.cuatro);
        cinco = (ImageButton) findViewById(R.id.cinco);
        seis = (ImageButton) findViewById(R.id.seis);
        siete = (ImageButton) findViewById(R.id.siete);
        ocho = (ImageButton) findViewById(R.id.ocho);
        nueve = (ImageButton) findViewById(R.id.nueve);
        cero = (ImageButton) findViewById(R.id.cero);
        ce = (ImageButton) findViewById(R.id.ce);
        raiz = (ImageButton) findViewById(R.id.root);
        cuadrado = (ImageButton) findViewById(R.id.cuadrado);
        back = (ImageButton) findViewById(R.id.back);
        suma = (ImageButton) findViewById(R.id.plus);
        resta = (ImageButton) findViewById(R.id.reduce);
        multiplicacion = (ImageButton) findViewById(R.id.multiplicar);
        division = (ImageButton) findViewById(R.id.dividir);
        txtnumero = (TextView) findViewById(R.id.txtnumero);
        txtalternativo = (TextView) findViewById(R.id.txtalternativo);
        igual = (ImageButton) findViewById(R.id.igual);
        point = (ImageButton) findViewById(R.id.point);
        txtnumero.setText("0");
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado==true){
                    if(operacion==false){
                        resultado=false;
                        txtnumero.setText("1");
                        txtalternativo.setText("1");
                    }else{
                        txtnumero.setText("1");
                        txtalternativo.setText(txtalternativo.getText()+"1");
                    }
                }else{
                    if(opcion==""){
                        if(txtnumero.getText().toString()=="0"){
                            txtnumero.setText("1");
                            txtalternativo.setText(txtalternativo.getText()+"1");
                        }else{
                            txtnumero.setText(txtnumero.getText()+"1");
                            txtalternativo.setText(txtalternativo.getText()+"1");
                        }

                    }else{
                        if(operacion==true){
                            txtnumero.setText("");
                            txtnumero.setText(txtnumero.getText()+"1");
                            txtalternativo.setText(txtalternativo.getText()+"1");
                            operacion=false;
                        }else{
                            txtnumero.setText(txtnumero.getText()+"1");
                            txtalternativo.setText(txtalternativo.getText()+"1");
                        }
                    }
                }


            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado==true){
                    if(operacion==false){
                        resultado=false;
                        txtnumero.setText("2");
                        txtalternativo.setText("2");
                    }else{
                        txtnumero.setText("2");
                        txtalternativo.setText(txtalternativo.getText()+"2");
                    }
                }else{
                    if(opcion==""){
                        if(txtnumero.getText().toString()=="0"){
                            txtnumero.setText("2");
                            txtalternativo.setText(txtalternativo.getText()+"2");
                        }else{
                            txtnumero.setText(txtnumero.getText()+"2");
                            txtalternativo.setText(txtalternativo.getText()+"2");
                        }
                    }else{
                        if(operacion==true){
                            txtnumero.setText("");
                            txtnumero.setText(txtnumero.getText()+"2");
                            txtalternativo.setText(txtalternativo.getText()+"2");
                            operacion=false;
                        }else{
                            txtnumero.setText(txtnumero.getText()+"2");
                            txtalternativo.setText(txtalternativo.getText()+"2");
                        }

                    }
                }


            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado==true){
                    if(operacion==false){
                        resultado=false;
                        txtnumero.setText("3");
                        txtalternativo.setText("3");
                    }else{
                        txtnumero.setText("3");
                        txtalternativo.setText(txtalternativo.getText()+"3");
                    }
                }else{
                    if(opcion==""){
                        if(txtnumero.getText().toString()=="0"){
                            txtnumero.setText("3");
                            txtalternativo.setText(txtalternativo.getText()+"3");
                        }else{
                            txtnumero.setText(txtnumero.getText()+"3");
                            txtalternativo.setText(txtalternativo.getText()+"3");
                        }
                    }else{
                        if(operacion==true){
                            txtnumero.setText("");
                            txtnumero.setText(txtnumero.getText()+"3");
                            txtalternativo.setText(txtalternativo.getText()+"3");
                            operacion=false;
                        }else{
                            txtnumero.setText(txtnumero.getText()+"3");
                            txtalternativo.setText(txtalternativo.getText()+"3");
                        }
                    }
                }

            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado==true){
                    if(operacion==false){
                        resultado=false;
                        txtnumero.setText("4");
                        txtalternativo.setText("4");
                    }else{
                        txtnumero.setText("4");
                        txtalternativo.setText(txtalternativo.getText()+"4");
                    }
                }else{
                    if(opcion==""){
                        if(txtnumero.getText().toString()=="0"){
                            txtnumero.setText("4");
                            txtalternativo.setText(txtalternativo.getText()+"4");
                        }else{
                            txtnumero.setText(txtnumero.getText()+"4");
                            txtalternativo.setText(txtalternativo.getText()+"4");
                        }
                    }else{
                        if(operacion==true){
                            txtnumero.setText("");
                            txtnumero.setText(txtnumero.getText()+"4");
                            txtalternativo.setText(txtalternativo.getText()+"4");
                            operacion=false;
                        }else{
                            txtnumero.setText(txtnumero.getText()+"4");
                            txtalternativo.setText(txtalternativo.getText()+"4");
                        }
                    }
                }

            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado==true){
                    if(operacion==false){
                        resultado=false;
                        txtnumero.setText("5");
                        txtalternativo.setText("5");
                    }else{
                        txtnumero.setText("5");
                        txtalternativo.setText(txtalternativo.getText()+"5");
                    }
                }else{
                    if(opcion==""){
                        if(txtnumero.getText().toString()=="0"){
                            txtnumero.setText("5");
                            txtalternativo.setText(txtalternativo.getText()+"5");
                        }else{
                            txtnumero.setText(txtnumero.getText()+"5");
                            txtalternativo.setText(txtalternativo.getText()+"5");
                        }
                    }else{
                        if(operacion==true){
                            txtnumero.setText("");
                            txtnumero.setText(txtnumero.getText()+"5");
                            txtalternativo.setText(txtalternativo.getText()+"5");
                            operacion=false;
                        }else{
                            txtnumero.setText(txtnumero.getText()+"5");
                            txtalternativo.setText(txtalternativo.getText()+"5");
                        }
                    }
                }

            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado==true){
                    if(operacion==false){
                        resultado=false;
                        txtnumero.setText("6");
                        txtalternativo.setText("6");
                    }else{
                        txtnumero.setText("6");
                        txtalternativo.setText(txtalternativo.getText()+"6");
                    }
                }else{
                    if(opcion==""){
                        if(txtnumero.getText().toString()=="0"){
                            txtnumero.setText("6");
                            txtalternativo.setText(txtalternativo.getText()+"6");
                        }else{
                            txtnumero.setText(txtnumero.getText()+"6");
                            txtalternativo.setText(txtalternativo.getText()+"6");
                        }
                    }else{
                        if(operacion==true){
                            txtnumero.setText("");
                            txtnumero.setText(txtnumero.getText()+"6");
                            txtalternativo.setText(txtalternativo.getText()+"6");
                            operacion=false;
                        }else{
                            txtnumero.setText(txtnumero.getText()+"6");
                            txtalternativo.setText(txtalternativo.getText()+"6");
                        }
                    }
                }

            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado==true){
                    if(operacion==false){
                        resultado=false;
                        txtnumero.setText("7");
                        txtalternativo.setText("7");
                    }else{
                        txtnumero.setText("7");
                        txtalternativo.setText(txtalternativo.getText()+"7");
                    }
                }else{
                    if(opcion==""){
                        if(txtnumero.getText().toString()=="0"){
                            txtnumero.setText("7");
                            txtalternativo.setText(txtalternativo.getText()+"7");
                        }else{
                            txtnumero.setText(txtnumero.getText()+"7");
                            txtalternativo.setText(txtalternativo.getText()+"7");
                        }
                    }else{
                        if(operacion==true){
                            txtnumero.setText("");
                            txtnumero.setText(txtnumero.getText()+"7");
                            txtalternativo.setText(txtalternativo.getText()+"7");
                            operacion=false;
                        }else{
                            txtnumero.setText(txtnumero.getText()+"7");
                            txtalternativo.setText(txtalternativo.getText()+"7");
                        }
                    }
                }

            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado==true){
                    if(operacion==false){
                        resultado=false;
                        txtnumero.setText("8");
                        txtalternativo.setText("8");
                    }else{
                        txtnumero.setText("8");
                        txtalternativo.setText(txtalternativo.getText()+"8");
                    }
                }else{
                    if(opcion==""){
                        if(txtnumero.getText().toString()=="0"){
                            txtnumero.setText("8");
                            txtalternativo.setText(txtalternativo.getText()+"8");
                        }else{
                            txtnumero.setText(txtnumero.getText()+"8");
                            txtalternativo.setText(txtalternativo.getText()+"8");
                        }
                    }else{
                        if(operacion==true){
                            txtnumero.setText("");
                            txtnumero.setText(txtnumero.getText()+"8");
                            txtalternativo.setText(txtalternativo.getText()+"8");
                            operacion=false;
                        }else{
                            txtnumero.setText(txtnumero.getText()+"8");
                            txtalternativo.setText(txtalternativo.getText()+"8");
                        }
                    }
                }

            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado==true){
                    if(operacion==false){
                        resultado=false;
                        txtnumero.setText("9");
                        txtalternativo.setText("9");
                    }else{
                        txtnumero.setText("9");
                        txtalternativo.setText(txtalternativo.getText()+"9");
                    }
                }else{
                    if(opcion==""){
                        if(txtnumero.getText().toString()=="0"){
                            txtnumero.setText("9");
                            txtalternativo.setText(txtalternativo.getText()+"9");
                        }else{
                            txtnumero.setText(txtnumero.getText()+"9");
                            txtalternativo.setText(txtalternativo.getText()+"9");
                        }
                    }else{
                        if(operacion==true){
                            txtnumero.setText("");
                            txtnumero.setText(txtnumero.getText()+"9");
                            txtalternativo.setText(txtalternativo.getText()+"9");
                            operacion=false;
                        }else{
                            txtnumero.setText(txtnumero.getText()+"9");
                            txtalternativo.setText(txtalternativo.getText()+"9");
                        }
                    }
                }

            }
        });
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado==true){
                    if(operacion==false){
                        resultado=false;
                        txtnumero.setText("0");
                        txtalternativo.setText("0");
                    }else{
                        txtnumero.setText("0");
                        txtalternativo.setText(txtalternativo.getText()+"0");
                    }

                }else{
                    if(opcion==""){
                        txtnumero.setText(txtnumero.getText()+"0");
                        txtalternativo.setText(txtalternativo.getText()+"0");
                    }else{
                        if(operacion==true){
                            txtnumero.setText("");
                            txtnumero.setText(txtnumero.getText()+"0");
                            txtalternativo.setText(txtalternativo.getText()+"0");
                            operacion=false;
                        }else{
                            txtnumero.setText(txtnumero.getText()+"0");
                            txtalternativo.setText(txtalternativo.getText()+"0");
                        }
                    }
                }

            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero.setText("0");
                txtalternativo.setText("");
            }
        });
        raiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtnumero.getText().toString()!="Error"){
                    presentador.raiz(txtnumero.getText().toString());
                    resultado=true;
                }

            }
        });
        cuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtnumero.getText().toString()!="Error"){
                    presentador.cuadrado(txtnumero.getText().toString());
                    resultado=true;
                }

            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtnumero.getText().toString()!="Error"){
                    primerNumero=txtnumero.getText().toString();
                    txtalternativo.setText(txtnumero.getText()+"+");
                    opcion="suma";
                    operacion=true;
                }

            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtnumero.getText().toString()!="Error"){
                    primerNumero=txtnumero.getText().toString();
                    txtalternativo.setText(txtnumero.getText()+"-");
                    opcion="resta";
                    operacion=true;
                }

            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtnumero.getText().toString()!="Error"){
                    primerNumero=txtnumero.getText().toString();
                    txtalternativo.setText(txtnumero.getText()+"*");
                    opcion="multiplicacion";
                    operacion=true;
                }

            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtnumero.getText().toString()!="Error"){
                    primerNumero=txtnumero.getText().toString();
                    txtalternativo.setText(txtnumero.getText()+"/");
                    opcion="division";
                    operacion=true;
                }

            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String segundoNumero=txtnumero.getText().toString();
                switch (opcion){
                    case "suma":
                    presentador.sumar(primerNumero,segundoNumero);
                        break;
                    case "resta":
                        presentador.restar(primerNumero,segundoNumero);
                        break;
                    case "multiplicacion":
                        presentador.multiplicar(primerNumero,segundoNumero);
                        break;
                    case "division":
                        presentador.dividir(primerNumero,segundoNumero);
                        break;
                }
                resultado=true;
                operacion=false;
            }
        });

        back.setOnClickListener(new             View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String str=txtnumero.getText().toString();
                if(str=="Error"){
                    if (str.length() >=1 ) {
                        str = str.substring(0, str.length() - 1);
                        txtnumero.setText(str);
                        txtalternativo.setText(str);
                    } else if (str.length() <=1 ) {
                        txtnumero.setText("0");
                        txtalternativo.setText(str);
                    }
                }else{
                    txtnumero.setText("0");
                }

            }}

            );

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txtnumero.getText().toString().contains(".")){
                    if(resultado==true){
                        if(operacion==false){
                            resultado=false;
                            txtnumero.setText("0.");
                            txtalternativo.setText("0.");
                        }else{
                            txtnumero.setText("0");
                            txtalternativo.setText(txtalternativo.getText()+"0");
                        }
                    }else{
                        if(opcion==""){
                            if(txtnumero.getText().toString()=="0"){
                                txtnumero.setText("0.");
                                txtalternativo.setText(txtalternativo.getText()+".");
                            }else{
                                txtnumero.setText(txtnumero.getText()+".");
                                txtalternativo.setText(txtalternativo.getText()+".");
                            }
                        }else{
                            if(operacion==true){
                                txtnumero.setText("");
                                txtnumero.setText(txtnumero.getText()+".");
                                txtalternativo.setText(txtalternativo.getText()+".");
                                operacion=false;
                            }else{
                                txtnumero.setText(txtnumero.getText()+".");
                                txtalternativo.setText(txtalternativo.getText()+".");
                            }
                        }
                    }
                }


            }
        });


    }

    @Override
    public void mostrarResultado(String r) {
        txtalternativo.setText(r);
        txtnumero.setText(r);
        opcion="";

    }
}
