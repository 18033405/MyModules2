package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView TvShow3;
    TextView TvShow4;
    TextView TvShow5;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            TvShow3 = findViewById(R.id.textView);
            TvShow4 = findViewById(R.id.textView);
            Intent intentReceived = getIntent();

            int value = intentReceived.getIntExtra("value",0) ;

            TvShow3.setText("Academicc Year: "+ value);

            TvShow3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getBaseContext(), ModuleDetailActivity.class);

                    intent.putExtra("value", "2018");
                    startActivity(intent);
                }
            });

            TvShow4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getBaseContext(), ModuleDetailActivity.class);

                    intent.putExtra("value", "");
                    startActivity(intent);
                }
            });

            TvShow5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getBaseContext(), ModuleDetailActivity.class);

                    intent.putExtra("value", "");
                    startActivity(intent);
                }
            });






        }
    }



