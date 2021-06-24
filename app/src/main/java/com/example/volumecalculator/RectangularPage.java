package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RectangularPage extends AppCompatActivity {


    EditText ValueOfL;
    EditText ValueOfW;
    EditText ValueOfH;
    Button Calculate;
    TextView RectangularAnswer;
    RadioGroup RadioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangular_page);

        ValueOfL = findViewById(R.id.ValueOfL);
        ValueOfW = findViewById(R.id.ValueOfW);
        ValueOfH = findViewById(R.id.ValueOfH);
        Calculate = findViewById(R.id.Calculate);
        RectangularAnswer = findViewById(R.id.RectangularAnswer);
        RadioGroup = findViewById(R.id.radioGroup);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float ValueOfNumL;
                float ValueOfNumW;
                float ValueOfNumH;
                float RectangularAnswerNum;
                String RectangularText;

                ValueOfNumL = Float.parseFloat(ValueOfL.getText().toString());
                ValueOfNumW = Float.parseFloat(ValueOfW.getText().toString());
                ValueOfNumH = Float.parseFloat(ValueOfH.getText().toString());
                RectangularAnswerNum = ValueOfNumL * ValueOfNumW * ValueOfNumH;
                RectangularText = String.valueOf(RectangularAnswerNum);

                if (RadioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(),"Please Select a Measurement", Toast.LENGTH_SHORT).show();
                }

                switch (RadioGroup.getCheckedRadioButtonId())
                {
                    case R.id.radioButton : RectangularAnswer.setText("V = "+RectangularText+" in³");
                        break;

                    case R.id.radioButton2 : RectangularAnswer.setText("V = "+RectangularText+" ft³");
                        break;

                    case R.id.radioButton3 : RectangularAnswer.setText("V = "+RectangularText+" cm³");
                        break;

                    case R.id.radioButton4 : RectangularAnswer.setText("V = "+RectangularText+" m³");
                        break;
                }

            }
        });
    }
}