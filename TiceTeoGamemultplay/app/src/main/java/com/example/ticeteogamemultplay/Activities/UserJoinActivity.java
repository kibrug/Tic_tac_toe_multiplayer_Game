package com.example.ticeteogamemultplay.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ticeteogamemultplay.MainActivity;
import com.example.ticeteogamemultplay.R;

public class UserJoinActivity extends AppCompatActivity {
    Button button_join_play;
    EditText first_user,second_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_join);
        button_join_play = findViewById(R.id.button_join);
        first_user = findViewById(R.id.user_one);
        second_user = findViewById(R.id.user_two);


        button_join_play.setOnClickListener(
                new View.OnClickListener() {
           @Override
          public void onClick(View v) {

         String first_one=      first_user.getText().toString();
         String second_tone=      second_user.getText().toString();


               if(first_one==null){
                   Intent intent=new Intent(getApplicationContext(), UserJoinActivity.class);
                   Toast.makeText(UserJoinActivity.this, "Pleas  Enter Player Name", Toast.LENGTH_SHORT).show();
                   startActivity(intent);


               }
               else if(second_tone==null){
                   Intent intent=new Intent(getApplicationContext(), UserJoinActivity.class);
                   Toast.makeText(UserJoinActivity.this, "Pleas  Enter Player Name", Toast.LENGTH_SHORT).show();
                   startActivity(intent);
               }
               else  if(first_one==null && second_tone==null){
                   Intent intent=new Intent(getApplicationContext(), UserJoinActivity.class);
                   Toast.makeText(UserJoinActivity.this, "Pleas  Enter Player Name", Toast.LENGTH_SHORT).show();
                   startActivity(intent);

               }
               else {
                   Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                   intent.putExtra("userone",first_one);
                   intent.putExtra("usertwo",second_tone);
                   startActivity(intent);

               }



         }
       }

        );
    }
}