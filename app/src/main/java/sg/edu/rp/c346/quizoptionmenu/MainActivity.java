package sg.edu.rp.c346.quizoptionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.Table) {
            Toast.makeText(this, "Table Selected", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.Chair) {
            Toast.makeText(this, "Chair Selected", Toast.LENGTH_SHORT).show();
            return true;
        }else  {
            Toast.makeText(this, "Id doesnt exist", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}