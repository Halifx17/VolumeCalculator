package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CubePage extends AppCompatActivity {



    EditText ValueOfA;
    Button Calculate;
    TextView CubeAnswer;
    RadioGroup RadioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_page);

        ValueOfA = findViewById(R.id.ValueOfA);
        Calculate = findViewById(R.id.Calculate);
        CubeAnswer = findViewById(R.id.CubeAnswer);
        RadioGroup = findViewById(R.id.radioGroup);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float ValueOfANum;
                float CubeAnswerNum;
                String CubeText;

                ValueOfANum = Float.parseFloat(ValueOfA.getText().toString());
                CubeAnswerNum = ValueOfANum * ValueOfANum * ValueOfANum;
                CubeText = String.valueOf(CubeAnswerNum);
                if (RadioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(),"Please Select a Measurement", Toast.LENGTH_SHORT).show();
                }

                switch (RadioGroup.getCheckedRadioButtonId())
                {
                    case R.id.radioButton : CubeAnswer.setText("V = "+CubeText+" in³");
                    break;

                    case R.id.radioButton2 : CubeAnswer.setText("V = "+CubeText+" ft³");
                    break;

                    case R.id.radioButton3 : CubeAnswer.setText("V = "+CubeText+" cm³");
                    break;

                    case R.id.radioButton4 : CubeAnswer.setText("V = "+CubeText+" m³");
                    break;
                }

            }
        });
    }
}