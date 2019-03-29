package edu.mx.tesoem.itics.alan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    TextView bienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle parametros = this.getIntent().getExtras();

        bienvenida = (TextView) findViewById(R.id.textView);
        bienvenida.setText("Bienvenido "+parametros.getString("nombre").toString());

    }
}
