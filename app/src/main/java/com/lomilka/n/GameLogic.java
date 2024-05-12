package com.lomilka.n;


import java.util.ArrayList;

public class GameLogic {
    private ArrayList<Dialogue> dialogues;
    private int currentDialogueIndex;
    private Dialogue currentDialogue;
    public static int theme;

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
}