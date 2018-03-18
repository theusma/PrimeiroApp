package primeiroapp.mtusjt.com.br.primeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActvity extends AppCompatActivity {
    /* @autor MATHEUS RIBEIRO*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message =
                intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        ViewGroup layout = (ViewGroup).fndViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
