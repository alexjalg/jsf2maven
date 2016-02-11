package com.alexjalg.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import clases.Persona;

@ManagedBean
@RequestScoped
public class PersonaBean {
	
	private String nombre;
	private String mensaje;
	private Persona persona = new Persona();
	private static List<Persona> lstpersona = new ArrayList<Persona>();
	
	public void agregarPersona(){
		PersonaBean.lstpersona.add(this.persona);
	}
	
	public void eliminarPersona(Persona persona){
		PersonaBean.lstpersona.remove(persona);
	}
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public List<Persona> getLstpersona() {
		return lstpersona;
	}
	public void setLstpersona(List<Persona> lstpersona) {
		PersonaBean.lstpersona = lstpersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public void saludar(){
		this.mensaje = "Salud ! " + this.nombre;
	}
	
}
