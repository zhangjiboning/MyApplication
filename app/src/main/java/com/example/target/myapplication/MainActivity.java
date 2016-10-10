package com.example.target.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int xxx;

    public MainActivity(){
        super();
        this.xxx=0;

    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button_Onclick_Test(View view) {
        TelephonyManager telephonyManager=(TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
        String imei=telephonyManager.getDeviceId();

        String msg="手机厂商="+ Build.MANUFACTURER+"\n"+"手机型号="+Build.MODEL+"\n"+imei;

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("提示");
        //builder.setMessage("计算结果:" + String.valueOf((testFunction(this.xxx + 5, 6))));
        builder.setMessage(msg);
        builder.setPositiveButton(android.R.string.ok, null);
        builder.create().show();
    }

    public int testFunction(int a,int b){
        return a+b;
    }
}
