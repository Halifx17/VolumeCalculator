package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CubeFunction(View view) {
        Intent CubeIntent = new Intent(this, CubePage.class);
        startActivity(CubeIntent);
    }

    public void RectangularFunction(View view) {
        Intent RectangularIntent = new Intent(this, RectangularPage.class);
        startActivity(RectangularIntent);
    }

    public void SphereFunction(View view) {
        Intent SphereIntent = new Intent(this, SpherePage.class);
        startActivity(SphereIntent);
    }

    public void CylinderFunction(View view) {
        Intent CylinderIntent = new Intent(this, CylinderPage.class);
        startActivity(CylinderIntent);
    }

    public void ConeFunction(View view) {
        Intent ConeIntent = new Intent(this, ConePage.class);
        startActivity(ConeIntent);
    }
}