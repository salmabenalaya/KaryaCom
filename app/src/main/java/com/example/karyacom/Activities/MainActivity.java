package com.example.karyacom.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.karyacom.R;

public class MainActivity extends AppCompatActivity {
    String[] Name = {"Maison1","Maison2","Maison3","Maison4","Maison5","Maison6","Maison7","Maison8"};
    int[] Image ={R.drawable.maison1,R.drawable.maison2,R.drawable.maison3,R.drawable.maison4,R.drawable.maison5,R.drawable.maison6,R.drawable.maison7,R.drawable.maison8};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return Image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view =getLayoutInflater().inflate(R.layout.activity_customlayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.image_view);
            TextView textView=(TextView)view.findViewById(R.id.text_view);
            imageView.setImageResource(Image[i]);
            textView.setText(Name[i]);



            return view;
        }
    }}