package com.example.recyclerapi;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Adapter_rc extends RecyclerView.Adapter<Adapter_rc.ViewHolder> {
    private List<Msg> msg;

    private Context context;

    public Adapter_rc(List<Msg> msg, Context context) {
        this.msg = msg;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_user.setText(msg.get(0).getResult().getHourly().getWind().get(position).getDatetime());
        Log.e("TAG","适配器中的msg："+msg);
        //Log.e("TAG","第一个speed为："+msg.get(0).getSpeed());
       // holder.tv_equipment.setText(msg.get(position).getDatetime());
    }

    @Override
    public int getItemCount() {
        return msg.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tv_equipment;
        private final TextView tv_user;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_equipment = itemView.findViewById(R.id.tv_equpment);
            tv_user = itemView.findViewById(R.id.tv_user);

        }
    }
}
