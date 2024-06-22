package com.lomilka.n;

import android.annotation.SuppressLint;

import java.util.ArrayList;

public class DialogLoader {
    public static ArrayList<Dialogue> dialogues_0 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_1_1 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_1_2 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_2_1 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_2_2 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_3 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_4 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_5 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_6 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_7 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_8 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_9 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_10 = new ArrayList<>();
    public static ArrayList<Dialogue> dialogues_11 = new ArrayList<>();

    public static ArrayList<Dialogue> select (String selected){
        dialogues_0.clear();
        dialogues_1_1.clear();
        dialogues_1_2.clear();
        dialogues_2_1.clear();
        dialogues_2_2.clear();
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
        dialogues_0.add(new Dialogue("Девочка в зеркале", "Какой хороший сегодня день! Наверное буду играть, пока не лопну.", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_0.add(new Dialogue("Мама", "Майа, через полчаса пойдем гулять, не забудь одеться вовремя", R.drawable.spr_mom, R.drawable.back1_childroom));
        dialogues_0.add(new Dialogue("Майа", "Хорошо, мам.", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_0.add(new Dialogue("Майа", "Вот я снова одна в комнате. Хотя..", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_0.add(new Dialogue("Майа", "Хотя почему одна? Со мной мой любимый Чуша", R.drawable.spr_teddybear, R.drawable.back1_childroom));
        dialogues_0.add(new Dialogue("Майа", "Что же ему сказать?", R.drawable.spr_teddybear, R.drawable.back1_childroom));

        //dialogues_1_1
        dialogues_1_1.add(new Dialogue("Майа", "Чуша, чем ты занимался сегодня?", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_1_1.add(new Dialogue("Чуша", "...", R.drawable.spr_teddybear, R.drawable.back1_childroom));
        dialogues_1_1.add(new Dialogue("Майа", "Ты хочешь сказать, но не можешь..", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_1_1.add(new Dialogue("Чуша", "...", R.drawable.spr_teddybear, R.drawable.back1_childroom));
        dialogues_1_1.add(new Dialogue("Майа", "Надеюсь, когда-нибудь ты поправишься и мы сможем поболтать", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_1_1.add(new Dialogue("Майа", "Хм, мама сказала, у меня ещё есть полчаса. Надо чем-то заняться..", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_1_1.add(new Dialogue("Майа", "Что же выбрать?", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        //dialogues_1_2
        dialogues_1_2.add(new Dialogue("dialogues_1", "Чуша, представляешь, я сегодня нашла огромного жука под подушкой", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_1_2.add(new Dialogue("dialogues_1", "Я хотела его выпустить, но он не полетел, а упал на пол(", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_1_2.add(new Dialogue("dialogues_1", "Ну ты не переживай, я его засунула в водяной пистолет и выстрелила в небо", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_1_2.add(new Dialogue("Майа", "Хм, мама сказала, у меня ещё есть полчаса. Надо чем-то заняться..", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_1_2.add(new Dialogue("Майа", "Что же выбрать?", R.drawable.spr_maya_1, R.drawable.back1_childroom));

        //dialogues_2_1
        dialogues_2_1.add(new Dialogue("Майа", "Надо будет позаботиться о моём котике мистере Феликсе", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "Из-за жизни на берегу океанов и ежедневного купания его предки разучились мяукать.", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "Это печально. Если я буду купаться, я тоже разучусь говорить?", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "Так! Надо найти бутылку с водой для Чуши.", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "В ящике её нет", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "За батареей тоже", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "Под кроватью..", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "ФУ! НУ И ПЫЛИЩА!", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "Апчхи!", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "О, кажется, бутылочка лежит за дверью, в коридоре", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "Ага, дело сделано", R.drawable.spr_maya_1, R.drawable.back2_hallway));
        dialogues_2_1.add(new Dialogue("Майа", "Чуша, я про тебя не забыла. Ты наверное уже заждалась", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "*Майе показалось, что Чуша действительно посмотрел на неё как-то иначе*", R.drawable.spr_teddybear, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "...", R.drawable.spr_teddybear, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "Вижу, ты доволен. Теперь надо покормить мистера Феликса!", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_1.add(new Dialogue("Майа", "Но чем?", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        //dialogues_2_2
        dialogues_2_2.add(new Dialogue("Майа", "Надо будет позаботиться о моём котике мистере Феликсе", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "Из-за жизни на берегу океанов и ежедневного купания его предки разучились мяукать.", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "Это печально. Если я буду купаться, я тоже разучусь говорить?", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "Так! Надо найти сумку для мамы.", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "В ящике её нет", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "За батареей тоже", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "Под кроватью..", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "ФУ! НУ И ПЫЛИЩА!", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "Апчхи!", R.drawable.spr_maya_2, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "О, кажется, сумка лежит за дверью, в коридоре", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "Ага, дело сделано. Представляю, если бы мама её забыла взять с собой", R.drawable.spr_maya_1, R.drawable.back2_hallway));
        dialogues_2_2.add(new Dialogue("Майа", "Положу её рядом с мистером Феликсом.", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "Кстати, его надо покормить!", R.drawable.spr_maya_1, R.drawable.back1_childroom));
        dialogues_2_2.add(new Dialogue("Майа", "Но чем?", R.drawable.spr_maya_1, R.drawable.back1_childroom));

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
            case "0":
                return dialogues_0;
            case "1.1":
                return dialogues_1_1;
            case "1.2":
                return dialogues_1_2;
            case "2.1":
                return dialogues_2_1;
            case "2.2":
                return dialogues_2_2;
            case "3":
                return dialogues_3;
            case "4":
                return dialogues_4;
            case "5":
                return dialogues_5;
            case "6":
                return dialogues_6;
            case "7":
                return dialogues_7;
            case "8":
                return dialogues_8;
            case "9":
                return dialogues_9;
            case "10":
                return dialogues_10;
            case "11":
                return dialogues_11;
            default:
                return null;
        }
    }
}
