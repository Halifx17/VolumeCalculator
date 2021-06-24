package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CylinderPage extends AppCompatActivity {

    EditText ValueOfR;
    EditText ValueOfH;
    Button Calculate;
    TextView CylinderAnswer;
    RadioGroup RadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_page);

        ValueOfR = findViewById(R.id.ValueOfR);
        ValueOfH = findViewById(R.id.ValueOfH);
        Calculate = findViewById(R.id.Calculate);
        CylinderAnswer = findViewById(R.id.CylinderAnswer);
        RadioGroup = findViewById(R.id.radioGroup);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float ValueOfRNum;
                Float ValueOfHNum;
                String CylinderText;

                ValueOfRNum = Float.parseFloat(ValueOfR.getText().toString());
                ValueOfHNum = Float.parseFloat(ValueOfH.getText().toString());
                float CylinderAnswerNum = (float) ((ValueOfRNum * ValueOfRNum) * ValueOfHNum * 3.1416);
                CylinderText = String.valueOf(CylinderAnswerNum);

                if (RadioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(),"Please Select a Measurement", Toast.LENGTH_SHORT).show();
                }

                switch (RadioGroup.getCheckedRadioButtonId())
                {
                    case R.id.radioButton : CylinderAnswer.setText("V = "+CylinderText+" in³");
                        break;

                    case R.id.radioButton2 : CylinderAnswer.setText("V = "+CylinderText+" ft³");
                        break;

                    case R.id.radioButton3 : CylinderAnswer.setText("V = "+CylinderText+" cm³");
                        break;

                    case R.id.radioButton4 : CylinderAnswer.setText("V = "+CylinderText+" m³");
                        break;
                }

            }
        });
    }
}