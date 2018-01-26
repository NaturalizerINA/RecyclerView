package com.mukminullah.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 26/01/18.
 */

public class AV_list extends RecyclerView.Adapter<AV_list.myViewHolder> {

    public static List<B_list> itemList = new ArrayList<B_list>();
    public static Context context;

    public AV_list(List<B_list> itemList, Context context){
        this.itemList = itemList;
        this.context = context;
        notifyDataSetChanged();
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null);
        myViewHolder rcv = new myViewHolder(layout);
        return rcv;
    }

    @Override
    public void onBindViewHolder(AV_list.myViewHolder holder, int position) {

        B_list thisrow = itemList.get(position);

        holder.tv_nama.setText(thisrow.getName());
        holder.tv_jurusan.setText(thisrow.getJurusan());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tv_nama, tv_jurusan;

        public myViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            tv_nama = (TextView) itemView.findViewById(R.id.nama_tv);
            tv_jurusan = (TextView) itemView.findViewById(R.id.jurusan_tv);

        }

        @Override
        public void onClick(View v) {
            ((MainActivity)context).doTheActionInActivity(itemList.get(getAdapterPosition()));
        }
    }

}
