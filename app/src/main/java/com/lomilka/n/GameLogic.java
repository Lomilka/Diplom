package com.lomilka.n;


import java.util.ArrayList;

public class GameLogic {
    public ArrayList<Dialogue> dialogues;
    private int currentDialogueIndex;
    private Dialogue currentDialogue;
    public static int theme;
    public static int razvilka = 0;
    public static int sujet = 0;
    public static int forselect = 0;
    public  static String option1Text = "Расспрашивать Чушу о его делах";
    public  static String option2Text = "Рассказывать Чуше о своих делах";
    public static int attentiveness = 0;
    public static int madness = 0;
    public static int friendship = 0;

    //Конструктор. Объект будет хранить лист с диалогами из NovelActivity
    public GameLogic(ArrayList<Dialogue> dialogues) {
        this.dialogues = dialogues;
        this.currentDialogueIndex = 0;
    }
    //Геттер
    public int getCurrentDialogueIndex() {
        return currentDialogueIndex;
    }

    // Переносит на следующий диалог
    public Dialogue getNextDialogue() {
        if (currentDialogueIndex < dialogues.size()) {
            currentDialogue = dialogues.get(currentDialogueIndex);
            currentDialogueIndex++;
            return currentDialogue; // возвращаем текущий диалог
        } else {
            return null;
        }
    }
    // Метод для сброса текущего индекса диалога на начальное значение
    public void resetCurrentDialogueIndex() {
        this.currentDialogueIndex = 0;
    }

    public int sizee(){
        return dialogues.size();
    }

    public void setDialogues(ArrayList<Dialogue> newList) {
        this.dialogues = newList;
    }

    public static int forselect(){
        switch (sujet) {
            case 1:
                forselect = 1;
                if(razvilka == 1){attentiveness ++;} //TODO: Из-за того, что forselect() вызывается каждый клик, attentiveness чересчур множится
                option1Text = "Искать бутылочку с водой для Чуши";
                option2Text = "Искать мамину сумку";
                System.out.println(attentiveness);
                break;
            case 2:
                forselect = 2;
                option1Text = "Оставить Mr.Феликсу рыбку";
                option2Text = "Оставить Mr.Феликсу курочку";
                break;
            case 3:
                forselect = 3;
                option1Text = "Молча наблюдать";
                option2Text = "Поздороваться с мальчиком";
                break;
            case 4:
                forselect = 4;
                option1Text = "Хочу такую же рогатку!";
                option2Text = "Мои игрушки лучше!";
                break;
            case 5:
                forselect = 5;
                option1Text = "Попроси моих родителей, они тебе разрешат";
                option2Text = "Я же говорила, тебе в миллиард раз скучнее!";
                break;
            case 6:
                forselect = 6;
                option1Text = "Ты самый лучший мишка в мире!";
                option2Text = "Я всегда буду тебя кормить.";
                break;
            case 7:
                forselect = 7;
                option1Text = "Плакать";
                option2Text = "Спорить с родителями";
                break;
            case 8:
                forselect = 8;
                option1Text = "Мама! Папа!";
                option2Text = "Промолчать";
                break;
            case 9:
                forselect = 9;
                option1Text = "Повернуть за угол";
                option2Text = "Повернуть за угол";
                break;
            case 10:
                forselect = 10;
                option1Text = "Уйти от голосов";
                option2Text = "Убежать от голосов";
                break;
            default:
                forselect = 0;
        }
        return forselect;
    }
}