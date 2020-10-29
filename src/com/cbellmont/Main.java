package com.cbellmont;

import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Camarero camarero = new Camarero();
         Cliente cliente = new Cliente(camarero);
        // Es importante que empiece el camarero ya que se queda esperando
        cliente.start();
    }


}
