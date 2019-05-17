package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TvShow;
    TextView TvShow2;
    TextView TvShow3;
    TextView TvShow4;
    TextView TvShow5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TvShow=findViewById(R.id.textView);
        TvShow2=findViewById(R.id.textView2);
        TvShow3=findViewById(R.id.textView3);
        TvShow4=findViewById(R.id.textView4);
        TvShow5=findViewById(R.id.textView5);

        TvShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ModuleDetailActivity.class);

                intent.putExtra("value", "c346");
                startActivity(intent);
            }
        });

        TvShow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ModuleDetailActivity.class);

                intent.putExtra("value", "");
                startActivity(intent);
            }
        });



    }
}
