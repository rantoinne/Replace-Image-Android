package ravi.mycompany.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Udemy - 18
    public void showTextValueOnToastWhenButtonClicks(View view) {
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        ImageView catImageView = (ImageView) findViewById(R.id.catEditImageView);

        Log.i("Info", "Clicked!");
        Log.i("Value", nameEditText.getText().toString());

        Toast toastHandler = Toast.makeText(this, "Hey " + nameEditText.getText().toString()+ "!", Toast.LENGTH_SHORT);
        toastHandler.show();

        // Also replacing the cat1 image with cat2 dynamically on click
        catImageView.setImageResource(R.drawable.cat2);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}