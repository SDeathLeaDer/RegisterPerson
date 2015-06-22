package com.aqpup.registerperson;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import model.Person;


public class RegisterActivity extends ActionBarActivity {

    boolean selectSex;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText etName = (EditText)findViewById(R.id.etName);
        final EditText etLastName = (EditText)findViewById(R.id.etLastName);

        context = this;
        RadioGroup rgSex =(RadioGroup)findViewById(R.id.rgSexo);
        RadioButton rbMale =(RadioButton)findViewById(R.id.rbMale);
        RadioButton rbFemale =(RadioButton)findViewById(R.id.rbFemale);

        Button bRegister = (Button) findViewById(R.id.bRegister);

        rgSex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbMale:
                        selectSex = true;
                        break;
                    case R.id.rbFemale:
                        selectSex = false;
                        break;
                }
            }
        });

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person person = new Person(etName.getText().toString(),
                        etLastName.getText().toString(), selectSex);
                Intent i = new Intent(context, WelcomeActivity.class);
               i.putExtra("person",person);
               // i.putExtra("name",etName.getText().toString());
               // i.putExtra("lastName",etLastName.getText().toString());
               // i.putExtra("sex", selectSex);
                startActivity(i);
            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
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
