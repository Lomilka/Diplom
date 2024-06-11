package com.lomilka.n;

import android.annotation.SuppressLint;

import java.util.ArrayList;

public class DialogLoader {
    public static ArrayList<Dialogue> dialogues_0 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_1 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_2 = new ArrayList<>();

    public static ArrayList<Dialogue> select (int selected){
        //dialogues_0
        dialogues_0.add(new Dialogue("dialogues_0", "0", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_0.add(new Dialogue("dialogues_0", "1", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_0.add(new Dialogue("dialogues_0", "2", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_0.add(new Dialogue("dialogues_0", "3", R.drawable.spr_mom, R.drawable.back11_sus_path));
        dialogues_0.add(new Dialogue("dialogues_0", "4", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_0.add(new Dialogue("dialogues_0", "5", R.drawable.spr_nurse, R.drawable.back10_mental_hospital));

        //dialogues_1
        dialogues_1.add(new Dialogue("dialogues_1", "0", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_1.add(new Dialogue("dialogues_1", "1", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_1.add(new Dialogue("dialogues_1", "2", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_1.add(new Dialogue("dialogues_1", "3", R.drawable.spr_mom, R.drawable.back11_sus_path));
        dialogues_1.add(new Dialogue("dialogues_1", "4", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_1.add(new Dialogue("dialogues_1", "5", R.drawable.spr_nurse, R.drawable.back10_mental_hospital));

        //dialogues_2
        dialogues_2.add(new Dialogue("dialogues_2", "0", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2.add(new Dialogue("dialogues_2", "1", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_2.add(new Dialogue("dialogues_2", "2", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_2.add(new Dialogue("dialogues_2", "3", R.drawable.spr_mom, R.drawable.back11_sus_path));
        dialogues_2.add(new Dialogue("dialogues_2", "4", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_2.add(new Dialogue("dialogues_2", "5", R.drawable.spr_nurse, R.drawable.back10_mental_hospital));

        switch (selected) {
            case 0:
                return dialogues_0;
            case 1:
                return dialogues_1;
            case 2:
                return dialogues_2;
            default:
                return null;
        }
    }
}
