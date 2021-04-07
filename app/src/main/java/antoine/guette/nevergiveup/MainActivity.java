package antoine.guette.nevergiveup;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}
    public static void main(String[] args){
        Mouvements Burpees = new Mouvements("Burpees:","Commencez en position debout. Maintenez vous en position de squat et posez vos mains sur le sol.\n" +

                "Redressez vos jambes et vos bras en même temps. Revenez vos jambes et vos bras en même temps. Revenez immédiatement à la position de squat. Sautez depuis cette position. Le burpee es un exercice de force et aérobic complet.");
        Mouvements EtirementsBuste = new Mouvements("Étirements du buste:","Trouvez une embrasure de porte, placez-vous en position de fente avec les bras sur le chambranle et vos coudes un peu plus bas que vos épaules, puis ramenez doucement votre torse vers l’avant.\n" +

                "Maintenez la position 30 à 40 secondes, puis revenez vers la position de départ, redescendez vos bras et effectuez quelques roulement d’épaules.");
        Mouvements PompesPiedsSureleves = new Mouvements("Pompes avec pieds surélevés:","Placez-vous en position pompes standard, les genoux alignés avec le bassin et les mains alignées avec les épaules.\n" +

                "Placez vos pieds sur une chaise ou un banc puis abaissez votre corps et remontez-le à la force des bras et pensez à bien garder le corps dans la ligne.");
        Mouvements CerclesBras = new Mouvements("Cercles avec les bras:","En position debout, tendez les bras sur le côté, à hauteur des épaules .\n" +

                "Effectuez de petits cercles dans un sens puis dans l’autre.");
        Mouvements PompesSpiderman = new Mouvements("Pompes spiderman:","Placez vous en position de pompes standards, lorsque vous relevez le torse, fléchissez et relevez une jambe sur le côté.\n" +

                "Retournez à votre position initiale et répétez l’exercice de l’autre côté . Pensez à bien garder le corps dans une ligne.");
        Mouvements EtirementsEpaules = new Mouvements("Étirement des épaules:","Placez un bras en travers de votre corps, parallèle au sol, puis utilisez l’autre bras pour tirer le bras parallèle vers torse.\n" +

                "Maintenez quelques instants, changez de bras et répétez l’exercice.");
        Mouvements EtirementsCobra = new Mouvements("Étirements cobra:","Allongez-vous sur le ventre et fléchissez vos coudes en plaçant vos mains derrière les épaules.\n" +

                "Puis décollez votre torse du sol aussi loin que possible. Maintenez cette position durant quelques seconde.");
        Mouvements JumpingJack = new Mouvements("Jumping jack:","Commencez debout, les pieds joints et les bras sur les côtés, puis sautez en écartant les pieds et les mains au-dessus de la tête.\n" +

                "Revenez à la position de départ et répétez le mouvement. Cet exercice fait travailler tout le corps ainsi que de grands groupes de muscles.");
        Mouvements PompesGenoux = new Mouvements("Pompes genoux au sol:","Placez-vous en position pompes standard, les genoux alignés avec le bassin et les mains alignées avec les épaules.\n" +

                "Fléchissez les coudes et faîtes une pompe, retournez à la position d’origine et répétez l’exercice.");
        Mouvements PompesRotation = new Mouvements("Pompes & Rotations:","Commencez comme pour faire des pompes. Effectuez une descente et au moment où vous remontez, faites tourner le haut de votre corps et tendez votre bras droit vers le haut.\n" +

                "Répétez l’exercice avec l’autre bras. C’est un très bon exercice pour le torse, les épaules, les bras et le corps en général.");
        Mouvements PompesDiamant = new Mouvements("Pompes diamant:","Commencez en position de pompe. Formez un losange avec vos doigts puis abaissez et relevez votre corps. Pensez à toujours gardez le corps dans une ligne.");
        Mouvements PompesHindu = new Mouvements("Pompes hindu:","Placez vos pieds et vos mains au sol et levez les fesses de manière à former un « V » inversé\n" +

                "Ensuite fléchissez les coudes pour faire descendre votre corps vers le sol.\n" +

                "Lorsque votre corps est à proximité du sol, levez le torse aussi loin que possible.\n" +

                "Retournez à votre position initiale et répétez l’exercice.");
        Mouvements PompesDecales = new Mouvements("Pompes décalées:","Placez -vous en position de pompes standards mais positionner une main devant l’autre.\n" +

                "Effectuez une pompe et inversez la position des mains, Pensez à bien garder le corps dans une ligne.");



        System.out.println("\u001B[46m"+Burpees.nom+"\n"+Burpees.description+"\n");
        System.out.println("\u001B[46m"+EtirementsBuste.nom+"\n"+EtirementsBuste.description+"\n");
        System.out.println("\u001B[46m"+PompesPiedsSureleves.nom+"\n"+PompesPiedsSureleves.description+"\n");
        System.out.println("\u001B[46m"+CerclesBras.nom+"\n"+CerclesBras.description+"\n");
        System.out.println("\u001B[46m"+PompesSpiderman.nom+"\n"+PompesSpiderman.description+"\n");
        System.out.println("\u001B[46m"+EtirementsEpaules.nom+"\n"+EtirementsEpaules.description+"\n");
        System.out.println("\u001B[46m"+EtirementsCobra.nom+"\n"+EtirementsCobra.description+"\n");
        System.out.println("\u001B[46m"+JumpingJack.nom+"\n"+JumpingJack.description+"\n");
        System.out.println("\u001B[46m"+PompesGenoux.nom+"\n"+PompesGenoux.description+"\n");
        System.out.println("\u001B[46m"+PompesRotation.nom+"\n"+PompesRotation.description+"\n");
        System.out.println("\u001B[46m"+PompesDiamant.nom+"\n"+PompesDiamant.description+"\n");
        System.out.println("\u001B[46m"+PompesHindu.nom+"\n"+PompesHindu.description+"\n");
        System.out.println("\u001B[46m"+PompesDecales.nom+"\n"+PompesDecales.description+"\n");
}
}