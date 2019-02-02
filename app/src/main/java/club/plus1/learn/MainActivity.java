package club.plus1.learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        EditText editText = this.findViewById(R.id.editText);
        String text = editText.getText().toString();
        if(!text.isEmpty()) {
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }
    }
}
