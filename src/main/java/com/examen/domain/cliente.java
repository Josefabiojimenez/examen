package com.examen.domain;

import java.util.Date;
import java.util.logging.Logger;

public class cliente
{

    private int Idpelicula;
    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Usuario;
    private String Tipo;

    public int getIdpelicula()
    {
        return Idpelicula;
    }

    public void setIdpelicula(int Idpelicula)
    {
        this.Idpelicula = Idpelicula;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public String getApellido()
    {
        return Apellido;
    }

    public void setApellido(String Apellido)
    {
        this.Apellido = Apellido;
    }

    public String getDNI()
    {
        return DNI;
    }

    public void setDNI(String DNI)
    {
        this.DNI = DNI;
    }

    public String getUsuario()
    {
        return Usuario;
    }

    public void setUsuario(String Usuario)
    {
        this.Usuario = Usuario;
    }


    public String getTipo()
    {
        return Tipo;
    }

    public void setTipo(String Tipo)
    {
        this.Tipo = Tipo;
    }   

    public cliente()
    {
    }
 
    public cliente(String Usuario, String Nombre, String Apellido, String DNI, String Tipo)
    {
        setUsuario(Usuario);
        setNombre(Nombre);
        setApellido(Apellido);
        setDNI(DNI);      
        setTipo(Tipo);
    }

    public cliente(int Idpelicula, String Usuario, String Nombre, String Apellido, String DNI, String Tipo)
    {
        setIdpelicula(Idpelicula);
        setUsuario(Usuario);
        setNombre(Nombre);
        setApellido(Apellido);
        setDNI(DNI);
        setTipo(Tipo);
    }
}
