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
    boolean firstminus=false, firstdivide=false, firstmultiply=false, firstplus=false, firstpro=false, firstroot=false;

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
            { view2.setText(String.valueOf((int)Double.parseDouble(view2.getText().toString())-(int)Double.parseDouble(view1.getText().toString()))); }
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
            { view2.setText(String.valueOf((int)Double.parseDouble(view2.getText().toString())+(int)Double.parseDouble(view1.getText().toString()))); }
            else view2.setText(String.valueOf(Double.parseDouble(view2.getText().toString())+Double.parseDouble(view1.getText().toString())));
        }
    }

    public void AC(View view)
    {
        Operations.start=0;
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
            Operations.Operation(point, firstpro, view1);
            Operations.option="pro";
        }
    }

    public void Root(View view)
    {
        if(view1.getText().toString().equals("") || view1.getText().toString().equals("0"))
        Toast.makeText(getApplicationContext(), "You can't use that with 0 or empty field!", Toast.LENGTH_SHORT).show();
        else
        {
            Operations.Operation(point, firstroot, view1);
            Operations.option="root";
        }
    }

    public void Seven(View view)
    {
        runOnUiThread(new Runnable()
        {
            public void run()
            {
                view1.append("7");
                Operations.Numbers(view1);
            }
        });
    }

    public void Eight(View view)
    {
        runOnUiThread(new Runnable()
        {
            public void run()
            {
                view1.append("8");
                Operations.Numbers(view1);
            }
        });
    }

    public void Nine(View view)
    {
        runOnUiThread(new Runnable()
        {
            public void run()
            {
                view1.append("9");
                Operations.Numbers(view1);
            }
        });
    }

    public void Four(View view)
    {
        runOnUiThread(new Runnable()
        {
            public void run()
            {
                view1.append("4");
                Operations.Numbers(view1);
            }
        });
    }

    public void Five(View view)
    {
        runOnUiThread(new Runnable()
        {
            public void run()
            {
                view1.append("5");
                Operations.Numbers(view1);
            }
        });
    }

    public void Six(View view)
    {
        runOnUiThread(new Runnable()
        {
            public void run()
            {
                view1.append("6");
                Operations.Numbers(view1);
            }
        });
    }

    public void One(View view)
    {
        runOnUiThread(new Runnable()
        {
            public void run()
            {
                view1.append("1");
                Operations.Numbers(view1);
            }
        });
    }

    public void Two(View view)
    {
        runOnUiThread(new Runnable()
        {
            public void run()
            {
                view1.append("2");
                Operations.Numbers(view1);
            }
        });
    }

    public void Three(View view)
    {
        runOnUiThread(new Runnable()
        {
            public void run()
            {
                view1.append("3");
                Operations.Numbers(view1);
            }
        });
    }

    public void Zero(View view)
    {
        runOnUiThread(new Runnable()
        {
            public void run()
            {
                view1.append("0");
                Operations.Numbers(view1);
            }
        });
    }

    public void Divide(View view)
    {
        if(view1.getText().toString().equals("") || view1.getText().toString().equals("0"))
        Toast.makeText(getApplicationContext(), "You can't use that with 0 or empty field!", Toast.LENGTH_SHORT).show();
        else
        {
            Operations.Operation(point, firstdivide, view1);
            Operations.option="divide";
        }
    }

    public void Multiply(View view)
    {
        if(view1.getText().toString().equals("") || view1.getText().toString().equals("0"))
        Toast.makeText(getApplicationContext(), "You can't use that with 0 or empty field!", Toast.LENGTH_SHORT).show();
        else
        {
            Operations.Operation(point, firstmultiply, view1);
            Operations.option="multiply";
        }
    }

    public void Minus(View view)
    {
        if(view1.getText().toString().equals("")) Toast.makeText(getApplicationContext(), "You can't use the Minus button now!", Toast.LENGTH_SHORT).show();
        else
        {
            Operations.Operation(point, firstminus, view1);
            Operations.option="minus";
        }
    }

    public void Plus(View view)
    {
        if(view1.getText().toString().equals("")) Toast.makeText(getApplicationContext(), "You can't use the Plus button now!", Toast.LENGTH_SHORT).show();
        else
        {
            Operations.Operation(point, firstplus, view1);
            Operations.option="plus";
        }
    }

    public void Equal(final View view)
    {
        if(view1.getText().toString().equals("")) Toast.makeText(getApplicationContext(), "You can't use the Equal button now!", Toast.LENGTH_SHORT).show();
        else
        {
            runOnUiThread(new Runnable()
            {
                public void run()
                {
                    if ((Operations.start == Math.floor(Operations.start)) && !Double.isInfinite(Operations.start))
                    { view1.setText(String.valueOf((int) (Operations.start))); }
                    else view1.setText(Operations.start + "");
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