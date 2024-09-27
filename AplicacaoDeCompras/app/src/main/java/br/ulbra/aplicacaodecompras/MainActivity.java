package br.ulbra.aplicacaodecompras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CheckBox chkarroz, chkleite, chkcarne, chkfeijao, chkrefri;
    Button bttotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        chkarroz = (CheckBox) findViewById(R.id.chkarroz);
        chkleite = (CheckBox) findViewById(R.id.chkleite);
        chkcarne = (CheckBox) findViewById(R.id.chkcarne);
        chkfeijao = (CheckBox) findViewById(R.id.chkfeijao);
        chkrefri = (CheckBox) findViewById(R.id.chkrefri);
         bttotal = (Button) findViewById(R.id.bttotal);

         bttotal.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 double total = 0;
                 if(chkarroz.isChecked()) { total += 2.69;}
                 if(chkleite.isChecked()) { total += 5.00;}
                 if(chkcarne.isChecked()) {total += 10.00;}
                 if (chkfeijao.isChecked()) {total += 2.30;}
                 if (chkrefri.isChecked()) {total += 2.00;}

                 AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                 dialogo.setTitle("Aviso");
                 dialogo.setMessage("Valor total da compra: " + String.valueOf(total));
                 dialogo.setNeutralButton("Ok", null);
                 dialogo.show();
             }
         });

    }
}