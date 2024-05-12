package com.lomilka.n;

public class Dialogue {
    private String characterName; //поставить дефолтные значения
    private String text;
    private int imageResourceId;
    private int backgroundResourceId;

    public Dialogue(String characterName, String text, int imageResourceId, int backgroundResourceId) {
        this.characterName = characterName;
        this.text = text;
        this.imageResourceId = imageResourceId;
        this.backgroundResourceId = backgroundResourceId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
    public int getBackgroundResourceId() {
        return backgroundResourceId;
    }

    public void setBackgroundResourceId(int backgroundResourceIdResourceId) {
        this.backgroundResourceId = backgroundResourceIdResourceId;
    }
}