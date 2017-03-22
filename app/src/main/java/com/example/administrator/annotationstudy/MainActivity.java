package com.example.administrator.annotationstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Class clazz = Class.forName("com.example.administrator.annotationstudy.AnnotationTest");
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation annotation : annotations) {
                Test testA = (Test) annotation;
                Log.d(TAG, String.format("onCreate: name=%s names=%s", testA.value()[0], testA.desc()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
