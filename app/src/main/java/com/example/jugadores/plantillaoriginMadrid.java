package com.example.jugadores;

public class plantillaoriginMadrid {
    int Foto;
    String VerNombre;
    String VerEquipo;
    String VerPosicion;
    String VerNum;
    String ConocerNacimiento;
    String VerNacionalidad;

    public plantillaoriginMadrid(int foto, String MuestraNom, String MuestraEquipo,
                          String MuestraPosicion, String MuestraNum,
                          String Nacimiento, String Nacionalidad) {
        Foto = foto;
        VerNombre = MuestraNom;
        VerEquipo = MuestraEquipo;
        VerPosicion = MuestraPosicion;
        VerNum = MuestraNum;
        ConocerNacimiento = Nacimiento;
        VerNacionalidad = Nacionalidad;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }

    public String getVerNombre() {
        return VerNombre;
    }

    public void setVerNombre(String verNombre) {
        VerNombre = verNombre;
    }

    public String getVerEquipo() {
        return VerEquipo;
    }

    public void setVerEquipo(String verEquipo) {
        VerEquipo = verEquipo;
    }

    public String getVerPosicion() {
        return VerPosicion;
    }

    public void setVerPosicion(String verPosicion) {
        VerPosicion = verPosicion;
    }

    public String getVerNum() {
        return VerNum;
    }

    public void setVerNum(String verNum) {
        VerNum = verNum;
    }

    public String getConocerNacimiento() {
        return ConocerNacimiento;
    }

    public void setConocerNacimiento(String conocerNacimiento) {
        ConocerNacimiento = conocerNacimiento;
    }

    public String getVerNacionalidad() {
        return VerNacionalidad;
    }

    public void setVerNacionalidad(String verNacionalidad) {
        VerNacionalidad = verNacionalidad;
    }
}
