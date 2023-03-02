package com.example.jugadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorMadrid extends androidx.recyclerview.widget.RecyclerView.Adapter<AdaptadorMadrid.ViewHolder>{
    List<plantillaoriginMadrid> Madrid;
    LayoutInflater MiInflaterBAR;
    Context Vamos;

    public AdaptadorMadrid(List<plantillaoriginMadrid> miBarca, Context vamos) {
        Madrid = miBarca;
        MiInflaterBAR = LayoutInflater.from(vamos);
        Vamos = vamos;
    }

    @NonNull
    @Override
    public AdaptadorMadrid.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull ViewGroup parent, int viewType) {
        View Barca = MiInflaterBAR.inflate(R.layout.plantillaorigin, null);
        return new  AdaptadorMadrid.ViewHolder(Barca);
    }


    @Override
    public void onBindViewHolder(@NonNull AdaptadorMadrid.ViewHolder holder, int position) {
        holder.BinData(Madrid.get(position));
    }

    @Override
    public int getItemCount() {
        return Madrid.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView Mostrar;
        TextView Nom, Equ, Pos, Dor, Fech, Nac;
        ViewHolder( View Plantel){
            super(Plantel);
            Mostrar = Plantel.findViewById(R.id.Muestra);
            Nom = Plantel.findViewById(R.id.MuestraNom);
            Equ = Plantel.findViewById(R.id.MuestraEquipo);
            Pos = Plantel.findViewById(R.id.MuestraPosicion);
            Dor = Plantel.findViewById(R.id.MuestraDorsal);
            Fech = Plantel.findViewById(R.id.MuestraFecha);
            Nac = Plantel.findViewById(R.id.MuestraNacimiento);
        }
        public void BinData(final plantillaoriginMadrid MiEquipo){
            Mostrar.setImageResource(MiEquipo.getFoto());
            Nom.setText(MiEquipo.getVerNombre());
            Equ.setText(MiEquipo.getVerEquipo());
            Pos.setText(MiEquipo.getVerPosicion());
            Dor.setText(MiEquipo.getVerNum());
            Fech.setText(MiEquipo.getConocerNacimiento());
            Nac.setText(MiEquipo.getVerNacionalidad());
        }
    }
}
