package com.aqpup.registerperson;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import model.Person;


public class WelcomeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

//        String name = getIntent().getStringExtra("name");
//        String lastName = getIntent().getStringExtra("lastName");
//        Boolean bSex = getIntent().getBooleanExtra("sex", true);

        Person person = (Person) getIntent().getSerializableExtra("person");

        TextView tvResult =(TextView)findViewById(R.id.tvContent);
        String sex = null;

        if(person.getSex() == true){
            sex = "Masculino";
        }else{
            sex = "Femenino";
        }
        tvResult.setText(person.getName()+" "+person.getLastName() +" "+ sex);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
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
}
