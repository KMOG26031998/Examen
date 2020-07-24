package com.example.examen.Componentes;

import java.util.Observable;
import com.example.examen.Json.*;
import retrofit2.http.GET;

public interface Paisretr {
    @GET("imagen")
    Observable<List<Json>> getData();
}
