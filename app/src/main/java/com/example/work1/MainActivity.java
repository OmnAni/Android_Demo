package com.example.work1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    public List<Phonecall> phonecallList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DefaultItemAnimator animator = new DefaultItemAnimator();
        animator.setAddDuration(500);
        animator.setRemoveDuration(500);


        TextView telnum = (TextView) findViewById(R.id.telnumber);


        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        PhonecallAdapter adapter = new PhonecallAdapter(phonecallList);
        rv.setAdapter(adapter);
        rv.setItemAnimator(animator);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telnum.setText(telnum.getText().toString() + ((Button) v).getText().toString());
            }
        };
        Button buttonDial = (Button) findViewById(R.id.buttondial);

        buttonDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (telnum.getText().toString().length() > 0) {
                    Phonecall newPhonecall = new Phonecall(telnum.getText().toString());
                    phonecallList.add(0, newPhonecall);
                    telnum.setText("");
                    adapter.notifyItemInserted(0);
                    layoutManager.scrollToPosition(0);
                }
            }
        });

        Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(listener);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(listener);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(listener);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(listener);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(listener);

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(listener);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(listener);

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(listener);

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(listener);

        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(listener);

        Button buttonstar = (Button) findViewById(R.id.buttonstar);
        buttonstar.setOnClickListener(listener);

        Button buttonsharp = (Button) findViewById(R.id.buttonsharp);
        buttonsharp.setOnClickListener(listener);

        Button buttonback = (Button) findViewById(R.id.buttonback);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (telnum.getText().toString().length() >= 1) {
                    String str = telnum.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    telnum.setText(str);
                }
            }
        });


    }
}