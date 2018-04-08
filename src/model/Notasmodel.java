package model;

import entity.notas;

public class Notasmodel {

    public void procesarDatos(notas mark) {
        //busqueda de la practica menor
        double arr[] = new double[4];
        arr[0] = mark.getP1();
        arr[1] = mark.getP2();
        arr[2] = mark.getP3();
        arr[3] = mark.getP4();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[j] < arr[j + 1]) {
                    double tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        double prom=(arr[0]+arr[1]+arr[2])/3.0;
        mark.setPp(prom);
        double prom2=(mark.getPp()*0.3+mark.getEp()*0.3+mark.getEf()*0.4);
        mark.setPromedio(prom2);
    }
}
