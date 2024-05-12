package com.lomilka.n; //Движение определяется по вектору между точкой касания и отрыва, в момент отрыва.

import android.util.Log;
import android.view.MotionEvent;

public abstract class SwipeDetector {

    private static final String TAG = "myLOG";// в случае ошибки

    private boolean isStarted = false; //Фиксация "было прикосновение"
    private float startX = 0; // 2 переменные координаты касания
    private float startY = 0;
    private int minTouchLen = 10; //Минимальное движение пальца, чтобы был зафиксирован свайп

    //Метод для взаимодействия, будем вызывать из onTouchEvent
    public abstract void onSwipeDetected (Direction direction);

    public SwipeDetector(int minTouchLen) {
        this.minTouchLen = minTouchLen * 5;
    }

    public boolean onTouchEvent (MotionEvent event) {
        switch (event.getAction()){ //События:
            case MotionEvent.ACTION_DOWN: //Прикосновение
                startX = event.getX();
                startY = event.getY();
                isStarted = true;
                break;
            case MotionEvent.ACTION_MOVE: //Беотрывное движение пальца по экрану
                break;
            case MotionEvent.ACTION_UP: //Точка отрыва
                //Фиксируем вектор и записываем его длину по теореме Пифагора
                float dx = event.getX() - startX;
                float dy = event.getY() - startY;
                if (calcDist (dx, dy) >= minTouchLen) {
                    onSwipeDetected(Direction.get(calcAngle(dx, dy)));//В конце идет вызов метода
                }
                startY = startX = 0;//Обнуление переменных в конце
                isStarted = false;
                break;
            default:
                startY = startX = 0;
                isStarted = false;
                Log.d(TAG, "onTouchEvent: Error");
        }

        return false; //Можно и true
    }

    private int calcAngle(float dx, float dy) { //Подстраиваем получаемые значния для геттера
        return (int) ((Math.atan2(dy, dx) + Math.PI)*180 /Math.PI +180) % 360;
    }

    private double calcDist(float dx, float dy) {
        return Math.sqrt(dx*dx + dy*dy);
    }

    public enum Direction {
        UN_EXPT, //На месте
        LEFT,
        RIGHT,
        UP,
        DOWN;

        public static Direction get (int angle) { //геттер
            Direction res = UN_EXPT;
            if (inRangle(angle, 45, 135)) res = DOWN;
            else if (inRangle(angle, 135, 225)) res = LEFT;
            else if (inRangle(angle, 225, 315)) res = UP;
            else if (inRangle(angle, 315, 360) || inRangle(angle, 0, 45)) res = RIGHT;
            return res;
        }

        private static boolean inRangle (int angle, int min, int max) { //Чтобы сократить предыдущие if else
            return angle >= min && angle <=max;
        }
    }
}
