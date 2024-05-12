package com.lomilka.n;

import java.util.ArrayList;

public class DialogLoader {

    public static ArrayList<Dialogue> loadDialogues() {
        ArrayList<Dialogue> dialogues = new ArrayList<>();
        dialogues.add(new Dialogue("Майя", "Мне очень надо погладить мишку!", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues.add(new Dialogue("Пит", "У тебя никогда не получится.", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues.add(new Dialogue("Пит", "У тебя никогда не получится.", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues.add(new Dialogue("Медсестра", "Ты не посмеешь сдвинуться с места!", R.drawable.spr_nurse, R.drawable.back10_mental_hospital));
        dialogues.add(new Dialogue("Майя", "Мне очень надо погладить мишку!", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues.add(new Dialogue("Пит", "У тебя никогда не получится.", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        return dialogues;
    }
}