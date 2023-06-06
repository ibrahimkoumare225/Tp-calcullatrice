package com.koumare.somme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText note1,note2,somme;
    TextView nbre1,nbre2,resultat;
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        note1 = findViewById(R.id.note1);
        note2 = findViewById(R.id.note2);
        somme = findViewById(R.id.somme);
        nbre1 = findViewById(R.id.nbre1);
        nbre2 = findViewById(R.id.nbre2);
        resultat = findViewById(R.id.resultat);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
    }


    //fonction button qui renvoie multiplication
    public void onButtonMultiplierClicked(View v){
        String txtNote1 = note1.getText().toString().trim();

        String txtNote2 = note2.getText().toString().trim();





        // on Verifie que l'utilisateur a saisir la valeur  de note 1

        if(txtNote1.isEmpty()){
            note1.setError("Veuillez saisir la valeur du nombre1");
            note1.requestFocus();
            return;
        }

        // on Verifie que l'utilisateur a saisir la valeur  de note 2

        if(txtNote2.isEmpty()){
            note2.setError("Veuillez saisir la valeur du nombre2");
            note2.requestFocus();
            return;
        }

        int txtn1, txtn2,somfi;
        try {
            txtn1 = Integer.parseInt(txtNote1);
            txtn2 = Integer.parseInt(txtNote2);
        } catch (NumberFormatException e) {
            // Gérer l'exception si les champs contiennent des valeurs non numériques
            e.printStackTrace(); // Afficher les détails de l'erreur dans la console
            return; // Arrêter l'exécution de la méthode
        }
        if (!txtNote1.isEmpty() && !txtNote2.isEmpty()){
            int som = txtn1 * txtn2;
            somme.setText(String.valueOf(som));
        }

    }


    //fonction button qui renvoie 'addittion
    public void onButtonSommeClicked(View v){
        String txtNote1 = note1.getText().toString().trim();

        String txtNote2 = note2.getText().toString().trim();





        // on Verifie que l'utilisateur a saisir la valeur  de note 1

        if(txtNote1.isEmpty()){
            note1.setError("Veuillez saisir la valeur du nombre1");
            note1.requestFocus();
            return;
        }

        // on Verifie que l'utilisateur a saisir la valeur  de note 2

        if(txtNote2.isEmpty()){
            note2.setError("Veuillez saisir la valeur du nombre2");
            note2.requestFocus();
            return;
        }

        int txtn1, txtn2,somfi;
        try {
            txtn1 = Integer.parseInt(txtNote1);
            txtn2 = Integer.parseInt(txtNote2);
        } catch (NumberFormatException e) {
            // Gérer l'exception si les champs contiennent des valeurs non numériques
            e.printStackTrace(); // Afficher les détails de l'erreur dans la console
            return; // Arrêter l'exécution de la méthode
        }
        if (!txtNote1.isEmpty() && !txtNote2.isEmpty()){
            int som = txtn1 + txtn2;
            somme.setText(String.valueOf(som));
        }

    }


    //fonction button qui renvoie 'la soustraction
    public void onButtonSoustraireClicked(View v){
        String txtNote1 = note1.getText().toString().trim();

        String txtNote2 = note2.getText().toString().trim();





        // on Verifie que l'utilisateur a saisir la valeur  de note 1

        if(txtNote1.isEmpty()){
            note1.setError("Veuillez saisir la valeur du nombre1");
            note1.requestFocus();
            return;
        }

        // on Verifie que l'utilisateur a saisir la valeur  de note 2

        if(txtNote2.isEmpty()){
            note2.setError("Veuillez saisir la valeur du nombre2");
            note2.requestFocus();
            return;
        }

        int txtn1, txtn2,somfi;
        try {
            txtn1 = Integer.parseInt(txtNote1);
            txtn2 = Integer.parseInt(txtNote2);
        } catch (NumberFormatException e) {
            // Gérer l'exception si les champs contiennent des valeurs non numériques
            e.printStackTrace(); // Afficher les détails de l'erreur dans la console
            return; // Arrêter l'exécution de la méthode
        }
        if (!txtNote1.isEmpty() && !txtNote2.isEmpty()){
            int som = txtn1 - txtn2;
            somme.setText(String.valueOf(som));
        }

    }

    //fonction button qui renvoie 'la division de deux nombres
    public void onButtonDiviserClicked(View v){
        String txtNote1 = note1.getText().toString().trim();

        String txtNote2 = note2.getText().toString().trim();





        // on Verifie que l'utilisateur a saisir la valeur  de note 1

        if(txtNote1.isEmpty()){
            note1.setError("Veuillez saisir la valeur du nombre1");
            note1.requestFocus();
            return;
        }

        // on Verifie que l'utilisateur a saisir la valeur  de note 2

        if(txtNote2.isEmpty()){
            note2.setError("Veuillez saisir la valeur du nombre2");
            note2.requestFocus();
            return;
        }

        int txtn1, txtn2,somfi;
        try {
            txtn1 = Integer.parseInt(txtNote1);
            txtn2 = Integer.parseInt(txtNote2);
        } catch (NumberFormatException e) {
            // Gérer l'exception si les champs contiennent des valeurs non numériques
            e.printStackTrace(); // Afficher les détails de l'erreur dans la console
            return; // Arrêter l'exécution de la méthode
        }
        if (!txtNote1.isEmpty() && !txtNote2.isEmpty()){
            int som = txtn1 / txtn2;
            somme.setText(String.valueOf(som));
        }

    }
    public void onButtonResetClicked(View v){
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        note1.setText(String.valueOf(n1));
        note2.setText(String.valueOf(n2));
        somme.setText(String.valueOf(n3));
    }
}