package entities;

import java.util.Scanner;

public class pessoa {

	Scanner sc = new Scanner(System.in);

	//atributo
	private int sintomas;

	public pessoa() {

	}

	public pessoa(int sintomas) {
		setSintomas(sintomas);

		//se ele tiver sintoma gripal
		if (sintomas == 1) {
			int rc;
			int dias = 0;

			do {
				
				System.out.println("Est� com mais de 2 dias de sintomas?\n1 - Sim\n2 - N�o");
				rc = sc.nextInt();
				
				if (rc == 2) {
					
					System.out.println("Aguarde para fazer o teste!\n\n");
					
				}
			} while (rc != 1);
			
			System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - N�o");
			rc = sc.nextInt();
			
			if (rc == 2) {
				
				System.out.println("Ent�o v� realizar!");
				
			} else {
				
				System.out.println("O resultado deu positivo?\n1 - Sim\n2 - N�o");
				rc = sc.nextInt();
				
				if (rc == 2) {
					
					System.out.println("Procure uma orienta��o m�dica!");
					
				} else {
					
					System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

					do {
						
						System.out.println("Voc� possui quantos dias com sintomas?");
						dias = sc.nextInt();

						if (dias < 7) {
							System.out.println("Mantenha isolamento!");
						} else if (dias >= 7 && dias < 10) {
							System.out.println("Mantenha o isolamento!");
						} else if (dias > 10) {
							System.out.println("Procure um m�dico!");
						}
						
						System.out.println("Continua com sintomas?\n1 - Sim\n2 - N�o");
						rc = sc.nextInt();
						
					} while (rc != 2);
					
					System.out.println("Fim do isolamento, se cuide.");
				}
			}
		}
		
		//se ele n�o tiver sintoma gripal
		if (sintomas == 2) {

			int rc;
			int dias;

			System.out.println("Teve contato com algum caso confirmado?\n1 - Sim\n2 - N�o");
			rc = sc.nextInt();

			if (rc == 2) {
				
				System.out.println("Sem suspeita mas, fa�a um teste.");
				
			} else {

				System.out.println("O �ltimo contato foi a 5 dias atr�s?\n1 - Sim\n2 - N�o");
				rc = sc.nextInt();

				if (rc == 1) {
					
					System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - N�o");
					rc = sc.nextInt();
					
					if (rc == 2) {
						
						System.out.println("Ent�o v� realizar!");
						
					} else {
						
						System.out.println("O resultado deu positivo?\n1 - Sim\n2 - N�o");
						rc = sc.nextInt();
						
						if (rc == 2) {
							
							System.out.println("Procure uma orienta��o m�dica!");
							
						} else {
							
							System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

							do {
								System.out.println("Voc� possui quantos dias com sintomas?");
								dias = sc.nextInt();

								if (dias < 7) {
									System.out.println("Mantenha isolamento!");
								} else if (dias >= 7 && dias < 10) {
									System.out.println("Mantenha o isolamento!");
								} else if (dias > 10) {
									System.out.println("Procure um m�dico!");
								}
								
								System.out.println("Continua com sintomas?\n1 - Sim\n2 - N�o");
								rc = sc.nextInt();
								
								if (rc == 2) {
									
									System.out.println("irra");
									
								}
								
							} while (rc != 2);
							
							System.out.println("Fim do isolamento, se cuide.");

						}
					}
				}
				if (rc == 2) {

					System.out.println("Aguarde alguns dias.\n\nMant�m assintom�tico?\n1 - Sim\n2 - N�o");
					rc = sc.nextInt();
					
					if (rc == 1) {
						
						System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - N�o");
						rc = sc.nextInt();
						
						if (rc == 2) {
							
							System.out.println("Ent�o v� realizar!");
							
						} else {
							
							System.out.println("O resultado deu positivo?\n1 - Sim\n2 - N�o");
							rc = sc.nextInt();
							
							if (rc == 2) {
								
								System.out.println("Procure uma orienta��o m�dica!");
								
							} else {
								
								System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

								do {
									
									System.out.println("Voc� possui quantos dias com sintomas?");
									dias = sc.nextInt();

									if (dias < 7) {
										System.out.println("Mantenha isolamento!");
									} else if (dias >= 7 && dias < 10) {
										System.out.println("Mantenha o isolamento!");
									} else if (dias > 10) {
										System.out.println("Procure um m�dico!");
									}
									
									System.out.println("Continua com sintomas?\n1 - Sim\n2 - N�o");
									rc = sc.nextInt();
									
								} while (rc != 2);
								
								System.out.println("Fim do isolamento, se cuide.");

							}
						}
					}
					if (rc == 2) {
						
						do {
							
							System.out.println("Est� com mais de 2 dias de sintomas?\n1 - Sim\n2 - N�o");
							rc = sc.nextInt();
							
							if (rc == 2) {
								
								System.out.println("Aguarde para fazer o teste!\n\n");
								
							}
							
						} while (rc != 1);
						
						System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - N�o");
						rc = sc.nextInt();
						
						if (rc == 2) {
							
							System.out.println("Ent�o v� realizar!");
							
						} else {
							
							System.out.println("O resultado deu positivo?\n1 - Sim\n2 - N�o");
							rc = sc.nextInt();
							
							if (rc == 2) {
								System.out.println("Procure uma orienta��o m�dica!");
								
							} else {
								System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

								do {
									
									System.out.println("Voc� possui quantos dias com sintomas?");
									dias = sc.nextInt();

									if (dias < 7) {
										System.out.println("Mantenha isolamento!");
									} else if (dias >= 7 && dias < 10) {
										System.out.println("Mantenha o isolamento!");
									} else if (dias > 10) {
										System.out.println("Procure um m�dico!");
									}
									
									System.out.println("Continua com sintomas?\n1 - Sim\n2 - N�o");
									rc = sc.nextInt();
									
								} while (rc != 2);
								
								System.out.println("Fim do isolamento, se cuide.");

							}
						}
					}
				}

			}
		}

	}

	//Get e Set
	public int getSintomas() {
		return sintomas;
	}

	public void setSintomas(int sintomas) {
		this.sintomas = sintomas;
	}

}
