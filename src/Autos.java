
public class Autos extends Vehiculo {

	private Integer Puertas;
	
	public Autos (String MarcaIn, String ModeloIn, double PrecioIn, Integer PuertasIn)
	{  super(MarcaIn,ModeloIn,PrecioIn);
	   Puertas=PuertasIn;
	}
	public void setPuertas(Integer PuertasIn)
	{Puertas=PuertasIn;}
	
	public Integer getPuertas()
	{return Puertas;}
	@Override
	public String print()
	{return "Marca: "+getMarca()+" // Modelo: "+getModelo()+" // Puertas: "+getPuertas()+" // Precio: $"+getPrecio();}
	@Override
	public String getClase()
	{return "Auto";}
}