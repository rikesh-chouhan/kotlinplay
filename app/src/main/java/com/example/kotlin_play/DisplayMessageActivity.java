package com.example.kotlin_play;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class DisplayMessageActivity extends AppCompatActivity {

    private int loopCount = 0;
    private Handler handler;
    private UpdateTask updateTask;
    private static final int MAX = 5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        handler = new Handler();
        updateTask = new UpdateTask();

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.displayMessageText);
        textView.setText(message);

    }

    public void sendBack(View button) {
        Log.i("RC", "1 loopCount value: "+loopCount);
        if (loopCount == 0) {
            loopCount++;
            ((EditText) findViewById(R.id.countDownView)).setText(""+loopCount);
            handler.removeCallbacks(updateTask);
            handler.postDelayed(updateTask, 500);
        }
        Toast.makeText(this, "Sending you Back", Toast.LENGTH_SHORT).show();
    }

    private void setText() {
        if (loopCount>= MAX) {
            Log.i("RC", "2 loopCount value: "+loopCount);
            handler.removeCallbacks(updateTask);
            finish();
        } else {
            loopCount++;
            ((EditText) findViewById(R.id.countDownView)).setText(""+loopCount);
            //handler.removeCallbacks(updateTask);
            handler.postDelayed(updateTask, 500);
            Log.i("RC", "3 loopCount value: "+loopCount);
        }
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        findViewById(R.id.sendBack).setOnClickListener(this::sendBack);
    }

    class UpdateTask implements Runnable {
        public void run() {
            Log.i("RC", "In the loop");

            /*
            long millis = System.currentTimeMillis() - loopCount;
            int seconds = (int) (millis / 1000);
            int minutes = seconds / 60;
            seconds     = seconds % 60;
            timeLabel.setText(String.format("%d:%02d", minutes, seconds));
            */
            setText();
        }
    }
}
