public class Motos extends Vehiculo {

	private String Cilindrada;
	
	public Motos (String MarcaIn, String ModeloIn, double PrecioIn, String CilindradaIn)
	{  super(MarcaIn,ModeloIn,PrecioIn);
	   Cilindrada=CilindradaIn;
	}
	public void setCilindrada(String CilindradaIn)
	{Cilindrada=CilindradaIn;}
	
	public String getCilindrada()
	{return Cilindrada;}
	@Override
	public String print()
	{return "Marca: "+getMarca()+" // Modelo: "+getModelo()+" // Cilindrada: "+getCilindrada()+" // Precio: $"+getPrecio();}
	@Override
	public String getClase()
	{return "Moto";}
}
