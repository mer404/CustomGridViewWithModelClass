package com.example.customgridviewwithmodelclass;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView customGridView;

    ArrayList<CustomClass> myRecord = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();

    }

    private void initView() {

        CustomClass recodOne = new CustomClass();
        recodOne.setImageRecodList(R.drawable.khaby_lame_);
        recodOne.setNameRecodList("PROFILE");
        myRecord.add(recodOne);

        CustomClass recordTwo = new CustomClass();
        recordTwo.setImageRecodList(R.drawable.eventss);
        recordTwo.setNameRecodList("EVENTS");
        myRecord.add(recordTwo);


        CustomClass recordThree = new CustomClass();
        recordThree.setImageRecodList(R.drawable.staff);
        recordThree.setNameRecodList("STAFS");
        myRecord.add(recordThree);

        CustomClass recordFour = new CustomClass();
        recordFour.setImageRecodList(R.drawable.attendenece);
        recordFour.setNameRecodList("ATTENDENCE");
        myRecord.add(recordFour);

        CustomClass recordFive = new CustomClass();
        recordFive.setImageRecodList(R.drawable.chatbox);
        recordFive.setNameRecodList("CHATBOX");
        myRecord.add(recordFive);

        CustomClass recordSix = new CustomClass();
        recordSix.setImageRecodList(R.drawable.gradesheet);
        recordSix.setNameRecodList("GRADESHEET");
        myRecord.add(recordSix);

        CustomClass recordSeven = new CustomClass();
        recordSeven.setImageRecodList(R.drawable.galleryy);
        recordSeven.setNameRecodList("GALLERY");
        myRecord.add(recordSeven);

        CustomClass recordEight = new CustomClass();
        recordEight.setImageRecodList(R.drawable.doller);
        recordEight.setNameRecodList("FREE DETAILS");
        myRecord.add(recordEight);

        CustomClass recordNine = new CustomClass();
        recordNine.setImageRecodList(R.drawable.course);
        recordNine.setNameRecodList("COURSES");
        myRecord.add(recordNine);


        CustomClass recordTen = new CustomClass();
        recordTen.setImageRecodList(R.drawable.subject);
        recordTen.setNameRecodList("SUBJECTS");
        myRecord.add(recordTen);


        customGridView = findViewById(R.id.customGridView);

        CustomGrid customGrid = new CustomGrid(myRecord);
        customGridView.setAdapter(customGrid);
    }
}