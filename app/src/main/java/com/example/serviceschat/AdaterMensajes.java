package com.example.serviceschat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class AdaterMensajes extends RecyclerView.Adapter<HolderMensaje> {
    private List<Mensaje> listMensaje;
    private Context c;

    public AdaterMensajes(List<Mensaje> listMensaje, Context c) {
        this.listMensaje = listMensaje;
        this.c = c;
    }

    @NonNull
    @Override
    public HolderMensaje onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderMensaje holderMensaje, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
