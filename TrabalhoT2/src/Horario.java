public class Horario {
    private String horarioTrabalho;

    public Horario(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public void mudarHorario(Horario horario) {
        if( horario.equals("Regular"))
        setHorarioTrabalho("Extra");
        if( horario.equals("Extra"))
        setHorarioTrabalho("Regular");
    }

    @Override
    public String toString() {
        return "Horario [horarioTrabalho=" + horarioTrabalho + "]";
    }
    
}
