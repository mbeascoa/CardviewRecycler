package com.example.cardviewrecycler;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private List<Peliculas> listaPeliculas;

    public Adaptador(List<Peliculas> ListaPelicula) {
        this.listaPeliculas = ListaPelicula;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_datos, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String tit = listaPeliculas.get(position).getTitulo();
        holder.txttit.setText(tit);
        String distri = listaPeliculas.get(position).getDistribuidor();
        holder.txtdistri.setText(distri);
        int peli = listaPeliculas.get(position).getFoto();
        holder.fotoPeli.setImageResource(peli);  //para asociar la imagen
    }

    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txttit,txtdistri;
        private ImageView fotoPeli;
        public ViewHolder(View v) {
            super(v);
            txttit = (TextView) v.findViewById(R.id.txtTitulo);
            txtdistri = (TextView) v.findViewById(R.id.txtDistribuidor);
            fotoPeli= (ImageView) v.findViewById(R.id.imaPeli);

        }
    }

}