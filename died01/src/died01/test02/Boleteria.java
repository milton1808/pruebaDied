package died01.test02;

import	java.time.LocalDate;

/**
 * 
 * @author MANSILLA
 *Clase para gestionar la cantidad de entradas vendidas
 */

public class Boleteria {
	
	/*
	 * Constante publica que determina maximo a atender
	 */
	public static final int MAX_INSCRIPTOS =20;
	
	// guardo el nombre de la boca de expendio
	private String nombre;
	private Integer[] vendidas;
	private LocalDate fechaInicio;
	private int cantidadDeClientes;
	
	public Boleteria() {
		this.cantidadDeClientes=0;
		this.vendidas= new Integer[MAX_INSCRIPTOS];
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer[] getVendidas() {
		return this.vendidas;
	}
	public void setVendidas(Integer[] vendidas) {
		this.vendidas= vendidas;
	}
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio=fechaInicio;
	}
	public int getCantidadDeClientes() {
		return this.cantidadDeClientes;
	}
	public void setCantidadDeClientes(int cantidadDeClientes) {
		this.cantidadDeClientes=cantidadDeClientes;
	}
	public void vender(int cantidad) {
		this.vendidas[this.cantidadDeClientes]=cantidad;
		this.cantidadDeClientes++;
	}
	public Double promedio() {
		double suma=0.0;
		for(int i=0; i<cantidadDeClientes;i++) {
			if(vendidas[i]!=null) {
				suma += vendidas[i];
			}
		}
		return suma/cantidadDeClientes;
	}
}
