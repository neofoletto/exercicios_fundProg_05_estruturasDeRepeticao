# exercicios_fundProg_05_estruturasDeRepeticao

1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
seja inválido e continue pedindo até que o usuário informe um valor válido.

2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
3. Faça um programa que leia e valide as seguintes informações:

    1. Nome: maior que 3 caracteres;
    2. Idade: entre 0 e 150;
    3. Salário: maior que zero;
    4. Sexo: 'f' ou 'm';
    5. Estado Civil: 's', 'c', 'v', 'd';

4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa
anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
taxas de crescimento. Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a
operação.

5. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois
modifique o programa para que ele mostre os números um ao lado do outro.

6. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

7. Faça um programa que receba dois números inteiros e gere os números inteiros que estão
no intervalo compreendido por eles.

8. Altere o programa anterior para mostrar no final a soma dos números.

9. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve
ser conforme o exemplo abaixo:

        Tabuada de 5:
        
        5 x 1 = 5
        5 x 2 = 10
        ...
        5 x 10 = 50

10. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro
número elevado ao segundo número. Não utilize a função de potência da linguagem.

11. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
números pares e a quantidade de números impares.

12. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um
programa capaz de gerar a série até o n−ésimo termo.

13. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

        Ex.: 5!=5.4.3.2.1=120

14. Faça um programa que mostre os n termos da Série a seguir:

        S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.

15. Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37.

16. Faça um programa que, dado um conjunto de N números, determine o menor valor, o
maior valor e a soma dos valores.

17. Faça um programa que peça um número inteiro e determine se ele é ou não um número
primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.

18. Altere o programa de cálculo dos números primos, informando, caso o número não seja
primo, por quais número ele é divisível.

19. Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro
fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele
executou para encontrar os números primos.

20. Faça um programa que calcule e mostre a média aritmética de N notas.

21. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então,
dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

22. Numa eleição existem três candidatos. Faça um programa que peça o número total de
votantes. Peça para cada votante votar e ao final mostrar o número de votos de cada
candidato.

23. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a
quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter
mais de 40 alunos.

24. Faça um programa que calcule o valor total investido por um colecionador em sua
coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a
quantidade de CDs e o valor para em cada um.

25. O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10
caixas. Para agilizar o cálculo de quanto cada cliente deve pagar ele desenvolveu um tabela
que contém o número de itens que o cliente comprou e ao lado o valor da conta. Desta forma
a atendente do caixa precisa apenas contar quantos itens o cliente está levando e olhar na
tabela de preços. Você foi contratado para desenvolver o programa que monta esta tabela de
preços, que conterá os preços de 1 até 50 produtos, conforme o exemplo abaixo:
 
    Lojas Quase Dois - Tabela de preços

        1 - R$ 1.99
        2 - R$ 3.98
        ...
        50 - R$ 99.50

26. O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a
metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para
desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do
preço do pão informado pelo usuário, conforme o exemplo abaixo:
Preço do pão: R$ 0.18

        Panificadora Pão de Ontem - Tabela de preços

        1 - R$ 0.18
        2 - R$ 0.36
        ...
        50 - R$ 9.00

27. O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora
possui uma loja de conveniências. Faça um programa que implemente uma caixa
registradora rudimentar. O programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para
indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o
valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima
compra. A saída deve ser conforme o exemplo abaixo:

        Lojas Tabajara
       
        Produto 1: R$ 2.20
        Produto 2: R$ 5.80
        Produto 3: R$ 0
        Total: R$ 9.00
        Dinheiro: R$ 20.00
        Troco: R$ 11.00
        ...

28. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa
que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a
maior temperaturas informadas, bem como a média das temperaturas.

29. Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será
digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em
10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo
abaixo:

    1. Montar a tabuada de: 5
    2. Começar por: 4
    3. Terminar em: 7
    4. Vou montar a tabuada de 5 começando em 4 e terminando em 7:

        5 x 4 = 20
        5 x 5 = 25
        5 x 6 = 30
        5 x 7 = 35

    Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.

30. Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o
mais baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que
pergunte a cada um dos clientes da academia seu código, sua altura e seu peso. O final da
digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código. Ao
encerrar o programa também deve ser informados os códigos e valores do clente mais alto,
do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos
clientes.

31. Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o
número do aluno e o segundo representando a sua altura em centímetros. Encontre o aluno
mais alto e o mais baixo. Mostre o número do aluno mais alto e o número do aluno mais
baixo, junto com suas alturas.

32. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes
de trânsito. Foram obtidos os seguintes dados:

    1. Código da cidade;
    2. Número de veículos de passeio (em 1999);
    3. Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
    4. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
    5. Qual a média de veículos nas cinco cidades juntas;
    6. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.

33. Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes
dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.

    - Os juros e a quantidade de parcelas seguem a tabela abaixo:
    
        | Quantidade de Parcelas | % de Juros sobre o valor inicial da dívida |
        | --- | --- |
        | 1 | 0 |
        | 3 | 10 |
        | 6 | 15 |
        | 9 | 20 |
        | 12 | 25 |

    - Exemplo de saída do programa:
      
        | Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela | 
        | --- | --- | --- | --- |
        | R$ 1.000,00 | 0 | 1 | R$ 1.000,00 | 
        | R$ 1.100,00 | 100 | 3 | R$ 366,00 | 
        | R$ 1.150,00 | 150 | 6 | R$ 191,67 | 
 
34. Faça um programa que leia uma quantidade indeterminada de números positivos e conte
quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada
de dados deverá terminar quando for lido um número negativo.
35. O cardápio de uma lanchonete é o seguinte:

    | Especificação| Código| Preço |
    | --- | --- | --- |
    | Cachorro Quente | 100 | R$ 1,20
    | Bauru Simples | 101 | R$ 1,30
    | Bauru com ovo | 102 | R$ 1,50
    | Hambúrguer | 103 | R$ 1,20
    | Cheeseburguer | 104 | R$ 1,30
    | Refrigerante | 105 | R$ 1,00

    Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calculemostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere
    que o cliente deve informar quando o pedido deve ser encerrado.

36. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por
meio de código. Os códigos utilizados são:

    1 , 2, 3, 4 - Votos para os respectivos candidatos
    
    (você deve montar a tabela ex: 
    
        1 - Candidato 01
        2 - Candidato 02
        3 - Candidato 03
        4 - Candidato 04
        5 - Voto Nulo
        6 - Voto em Branco

    Faça um programa que calcule e mostre:
        
    1. O total de votos para cada candidato;
    2. O total de votos nulos;
    3. O total de votos em branco;
    4. A percentagem de votos nulos sobre o total de votos;
    5. A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos tem-se o valor zero.

37. Desenvolver um programa para verificar a nota do aluno em uma prova com 10
questões, o programa deve perguntar ao aluno a resposta de cada questão e ao final
comparar com o gabarito da prova e assim calcular o total de acertos e a nota (atribuir 1
ponto por resposta certa). Após cada aluno utilizar o sistema deve ser feita uma pergunta se
outro aluno vai utilizar o sistema. Após todos os alunos terem respondido informar:

    1. Maior e Menor Acerto;
    2. Total de Alunos que utilizaram o sistema;
    3. A Média das Notas da Turma.

            Gabarito da Prova:
        
            01 A
            02 B
            03 C
            04 D
            05 E
            06 E
            07 D
            08 C
            09 B
            10 A
        
38. Após concluir isto você poderia incrementar o programa permitindo que o professor digite o gabarito da prova antes dos alunos usarem o programa.

39. Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero invertido.

    Exemplo:
    
        12376489
        
        => 98467321
