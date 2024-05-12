package com.lomilka.n;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OptionsActivity extends BaseActivity {
    private ConstraintLayout optionsLayout;
    private TextView optionsTextView;
    private Button buttonTheme1;
    private Button buttonTheme2;
    private Button buttonTheme3;
    private Button exitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        optionsLayout = findViewById(R.id.optionsLayout);
        optionsTextView = findViewById(R.id.optionsTextView);
        buttonTheme1 = findViewById(R.id.buttonTheme1);
        buttonTheme2 = findViewById(R.id.buttonTheme2);
        buttonTheme3 = findViewById(R.id.buttonTheme3);
        exitButton = findViewById(R.id.exitButtonOpt);
        setOptionsTheme(optionsLayout,optionsTextView,buttonTheme1,buttonTheme2,buttonTheme3,exitButton);

        buttonTheme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GameLogic.theme = 1;
                setOptionsTheme(optionsLayout,optionsTextView,buttonTheme1,buttonTheme2,buttonTheme3,exitButton);
            }
        });
        buttonTheme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GameLogic.theme = 2;
                setOptionsTheme(optionsLayout,optionsTextView,buttonTheme1,buttonTheme2,buttonTheme3,exitButton);
            }
        });
        buttonTheme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GameLogic.theme = 3;
                setOptionsTheme(optionsLayout,optionsTextView,buttonTheme1,buttonTheme2,buttonTheme3,exitButton);
            }
        });

        //Назад
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_NovelActivity = new Intent(v.getContext(), NovelActivity.class);
                startActivity(start_NovelActivity);
            }
        });
    }
    //ОФОРМЛЕНИЕ
    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
    @Override
    public void onBackPressed() {}
}