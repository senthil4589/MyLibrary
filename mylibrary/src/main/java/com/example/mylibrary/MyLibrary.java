package com.example.mylibrary;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class MyLibrary {

    public static void callService(Context context,String requestMessage){
        Intent i = new Intent();
        i.putExtra("message",requestMessage);
        i.setComponent(new ComponentName("com.example.pocserviceapp", "com.example.pocserviceapp.services.ServiceWithHandler"));
        context.startService(i);
    }

}
