package com.example.serviceschat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class AdaterMensajes extends RecyclerView.Adapter<HolderMensaje> {
    private List<Mensaje> listMensaje= new ArrayList<>();
    private Context c;

    public AdaterMensajes(Context c) {
        this.c = c;
    }
    public void addMensaje (Mensaje m){
        listMensaje.add(m);
        
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
