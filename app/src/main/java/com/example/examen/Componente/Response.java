package com.example.examen.Componente;
import com.example.examen.Paises;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {
    @SerializedName("Paises")
    @Expose
    private List<Paises> Usuarios;
}

