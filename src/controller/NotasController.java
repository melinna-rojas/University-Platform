package controller;

import entity.notas;
import model.Notasmodel;

public class NotasController {
    Notasmodel model;
//constructor
    public NotasController() {
        model=new Notasmodel();
    }
    public String calcularPromedio(notas x){
        model.procesarDatos(x);
        return "BOLETA DE NOTAS"+
                "\nPromedio de Practicas : "+x.getPp()+
                "\nExamen Parcial : "+x.getEp()+
                "\nExamen Final : "+x.getEf()+
                "\nPromedio final : "+x.getPromedio();
    }
}

