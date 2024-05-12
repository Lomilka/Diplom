package com.lomilka.n;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BaseActivity extends AppCompatActivity {

    //activity_main
    protected void setMainTheme(Object background, Object heading, Object buttonPlay, Object buttonExit){
        switch (GameLogic.theme) {
            case 2:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_2));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_2));
                }
                if (buttonPlay instanceof Button) {
                    ((Button) buttonPlay).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) buttonPlay).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                if (buttonExit instanceof Button) {
                    ((Button) buttonExit).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) buttonExit).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                break;
            case 3:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_3));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_3));
                }
                if (buttonPlay instanceof Button) {
                    ((Button) buttonPlay).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) buttonPlay).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                if (buttonExit instanceof Button) {
                    ((Button) buttonExit).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) buttonExit).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                break;
            default:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_1));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_1));
                }
                if (buttonPlay instanceof Button) {
                    ((Button) buttonPlay).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) buttonPlay).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                if (buttonExit instanceof Button) {
                    ((Button) buttonExit).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) buttonExit).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                break;
        }
    }



    //activity_novel

    protected void setNovelTheme(Object background, Object characterName, Object dialogueText, Object button1, Object button2, Object button3){
        switch (GameLogic.theme) {
            case 2:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_30_2));
                }
                if (characterName instanceof TextView) {
                    ((TextView) characterName).setTextColor(getResources().getColor(R.color.text1_2));
                    ((TextView) characterName).setBackgroundColor(getResources().getColor(R.color.background_95_2));
                }
                if (dialogueText instanceof TextView) {
                    ((TextView) dialogueText).setTextColor(getResources().getColor(R.color.text1_2));
                    ((TextView) dialogueText).setBackgroundColor(getResources().getColor(R.color.background_95_2));
                }
                if (button1 instanceof Button) {
                    ((Button) button1).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) button1).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                if (button2 instanceof Button) {
                    ((Button) button2).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) button2).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                if (button3 instanceof Button) {
                    ((Button) button3).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) button3).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                break;
            case 3:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_30_3));
                }
                if (characterName instanceof TextView) {
                    ((TextView) characterName).setTextColor(getResources().getColor(R.color.text1_3));
                    ((TextView) characterName).setBackgroundColor(getResources().getColor(R.color.background_95_3));
                }
                if (dialogueText instanceof TextView) {
                    ((TextView) dialogueText).setTextColor(getResources().getColor(R.color.text1_2));
                    ((TextView) dialogueText).setBackgroundColor(getResources().getColor(R.color.background_95_3));
                }
                if (button1 instanceof Button) {
                    ((Button) button1).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) button1).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                if (button2 instanceof Button) {
                    ((Button) button2).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) button2).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                if (button3 instanceof Button) {
                    ((Button) button3).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) button3).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                break;
            default:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_30_1));
                }
                if (characterName instanceof TextView) {
                    ((TextView) characterName).setTextColor(getResources().getColor(R.color.text1_1));
                    ((TextView) characterName).setBackgroundColor(getResources().getColor(R.color.background_95_1));
                }
                if (dialogueText instanceof TextView) {
                    ((TextView) dialogueText).setTextColor(getResources().getColor(R.color.text1_2));
                    ((TextView) dialogueText).setBackgroundColor(getResources().getColor(R.color.background_95_1));
                }
                if (button1 instanceof Button) {
                    ((Button) button1).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) button1).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                if (button2 instanceof Button) {
                    ((Button) button2).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) button2).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                if (button3 instanceof Button) {
                    ((Button) button3).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) button3).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                break;
        }
    }



    //activity_description

    protected void setDescriptionTheme(Object background, Object heading, Object description, Object buttonExit){
        switch (GameLogic.theme) {
            case 2:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_2));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_2));
                }
                if (description instanceof TextView) {
                    ((TextView) description).setTextColor(getResources().getColor(R.color.text1_2));
                }
                if (buttonExit instanceof Button) {
                    ((Button) buttonExit).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) buttonExit).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                break;
            case 3:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_3));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_3));
                }
                if (description instanceof TextView) {
                    ((TextView) description).setTextColor(getResources().getColor(R.color.text1_3));
                }
                if (buttonExit instanceof Button) {
                    ((Button) buttonExit).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) buttonExit).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                break;
            default:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_1));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_1));
                }
                if (description instanceof TextView) {
                    ((TextView) description).setTextColor(getResources().getColor(R.color.text1_1));
                }
                if (buttonExit instanceof Button) {
                    ((Button) buttonExit).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) buttonExit).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                break;
        }
    }



    //activity_options

    protected void setOptionsTheme(Object background, Object heading, Object button1, Object button2, Object button3, Object buttonExit){
        switch (GameLogic.theme) {
            case 2:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_2));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_2));
                }
                if (button1 instanceof Button) {
                    ((Button) button1).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) button1).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                if (button2 instanceof Button) {
                    ((Button) button2).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) button2).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                if (button3 instanceof Button) {
                    ((Button) button3).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) button3).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                if (buttonExit instanceof Button) {
                    ((Button) buttonExit).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) buttonExit).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                break;
            case 3:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_3));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_3));
                }
                if (button1 instanceof Button) {
                    ((Button) button1).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) button1).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                if (button2 instanceof Button) {
                    ((Button) button2).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) button2).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                if (button3 instanceof Button) {
                    ((Button) button3).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) button3).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                if (buttonExit instanceof Button) {
                    ((Button) buttonExit).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) buttonExit).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                break;
            default:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_1));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_1));
                }
                if (button1 instanceof Button) {
                    ((Button) button1).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) button1).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                if (button2 instanceof Button) {
                    ((Button) button2).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) button2).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                if (button3 instanceof Button) {
                    ((Button) button3).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) button3).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                if (buttonExit instanceof Button) {
                    ((Button) buttonExit).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) buttonExit).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                break;
        }
    }



    //custom_dialog_layout

    protected void setCustomDialogLayoutTheme(Object background, Object heading, Object button1, Object button2){
        switch (GameLogic.theme) {
            case 2:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_2));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_2));
                }
                if (button1 instanceof Button) {
                    ((Button) button1).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) button1).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                if (button2 instanceof Button) {
                    ((Button) button2).setBackgroundColor(getResources().getColor(R.color.button_background_2));
                    ((Button) button2).setTextColor(getResources().getColor(R.color.button_text_2));
                }
                break;
            case 3:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_3));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_3));
                }
                if (button1 instanceof Button) {
                    ((Button) button1).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) button1).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                if (button2 instanceof Button) {
                    ((Button) button2).setBackgroundColor(getResources().getColor(R.color.button_background_3));
                    ((Button) button2).setTextColor(getResources().getColor(R.color.button_text_3));
                }
                break;
            default:
                if (background instanceof View) {
                    ((View) background).setBackgroundColor(getResources().getColor(R.color.background_Main_1));
                }
                if (heading instanceof TextView) {
                    ((TextView) heading).setTextColor(getResources().getColor(R.color.text1_1));
                }
                if (button1 instanceof Button) {
                    ((Button) button1).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) button1).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                if (button2 instanceof Button) {
                    ((Button) button2).setBackgroundColor(getResources().getColor(R.color.button_background_1));
                    ((Button) button2).setTextColor(getResources().getColor(R.color.button_text_1));
                }
                break;
        }
    }
}