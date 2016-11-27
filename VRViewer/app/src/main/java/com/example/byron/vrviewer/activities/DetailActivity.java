package com.example.byron.vrviewer.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.byron.vrviewer.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DetailActivity extends AppCompatActivity {

    private DatabaseReference mPostReference;
    private String postRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        postRef = getIntent().getStringExtra("postRef");
        mPostReference = FirebaseDatabase.getInstance().getReference().child("posts").child(postRef);
    }
}