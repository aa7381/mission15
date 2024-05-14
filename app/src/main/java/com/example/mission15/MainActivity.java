package com.example.mission15;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn ;
    Switch switch1 ;
    RadioGroup rG ;
    RadioButton rB , rB2 ,rB3 , rB4 ;

    ImageView iV  ;
    int count=0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        switch1 = findViewById(R.id.switch1);
        rB = findViewById(R.id.rB);
        rB2 = findViewById(R.id.rB2);
        rB3 = findViewById(R.id.rB3);
        rB4 = findViewById(R.id.rB4);
        rG = findViewById(R.id.rG);
        iV = findViewById(R.id.iV);


    }

    public void blue(View view)
    {
        count  = 1 ;
        check(count , iV);

    }
    public void red(View view)
    {
        count = 2 ;
        check(count , iV);

    }
    public void yellow(View view)
    {
        count = 3;
        check(count , iV);

    }
    public void green(View view)
    {
        count = 4;
        check(count , iV);
    }

    public void check(int count , ImageView iV )
    {
        if(count == 1 )
        {
            iV.setImageResource(R.drawable.ic_launcher_foreground);

        }
        else if (count ==2 )
        {
            iV.setImageResource(R.drawable.ic_launcher_background);

        }
        else if (count ==3 )
        {
            iV.setImageResource(R.drawable.dog);
        }
        else if (count ==4 )
        {
            iV.setImageResource(R.drawable.banana);
        }
    }
    public void switch2(View view)
    {
        if(switch1.isChecked()) {
            count = 1;
        }
        else if(!switch1.isChecked())
            count =2;
    }



    
        public void change(View view)
        {
            if(switch1.isChecked())
            {
                check(count , iV);

            }else if(!switch1.isChecked())
            {
                    check(count , iV);

            }
        }
}
