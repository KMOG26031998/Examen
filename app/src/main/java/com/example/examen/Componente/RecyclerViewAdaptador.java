package com.example.examen.Componente;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ViewTarget;
import com.example.examen.R;
import com.example.examen.Paises;
import java.security.AccessController;
import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        //,topLevelDomain,alpha2Code,alpha3Code,capital,altSpellingM,region,subregion,demonym,timesones,borders,languages;
        ImageView alpha2Code;
    public ViewHolder(View itemView) {
            super(itemView);
            name =(TextView)itemView.findViewById(R.id.txtname );
         /*   topLevelDomain =(TextView)itemView.findViewById(R.id.txttopLevelDomain);
            alpha2Code =(TextView)itemView.findViewById(R.id.txtalpha2Code);
            alpha3Code =(TextView)itemView.findViewById(R.id.txtalpha3Code);
            capital =(TextView)itemView.findViewById(R.id.txtcapital);
      /* altSpellingM =(TextView)itemView.findViewById(R.id.txtaltSpellingM);
        region =(TextView)itemView.findViewById(R.id.txtregion );
        subregion =(TextView)itemView.findViewById(R.id.txtsubregion);
        demonym =(TextView)itemView.findViewById(R.id.txtdemonym );
        timesones =(TextView)itemView.findViewById(R.id.txttimesones);
        borders =(TextView)itemView.findViewById(R.id.txtborders);
        borders =(TextView)itemView.findViewById(R.id.txtlanguages);*/
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
        /*holder.topLevelDomain.setText((paisesListist.get(position).getTopLevelDomain()));
        holder.alpha2Code.setText((paisesListist.get(position).getAlpha2Code()));
        holder.alpha3Code.setText((paisesListist.get(position).getAlpha3Code()));
        holder.capital.setText((paisesListist.get(position).getCapital()));*/
       option.load(paisesListist.get(position).getAlpha2Code()).centerCrop().into(holder.alpha2Code);
    }
    @Override
    public int getItemCount() {
        return paisesListist.size();
    }
}
