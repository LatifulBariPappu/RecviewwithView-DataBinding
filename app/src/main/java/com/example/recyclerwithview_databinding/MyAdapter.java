package com.example.recyclerwithview_databinding;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerwithview_databinding.databinding.SinglerowBinding;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    List<Student> students;

    public MyAdapter(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        SinglerowBinding binding=SinglerowBinding.inflate(inflater,parent,false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Student currentStudent=students.get(position);
        holder.singlerowBinding.setStudent(currentStudent);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        SinglerowBinding singlerowBinding;
        public MyViewHolder(@NonNull SinglerowBinding singlerowBinding) {
            super(singlerowBinding.getRoot());
            this.singlerowBinding=singlerowBinding;
        }
    }
}
