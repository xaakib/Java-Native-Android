package com.example.myapplication;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity  {
   Button firstBotton,secoundButton;
    TextView textViews,textView2;
    int count = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstBotton = (Button) findViewById(R.id.bottonClick);
        textViews =  (TextView) findViewById(R.id.textViews);

        secoundButton = (Button) findViewById(R.id.bottonClick2);
        textView2 = (TextView) findViewById(R.id.textViews2);




      firstBotton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              count ++;
              textViews.setText("Hi"+count);
              if (count >= 10){
                  count = 0;
                  
              }
          }
      });
      secoundButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              count --;

              textView2.setText("Xaakin"+count);
              if (count <= 0){
                  textView2.setText("minus not avilable" + count);
                  count =0;
              }


          }
      });





    }


}
