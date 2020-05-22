package com.app7;
import android.widget.Button;
import android.widget.TextView;

public class Operations
{
    public static double start;
    public static String option="else";

    public static void Operation(Button point, boolean bool, TextView view)
    {
        point.setEnabled(true);
        view.setText("");
        bool=false;
    }

    public static void Numbers(TextView view)
    {
        switch(option)
        {
            case "else":
                start=Double.parseDouble(view.getText().toString());
                break;

            case "plus":
                start+=Double.parseDouble(view.getText().toString());
                option="else";
                break;

            case "minus":
                start-=Double.parseDouble(view.getText().toString());
                option="else";
                break;

            case "multiply":
                start*=Double.parseDouble(view.getText().toString());
                option="else";
                break;

            case "divide":
                start/=Double.parseDouble(view.getText().toString());
                option="else";
                break;

            case "root":
                start=Math.sqrt(Double.parseDouble(view.getText().toString()));
                option="else";
                break;

            case "pro":
                start%=Double.parseDouble(view.getText().toString());
                option="else";
                break;
        }
    }
}