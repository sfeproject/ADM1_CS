package com.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // attributs graphiques
   
   
    // un adapter pour les deux spinners
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initGraphique();
    }
    private void initGraphique() {
        initComposants();
        remplir();
        ajouterEcouteur();
    }
    private void initComposants() {
        spSource = (Spinner) findViewById(R.id.spSource);
        spCible = (Spinner) findViewById(R.id.spCible);
        edValeur = (EditText) findViewById(R.id.edValeur);
        btConvertir = (Button) findViewById(R.id.btnConvertir);
        tvResultat = (TextView) findViewById(R.id.tvResultat);
    }
    private void remplir() {
        
    }
    private void ajouterEcouteur() {
      

    }




    protected void convertir() {
       
    }
    private int evaluerValeur() {
        int resultat = -1;
       
        return resultat;
    }
    private String getResultat(int valeur) {
        String strResultat = "";
      
        return strResultat;
    }
}
