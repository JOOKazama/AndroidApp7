package com.app7;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    Button mc, mr, m1, m2, ac, c, pro, root, _7, _8, _9, _4, _5, _6, _1, _2, _3, _0, divide, multiply, minus, plus, equal, point;
    TextView view1, saved, view2;
    double start, second;
    String option="else";
    boolean firstminus=true, firstdivide=true, firstmultiply=true, firstplus=true, firstpro=true;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mc=findViewById(R.id.mc);
        mr=findViewById(R.id.mr);
        m1=findViewById(R.id.m1);
        m2=findViewById(R.id.m2);
        ac=findViewById(R.id.ac);
        c=findViewById(R.id.c);
        pro=findViewById(R.id.pro);
        root=findViewById(R.id.root);
        _7=findViewById(R.id._7);
        _8=findViewById(R.id._8);
        _9=findViewById(R.id._9);
        _4=findViewById(R.id._4);
        _5=findViewById(R.id._5);
        _6=findViewById(R.id._6);
        _1=findViewById(R.id._1);
        _2=findViewById(R.id._2);
        _3=findViewById(R.id._3);
        _0=findViewById(R.id._0);
        divide=findViewById(R.id.divide);
        multiply=findViewById(R.id.multiply);
        minus=findViewById(R.id.minus);
        plus=findViewById(R.id.plus);
        equal=findViewById(R.id.equal);
        point=findViewById(R.id.point);
        view1=findViewById(R.id.view);
        saved=findViewById(R.id.saved);
        view2=findViewById(R.id.view2);
        view1.setPadding(30, 10, 30, 10);
        view1.setBackgroundResource(R.drawable.first);
        setTitle("Calculator");
    }

    public void MC(View view) { view2.setText(""); }

    public void MR(View view)
    {
        if(view2.getText().toString().equals("")) Toast.makeText(getApplicationContext(), "No value to use!", Toast.LENGTH_SHORT).show();
        else view1.setText(view2.getText());
    }

    public void MS(View view)
    {
        if(view1.getText().toString().equals("")) Toast.makeText(getApplicationContext(), "You can't store empty value!", Toast.LENGTH_SHORT).show();
        else view2.setText(view1.getText());
    }

    public void M1(View view)
    {
        if(view2.getText().toString().equals("")) Toast.makeText(getApplicationContext(), "You can't subtract from empty value!", Toast.LENGTH_SHORT).show();
        else
        {
            if((Double.parseDouble(view2.getText().toString())-Double.parseDouble(view1.getText().toString())
            ==Math.floor(Double.parseDouble(view2.getText().toString())-Double.parseDouble(view1.getText().toString())))
            &&!Double.isInfinite(Double.parseDouble(view2.getText().toString())-Double.parseDouble(view1.getText().toString())))
            {
                view2.setText(String.valueOf((int)Double.parseDouble(view2.getText().toString())-(int)Double.parseDouble(view1.getText().toString())));
            }
            else view2.setText(String.valueOf(Double.parseDouble(view2.getText().toString())-Double.parseDouble(view1.getText().toString())));
        }
    }

    public void M2(View view)
    {
        if(view2.getText().toString().equals("")) Toast.makeText(getApplicationContext(), "You can't add to empty value!", Toast.LENGTH_SHORT).show();
        else
        {
            if((Double.parseDouble(view2.getText().toString())+Double.parseDouble(view1.getText().toString())
            ==Math.floor(Double.parseDouble(view2.getText().toString())+Double.parseDouble(view1.getText().toString())))
            &&!Double.isInfinite(Double.parseDouble(view2.getText().toString())+Double.parseDouble(view1.getText().toString())))
            {
                view2.setText(String.valueOf((int)Double.parseDouble(view2.getText().toString())+(int)Double.parseDouble(view1.getText().toString())));
            }
            else view2.setText(String.valueOf(Double.parseDouble(view2.getText().toString())+Double.parseDouble(view1.getText().toString())));
        }
    }

    public void AC(View view)
    {
        start=0;
        second=0;
        view1.setText("");
        view2.setText("");
    }

    public void C(View view) { view1.setText(""); }

    public void Pro(View view)
    {
        if(view1.getText().toString().equals("") || view1.getText().toString().equals("0"))
        Toast.makeText(getApplicationContext(), "You can't use that with 0 or empty field!", Toast.LENGTH_SHORT).show();
        else
        {
            point.setEnabled(true);
            if(firstpro)
            {
                start=Double.parseDouble(view1.getText().toString());
                view1.setText("");
                option="pro";
                firstpro=false;
            }
            else
            {
                start%=Double.parseDouble(view1.getText().toString());
                view1.setText("");
            }
        }
    }

    public void Root(View view)
    {
        point.setEnabled(true);
        if(view1.getText().toString().equals("") || view1.getText().toString().equals("0"))
        Toast.makeText(getApplicationContext(), "You can't use that with 0 or empty field!", Toast.LENGTH_SHORT).show();
        else
        {
            start=Math.sqrt(Double.parseDouble(view1.getText().toString()));
            view1.setText(String.valueOf(start));
            option="root";
        }
    }

    public void Seven(View view) { runOnUiThread(new Runnable() { public void run() { view1.append("7"); } }); }
    public void Eight(View view) { runOnUiThread(new Runnable() { public void run() { view1.append("8"); } }); }
    public void Nine(View view) { runOnUiThread(new Runnable() { public void run() { view1.append("9"); } }); }
    public void Four(View view) { runOnUiThread(new Runnable() { public void run() { view1.append("4"); } }); }
    public void Five(View view) { runOnUiThread(new Runnable() { public void run() { view1.append("5"); } }); }
    public void Six(View view) { runOnUiThread(new Runnable() { public void run() { view1.append("6"); } }); }
    public void One(View view) { runOnUiThread(new Runnable() { public void run() { view1.append("1"); } }); }
    public void Two(View view) { runOnUiThread(new Runnable() { public void run() { view1.append("2"); } }); }
    public void Three(View view) { runOnUiThread(new Runnable() { public void run() { view1.append("3"); } }); }
    public void Zero(View view) { runOnUiThread(new Runnable() { public void run() { view1.append("0"); } }); }

    public void Divide(View view)
    {
        if(view1.getText().toString().equals("") || view1.getText().toString().equals("0"))
        Toast.makeText(getApplicationContext(), "You can't use that with 0 or empty field!", Toast.LENGTH_SHORT).show();
        else
        {
            point.setEnabled(true);
            if(firstdivide)
            {
                start=Double.parseDouble(view1.getText().toString());
                view1.setText("");
                option="divide";
                firstdivide=false;
            }
            else
            {
                start/=Double.parseDouble(view1.getText().toString());
                view1.setText("");
            }
        }
    }

    public void Multiply(View view)
    {
        if(view1.getText().toString().equals("") || view1.getText().toString().equals("0"))
        Toast.makeText(getApplicationContext(), "You can't use that with 0 or empty field!", Toast.LENGTH_SHORT).show();
        else
        {
            point.setEnabled(true);
            if(firstmultiply)
            {
                start=Double.parseDouble(view1.getText().toString());
                view1.setText("");
                option="multiply";
                firstmultiply=false;
            }
            else
            {
                start*=Double.parseDouble(view1.getText().toString());
                view1.setText("");
            }
        }
    }

    public void Minus(View view)
    {
        if(view1.getText().toString().equals("")) Toast.makeText(getApplicationContext(), "You can't use that with empty field!", Toast.LENGTH_SHORT).show();
        else
        {
            point.setEnabled(true);
            if(firstminus)
            {
                start=Double.parseDouble(view1.getText().toString());
                view1.setText("");
                option="minus";
                firstminus=false;
            }
            else
            {
                start-=Double.parseDouble(view1.getText().toString());
                view1.setText("");
            }
        }
    }

    public void Plus(View view)
    {
        if(view1.getText().toString().equals("")) Toast.makeText(getApplicationContext(), "You can't use that with empty field!", Toast.LENGTH_SHORT).show();
        else
        {
            point.setEnabled(true);
            if(firstplus)
            {
                start=Double.parseDouble(view1.getText().toString());
                view1.setText("");
                option="plus";
                firstplus=false;
            }
            else
            {
                start+=Double.parseDouble(view1.getText().toString());
                view1.setText("");
            }
        }
    }

    public void Equal(final View view)
    {
        if(view1.getText().toString().equals("") || option.equals("else")) Toast.makeText(getApplicationContext(), "You can't use that now!", Toast.LENGTH_SHORT).show();
        else
        {
            second=Double.parseDouble(view1.getText().toString());
            runOnUiThread(new Runnable()
            {
                public void run()
                {
                    switch(option)
                    {
                        case "plus":
                            if((start+second==Math.floor(start+second)) && !Double.isInfinite(start+second))
                            { view1.setText(String.valueOf((int)(start+second))); }
                            else view1.setText(start+second+"");
                            option="else";
                            firstplus=true;
                            break;

                        case "minus":
                            if((start-second==Math.floor(start-second)) && !Double.isInfinite(start-second))
                            { view1.setText(String.valueOf((int)(start-second))); }
                            else view1.setText(start-second+"");
                            option="else";
                            firstminus=true;
                            break;

                        case "multiply":
                            if((start*second==Math.floor(start*second)) && !Double.isInfinite(start*second))
                            { view1.setText(String.valueOf((int)(start*second))); }
                            else view1.setText(start*second+"");
                            option="else";
                            firstmultiply=true;
                            break;

                        case "divide":
                            if((start/second==Math.floor(start/second)) && !Double.isInfinite(start/second))
                            { view1.setText(String.valueOf((int)(start/second))); }
                            else view1.setText(start/second+"");
                            option="else";
                            firstdivide=true;
                            break;

                        case "root":
                            if((start==Math.floor(start)) && !Double.isInfinite(start))
                            { view1.setText(String.valueOf((int)(start))); }
                            else view1.setText(String.valueOf(start));
                            break;

                        case "pro":
                            if((start%second==Math.floor(start%second)) && !Double.isInfinite(start%second))
                            { view1.setText(String.valueOf((int)(start%second))); }
                            else view1.setText(start%second+"");
                            option="else";
                            firstdivide=true;
                            break;
                    }
                }
            });
        }
    }

    public void Point(View view)
    {
        if(view1.getText().toString().equals("")) Toast.makeText(getApplicationContext(), "You can't use that with empty field!", Toast.LENGTH_SHORT).show();
        else
        {
            runOnUiThread(new Runnable()
            {
                public void run()
                {
                    if(view1.getText().toString().indexOf('.')==-1) view1.append(".");
                    else point.setEnabled(false);
                }
            });
        }

    }
}