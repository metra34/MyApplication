package com.example.artem.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.artem.myapplication.R.id.button;
import com.example.artem.myapplication.MyMath;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button m1;
    private MyMath mathy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        m1 = (Button) findViewById(button);


        m1.setOnClickListener(new View.OnClickListener() {

            public void onClick (View view){

                EditText m5 = (EditText) findViewById(R.id.editText);
                TextView m2 = (TextView) findViewById(R.id.textView);
                String result = "";
                int r;

                try{
                    r = Integer.parseInt(m5.getText().toString()) + (int) Math.round(Math.random() * 100.00);
                    result = Integer.toString(r);
                }catch (Exception e){
                    System.out.println ("No number");
                }

                m2.setText((CharSequence) result);
                m5.setText("");

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void DisplayResult (String in){

    }
}
