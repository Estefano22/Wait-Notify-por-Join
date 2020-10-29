package com.cbellmont;

public class Cliente extends Thread {
camarero camarero;

public Cliente (Camarero camarero){
    this.camarero=camarero;
}
    @Override
    public void run() {
        try {
            while (true) {
                    if (Main.list.isEmpty()){
                        camarero.preparaComanda();
                        System.out.println("Cliente - Voy a esperar a que me traigan la comida");



                    } else {
                        System.out.println("Cliente - Voy a a consumir un \" + Main.list.get(0) + \" 3 segundos");
                        Main.list.remove(0);
                        sleep(2000);
                    }
                }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
