package com.example.laba10;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Event time!", Toast.LENGTH_SHORT).show();
        // Здесь можно добавить отправку уведомления
    }
}
