package org.unitec.androidimc;

public class Imc {

    public  String calcular(Usuario u){
        float imc=u.getPeso()/(u.getAltura()*u.getAltura());

        return  "Tu imc es "+imc;
    }
}
