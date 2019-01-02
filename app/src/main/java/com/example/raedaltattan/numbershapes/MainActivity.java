package com.example.raedaltattan.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void testNumber(View view){
        EditText enternumber = (EditText) findViewById(R.id.usernumber);
        Number mynumber = new Number();
        int enternum = Integer.parseInt(enternumber.getText().toString());
        if(mynumber.isTriangular(enternum)){
            if (mynumber.isSqure(enternum)){Toast.makeText(MainActivity.this, "The number is " + enternum + " its Both", Toast.LENGTH_LONG).show();}
            else { Toast.makeText(MainActivity.this, "The number is " + enternum + " its Triangulare not squer", Toast.LENGTH_LONG).show();}}
            else if (mynumber.isSqure(enternum)){Toast.makeText(MainActivity.this, "The number is " + enternum + " its  squer but not triangulare", Toast.LENGTH_LONG).show();}
            else {Toast.makeText(MainActivity.this, "The number is " + enternum + " its not Triangulare and  not squer", Toast.LENGTH_LONG).show();}
    }

        class Number {
            int number;

            public boolean isSqure(int number) {
                double squreNumber = Math.sqrt(number);
                if (squreNumber == Math.floor(squreNumber)) {
                    return true;
                } else {
                    return false;
                }
            }

            public boolean isTriangular(int number) {

                int x = 1;
                int triangulerNumber = 1;
                while (triangulerNumber < number) {
                    x++;
                    triangulerNumber = triangulerNumber + x;
                }
                if (triangulerNumber == number) {
                    return true;
                } else {
                    return false;
                }
            }
    }
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


            }

}