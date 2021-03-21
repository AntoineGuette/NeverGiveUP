package antoine.guette.nevergiveup;

public class Mouvements {
    String nom;
    String description;
        public Mouvements(String nom,String description){
        this.nom=nom;
        this.description=description;
        }

    public static void main(String args[]){
        Mouvements Burpees = new Mouvements("Burpees:","Commencez en position debout. Maintenez vous en position de squat et posez vos mains sur le sol.\n" +
                "\n" +
                "Redressez vos jambes et vos bras en même temps. Revenez vos jambes et vos bras en même temps. Revenez immédiatement à la position de squat. Sautez depuis cette position. Le burpee es un exercice de force et aérobic complet.");
        Mouvements EtirementsBuste = new Mouvements("Étirements du buste:","Trouvez une embrasure de porte, placez-vous en position de fente avec les bras sur le chambranle et vos coudes un peu plus bas que vos épaules, puis ramenez doucement votre torse vers l’avant.\n" +
                "\n" +
                "Maintenez la position 30 à 40 secondes, puis revenez vers la position de départ, redescendez vos bras et effectuez quelques roulement d’épaules.");
        Mouvements PompesPiedsSureleves = new Mouvements("Pompes avec pieds surélevés","Placez-vous en position pompes standard, les genoux alignés avec le bassin et les mains alignées avec les épaules.\n" +
                "\n" +
                "Placez vos pieds sur une chaise ou un banc puis abaissez votre corps et remontez-le à la force des bras et pensez à bien garder le corps dans la ligne.");
        Mouvements CerclesBras = new Mouvements("Cercles avec les bras","En position debout, tendez les bras sur le côté, à hauteur des épaules .\n" +
                "\n" +
                "Effectuez de petits cercles dans un sens puis dans l’autre.");
        Mouvements PompesSpiderman = new Mouvements("Pompes spiderman","Placez vous en position de pompes standards, lorsque vous relevez le torse, fléchissez et relevez une jambe sur le côté.\n" +
                "\n" +
                "Retournez à votre position initiale et répétez l’exercice de l’autre côté . Pensez à bien garder le corps dans une ligne.");
        Mouvements EtirementsEpaules = new Mouvements("Étirement des épaules","Placez un bras en travers de votre corps, parallèle au sol, puis utilisez l’autre bras pour tirer le bras parallèle vers torse.\n" +
                "\n" +
                "Maintenez quelques instants, changez de bras et répétez l’exercice.");
        Mouvements EtirementsCobra = new Mouvements("Étirements cobra","Allongez-vous sur le ventre et fléchissez vos coudes en plaçant vos mains derrière les épaules.\n" +
                "\n" +
                "Puis décollez votre torse du sol aussi loin que possible. Maintenez cette position durant quelques seconde.");
        Mouvements JumpingJack = new Mouvements("Jumping jack","Commencez debout, les pieds joints et les bras sur les côtés, puis sautez en écartant les pieds et les mains au-dessus de la tête.\n" +
                "\n" +
                "Revenez à la position de départ et répétez le mouvement. Cet exercice fait travailler tout le corps ainsi que de grands groupes de muscles.");
        Mouvements PompesGenoux = new Mouvements("Pompes genoux au sol","Placez-vous en position pompes standard, les genoux alignés avec le bassin et les mains alignées avec les épaules.\n" +
                "\n" +
                "Fléchissez les coudes et faîtes une pompe, retournez à la position d’origine et répétez l’exercice.");
        Mouvements PompesRotation = new Mouvements("Pompes & Rotations","Commencez comme pour faire des pompes. Effectuez une descente et au moment où vous remontez, faites tourner le haut de votre corps et tendez votre bras droit vers le haut.\n" +
                "\n" +
                "Répétez l’exercice avec l’autre bras. C’est un très bon exercice pour le torse, les épaules, les bras et le corps en général.");
        Mouvements PompesDiamant = new Mouvements("Pompes diamant","Commencez en position de pompe. Formez un losange avec vos doigts puis abaissez et relevez votre corps. Pensez à toujours gardez le corps dans une ligne.");
        Mouvements PompesHindu = new Mouvements("Pompes hindu","Placez vos pieds et vos mains au sol et levez les fesses de manière à former un « V » inversé\n" +
                "\n" +
                "Ensuite fléchissez les coudes pour faire descendre votre corps vers le sol.\n" +
                "\n" +
                "Lorsque votre corps est à proximité du sol, levez le torse aussi loin que possible.\n" +
                "\n" +
                "Retournez à votre position initiale et répétez l’exercice.");
        Mouvements PompesDecales = new Mouvements("Pompes décalées","Placez -vous en position de pompes standards mais positionner une main devant l’autre.\n" +
                "\n" +
                "Effectuez une pompe et inversez la position des mains, Pensez à bien garder le corps dans une ligne.");


        System.out.println(Burpees.nom+"\n"+Burpees.description);
        System.out.println(EtirementsBuste.nom+"\n"+EtirementsBuste.description);
        System.out.println(PompesPiedsSureleves.nom+"\n"+PompesPiedsSureleves.description);
        System.out.println(CerclesBras.nom+"\n"+CerclesBras.description);
        System.out.println(PompesSpiderman.nom+"\n"+PompesSpiderman.description);
        System.out.println(EtirementsEpaules.nom+"\n"+EtirementsEpaules.description);
        System.out.println(EtirementsCobra.nom+"\n"+EtirementsCobra.description);
        System.out.println(JumpingJack.nom+"\n"+JumpingJack.description);
        System.out.println(PompesGenoux.nom+"\n"+PompesGenoux.description);
        System.out.println(PompesRotation.nom+"\n"+PompesRotation.description);
        System.out.println(PompesDiamant.nom+"\n"+PompesDiamant.description);
        System.out.println(PompesHindu.nom+"\n"+PompesHindu.description);
        System.out.println(PompesDecales.nom+"\n"+PompesDecales.description);
    }
}
