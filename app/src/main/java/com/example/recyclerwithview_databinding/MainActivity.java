package com.example.recyclerwithview_databinding;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.recyclerwithview_databinding.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recView.setLayoutManager(new LinearLayoutManager(this));
        binding.recView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        MyAdapter adapter=new MyAdapter(getStudents());
        binding.recView.setAdapter(adapter);
    }
    public List<Student> getStudents(){

        List<Student> students =new ArrayList<>();
        students.add(new Student("Latiful Bari","Course : B.Sc"));
        students.add(new Student("Md Jamal","Course : MCA"));
        students.add(new Student("Mr Karim","Course : B.Sc"));
        students.add(new Student("Rahim khan","Course : B.Com"));
        students.add(new Student("Akash Ahmed","Course : BBA"));
        students.add(new Student("Ruhul Amin","Course : B.Sc"));

        return students;
    }
}