public class BigBrothers extends Membro {

    public BigBrothers(String usuario, String email, Funcao funcao) {
        super(usuario, email, funcao);
    }

    @Override
    public void postarMensagem(Funcao funcao, Horario horario) {
        if( horario.equals("Regular") && funcao.equals("Big Brother") )
        System.out.println("Sempre ajudando as pessoas membros ou não S2!");
        if( horario.equals("Extra") && funcao.equals("Big Brother"))
        System.out.println("...");
    }
    
}
