package com.example.firebaseui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private FirebaseUser user;
    private TextView Email;
    private TextView Uid;
    private Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Email = (TextView)findViewById(R.id.textview1);
        Uid = (TextView)findViewById(R.id.textview2);
        auth = FirebaseAuth.getInstance();
        logout = (Button)findViewById(R.id.btn_logout);
        user = auth.getCurrentUser();

        if (user != null){
            String email = user.getEmail();
            String uid = user.getUid();
            Email.setText(email);
            Uid.setText(uid);
        }
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}

