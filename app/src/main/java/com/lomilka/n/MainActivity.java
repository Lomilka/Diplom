package com.lomilka.n;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends BaseActivity {
    private ImageView LokOk;
    private ImageView LokLose;
    private ConstraintLayout constraintLayout;
    private TextView textView_ByLomilka;
    private Button button_play;
    private Button button_leaveAtTheGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LokOk = findViewById(R.id.imageView_Lok1);
        LokLose = findViewById(R.id.imageView_Lok2);
        constraintLayout = findViewById(R.id.constraintLayout);
        textView_ByLomilka = findViewById(R.id.textView_ByLomilka);
        button_play = findViewById(R.id.button_play);
        button_leaveAtTheGame = findViewById(R.id.button_leaveAtTheGame);

        setMainTheme(constraintLayout, textView_ByLomilka, button_play, button_leaveAtTheGame);
        showAgeVerificationDialog();
    }
    // Подтверждение возраста
    private void showAgeVerificationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Внимание!")
                .setMessage("Эта игра предназначена для лиц старше 18 лет")
                .setCancelable(false)
                .setPositiveButton("Мне есть 18 лет", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Мне меньше 18 лет", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (1 == 1){
            LokOk.setImageAlpha(0);
            LokLose.setImageAlpha(255);
        }else {
            LokOk.setImageAlpha(255);
            LokLose.setImageAlpha(0);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override
    public void onBackPressed() {
        showExit();
    }

    public void to_NovelActivity(View view){
        Intent start_NovelActivity = new Intent(this,NovelActivity.class);
        startActivity(start_NovelActivity);
    }


    public void exit(View view){
        this.finishAffinity();
    }

    //Окно
    public void showExit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Вы нажали кнопку <<Назад>>");
        builder.setMessage("Вы действительно хотите выйти из игры?");
        builder.setNegativeButton("Нет!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setPositiveButton("Да.", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}