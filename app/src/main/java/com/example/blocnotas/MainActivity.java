package com.example.blocnotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView from = findViewById(R.id.txtfrom);
        TextView nombre = findViewById(R.id.txtnombre);
        ImageView imageView2=findViewById(R.id.imageView2);

        Animation  animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation  animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        from.setAnimation(animacion1);
        nombre.setAnimation(animacion1);
        imageView2.setAnimation(animacion2);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, RegistrarUsuario.class);
                startActivity(intent);
                finish();
            }
        },1990);
    }
}