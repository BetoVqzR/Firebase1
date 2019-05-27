package com.example.firebase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private TextView mTxtNombre;
    private Button mBtnCrear;
    public DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxtNombre = findViewById(R.id.txtNombre);
        mBtnCrear =  findViewById(R.id.btnCrear);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mBtnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nombre = mTxtNombre.getText().toString();
            }
        });


    }
}
