package com.example.antonioperea.alumnos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity
  extends AppCompatActivity
{
  private EditText et1;
  private EditText et2;
  private EditText et3;
  private TextView tv1;
  
  public void Evaluar(View paramView)
  {
    paramView = et1.getText().toString();
    Object localObject = et2.getText().toString();
    String str = et3.getText().toString();
    double d = (Double.parseDouble(paramView) + Double.parseDouble((String)localObject) + Double.parseDouble(str)) / 3.0D;
    if (d >= 4.9D)
    {
      paramView = tv1;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Aprobado con una media de ");
      ((StringBuilder)localObject).append(d);
      paramView.setText(((StringBuilder)localObject).toString());
      return;
    }
    paramView = tv1;
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Suspenso con una media de ");
    ((StringBuilder)localObject).append(d);
    paramView.setText(((StringBuilder)localObject).toString());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131296284);
    et1 = ((EditText)findViewById(2131165328));
    et2 = ((EditText)findViewById(2131165327));
    et3 = ((EditText)findViewById(2131165329));
    tv1 = ((TextView)findViewById(2131165326));
  }
}

/* Location:
 * Qualified Name:     com.example.antonioperea.alumnos.MainActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */