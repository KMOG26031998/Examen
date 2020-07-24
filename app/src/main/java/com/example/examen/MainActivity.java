package com.example.examen;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.examen.Componente.RecyclerViewAdaptador;
import com.example.examen.Componente.Servidor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdaptador recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =(RecyclerView)findViewById(R.id.rvpaises);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        gsonpaises();
    }
    public List<Paises> obtenerPaises(){
        List<Paises> paises = new ArrayList<>();
        return paises;
    }
    private void gsonpaises() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://restcountries.eu/rest/v2/lang/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
       Servidor svr = retrofit.create(Servidor.class);
        Call<List<Paises>> call = svr.getPaises();
        call.enqueue(new Callback<List<Paises>>() {
            @Override
            public void onResponse(Call<List<Paises>> call, Response<List<Paises>> response) {
                if (!response.isSuccessful()) {
                    return;
                }
                List<Paises> postpaises = response.body();
                recyclerViewAdapter = new RecyclerViewAdaptador(postpaises);
                recyclerView.setAdapter(recyclerViewAdapter);
            }
            @Override
            public void onFailure(Call<List<Paises>> call, Throwable t) {
                Log.e("KR","aqui");
            }
        });
    }

}
