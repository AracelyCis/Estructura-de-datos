/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Almacen {
    private String clave;
    private int cantidad;
    private String producto;
    public Almacen(){
        clave="";
        cantidad=0;
        producto="";
    }
    public Almacen(String clave, int cantidad, String producto){
        this.clave=clave;
        this.cantidad=cantidad;
        this.producto=producto;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
}
