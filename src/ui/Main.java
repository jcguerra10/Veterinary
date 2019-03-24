package ui;
//
import model.*;
import java.util.*;
//
public class Main{
	private Veterinary vete;

	public Main(){
		init();
	}

	public void init(){
		
		Dated histoDate1 = new Dated (10, 02, 2018);
		//
		ClinicHistory clini = new ClinicHistory("--", "--", "abierto", histoDate1, null);
		//
		Pet paca = new Pet("paca", "perro", 12, 32, false, true);
		//
		Clients juan = new Clients ("juan", 20563, "cll 16 #10-86", "3025874962");
		//
		// Medicine Acetaminophen = new Medicine ("apheminophen", 15, 200, 2);
		// ClinicHistory c1 = new ClinicHistory ("--", "--", "abierto", new Dated(10, 03, 2000), new Dated(10, 03, 2001));
		// c1.addMedicine(Acetaminophen);
		// Pet luna = new Pet ("Luna", "perro", 2, 40.0, false, true);
		// Clients juan = new Clients ("juan", 20563, "cll 16 #10-86", "3025874962");

		vete = new Veterinary("Paquita's veterinary");

	}

	public static void main(String[] args){
		Main m = new Main();
		m.msg();
	}
	public void msg(){
		Scanner scanStr = new Scanner (System.in);
		Scanner scanInt = new Scanner (System.in);
		Scanner scanDou = new Scanner (System.in);
		Scanner scanLong = new Scanner (System.in);
		//
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("||BIENVENIDO AL PROGRAMA PARA LA VETERINARIA PAQUITA'S VETERINARY||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n\n");
		//
		int option = 0;
		boolean exit = false;
		while (!exit){
			menu();
			option = scanInt.nextInt();

			switch (option){
				case(1):
					System.out.println(vete.infoClientPet());
					break;
				case(2):
					exit = true;

					break;

				case (3):
					//Crear cliente

					System.out.println("DIGITE EL NOMBRE DEL CLIENTE: ");
					String namec = scanStr.nextLine();
					System.out.println("DIGITE SU IDENTIFICACION: ");
					int id = scanInt.nextInt();
					System.out.println("DIGITE LA DIRECCION DEL CLIENTE: ");
					String address = scanStr.nextLine();
					System.out.println("DIGITE EL TELEFONO DEL CLIENTE: ");
					String phone = scanStr.nextLine();

					Clients newClient = new Clients(namec, id, address , phone);
					System.out.println("OBJETO CREADO \n");
					vete.addClient(newClient);
					System.out.println("OBJETO INGRESADO SATISFACTORIAMENTE \n");
					break;

				case(4):
					//Crear pets
					boolean hospitalizatedBefore;
					boolean hospitalizatedNow;
					System.out.println(vete.shortInfoClient());
					int index = scanInt.nextInt();

					System.out.println("DIGITE EL NOMBRE DE LA MASCOTA");
					String name = scanStr.nextLine();
					System.out.println("DIGITE EL TIPO DE ANIMAL:");
					System.out.println("PERRO");
					System.out.println("GATO");
					System.out.println("AVE");
					System.out.println("OTRO");
					String type = scanStr.nextLine();
					System.out.println("DIGITE LA EDAD DEL ANIMAL");
					int age = scanInt.nextInt();
					System.out.println("DIGITE EL PESO EN KG");
					double weight = scanDou.nextDouble();
					System.out.println("HA ESTADO ANTES EN LA VETERINARIA");
					System.out.println("1. SI");
					System.out.println("2. NO");
					int i = scanInt.nextInt();
					if(i == 1){
						hospitalizatedBefore = true;
					}else if(i == 2){
						hospitalizatedBefore = false;
					}else{
						hospitalizatedBefore = false;
					}
					hospitalizatedNow = true;

					Pet pet = new Pet(name, type, age, weight, hospitalizatedBefore, hospitalizatedNow);

					vete.addPettoClient(pet, index);

				break;
				case(5):
					//crear historia clinica
					System.out.println("DIGITE EL DUEÑO DE LA MASCOTA QUE QUIERE AGREGARLE LA HISTORIA CLINICA: \n");
					System.out.println(vete.shortInfoClient());
					int indexClient = scanInt.nextInt();
					System.out.println("DIGITE LA MASCOTA A LA QUE QUIERE AGREGARLE LA HISTORIA CLINICA:\n");
					System.out.println(vete.shortInfoClientPet(indexClient));
					int indexPet = scanInt.nextInt();
					System.out.println("DIGITE EL SINTOMA DEL ANIMAL:\n");
					String symptomh = scanStr.nextLine();
					System.out.println("DIGITE EL DIAGNOSTICO DEL ANIMAL:\n");
					String diagnosish = scanStr.nextLine();
					System.out.println("DIGITE EL DIA DE ENTRADA:\n");
					int dayh = scanInt.nextInt();
					System.out.println("DIGITE EL MES DE ENTRADA:\n");
					int monthh = scanInt.nextInt();
					System.out.println("DIGITE EL ANIO DE ENTRADA:\n");
					int yearh = scanInt.nextInt();
					Dated histoDate1h = new Dated (dayh, monthh, yearh);
					String statush = "abierto";

					vete.createHistoryClinicPet(indexClient, indexPet, statush, symptomh, diagnosish, histoDate1h, null);

				break;
				case(6):
					System.out.println("DIGITE EL DUEÑO DE LA MASCOTA QUE QUIERE AGREGARLE LA MEDICINA: \n");
					System.out.println(vete.shortInfoClient());
					int iClient = scanInt.nextInt();
					System.out.println("DIGITE LA MASCOTA A LA QUE QUIERE AGREGARLE LA MEDICINA:\n");
					System.out.println(vete.shortInfoClientPet(iClient));
					int iPet = scanInt.nextInt();
					System.out.println("DIGITE EL NOMBRE DE LA MEDICINA: ");
					String namem = scanStr.nextLine();
					System.out.println("DIGITE LA DOSIS: ");
					double dosem = scanDou.nextDouble();
					System.out.println("DIGITE EL COSTO DE LA DOSIS: ");
					double doseCostm = scanDou.nextDouble();
					System.out.println("DIGITE LA FRECUENCIA: ");
					int frecuencym = scanInt.nextInt();

					Medicine newMed = new Medicine(namem, dosem, doseCostm, frecuencym);
					vete.addMedicine(iClient, iPet, newMed);
				break;
				case(7):
					String newHistory = "";
					System.out.println("DIGITE EL DUEÑO DE LA MASCOTA QUE QUIERE HOSPITALIZAR: \n");
					System.out.println(vete.shortInfoClient());
					int indexClientFH = scanInt.nextInt();
					System.out.println("DIGITE LA MASCOTA A LA QUE QUIERE HOSPITALIZAR:\n");
					System.out.println(vete.shortInfoClientPet(indexClientFH));
					int indexPetFH = scanInt.nextInt();
					//
					Pet addPet = (vete.getPetToMini(indexClientFH, indexPetFH));
					newHistory += vete.getHistoClinicSpecific(indexClientFH, indexPetFH);
					boolean ava = false;
					// 
					MiniRoom miniWithPet = new MiniRoom (ava, addPet, newHistory);
					System.out.println(vete.addPetToMini(miniWithPet));
				break;
				case(8):
					System.out.println(vete.showHistoInMiniRooms());
				
				break;
				case(9):
					System.out.println(vete.nose());
				break;
				default:
					System.out.println ("DIGITO NO VALIDO");
			}
		}
	}

	public void menu(){

		System.out.println("||||||||||||||||||| MENU |||||||||||||||||||");
		System.out.println("1. MOSTRAR LA INFORMACION DE LA VETERINARIA");
		System.out.println("2. PARA SALIR DEL MENU");
		System.out.println("3. PARA CREAR CLIENTE");
		System.out.println("4. PARA AGREGAR ANIMAL A CLIENTE");
		System.out.println("5. PARA AGREGAR HISTORIA CLINICA");
		System.out.println("6. PARA AGREGAR NUEVA MEDICINA");
		System.out.println("7. PARA HOSPITALIZAR");
		System.out.println("8. PARA SABER LAS HISTORIAS CLINICAS DE LOS CUARTOS");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
	}
}