package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ConePage extends AppCompatActivity {

    EditText ValueOfR;
    EditText ValueOfH;
    Button Calculate;
    TextView ConeAnswer;
    RadioGroup RadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone_page);

        ValueOfR = findViewById(R.id.ValueOfR);
        ValueOfH = findViewById(R.id.ValueOfH);
        Calculate = findViewById(R.id.Calculate);
        ConeAnswer = findViewById(R.id.ConeAnswer);
        RadioGroup = findViewById(R.id.radioGroup);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float ValueOfRNum;
                Float ValueOfHNum;
                String ConeText;

                ValueOfRNum = Float.parseFloat(ValueOfR.getText().toString());
                ValueOfHNum = Float.parseFloat(ValueOfH.getText().toString());
                float ConeAnswerNum = (float) (((ValueOfRNum * ValueOfRNum) * 3.1416) * ValueOfHNum)/3;
                ConeText = String.valueOf(ConeAnswerNum);


                if (RadioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(),"Please Select a Measurement", Toast.LENGTH_SHORT).show();
                }

                switch (RadioGroup.getCheckedRadioButtonId())
                {
                    case R.id.radioButton : ConeAnswer.setText("V = "+ConeText+" in³");
                        break;

                    case R.id.radioButton2 : ConeAnswer.setText("V = "+ConeText+" ft³");
                        break;

                    case R.id.radioButton3 : ConeAnswer.setText("V = "+ConeText+" cm³");
                        break;

                    case R.id.radioButton4 : ConeAnswer.setText("V = "+ConeText+" m³");
                        break;
                }

            }
        });
    }
}