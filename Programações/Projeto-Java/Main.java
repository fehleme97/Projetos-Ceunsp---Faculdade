/*
    *************************************************
    *                                               *
    *   SISTEMATIZAÇÃO - CARDÁPIO DE LANCHONETE     *
    *                                               *
    *************************************************
    
    AUTORES:    Elvis Leite Diniz                    RGM: 30316600
                Felipe Leme Correa da Silva          RGM: 29953723
                Gabriel Francisco de Abreu           RGM: 29073642   
                Leonardo Serafim Pinton              RGM: 30221463
                Mário Gustavo Fachin                 RGM: 30195241
                Rafael Pontes Barbosa                RGM: 30359465
*/

import java.util.Scanner;

public class Main {
    
    public static void pulaLinha(){
        for(int i = 1; i <= 101; i++){
            System.out.println("");
        }
    }
    
    public static void menuInicial(){
        System.out.println("**********************************");
        System.out.println("*                                *");
        System.out.println("*       CONTROLE DE MESAS        *");
        System.out.println("*                                *");
        System.out.println("**********************************");
        System.out.println("----------ESCOLHA A MESA----------");
        System.out.println("Mesa - 0        |        Mesa - 1");
        System.out.println("Mesa - 2        |        Mesa - 3");
        System.out.println("Mesa - 4        |        Mesa - 5");
        System.out.println("Mesa - 6        |        Mesa - 7");
        System.out.println("Mesa - 8        |        Mesa - 9");
        System.out.println("--------------OPÇÕES--------------");
        System.out.println("   DESCRIÇÃO             DIGITE \n");
        System.out.println("SELECIONAR MESA    -     0 à 9");
        System.out.println("CONTAS EM ABERTO   -      10");
        System.out.println("SAIR               -     101");
        System.out.println("----------------------------------");
    }
    
    public static void menuMesa(){
        System.out.println("----------ESCOLHA O PRODUTO----------");
        System.out.println("1 - Lanches");
        System.out.println("2 - Bebidas");
        System.out.println("3 - Finalizar Pedidos");
        System.out.println("4 - Sair");
        System.out.println("-------------------------------------");
    }
    
    public static void menuComida(){
        System.out.println("----------ESCOLHA O LANCHE----------");
        System.out.println("1- X-Salada - R$25");
        System.out.println("2- X-Frango - R$30");
        System.out.println("3- X-Tudo - R$35");
        System.out.println("4- X-Calabresa - R$27");
        System.out.println("5- X-Bacon - R$29");
        System.out.println("6- Vegano - R$20");
        System.out.println("7- Voltar");
        System.out.println("------------------------------------");
    }
    
    public static void menuBebida(){
        System.out.println("----------ESCOLHA A BEBIDA----------");
        System.out.println("1- Refrigerante Lata - R$7");
        System.out.println("2- Refrigerante 600ml - R$10");
        System.out.println("3- Suco Diversos - R$8");
        System.out.println("4- Chopp 500ml - R$8");
        System.out.println("5- Água sem gás - R$3");
        System.out.println("6- Água com gás - R$5");
        System.out.println("7- Voltar");
        System.out.println("------------------------------------");
    }
    
