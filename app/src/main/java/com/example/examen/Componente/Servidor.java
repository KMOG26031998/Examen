package com.example.examen.Componente;
import com.example.examen.Paises;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
public interface Servidor {
    @GET("es")
    Call<List<Paises>> getPaises();
}
