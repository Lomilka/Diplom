package com.lomilka.n;

import android.annotation.SuppressLint;

import java.util.ArrayList;

public class DialogLoader {
    public static ArrayList<Dialogue> dialogues_0 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_1 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_2 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_3 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_4 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_5 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_6 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_7 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_8 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_9 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_10 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_11 = new ArrayList<>();

    public static ArrayList<Dialogue> select (int selected){
        dialogues_0.clear();
        dialogues_1.clear();
        dialogues_2.clear();
        dialogues_3.clear();
        dialogues_4.clear();
        dialogues_5.clear();
        dialogues_6.clear();
        dialogues_7.clear();
        dialogues_8.clear();
        dialogues_9.clear();
        dialogues_10.clear();
        dialogues_11.clear();

        //dialogues_0
        dialogues_0.add(new Dialogue("dialogues_0", "0", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_0.add(new Dialogue("dialogues_0", "1", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_0.add(new Dialogue("dialogues_0", "2", R.drawable.spr_teddybear, R.drawable.back1_childroom));

        //dialogues_1
        dialogues_1.add(new Dialogue("dialogues_1", "0", R.drawable.spr_teddybear, R.drawable.back1_childroom));
        dialogues_1.add(new Dialogue("dialogues_1", "1", R.drawable.spr_maya_1, R.drawable.back2_hallway));
        dialogues_1.add(new Dialogue("dialogues_1", "2", R.drawable.spr_maya_1, R.drawable.back1_childroom));

        //dialogues_2
        dialogues_2.add(new Dialogue("dialogues_2", "0", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2.add(new Dialogue("dialogues_2", "1", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2.add(new Dialogue("dialogues_2", "2", R.drawable.spr_maya_1, R.drawable.back1_childroom));

        //dialogues_3
        dialogues_3.add(new Dialogue("dialogues_3", "0", R.drawable.spr_maya_1, R.drawable.back2_hallway));
        dialogues_3.add(new Dialogue("dialogues_3", "1", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_3.add(new Dialogue("dialogues_3", "2", R.drawable.spr_pit_1, R.drawable.back4_sandbox));

        //dialogues_4
        dialogues_4.add(new Dialogue("dialogues_4", "0", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_4.add(new Dialogue("dialogues_4", "1", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_4.add(new Dialogue("dialogues_4", "2", R.drawable.spr_pit_1, R.drawable.back4_sandbox));

        //dialogues_5
        dialogues_5.add(new Dialogue("dialogues_5", "0", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_5.add(new Dialogue("dialogues_5", "1", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_5.add(new Dialogue("dialogues_5", "2", R.drawable.spr_pit_1, R.drawable.back4_sandbox));

        //dialogues_6
        dialogues_6.add(new Dialogue("dialogues_6", "0", R.drawable.spr_maya_1, R.drawable.back15_home));
        dialogues_6.add(new Dialogue("dialogues_6", "1", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_6.add(new Dialogue("dialogues_6", "2", R.drawable.spr_teddybear, R.drawable.back1_childroom));

        //dialogues_7
        dialogues_7.add(new Dialogue("dialogues_7", "0", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_7.add(new Dialogue("dialogues_7", "1", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_7.add(new Dialogue("dialogues_7", "2", R.drawable.spr_pit_1, R.drawable.back4_sandbox));

        //dialogues_8
        dialogues_8.add(new Dialogue("dialogues_8", "0", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_8.add(new Dialogue("dialogues_8", "1", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_8.add(new Dialogue("dialogues_8", "2", R.drawable.spr_pit_1, R.drawable.back4_sandbox));

        //dialogues_9
        dialogues_9.add(new Dialogue("dialogues_9", "0", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_9.add(new Dialogue("dialogues_9", "1", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_9.add(new Dialogue("dialogues_9", "2", R.drawable.spr_pit_1, R.drawable.back4_sandbox));

        //dialogues_10
        dialogues_10.add(new Dialogue("dialogues_10", "0", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_10.add(new Dialogue("dialogues_10", "1", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_10.add(new Dialogue("dialogues_10", "2", R.drawable.spr_pit_1, R.drawable.back4_sandbox));

        //dialogues_11
        dialogues_11.add(new Dialogue("dialogues_11", "0", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_11.add(new Dialogue("dialogues_11", "1", R.drawable.spr_pit_1, R.drawable.back4_sandbox));
        dialogues_11.add(new Dialogue("dialogues_11", "2", R.drawable.spr_pit_1, R.drawable.back4_sandbox));


        switch (selected) {
            case 0:
                return dialogues_0;
            case 1:
                return dialogues_1;
            case 2:
                return dialogues_2;
            case 3:
                return dialogues_3;
            case 4:
                return dialogues_4;
            case 5:
                return dialogues_5;
            case 6:
                return dialogues_6;
            case 7:
                return dialogues_7;
            case 8:
                return dialogues_8;
            case 9:
                return dialogues_9;
            case 10:
                return dialogues_10;
            case 11:
                return dialogues_11;
            default:
                return null;
        }
    }
}
