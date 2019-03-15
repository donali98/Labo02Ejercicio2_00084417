package com.example.labo02ejercicio2_00084417;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    int  cont=0;

    ImageView grid1, grid2, grid3, grid4, grid5, grid6,grid7,grid8,grid9;


    int[] img={ R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid1 = (ImageView) findViewById(R.id.img1);
        grid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid1.setImageResource(img[cont]);
                cont++;
                if(cont==9){
                    cont=0;
                }

            }
        });

        grid2 = (ImageView) findViewById(R.id.img2);
        grid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid2.setImageResource(img[cont]);
                cont++;
                if(cont==9){
                    cont=0;
                }

            }
        });

        grid3 = (ImageView) findViewById(R.id.img3);
        grid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid3.setImageResource(img[cont]);
                cont++;
                if(cont==9){
                    cont=0;
                }

            }
        });

        grid4 = (ImageView) findViewById(R.id.img4);
        grid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid4.setImageResource(img[cont]);
                cont++;
                if(cont==9){
                    cont=0;
                }

            }
        });

        grid5 = (ImageView) findViewById(R.id.img5);
        grid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid5.setImageResource(img[cont]);
                cont++;
                if(cont==9){
                    cont=0;
                }

            }
        });

        grid6 = (ImageView) findViewById(R.id.img6);
        grid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid6.setImageResource(img[cont]);
                cont++;
                if(cont==9){
                    cont=0;
                }

            }
        });

        grid7 = (ImageView) findViewById(R.id.img7);
        grid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid7.setImageResource(img[cont]);
                cont++;
                if(cont==9){
                    cont=0;
                }

            }
        });

        grid8 = (ImageView) findViewById(R.id.img8);
        grid8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid8.setImageResource(img[cont]);
                cont++;
                if(cont==9){
                    cont=0;
                }

            }
        });

        grid9 = (ImageView) findViewById(R.id.img9);
        grid9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid9.setImageResource(img[cont]);
                cont++;
                if(cont==9){
                    cont=0;
                }

            }
        });
    }
}
