package com.example.aula7.toolbarprogramacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Pantalla2 extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        toolbar = (Toolbar)findViewById(R.id.id_tb_toolbar);
        showtoolbar("Pantalla2",true);
    }

    public void showtoolbar(String title, boolean upBotton){
        //muestra el tooblar y configura pantalla
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upBotton);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        showPantalla1();
        return super.onOptionsItemSelected(item);


    }
    public void showPantalla1() {
        Intent Pantalla1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(Pantalla1);
    }

}
