package com.example.crudexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddTodo extends AppCompatActivity {

    EditText title,desc;
    Button add;
    private DBHandler dbHandler;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_todo);

        title=findViewById(R.id.editTextTitle);
        desc=findViewById(R.id.editTextDescription);
        add=findViewById(R.id.buttonEdit);
        context=this;

        dbHandler=new DBHandler(context);
        //button eka click karama title ekei desc ekei dapu values tika gnnawa

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //user input karana data tika gannwa

                String usertitle=title.getText().toString();
                String userDesc=desc.getText().toString();
                long started=System.currentTimeMillis();
//
//                hadapu todo class eke object ekak hadagannwa(model class eke)
                Todo todo=new Todo(usertitle,userDesc,started,0);
                dbHandler.addTodo(todo);

                startActivity(new Intent(context,MainActivity.class));


            }
        });
    }

}


































































