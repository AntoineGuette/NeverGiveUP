package antoine.guette.nevergiveup;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class TESTEXO extends AppCompatActivity {

    private TextView mTextOnEXOREP;
    private Button mButtonRetour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exo_rep);
        mTextOnEXOREP= findViewById(R.id.text_on_exorep); // association d'une variable au id du element que l'on veut
        mButtonRetour = findViewById(R.id.button_retour);
        mButtonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

        public void Burpees_10(Mouvements Burpees, int Nb_rep){
        Mouvements Burpees_10 = new Mouvements("Burpees","description");
        Nb_rep = 10;
        System.out.println("Burpees"+"Nb_rep");
         }
}


