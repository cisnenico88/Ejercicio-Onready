


public abstract class Vehiculo implements Comparable<Vehiculo>,Concecionario{
	
	private String Marca,Modelo;
	private double Precio;
	
	public Vehiculo (String MarcaIn, String ModeloIn, double PrecioIn)
	{
		Marca=MarcaIn;
		Modelo=ModeloIn;
		Precio=PrecioIn;
	}
	public void setMarca (String MarcaIn)
	
	{ Marca=MarcaIn;}
	
	public void setModelo (String ModeloIn)
	
	{ Modelo=ModeloIn;}
	
	public void setPrecio (double PrecioIn)
	{ Precio=PrecioIn;}
	
	public String getMarca ()
	{ return Marca;}
	
	public String getModelo ()
	{ return Modelo;}
	
	public double getPrecio ()
	{ return Precio;}
	
	public abstract String getClase();
	public abstract String print();
	 @Override
     public int compareTo(Vehiculo A) {
         if (Precio > A.Precio) {
             return -1;
         }
         if (Precio < A.Precio) {
             return 1;
         }
         return 0;
     } 

	 
	
	 
	 
		
		
		}
