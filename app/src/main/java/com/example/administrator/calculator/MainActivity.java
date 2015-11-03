package com.example.administrator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = (TextView)findViewById(R.id.screen);
        i=j=0;
        f="";
        r=0;
    }

    int a, b, r, i, j, finalResul;
    TextView s;
    String f;

    public void equal(View view)
    {
        a=Integer.parseInt(f.substring(0,j));
        b=Integer.parseInt(f.substring(j));

        if(r==1) finalResul = a+b;
        else if(r==2) finalResul = a-b;
        else if(r==3) finalResul = a*b;
        else if(r==4) finalResul = a/b;

        s.setText(""+finalResul);
    }

    public void bD(View view)
    {
        s.append("/");
        j=i;
        r=4;
    }

    public void bM(View view)
    {
        s.append("*");
        j=i;
        r=3;
    }

    public void bS(View view)
    {
        s.append("-");
        j=i;
        r=2;
    }

    public void bA(View view)
    {
        s.append("+");
        j=i;
        r=1;
    }

    public void b1(View view)
    {
        s.append("1");
        f+="1";
        i++;
    }

    public void b2(View view)
    {
        s.append("2");
        f+="2";
        i++;
    }

    public void b3(View view)
    {
        s.append("3");
        f+="3";
        i++;
    }

    public void b4(View view)
    {
        s.append("4");
        f+="4";
        i++;
    }

    public void b5(View view)
    {
        s.append("5");
        f+="5";
        i++;
    }

    public void b6(View view)
    {
        s.append("6");
        f+="6";
        i++;
    }

    public void b7(View view)
    {
        s.append("7");
        f+="7";
        i++;
    }

    public void b8(View view)
    {
        s.append("8");
        f+="8";
        i++;
    }

    public void b9(View view)
    {
        s.append("9");
        f+="9";
        i++;
    }

    public void b0(View view)
    {
        s.append("0");
        f+="0";
        i++;
    }

    public void bBC(View view)
    {
        i--;
        s.setText(f.substring(0, i));
        f=f.substring(0, i);
    }

    public void bClr(View view)
    {
        s.setText("");
        i=j=0;
        f="";
        r=0;
    }
}
