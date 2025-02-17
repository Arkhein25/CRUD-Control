package model;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private int id;
    private String nombreCompleto;
    private int edad;
    private String fechaNacimiento;
    private List<Asignatura> asignaturas;

    public Alumno(int id, String nombreCompleto, int edad, String fechaNacimiento) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.asignaturas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public void actualizarPrimeraAsignaturaNota(double nuevaNota) {
        if (!asignaturas.isEmpty()) {
            asignaturas.get(0).setNota(nuevaNota);
        }
    }
}
