package com.liuhuazhi.volvo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.liuhuazhi.volvo.myapplication.menuactivity.ContextMenuActivity;
import com.liuhuazhi.volvo.myapplication.menuactivity.OptionsMenuActivity;
import com.liuhuazhi.volvo.myapplication.menuactivity.PopupMenuActivity;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.options_menu:
                intent = new Intent(MainActivity.this, OptionsMenuActivity.class);
                break;
            case R.id.context_menu:
                intent = new Intent(MainActivity.this, ContextMenuActivity.class);
                break;
            case R.id.popup_menu:
                intent = new Intent(MainActivity.this, PopupMenuActivity.class);
                break;

        }
        startActivity(intent);
    }
}
