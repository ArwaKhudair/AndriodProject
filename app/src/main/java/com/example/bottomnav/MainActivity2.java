package com.example.bottomnav;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(
                    systemBars.left,
                    systemBars.top,
                    systemBars.right,
                    systemBars.bottom
            );
            return insets;
        });
        ImageView imageView = findViewById(R.id.arrow);
        Button b1 = findViewById(R.id.buy1);
        Button b2 = findViewById(R.id.buy);
        Button b3 = findViewById(R.id.buy3);
        Button b4 = findViewById(R.id.buy4);
        Button b5 = findViewById(R.id.buy5);
        Button b6 = findViewById(R.id.buy6);




        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q =new Intent(MainActivity2.this,MyCart.class);
                startActivity(q);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w =new Intent(MainActivity2.this,MyCart.class);
                startActivity(w);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e =new Intent(MainActivity2.this,MyCart.class);
                startActivity(e);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r =new Intent(MainActivity2.this,MyCart.class);
                startActivity(r);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t =new Intent(MainActivity2.this,MyCart.class);
                startActivity(t);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y =new Intent(MainActivity2.this,MyCart.class);
                startActivity(y);
            }
        });

    }

}
