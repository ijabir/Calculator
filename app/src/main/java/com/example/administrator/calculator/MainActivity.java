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
    }

    int a, b, r;
    TextView s;

    public void equal(View view)
    {

    }

    public void bD(View view)
    {
        s.append("/");
    }

    public void bM(View view)
    {
        s.append("*");
    }

    public void bS(View view)
    {
        s.append("-");
    }

    public void bA(View view)
    {
        s.append("+");
    }

    public void b1(View view)
    {
        s.append("1");
    }

    public void b2(View view)
    {
        s.append("2");
    }

    public void b3(View view)
    {
        s.append("3");
    }

    public void b4(View view)
    {
        s.append("4");
    }

    public void b5(View view)
    {
        s.append("5");
    }

    public void b6(View view)
    {
        s.append("6");
    }

    public void b7(View view)
    {
        s.append("7");
    }

    public void b8(View view)
    {
        s.append("8");
    }

    public void b9(View view)
    {
        s.append("9");
    }

    public void b0(View view)
    {
        s.append("0");
    }

}
