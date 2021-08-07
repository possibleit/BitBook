package com.example.possibleit.bitbook.Homepage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.possibleit.bitbook.R;

public class MainActivity extends AppCompatActivity {
    private ImageView list_menu;
    private TextView novel, paint;
    private LinearLayout homepage, bookstore, classify, mine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_menu = findViewById(R.id.list_menu);
        novel = findViewById(R.id.novel);
        paint = findViewById(R.id.paint);

        homepage = findViewById(R.id.homepage);
        bookstore = findViewById(R.id.bookstore);
        classify = findViewById(R.id.classify);
        mine = findViewById(R.id.mine);

        list_menu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Toast.makeText(MainActivity.this, "ListMenu", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        novel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Novel", Toast.LENGTH_LONG).show();
            }
        });

        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "HomePage", Toast.LENGTH_LONG).show();
            }
        });
    }
}
