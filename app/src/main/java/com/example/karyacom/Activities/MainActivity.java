package com.example.karyacom.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.karyacom.R;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] Name = {"Appartement Mansoura","Villa Zahra","Appartement Ben Mansour","Villa Manoubi","Studio Lonny","Villa chkili","Appartement Ben Hassine","Appartement Rais"};
    int[] Image ={R.drawable.maison1, R.drawable.maison2,R.drawable.maison3,R.drawable.maison4,R.drawable.maison5,R.drawable.maison6,R.drawable.maison7,R.drawable.maison8};
    String[] nubChambre ={"S+3","s+2","S+2","S+3","S+1","S+5","S+1","S+1"};
    String[] Location ={"kélibia","Zahra","Kerkoune","Dar Allouch","Ain Grinz","Mansoura","Hammem Ghazez ","Houaria"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        //getById description
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1){
                    startActivity(new Intent(MainActivity.this,discription1.class));
                }
                if (position == 2){
                    startActivity(new Intent(MainActivity.this,discription2.class));
                }
                if (position == 3){
                    startActivity(new Intent(MainActivity.this,discription3.class));
                }
                if (position == 4){
                    startActivity(new Intent(MainActivity.this,discription4.class));
                }
                if (position == 5){
                    startActivity(new Intent(MainActivity.this,discription5.class));
                }
                if (position == 6){
                    startActivity(new Intent(MainActivity.this,discription6.class));
                }
                if (position == 7){
                    startActivity(new Intent(MainActivity.this,discription7.class));
                }
                if (position == 8){
                    startActivity(new Intent(MainActivity.this,discription8.class));
                }

            }
        });
    }

    class CustomAdapter extends BaseAdapter {

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
            view =getLayoutInflater().inflate(R.layout.list_item,null);

            ImageView imageView=(ImageView)view.findViewById(R.id.image_view);
            TextView textView=(TextView)view.findViewById(R.id.text_view);
            TextView textViewLocation=view.findViewById(R.id.text_view_location);
            TextView textViewS=view.findViewById(R.id.text_view_s);

            imageView.setImageResource(Image[i]);
            textView.setText(Name[i]);
            textViewLocation.setText(Location[i]);
            textViewS.setText(nubChambre[i]);



            return view;
        }
    }}