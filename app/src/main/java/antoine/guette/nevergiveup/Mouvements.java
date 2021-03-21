package antoine.guette.nevergiveup;

public class Mouvements {
    String nom;
    String description;
        public Mouvements(String nom,String description){
        this.nom=nom;
        this.description=description;
        }

    public static void main(String args[]){
        Mouvements Burpees = new Mouvements("Burpees"," ");
        Mouvements EtirementsBuste = new Mouvements("Étirements du buste","");
        Mouvements PompesPiedsSureleves = new Mouvements("Pompes avec pieds surélevés","");
        Mouvements CerclesBras = new Mouvements("Cercles avec les bras","");
        Mouvements PompesSpiderman = new Mouvements("Pompes spiderman","");
        Mouvements EtirementsEpaules = new Mouvements("Étirement des épaules","");
        Mouvements EtirementsCobra = new Mouvements("Étirements cobra","");
        Mouvements JumpingJack = new Mouvements("Jumping jack","");
        Mouvements PompesGenoux = new Mouvements("Pompes genoux au sol","");
        Mouvements PompesRotation = new Mouvements("Pompes & Rotations","");
        Mouvements PompesDiamant = new Mouvements("Pompes diamant","");

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
    }
}
