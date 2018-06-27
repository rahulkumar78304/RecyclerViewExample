package com.rohit.recyclerviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentItemView> {

    ArrayList<Student> list;
    Context context;

    public StudentAdapter(ArrayList<Student> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_detail,parent,false);
        return new StudentItemView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentItemView holder, int position) {

        holder.name.setText(list.get(position).getName());
        holder.address.setText(list.get(position).getAddress());
        int roll = list.get(position).getRoll();
        String stringRoll = String.valueOf(roll);
        holder.roll.setText(stringRoll);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class StudentItemView extends RecyclerView.ViewHolder{

        public TextView name, address, roll;


        public StudentItemView(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            address = itemView.findViewById(R.id.address);
            roll = itemView.findViewById(R.id.roll_number);

        }
    }


}




