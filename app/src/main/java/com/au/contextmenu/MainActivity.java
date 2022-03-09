package com.au.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    ConstraintLayout c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv1);
        c=findViewById(R.id.c1);
        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose A Color");
        menu.add(0,v.getId(),0,"Black");
        menu.add(0,v.getId(),0,"Yellow");
        menu.add(0,v.getId(),0,"Red");
        menu.add(0,v.getId(),0,"Blue");

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getTitle()=="Black")
        {
            c.setBackgroundResource(R.drawable.download1);
        }
        if (item.getTitle()=="Yellow")
        {
            c.setBackgroundResource(R.drawable.download2);
        }
        if (item.getTitle()=="Red")
        {
            c.setBackgroundResource(R.drawable.download3);
        }
        if (item.getTitle()=="Blue")
        {
            c.setBackgroundResource(R.drawable.download4);
        }
        return true;
    }
}