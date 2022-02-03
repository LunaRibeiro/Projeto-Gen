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
				
				System.out.println("Está com mais de 2 dias de sintomas?\n1 - Sim\n2 - Não");
				rc = sc.nextInt();
				
				if (rc == 2) {
					
					System.out.println("Aguarde para fazer o teste!\n\n");
					
				}
			} while (rc != 1);
			
			System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - Não");
			rc = sc.nextInt();
			
			if (rc == 2) {
				
				System.out.println("Então vá realizar!");
				
			} else {
				
				System.out.println("O resultado deu positivo?\n1 - Sim\n2 - Não");
				rc = sc.nextInt();
				
				if (rc == 2) {
					
					System.out.println("Procure uma orientação médica!");
					
				} else {
					
					System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

					do {
						
						System.out.println("Você possui quantos dias com sintomas?");
						dias = sc.nextInt();

						if (dias < 7) {
							System.out.println("Mantenha isolamento!");
						} else if (dias >= 7 && dias < 10) {
							System.out.println("Mantenha o isolamento!");
						} else if (dias > 10) {
							System.out.println("Procure um médico!");
						}
						
						System.out.println("Continua com sintomas?\n1 - Sim\n2 - Não");
						rc = sc.nextInt();
						
					} while (rc != 2);
					
					System.out.println("Fim do isolamento, se cuide.");
				}
			}
		}
		
		//se ele não tiver sintoma gripal
		if (sintomas == 2) {

			int rc;
			int dias;

			System.out.println("Teve contato com algum caso confirmado?\n1 - Sim\n2 - Não");
			rc = sc.nextInt();

			if (rc == 2) {
				
				System.out.println("Sem suspeita mas, faça um teste.");
				
			} else {

				System.out.println("O último contato foi a 5 dias atrás?\n1 - Sim\n2 - Não");
				rc = sc.nextInt();

				if (rc == 1) {
					
					System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - Não");
					rc = sc.nextInt();
					
					if (rc == 2) {
						
						System.out.println("Então vá realizar!");
						
					} else {
						
						System.out.println("O resultado deu positivo?\n1 - Sim\n2 - Não");
						rc = sc.nextInt();
						
						if (rc == 2) {
							
							System.out.println("Procure uma orientação médica!");
							
						} else {
							
							System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

							do {
								System.out.println("Você possui quantos dias com sintomas?");
								dias = sc.nextInt();

								if (dias < 7) {
									System.out.println("Mantenha isolamento!");
								} else if (dias >= 7 && dias < 10) {
									System.out.println("Mantenha o isolamento!");
								} else if (dias > 10) {
									System.out.println("Procure um médico!");
								}
								
								System.out.println("Continua com sintomas?\n1 - Sim\n2 - Não");
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

					System.out.println("Aguarde alguns dias.\n\nMantém assintomático?\n1 - Sim\n2 - Não");
					rc = sc.nextInt();
					
					if (rc == 1) {
						
						System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - Não");
						rc = sc.nextInt();
						
						if (rc == 2) {
							
							System.out.println("Então vá realizar!");
							
						} else {
							
							System.out.println("O resultado deu positivo?\n1 - Sim\n2 - Não");
							rc = sc.nextInt();
							
							if (rc == 2) {
								
								System.out.println("Procure uma orientação médica!");
								
							} else {
								
								System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

								do {
									
									System.out.println("Você possui quantos dias com sintomas?");
									dias = sc.nextInt();

									if (dias < 7) {
										System.out.println("Mantenha isolamento!");
									} else if (dias >= 7 && dias < 10) {
										System.out.println("Mantenha o isolamento!");
									} else if (dias > 10) {
										System.out.println("Procure um médico!");
									}
									
									System.out.println("Continua com sintomas?\n1 - Sim\n2 - Não");
									rc = sc.nextInt();
									
								} while (rc != 2);
								
								System.out.println("Fim do isolamento, se cuide.");

							}
						}
					}
					if (rc == 2) {
						
						do {
							
							System.out.println("Está com mais de 2 dias de sintomas?\n1 - Sim\n2 - Não");
							rc = sc.nextInt();
							
							if (rc == 2) {
								
								System.out.println("Aguarde para fazer o teste!\n\n");
								
							}
							
						} while (rc != 1);
						
						System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - Não");
						rc = sc.nextInt();
						
						if (rc == 2) {
							
							System.out.println("Então vá realizar!");
							
						} else {
							
							System.out.println("O resultado deu positivo?\n1 - Sim\n2 - Não");
							rc = sc.nextInt();
							
							if (rc == 2) {
								System.out.println("Procure uma orientação médica!");
								
							} else {
								System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

								do {
									
									System.out.println("Você possui quantos dias com sintomas?");
									dias = sc.nextInt();

									if (dias < 7) {
										System.out.println("Mantenha isolamento!");
									} else if (dias >= 7 && dias < 10) {
										System.out.println("Mantenha o isolamento!");
									} else if (dias > 10) {
										System.out.println("Procure um médico!");
									}
									
									System.out.println("Continua com sintomas?\n1 - Sim\n2 - Não");
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
