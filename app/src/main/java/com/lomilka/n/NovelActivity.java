package com.lomilka.n;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class NovelActivity extends BaseActivity {

    private GameLogic gameLogic;
    private ImageView imageView;
    private RelativeLayout relativeLayout;
    private TextView characterNameTextView;
    private TextView dialogueTextView;
    private ImageView characterImageView;
    private AlertDialog dialog;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel);

        // Инициализация элементов интерфейса
        imageView = findViewById(R.id.imageView);
        relativeLayout = findViewById(R.id.relativeLayout);
        characterNameTextView = findViewById(R.id.characterNameTextView);
        dialogueTextView = findViewById(R.id.dialogueTextView);
        characterImageView = findViewById(R.id.characterImageView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        setNovelTheme(imageView, characterNameTextView, dialogueTextView, button1,button2,button3);

        //Создаём объект, который может управлять листом с диалогами. При создании currentDialogueIndex = 0
        gameLogic = new GameLogic(DialogLoader.select("0"));

        // Загрузка первого диалога
        loadNextDialogue(gameLogic);

        //Обработчик простого тыка по экрану
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadNextDialogue(gameLogic);
            }
        });

        // Обработчики событий для кнопок меню
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_MainActivity = new Intent(v.getContext(), MainActivity.class);
                startActivity(start_MainActivity);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_DescriptionActivity = new Intent(v.getContext(), DescriptionActivity.class);
                startActivity(start_DescriptionActivity);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_OptionsActivity = new Intent(v.getContext(), OptionsActivity.class);
                startActivity(start_OptionsActivity);
            }
        });
    }

    // Загрузка следующего диалога
    private void loadNextDialogue(GameLogic gameLogic) {
        Dialogue currentDialogue = gameLogic.getNextDialogue();
        if (currentDialogue != null) {
            characterNameTextView.setText(currentDialogue.getCharacterName());
            dialogueTextView.setText(currentDialogue.getText());
            characterImageView.setImageResource(currentDialogue.getImageResourceId());
            relativeLayout.setBackgroundResource(currentDialogue.getBackgroundResourceId());
        }
        if (gameLogic.getCurrentDialogueIndex() == gameLogic.sizee()) { //Если это последний диалог в листе, то:
            gameLogic.resetCurrentDialogueIndex();
            showCustomDialog();
            gameLogic.setDialogues(DialogLoader.select(GameLogic.forselect())); //TODO
        }
    }

    // Метод для отображения всплывающего окна
    private void showCustomDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(""); // Установка пустого заголовка
        LayoutInflater inflater = LayoutInflater.from(this);
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        LinearLayout customDialodLayout = dialogView.findViewById(R.id.customDialodLayout);
        TextView CustomDialogTextView = dialogView.findViewById(R.id.CustomDialogTextView);
        Button option1Button = dialogView.findViewById(R.id.option1Button);
        Button option2Button = dialogView.findViewById(R.id.option2Button);
        setCustomDialogLayoutTheme(customDialodLayout, CustomDialogTextView, option1Button, option2Button);

        // Получение текста кнопок из класса GameLogic
        option1Button.setText(GameLogic.option1Text);
        option2Button.setText(GameLogic.option2Text);

        option1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Обработка выбора варианта 1
                GameLogic.razvilka = 1;
                GameLogic.sujet++;
                // Закрыть окно
                if (dialog != null && dialog.isShowing()) {
                    dialog.dismiss();
                }
            }
        });

        option2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Обработка выбора варианта 2
                GameLogic.razvilka = 2;
                GameLogic.sujet++;
                // Закрыть окно
                if (dialog != null && dialog.isShowing()) {
                    dialog.dismiss();
                }
            }
        });

        // Запретить закрытие диалога при нажатии вне его области
        dialog = builder.create();
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
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