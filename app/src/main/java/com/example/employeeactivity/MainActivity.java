package com.example.employeeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText FirstNameET, LastNameET, AgeET, HeightET, WeightET;
    TextView FirstNameDisplayTV, LastNameDisplayTV, AgeDisplayTV, HeightDisplayTV, WeightDisplayTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.FirstNameET = this.findViewById(R.id.FirstNameET);
        this.LastNameET = this.findViewById(R.id.LastNameET);
        this.AgeET = this.findViewById(R.id.AgeET);
        this.HeightET = this.findViewById(R.id.HeightET);
        this.WeightET = this.findViewById(R.id.WeightET);

        this.FirstNameDisplayTV = this.findViewById(R.id.FirstNameDisplayTV);
        this.LastNameDisplayTV = this.findViewById(R.id.LastNameDisplayTV);
        this.AgeDisplayTV = this.findViewById(R.id.AgeDisplayTV);
        this.HeightDisplayTV = this.findViewById(R.id.HeightDisplayTV);
        this.WeightDisplayTV = this.findViewById(R.id.WeightDisplayTV);

    }

    public void onSubmitButtonPressed(View v)
    {

        String fName = this.FirstNameET.getText().toString();
        String lName = this.LastNameET.getText().toString();
        int age = Integer.parseInt(this.AgeET.getText().toString());
        int height = Integer.parseInt(this.HeightET.getText().toString());
        int weight = Integer.parseInt(this.WeightET.getText().toString());

        Employee newEmployee = new Employee(fName,lName,age,height,weight);


        FirstNameDisplayTV.setText(newEmployee.firstName);
        LastNameDisplayTV.setText(newEmployee.lastName);
        AgeDisplayTV.setText(""+ newEmployee.age);
        HeightDisplayTV.setText(""+ newEmployee.height);
        WeightDisplayTV.setText(""+ newEmployee.weight);

    }
}
