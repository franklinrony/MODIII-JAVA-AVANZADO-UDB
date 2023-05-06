package net.udb.mod3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Factura {
	 private double monto;
	    private int tiempoEnEmpresa;
	    private Genero generoVendedor;
	    private String concepto;
	    private int cantidad;

	    public Factura(double monto, int tiempoEnEmpresa, Genero generoVendedor, String concepto, int cantidad) {
	        this.monto = monto;
	        this.tiempoEnEmpresa = tiempoEnEmpresa;
	        this.generoVendedor = generoVendedor;
	        this.concepto = concepto;
	        this.cantidad = cantidad;
	    }

	    public double getMonto() {
	        return monto;
	    }

	    public void setMonto(double monto) {
	        this.monto = monto;
	    }

	    public int getTiempoEnEmpresa() {
	        return tiempoEnEmpresa;
	    }

	    public void setTiempoEnEmpresa(int tiempoEnEmpresa) {
	        this.tiempoEnEmpresa = tiempoEnEmpresa;
	    }

	    public Genero getGeneroVendedor() {
	        return generoVendedor;
	    }

	    public void setGeneroVendedor(Genero generoVendedor) {
	        this.generoVendedor = generoVendedor;
	    }

	    public String getConcepto() {
	        return concepto;
	    }

	    public void setConcepto(String concepto) {
	        this.concepto = concepto;
	    }

	    public int getCantidad() {
	        return cantidad;
	    }

	    public void setCantidad(int cantidad) {
	        this.cantidad = cantidad;
	    }

	    @Override
	    public String toString() {
	        return "Factura{" +
	                "monto=" + monto +
	                ", tiempoEnEmpresa=" + tiempoEnEmpresa +
	                ", generoVendedor=" + generoVendedor +
	                ", concepto='" + concepto + '\'' +
	                ", cantidad=" + cantidad +
	                '}';
	    }

	    public static void main(String[] args) {
	        // Llenar la lista con información en arreglos estáticos
	        List<Factura> facturas = new ArrayList<>();
	        facturas.add(new Factura(100.0, 3, Genero.HOMBRE, "Producto 1", 2));
	        facturas.add(new Factura(200.0, 1, Genero.MUJER, "Producto 2", 1));
	        facturas.add(new Factura(300.0, 5, Genero.HOMBRE, "Producto 3", 4));
	        facturas.add(new Factura(400.0, 2, Genero.MUJER, "Producto 4", 3));
	        facturas.add(new Factura(500.0, 4, Genero.HOMBRE, "Producto 5", 5));

	        // a. Obtener la venta mayor
	        double ventaMayor = facturas.stream()
	                .mapToDouble(Factura::getMonto)
	                .max()
	                .orElse(0.0);
	        System.out.println("Venta mayor: " + ventaMayor);

	        // b. Obtener la venta menor de hombres
	        double ventaMenorHombres = facturas.stream()
	                .filter(factura -> factura.getGeneroVendedor() == Genero.HOMBRE)
	                .mapToDouble(Factura::getMonto)
	                .min()
	                .orElse(0.0);
	        System.out.println("Venta menor de hombres: " + ventaMenorHombres);
	        
	        double totalVentasEmpleadosAntiguos = facturas.stream()
	        	    .filter(f -> f.getTiempoEnEmpresa() > 2)
	        	    .mapToDouble(Factura::getMonto)
	        	    .sum();
	        System.out.println("Venta empleados antiguos "+totalVentasEmpleadosAntiguos);
	        
	        Optional<Factura> ventaMayorMujeres = facturas.stream()
	        	    .filter(f -> f.getGeneroVendedor().equals("Femenino"))
	        	    .max(Comparator.comparing(Factura::getMonto));
	        
	        System.out.println("Venta maor mujeres "+ventaMayorMujeres);
	        
	        List<Factura> facturasOrdenadas = facturas.stream()
	        	    .sorted(Comparator.comparing(Factura::getCantidad))
	        	    .collect(Collectors.toList());
}
}