    public static void main(String[] args) {
        // variaves
        Scanner teclado = new Scanner (System.in);
        
        int opcaoMesa, opcaoMenuInicial, opcaoComida, opcaoBebida, opcaoGorgeta;
        int[] mesas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] comandas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] valoresTotais = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        do {
            menuInicial();
            opcaoMesa = teclado.nextInt();
            
            pulaLinha();
            
            
            if(opcaoMesa == 10){
                 System.out.println("********************");
                 System.out.println("* CONTAS EM ABERTO *");
                 System.out.println("********************");
                 
                for(int i = 0; i <= 9; i++){
                    System.out.println("Mesa " + i + " -> R$ " + valoresTotais[i]);
                }   
            } if(opcaoMesa == 101){
                System.out.println("* SISTEMA FINALIZADO! *");
            } else if((opcaoMesa < 0) || (opcaoMesa > 9)){
                System.out.println("* OPÇÃO INVÁLIDA! * \n");
            } else {
                do {
        	        menuMesa();
                    
                    opcaoMenuInicial = teclado.nextInt(); 
                    pulaLinha();
                    
                    
                    switch(opcaoMenuInicial){
                        case 1:
                            do {
                                menuComida();
                                
                                opcaoComida = teclado.nextInt();
                                pulaLinha();
                                
                                switch(opcaoComida){
                                    case 1:
                                        valoresTotais[opcaoMesa] += 20;
                                        System.out.println("X-Salada adicionado!");
                                        break;
                                    case 2:
                                        valoresTotais[opcaoMesa] += 30;
                                        System.out.println("X-Frango adicionado!");
                                        break;
                                    case 3:
                                        valoresTotais[opcaoMesa] += 35;
                                        System.out.println("X-Tudo adicionado!");
                                        break;
                                    case 4:
                                        valoresTotais[opcaoMesa] += 27;
                                        System.out.println("X-Calabresa adicionado!");
                                        break;
                                    case 5:
                                        valoresTotais[opcaoMesa] += 29;
                                        System.out.println("X-Bacon adicionado!");
                                        break;
                                    case 6:
                                        valoresTotais[opcaoMesa] += 20;
                                        System.out.println("Vegano adicionado!");
                                        break;
                                    case 7:
                                        System.out.println("Menu de Opções");
                                        break;
                                    default:
                                        System.out.println("* OPÇÃO INVÁLIDA! * \n");
                                        break;
                                }
                                opcaoComida = 7;
                                
                            } while(opcaoComida != 7);
                            break;
                        case 2:
                            do {
                                menuBebida();
                                
                                opcaoBebida = teclado.nextInt();
                                pulaLinha();
                                
                                switch(opcaoBebida){
                                    case 1:
                                        valoresTotais[opcaoMesa] += 7;
                                        System.out.println("Refrigerante Lata adicionado!");
                                        break;
                                    case 2:
                                        valoresTotais[opcaoMesa] += 10;
                                        System.out.println("Refrigerante 600ml adicionado!");
                                        break;
                                    case 3:
                                        valoresTotais[opcaoMesa] += 8;
                                        System.out.println("Suco Diversos adicionado!");
                                        break;
                                    case 4:
                                        valoresTotais[opcaoMesa] += 8;
                                        System.out.println("Chopp 500ml adicionado!");
                                        break;
                                    case 5:
                                        valoresTotais[opcaoMesa] += 3;
                                        System.out.println("Água sem gás adicionado!");
                                        break;
                                    case 6:
                                        valoresTotais[opcaoMesa] += 5;
                                        System.out.println("Água com gás adicionado!");
                                        break;
                                    case 7:
                                        System.out.println("Menu de Opções");
                                        break;
                                    default:
                                        System.out.println("* OPÇÃO INVÁLIDA! * \n");
                                        break;
                                }
                                
                                opcaoBebida = 7;
                                
                            } while(opcaoBebida != 7);
                            
                            break;
                        case 3:
                            double total = 0;
                            
                            System.out.println("\nFECHANDO A CONTA...\n");
                            
                            System.out.println("----Inserir 10% de gorgeta?----");
                            System.out.println("1 - SIM");
                            System.out.println("2 - NÃO");
                            System.out.println("-------------------------------");
                            
                            opcaoGorgeta = teclado.nextInt();
                            
                            if(opcaoGorgeta == 1){
                                total =  valoresTotais[opcaoMesa] + (valoresTotais[opcaoMesa] * 0.10);
                            } else {
                                total = valoresTotais[opcaoMesa];
                            }
                            
                            pulaLinha();
                            System.out.println("\nO pedido da comanda ficou no total de: R$" + total+ "\n");
                            
                            valoresTotais[opcaoMesa] = 0;
                            
                            opcaoMenuInicial = 4;
                            
                            break;
                        case 4:
                            System.out.println("* MENU INICIAL *");
                            break;
                        default:
                            System.out.println("* OPÇÃO INVÁLIDA! * \n");
                            break;
                    }
                } while(opcaoMenuInicial != 4);
            }
        } while(opcaoMesa != 101);
	}
}