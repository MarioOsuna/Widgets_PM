package com.example.creacionwidgetsdinamicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
GridLayout g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g=findViewById(R.id.gridlayout);

        Button b;
        for ( int i=0;i<10;i++)
        {

            b=new Button(this);
            b.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
            b.setText("Boton: "+i);
            b.setId(View.generateViewId());
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, ((Button)v).getText(), Toast.LENGTH_SHORT).show();
                }
            });
            g.addView(b);
        }

    }
}
