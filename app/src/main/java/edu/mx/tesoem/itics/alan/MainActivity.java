package edu.mx.tesoem.itics.alan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre=(EditText) findViewById(R.id.editText);

    }

    public void llamarpantalla (View v){
        Intent intent = new Intent(this,  SegundaActivity.class);
        intent.putExtra("nombre", txtnombre.getText().toString());
        startActivity(intent);
    }
}
