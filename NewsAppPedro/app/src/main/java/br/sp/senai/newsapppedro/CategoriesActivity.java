package br.sp.senai.newsapppedro;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class CategoriesActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;

    private CircleImageView business;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        toolbar = findViewById(R.id.toobar);
        toolbar.setTitle("Categories");

        // Instanciar o circle business
        // E atribuir um ouvinte de click


        business = findViewById(R.id.business);
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoriesActivity.this, FeedActivity.class);
                startActivity(intent);
            }
        });

        /* Criar o botão para exibir o drawerLayout */
        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer((GravityCompat.START));
        } else{
            super.onBackPressed();
        }
    }
}
