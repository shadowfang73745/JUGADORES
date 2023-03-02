package com.example.jugadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView Muestra;
    Spinner Lista;
    List<plantillaoriginMadrid> Inicial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Muestra = findViewById(R.id.Muestra);
        Lista = findViewById(R.id.lista);
        String[] Madrid = {"Seleccione", "Porteros", "Defensas", "Mediocampistas", "Delanteros"};
        ArrayAdapter<String> Bepod = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Madrid);

        Lista.setAdapter(Bepod);
        Lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                plan();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void plan() {
        String opcion;
        opcion = Lista.getSelectedItem().toString();
        // Establecemos un switch
        switch (opcion){
            // Si la persona selecciona el dato tipo String,
            // escoge "Seleccione" entra en el caso "Seleccione",
            // Se mostrarán todos los jugadores.
            case "Seleccione":
                // Creamos un arreglo
                Inicial = new ArrayList<>();
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.courtois,
                                        "Marc Courtois",
                                        "Madrid",
                                        "Portero",
                                        "1",
                                        "11 de mayo de 1992",
                                        "Bélgica"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.lunin,
                                        "Andriy Oleksiyovych Lunin",
                                        "Madrid",
                                        "Portero",
                                        "13",
                                        "2 de marzo de 1999",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.carvajal,
                                        "Daniel Carvajal Ramos",
                                        "Madrid",
                                        "Defensa",
                                        "2",
                                        "11 de enero de 1992 ",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.emiliatao,
                                        "Éder Gabriel Militão",
                                        "Madrid",
                                        "Defensa",
                                        "3",
                                        "18 de enero de 1998",
                                        "Brasil"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.alaba,
                                        "David Olatukunbo Alaba",
                                        "Madrid",
                                        "Defensa",
                                        "4",
                                        "24 de junio de 1992",
                                        "Australia"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.vallejo,
                                        "Jesús Vallejo Lázaro",
                                        "Madrid",
                                        "Defensa",
                                        "5",
                                        "5 de enero de 1997",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.nacho,
                                        "José Ignacio Fernández Iglesias",
                                        "Madrid",
                                        "Defensa",
                                        "6",
                                        "18 de enero de 1990",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.odriozola,
                                        "Álvaro Odriozola Arzallus",
                                        "Madrid",
                                        "Defensa",
                                        "16",
                                        "14 de diciembre de 1995",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.lucas,
                                        "Lucas Vázquez Iglesias",
                                        "Madrid",
                                        "Defensa",
                                        "17",
                                        "1 de julio de 1991",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.rudiger,
                                        "Antonio Rüdiger",
                                        "Madrid",
                                        "Defensa",
                                        "22",
                                        " 3 de marzo de 1993",
                                        "Alemania"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.fmendy,
                                        "Ferland Sinna Mendy",
                                        "Madrid",
                                        "Defensa",
                                        "23",
                                        "8 de junio de 1995",
                                        "Francia"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.kroos,
                                        "Toni Kroos",
                                        "Madrid",
                                        "Mediocampista",
                                        "8",
                                        " 4 de enero de 1990",
                                        "Alemania"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.modric,
                                        "Luka Modrić",
                                        "Madrid",
                                        "Mediocampista",
                                        "10",
                                        "9 de septiembre de 1985",
                                        "Croacia"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.camavinga,
                                        "Eduardo Celmi Camavinga",
                                        "Madrid",
                                        "Mediocampista",
                                        "12",
                                        "10 de noviembre de 2002",
                                        "Angola"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.valverde,
                                        "Federico Santiago Valverde Dipetta",
                                        "Madrid",
                                        "Mediocampista",
                                        "15",
                                        "22 de julio de 1998",
                                        "Uruguay"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.tchouameni,
                                        "Aurélien Djani Tchouaméni ",
                                        "Madrid",
                                        "Mediocampista",
                                        "18",
                                        "27 de enero de 2000",
                                        "Francia"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.dceballos,
                                        "Daniel Ceballos Fernández",
                                        "Madrid",
                                        "Mediocampista",
                                        "19",
                                        " 7 de agosto de 1996",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.hazard,
                                        "Eden Hazard",
                                        "Madrid",
                                        "Delantero",
                                        "7",
                                        "7 de enero de 1991",
                                        "Belgica"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.benzema,
                                        "Karim Benzema",
                                        "Madrid",
                                        "Delantero",
                                        "9",
                                        "19 de diciembre de 1987",
                                        "Francia"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.asensio,
                                        "Marco Asensio Willemsen",
                                        "Madrid",
                                        "Delantero",
                                        "11",
                                        "21 de enero de 1996",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.viniaaaaaa,
                                        "Vinícius José Paixaõ de Oliveira Junior",
                                        "Madrid",
                                        "Delantero",
                                        "20",
                                        "12 de julio de 2000",
                                        "Brasil"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.rodrygo,
                                        "Rodrygo Silva de Goes",
                                        "Madrid",
                                        "Delantero",
                                        "21",
                                        " de enero de 2001",
                                        "Brasil"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.mariano,
                                        "Mariano Díaz Mejía",
                                        "Madrid",
                                        "Delantero",
                                        "24",
                                        "1 de agosto de 1993",
                                        "España"
                                ));
                break;
            case "Porteros":
                Inicial.isEmpty();
                Inicial = new ArrayList<>();
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.courtois,
                                        "Marc Courtois",
                                        "Madrid",
                                        "Portero",
                                        "1",
                                        "11 de mayo de 1992",
                                        "Bélgica"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.lunin,
                                        "Andriy Oleksiyovych Lunin",
                                        "Madrid",
                                        "Portero",
                                        "13",
                                        "2 de marzo de 1999",
                                        "España"
                                ));
                break;
            case "Defensas":
                Inicial.isEmpty();
                Inicial = new ArrayList<>();
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.carvajal,
                                        "Daniel Carvajal Ramos",
                                        "Madrid",
                                        "Defensa",
                                        "2",
                                        "11 de enero de 1992 ",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.emiliatao,
                                        "Éder Gabriel Militão",
                                        "Madrid",
                                        "Defensa",
                                        "3",
                                        "18 de enero de 1998",
                                        "Brasil"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.alaba,
                                        "David Olatukunbo Alaba",
                                        "Madrid",
                                        "Defensa",
                                        "4",
                                        "24 de junio de 1992",
                                        "Australia"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.vallejo,
                                        "Jesús Vallejo Lázaro",
                                        "Madrid",
                                        "Defensa",
                                        "5",
                                        "5 de enero de 1997",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.nacho,
                                        "José Ignacio Fernández Iglesias",
                                        "Madrid",
                                        "Defensa",
                                        "6",
                                        "18 de enero de 1990",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.odriozola,
                                        "Álvaro Odriozola Arzallus",
                                        "Madrid",
                                        "Defensa",
                                        "16",
                                        "14 de diciembre de 1995",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.lucas,
                                        "Lucas Vázquez Iglesias",
                                        "Madrid",
                                        "Defensa",
                                        "17",
                                        "1 de julio de 1991",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.rudiger,
                                        "Antonio Rüdiger",
                                        "Madrid",
                                        "Defensa",
                                        "22",
                                        " 3 de marzo de 1993",
                                        "Alemania"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.fmendy,
                                        "Ferland Sinna Mendy",
                                        "Madrid",
                                        "Defensa",
                                        "23",
                                        "8 de junio de 1995",
                                        "Francia"
                                ));
                break;
            case "Mediocampistas":
                Inicial.isEmpty();
                Inicial = new ArrayList<>();
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.kroos,
                                        "Toni Kroos",
                                        "Madrid",
                                        "Mediocampista",
                                        "8",
                                        " 4 de enero de 1990",
                                        "Alemania"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.modric,
                                        "Luka Modrić",
                                        "Madrid",
                                        "Mediocampista",
                                        "10",
                                        "9 de septiembre de 1985",
                                        "Croacia"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.camavinga,
                                        "Eduardo Celmi Camavinga",
                                        "Madrid",
                                        "Mediocampista",
                                        "12",
                                        "10 de noviembre de 2002",
                                        "Angola"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.valverde,
                                        "Federico Santiago Valverde Dipetta",
                                        "Madrid",
                                        "Mediocampista",
                                        "15",
                                        "22 de julio de 1998",
                                        "Uruguay"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.tchouameni,
                                        "Aurélien Djani Tchouaméni ",
                                        "Madrid",
                                        "Mediocampista",
                                        "18",
                                        "27 de enero de 2000",
                                        "Francia"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.dceballos,
                                        "Daniel Ceballos Fernández",
                                        "Madrid",
                                        "Mediocampista",
                                        "19",
                                        " 7 de agosto de 1996",
                                        "España"
                                ));
                break;
            case "Delanteros":
                Inicial.isEmpty();
                Inicial = new ArrayList<>();
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.hazard,
                                        "Eden Hazard",
                                        "Madrid",
                                        "Delantero",
                                        "7",
                                        "7 de enero de 1991",
                                        "Belgica"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.benzema,
                                        "Karim Benzema",
                                        "Madrid",
                                        "Delantero",
                                        "9",
                                        "19 de diciembre de 1987",
                                        "Francia"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.asensio,
                                        "Marco Asensio Willemsen",
                                        "Madrid",
                                        "Delantero",
                                        "11",
                                        "21 de enero de 1996",
                                        "España"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.viniaaaaaa,
                                        "Vinícius José Paixaõ de Oliveira Junior",
                                        "Madrid",
                                        "Delantero",
                                        "20",
                                        "12 de julio de 2000",
                                        "Brasil"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.rodrygo,
                                        "Rodrygo Silva de Goes",
                                        "Madrid",
                                        "Delantero",
                                        "21",
                                        " de enero de 2001",
                                        "Brasil"
                                ));
                Inicial.add
                        (new plantillaoriginMadrid
                                (R.drawable.mariano,
                                        "Mariano Díaz Mejía",
                                        "Madrid",
                                        "Delantero",
                                        "24",
                                        "1 de agosto de 1993",
                                        "España"
                                ));

        }


    }
}