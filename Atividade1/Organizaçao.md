//Leonardo Campos 20.00786-8
Veiculos Compartilhados (Objetos):
    -Carro
    -Moto
    -Bicicleta
    -Patinete

Usuarios:
    -Possui um nome
    -Pode usar um veiculo por vez

Sistema:
    Deve simular o emprestimo de veiculos e troca deles

Comportamento "testar":
    -exibir ID do veiculo e seu tipo

Veiculos Compartilhados:
    -Devem possuir ID (5 digitos aleatorios) e seu tipo

SOLUÇAO:
    -No App, criar um usuario e trocar os veiculos compartilhados dele
    -Para cada veiculo, invocar testar()

Classes:
    -App (Roda/Inicia o sistema)
    -Carro
    -Bicicleta
    -Moto
    -Patinete
    -Usuario
    -Sistema
    -SUPER CLASSE: Veiculo --> HERANÇA

    Nao sei usar herança --> Soluçao: atribuir identificaçao(numero) para cada veiculo (Bicicleta=1; Carro=2;
    Moto=3; Patinete=4; Sem Veiculo=0(Inicial))