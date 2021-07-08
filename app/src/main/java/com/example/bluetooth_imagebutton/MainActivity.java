package com.example.bluetooth_imagebutton;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton i1;
    BluetoothAdapter ba;
    private boolean blue=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageButton)findViewById(R.id.imageButton);
        ba=BluetoothAdapter.getDefaultAdapter();
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blue==false){
                    ba.enable();
                    blue=true;
                    i1.setImageResource(R.drawable.g);
                }else{
                    ba.disable();
                    blue=false;
                    i1.setImageResource(R.drawable.r);

                }
            }
        });
    }
}