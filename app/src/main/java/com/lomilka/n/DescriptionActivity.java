package com.lomilka.n;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DescriptionActivity extends BaseActivity {

    private ConstraintLayout desLayout;
    private TextView description1TextView;
    private TextView description2TextView;
    private Button exitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        desLayout = findViewById(R.id.desLayout);
        description1TextView = findViewById(R.id.description1TextView);
        description2TextView = findViewById(R.id.description2TextView);
        exitButton = findViewById(R.id.exitButtonDes);
        setDescriptionTheme(desLayout,description1TextView,description2TextView,exitButton);

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