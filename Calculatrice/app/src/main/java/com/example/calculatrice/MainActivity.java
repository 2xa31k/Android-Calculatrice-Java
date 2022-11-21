package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    boolean parValid=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void equalsAction(View view) {
        TextView resultTextView = findViewById(R.id.calcul);
        String currentText = resultTextView.getText().toString();
        double result=0;

            ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
            try{
                result = (double)engine.eval(currentText);
            }catch(Exception e){
                Toast.makeText(this,"Exception Raised",Toast.LENGTH_SHORT).show();
            }

        TextView finalRes;
        finalRes=findViewById(R.id.results);
        finalRes.setText(String.valueOf(result));
    }

    public void parenthese(View view)
    {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        if(parValid) {
            txt.setText(res + ")");
            parValid=false;
        }
        else {txt.setText(res+"(");
            parValid=true;
        }
    }
    
    public void backSpaceAction(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        String c=txt.getText().toString();
        char lastChar=c.charAt(c.length()-1);
        if (lastChar==')')
            parValid=true;
        if (lastChar=='(')
            parValid=false;
        res = txt.getText().toString().substring(0, txt.length()-1);
        txt.setText(res);
    }

    public void allClearAction(View view) {
        TextView txt;
        txt = findViewById(R.id.calcul);
        txt.setText("");
        parValid=false;
    }
    public void DIV(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"/");
    }

    public void NB7(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"7");
    }

    public void NB8(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"8");
    }

    public void NB9(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"9");
    }

    public void MUL(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"*");
    }

    public void NB6(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"6");
    }

    public void NB5(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"5");
    }

    public void NB4(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"4");
    }

    public void ADD(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"+");
    }

    public void NB3(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"3");
    }

    public void NB2(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"2");
    }

    public void NB1(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"1");
    }

    public void SUS(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"-");
    }

    public void NB0(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        txt.setText(res+"0");
    }

    public void POINT(View view) {
        TextView txt;
        String res;
        txt = findViewById(R.id.calcul);
        res = txt.getText().toString();
        if(res.isEmpty() || res.equals("0") || res.equals("")){
            res="0";
        }
        txt.setText(res+".");
    }

}