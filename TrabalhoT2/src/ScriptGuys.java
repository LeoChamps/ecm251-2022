public class ScriptGuys extends Membro{

    public ScriptGuys(String usuario, String email, Funcao funcao) {
        super(usuario, email, funcao);
    }
    
    @Override
    public void postarMensagem(Funcao funcao, Horario horario) {
        if( horario.equals("Regular") && funcao.equals("Script Guy") )
        System.out.println("Prazer em ajudar novos amigos de código!");
        if( horario.equals("Extra") && funcao.equals("Script Guy"))
        System.out.println("QU3Ro_S3us_r3curs0s.py");
    }
}
