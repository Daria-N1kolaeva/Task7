package com.example.task77;


import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Timer implements IObserver{
    int setTime;
    Text txt = new Text();
    public Timer(){

    }
    public int counter = 0;
    boolean flag = true;

    Circle circle = new Circle();
    @Override
    public void update() {
        if (flag == true){
            counter++;
        }

        txt.setText(""+ counter);
        if (setTime == counter) {
            txt.setFont(Font.font(40));
            txt.setText("WAKE UP!!!");
            flag = false;

            //circle.setRadius(40);
            //circle.setFill(Color.DARKRED);
        }

    }
}