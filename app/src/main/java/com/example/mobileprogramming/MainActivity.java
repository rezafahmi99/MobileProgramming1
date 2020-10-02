package com.example.mobileprogramming;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.N;

public class MainActivity extends AppCompatActivity {

    private final int X = 4;
    public static final String up = "up";
    public static final String down = "down";
    public static final String left = "left";
    public static final String right = "right";

    private Button[][] buttons;
    private final int Button_id[][] = {{R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4},
            {R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8},
            {R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12},
            {R.id.btn13, R.id.btn14, R.id.btn15, R.id.btn16}};

    private boolean check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = new Button[X][X];
        for(int i = 0; i < X; i++)
            for(int j = 0; j < X; j++) {
                buttons[i][j] = (Button) this.findViewById(Button_id[i][j]);
                buttons[i][j].setOnClickListener(onClickListener);
            }
    };

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(!check)
                for(int i = 0; i < N; i++)
                    for(int j = 0; j < N; j++)
                        if(v.getId() == Button_id[i][j]);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigationmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.ulangi){
            Intent intent = new Intent(this,KeluarActivity.class);
            startActivity(intent);
        }else if(item.getItemId()==R.id.keluar){
            Intent intent = new Intent(this,KeluarActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}