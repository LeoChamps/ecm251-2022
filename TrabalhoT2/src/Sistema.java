import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public void run(){
        List<Membro> membros = new ArrayList<Membro>();

        membros.add(new BigBrothers("Max Verstappen", "SuperMax33@RedBull", new Funcao("Big Brother")));
        membros.add(new HeavyLifters("Lewis Hamilton", "SirLewis44@Mercedes", new Funcao("Heavy Lifter")));
        membros.add(new MobileMembers("Sergio Perez", "Checo11@RedBull", new Funcao("Mobile Member")));
        membros.add(new ScriptGuys("George Russell", "GeorgãoDaMassa63@Mercedes", new Funcao("Script Guy")));
        


    }   
}
