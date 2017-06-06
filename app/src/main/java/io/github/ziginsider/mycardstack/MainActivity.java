package io.github.ziginsider.mycardstack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    Button but_vertical;
    Button but_horizontal;
    Button but_both;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but_vertical = (Button) findViewById(R.id.vertical);
        but_horizontal = (Button) findViewById(R.id.horizontal);
        but_both = (Button) findViewById(R.id.both);

        initPressButtonVertical();
        initPressButtonHorizontal();
        initPressButtonBoth();

    }

    private void initPressButtonBoth() {
        but_both.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), BothCardStackActivity.class));
            }
        });
    }

    private void initPressButtonHorizontal() {
        but_horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), HorizontalCardStackActivity.class));
            }
        });
    }

    private void initPressButtonVertical() {
        but_vertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),VerticalCardStackActivity.class));
            }
        });
    }


}
