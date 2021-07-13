package com.example.amisha.wifitoggle;

import android.bluetooth.BluetoothAdapter;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    WifiManager w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=(ToggleButton)findViewById(R.id.toggleButton);
        w1=(WifiManager)getSystemService(WIFI_SERVICE);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    w1.setWifiEnabled(true);
                }
                else
                {
                    w1.setWifiEnabled(false);
                }
            }
        });
    }
}
