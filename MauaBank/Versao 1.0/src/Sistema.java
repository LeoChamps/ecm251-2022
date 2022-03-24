import java.time.LocalDate;

public class Sistema {
    public void run(){
        Cliente cliente = new Cliente("Max Verstappen", "333333", "SuperMax@RedBullRacing.com");
        Conta conta = new Conta(cliente, 33);

        System.out.println(conta);

        Titulo steam = new Titulo(200, LocalDate.of(2022, 03, 30), 5);
        
        conta.depositar(300);


    }

    boolean pagarTitulo(Titulo titulo, Conta conta){
        double valorPagar;
        LocalDate dataTitulo = titulo.getData();
        LocalDate hoje = LocalDate.now();
        if(dataTitulo.compareTo(hoje)>0){
            valorPagar = titulo.getValor();
        } else{
            // To do --> terminar implementaçao
        }
        
        
        return true;
    } 
}               
