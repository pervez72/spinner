package com.example.sippinar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] countryname;
    private Spinner spinner;
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get string Array
        countryname=getResources().getStringArray(R.array.countrname);

        spinner=findViewById(R.id.SpinnerID);
        button=findViewById(R.id.buttonViewID);
        textView=findViewById(R.id.textViewId);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.sampleview,R.id.sampleViewtextId,countryname);
        spinner.setAdapter(adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              String value=  spinner.getSelectedItem().toString();
              textView.setText(value);

            }
        });


    }
}