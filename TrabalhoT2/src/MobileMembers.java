public class MobileMembers extends Membro{

    public MobileMembers(String usuario, String email, Funcao funcao) {
        super(usuario, email, funcao);
    }
    
    @Override
    public void postarMensagem(Funcao funcao, Horario horario) {
        if( horario.equals("Regular") && funcao.equals("Mobile Member") )
        System.out.println("Happy Coding!");
        if( horario.equals("Extra") && funcao.equals("Mobile Member"))
        System.out.println("Happy_C0d1ng. Maskers");
    }
}
