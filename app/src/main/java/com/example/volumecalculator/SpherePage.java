package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SpherePage extends AppCompatActivity {

    EditText ValueOfR;
    Button Calculate;
    TextView SphereAnswer;
    RadioGroup RadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_page);

        ValueOfR = findViewById(R.id.ValueOfR);
        Calculate = findViewById(R.id.Calculate);
        SphereAnswer = findViewById(R.id.SphereAnswer);
        RadioGroup = findViewById(R.id.radioGroup);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float ValueOfRNum;
                String SphereText;

                ValueOfRNum = Float.parseFloat(ValueOfR.getText().toString());
                float SphereAnswerNum = (float) ((ValueOfRNum * ValueOfRNum * ValueOfRNum) * 3.1416*4/3);
                SphereText = String.valueOf(SphereAnswerNum);

                if (RadioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(),"Please Select a Measurement", Toast.LENGTH_SHORT).show();
                }

                switch (RadioGroup.getCheckedRadioButtonId())
                {
                    case R.id.radioButton : SphereAnswer.setText("V = "+SphereText+" in³");
                        break;

                    case R.id.radioButton2 : SphereAnswer.setText("V = "+SphereText+" ft³");
                        break;

                    case R.id.radioButton3 : SphereAnswer.setText("V = "+SphereText+" cm³");
                        break;

                    case R.id.radioButton4 : SphereAnswer.setText("V = "+SphereText+" m³");
                        break;
                }

            }
        });
    }
}