package primeiroapp.mtusjt.com.br.primeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

/* @autor MATHEUS RIBEIRO*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //constante static para identifcar a mensaaem
    public fnal static String EXTRA_MESSAGE =
            "br.usjt.meuprimeiroapp.MESSAGE";
    //será chamado quando o usuário clicar em Enviar
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText).fndViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);




}
