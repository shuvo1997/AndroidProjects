package com.example.javameetui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int value = 0;
    private Button btnAdd;
    private Button btnTake;
    private TextView txtValue;
    private Button btnGrow;
    private Button btnShrink;
    private Button btnReset;
    private Button btnHide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button)findViewById(R.id.btnadd);
        btnTake = (Button)findViewById(R.id.btntake);
        btnGrow = (Button)findViewById(R.id.btngrow);
        btnShrink = (Button)findViewById(R.id.btnshrink);
        btnReset = (Button)findViewById(R.id.btnreset);
        btnHide = (Button) findViewById(R.id.btnhide);
        txtValue = (TextView) findViewById(R.id.txtValue);

        btnAdd.setOnClickListener(this);
        btnTake.setOnClickListener(this);
        txtValue.setOnClickListener(this);
        btnGrow.setOnClickListener(this);
        btnShrink.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnHide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        float size;
        switch (view.getId()){
            case R.id.btnadd:
                value++;
                txtValue.setText(""+value);
                break;
            case R.id.btntake:
                value--;
                txtValue.setText(""+value);
                break;
            case R.id.btnreset:
                value = 0;
                txtValue.setText(""+value);
                break;
            case R.id.btngrow:
                size = txtValue.getTextScaleX();
                txtValue.setTextScaleX(size+1);
                break;
            case R.id.btnshrink:
                size = txtValue.getTextScaleX();
                txtValue.setTextScaleX(size-1);
                break;
            case R.id.btnhide:
                if(txtValue.getVisibility() == View.VISIBLE){
                    txtValue.setVisibility(View.INVISIBLE);
                    btnHide.setText("SHOW");
                }
                else{
                    txtValue.setVisibility(View.VISIBLE);
                    btnHide.setText("HIDE");
                }
        }

    }
}
