package com.example.antonioperea.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity
  extends AppCompatActivity
{
  private EditText et1;
  private EditText et2;
  private TextView tv1;
  
  public void Dividir(View paramView)
  {
    paramView = et1.getText().toString();
    String str = et2.getText().toString();
    double d = Double.parseDouble(paramView) / Double.parseDouble(str);
    tv1.setText(String.valueOf(d));
  }
  
  public void Multiplicar(View paramView)
  {
    paramView = et1.getText().toString();
    String str = et2.getText().toString();
    double d1 = Double.parseDouble(paramView);
    double d2 = Double.parseDouble(str);
    tv1.setText(String.valueOf(d1 * d2));
  }
  
  public void Restar(View paramView)
  {
    paramView = et1.getText().toString();
    String str = et2.getText().toString();
    double d1 = Double.parseDouble(paramView);
    double d2 = Double.parseDouble(str);
    tv1.setText(String.valueOf(d1 - d2));
  }
  
  public void Sumar(View paramView)
  {
    paramView = et1.getText().toString();
    String str = et2.getText().toString();
    double d1 = Double.parseDouble(paramView);
    double d2 = Double.parseDouble(str);
    tv1.setText(String.valueOf(d1 + d2));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131296284);
    paramBundle = (Button)findViewById(2131165218);
    et1 = ((EditText)findViewById(2131165330));
    et2 = ((EditText)findViewById(2131165331));
    tv1 = ((TextView)findViewById(2131165282));
  }
}

/* Location:
 * Qualified Name:     com.example.antonioperea.calculadora.MainActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */