import java.util.ArrayList;
import java.util.Collections;

public class Principal {
	
	
	public static void main(String[] args) {

		
		ArrayList <Vehiculo> Vehi  = new ArrayList<>();
		Vehi=Cargarvehiculos();
		print1(Vehi);
		print2(Vehi);
		
	}
		public static void print1(ArrayList<Vehiculo> VehiIn){
		for (Vehiculo str : VehiIn ){
			System.out.println(str.print());}
			
		
		System.out.println("");
		System.out.println("==================================");
		System.out.println("");
		
		System.out.println("Vehículo más caro: "+Concecionario.Vehiculomascaro(VehiIn));
		System.out.println("Vehículo más barato: "+Concecionario.Vehiculomasbarato(VehiIn));
		System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+Concecionario.Vehiculocontiene("y",VehiIn));
		System.out.println("");
		System.out.println("==================================");
		System.out.println("");}
		
	public static ArrayList<Vehiculo> Cargarvehiculos()
	{ArrayList <Vehiculo> VehiIn = new ArrayList<>();
	
	Autos auto1 = new Autos ("Peugeot","206",200000,4);
	Autos auto2 = new Autos ("Peugeot","208",250000,5);
	Motos moto1 = new Motos ("Honda","Titan",60000,"125c");
	Motos moto2 = new Motos ("Yamaha","YBR",80500.5,"160c");
	
	VehiIn.add(auto1);
	VehiIn.add(moto1);
	VehiIn.add(auto2);
	VehiIn.add(moto2);
	return VehiIn;
	
	
	}
	public static void print2(ArrayList<Vehiculo> VehiIn){
	Collections.sort(VehiIn);
	System.out.println("Vehículos ordenados por precio de mayor a menor:");
	for (Vehiculo str : VehiIn ){
		System.out.println(str.getMarca()+" "+str.getModelo());
	}
	
	
	}}
