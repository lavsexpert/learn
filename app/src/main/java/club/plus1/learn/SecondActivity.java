package club.plus1.learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String KEY = "KEY";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            textView.setText(bundle.getString(KEY));
        }
    }
}
