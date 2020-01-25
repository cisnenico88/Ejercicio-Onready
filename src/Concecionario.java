import java.util.ArrayList;


public interface Concecionario {

public static String Vehiculomascaro (ArrayList<Vehiculo> VehiIn ) {
	 {double preciomax=0;
String vehiculocaro="";
	for (Vehiculo str : VehiIn ){
		if (str.getPrecio()>preciomax){preciomax=str.getPrecio();vehiculocaro=str.getMarca()+" "+str.getModelo();}}
	return vehiculocaro;}
}
public static String Vehiculomasbarato (ArrayList<Vehiculo> VehiIn ) 
{double preciomin=1000000000;
String vehiculobarato="";
for (Vehiculo str : VehiIn ){
if (str.getPrecio()<preciomin){preciomin=str.getPrecio();vehiculobarato=str.getMarca()+" "+str.getModelo();}}
return vehiculobarato;}
public static String Vehiculocontiene (String LetraIn ,ArrayList<Vehiculo> VehiIn  )
{String vehiculocontiene="";
boolean y; 
for (Vehiculo str : VehiIn ){   
y=str.getModelo().contains(LetraIn);
   if (y)vehiculocontiene=str.getMarca()+" "+str.getModelo()+" $"+str.getPrecio();}
   return vehiculocontiene;}
}
