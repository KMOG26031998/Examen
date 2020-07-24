package com.example.examen.Componente;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.example.examen.R;
import com.example.examen.Paises;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        ImageView alpha2Code;
    public ViewHolder(View itemView) {
            super(itemView);
            name =(TextView)itemView.findViewById(R.id.txtname);
        alpha2Code = itemView.findViewById(R.id.ivpais);
        }
    }
    public List<Paises> paisesListist;
    RequestManager option;
    public RecyclerViewAdaptador(List<Paises> paisesListist){
        this.paisesListist = paisesListist;
    }
    @Override
    public RecyclerViewAdaptador.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_template,parent,false);
        final RecyclerViewAdaptador.ViewHolder viewHolder = new RecyclerViewAdaptador.ViewHolder(view);
        option = Glide.with(viewHolder.alpha2Code.getContext());
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(RecyclerViewAdaptador.ViewHolder holder, int position) {
        holder.name.setText((paisesListist.get(position).getName()));
       option.load("http://www.geognos.com/api/en/countries/flag/"+paisesListist.get(position).getAlpha2Code()+".png").centerCrop().into(holder.alpha2Code);
    }
    @Override
    public int getItemCount() {
        return paisesListist.size();
    }
}
