public class HeavyLifters extends Membro {

    public HeavyLifters(String usuario, String email, Funcao funcao) {
        super(usuario, email, funcao);
    }

    @Override
    public void postarMensagem(Funcao funcao, Horario horario) {
        if( horario.equals("Regular") && funcao.equals("Heavy Lifter") )
        System.out.println("Podem contar conosco!");
        if( horario.equals("Extra") && funcao.equals("Heavy Lifter"))
        System.out.println("N00b_qu3_n_Se_r3pita.bat");
    }
}
