package club.plus1.learn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String KEY = "KEY";
    private TextView textView;
    private Button buttonSearch;

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.google.com/search?q="+textView.getText()));
            startActivity(browserIntent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            textView.setText(bundle.getString(KEY));
        }

        buttonSearch = findViewById(R.id.buttonSearch);
        buttonSearch.setOnClickListener(onClickListener);
    }
}
