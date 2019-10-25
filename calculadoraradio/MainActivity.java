package com.example.antonioperea.calculadoraradio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity
  extends AppCompatActivity
{
  private EditText et1;
  private EditText et2;
  private RadioButton rb1;
  private RadioButton rb2;
  private RadioButton rb3;
  private RadioButton rb4;
  private TextView tv1;
  
  public void Calcular(View paramView)
  {
    paramView = et1.getText().toString();
    String str = et2.getText().toString();
    double d1 = Double.parseDouble(paramView);
    double d2 = Double.parseDouble(str);
    if (rb1.isChecked() == true)
    {
      tv1.setText(String.valueOf(d1 + d2));
      return;
    }
    if (rb2.isChecked() == true)
    {
      tv1.setText(String.valueOf(d1 - d2));
      return;
    }
    if (rb3.isChecked() == true)
    {
      tv1.setText(String.valueOf(d1 * d2));
      return;
    }
    if (rb4.isChecked() == true)
    {
      d1 /= d2;
      tv1.setText(String.valueOf(d1));
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131296284);
    et1 = ((EditText)findViewById(2131165332));
    et2 = ((EditText)findViewById(2131165333));
    tv1 = ((TextView)findViewById(2131165331));
    rb1 = ((RadioButton)findViewById(2131165283));
    rb2 = ((RadioButton)findViewById(2131165282));
    rb3 = ((RadioButton)findViewById(2131165281));
    rb4 = ((RadioButton)findViewById(2131165280));
  }
}

/* Location:
 * Qualified Name:     com.example.antonioperea.calculadoraradio.MainActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */