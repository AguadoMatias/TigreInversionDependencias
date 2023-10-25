package Objetos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Borges {

	
	public static void mostrarTigresBDPid()
	{	
		iTigreDAO iTigre = new TigreDAO();
    	iTigre.imprimirListadoTigres();
	}
	
	public static void mostrarTigresBD()
	{
    	AccesoDatos accesoBD = null;
    	Connection con = null;
    	Statement sentencia = null;
		ResultSet rs = null;
		
		String query = "select * from tigre";
        
        try {
        
        	accesoBD = new AccesoDatos();
            con = accesoBD.getConexion();
            sentencia = con.createStatement();
        
            rs  = sentencia.executeQuery(query);
            
            while(rs.next()){
            	
            		int idTigre = rs.getInt("idTigre");
					String nombre = rs.getString("nombre");  
					String fragilidad = rs.getString("fragilidad");
					String peligrosidad = rs.getString("peligrosidad");
					String vitalidad = rs.getString("vitalidad");
					String belleza = rs.getString("belleza");
					String tipoAtaque = rs.getString("tipoAtaque");
					String velocidad = rs.getString("velocidad");
					
            		System.out.println("Tigre Nro: " + String.valueOf(idTigre)
            		+ " Nombre " + nombre
					+ " Fragilidad " + fragilidad
					+ " Peligrosidad " + peligrosidad
					+ " Vitalidad " + vitalidad
					+ " Belleza " + belleza
					+ " Tipo de Ataque " + tipoAtaque
					+ " Velocidad " + velocidad
					);            	         		
            	            			
			}        
 
        } catch (SQLException e) {
            System.err.println("Error al CARGAR DATOS");
        }
       finally
        {
        	try
        	{
        		
        		if (rs!= null) rs.close();
        		
        		if (sentencia!= null) sentencia.close();
        		
        		if (con != null) con.close();
        		
        	}catch (SQLException e)
        	{
        		System.err.println("Error al cerrar conexion");
        	}
        }
	}

	public static void main(String[] args) throws IOException {

		mostrarTigresBDPid();
		/* 
		int opcion = 9;
		Tigre miTigre = null;

		opcion = obtenerSeleccionMenu();

		switch (opcion) {
			case 1:
				// TIGRE DE PALERMO
				miTigre = crearTigreElegido("Palermo", "delicado", "fatal", "hermoso", "sanguinario",
						"infinita Energia");
				break;

			case 2:
				// TIGRE DE SHERE KHAN
				miTigre = crearTigreElegido("Shere Khan", "Rustico", "Inofensivo", "Apenas bello", "Peligroso",
						"Limitada Energia");
				break;

			case 3:
				// TIGRE DE HUGO
				miTigre = crearTigreElegido("Hugo", "Indestructible", "Brutal", "Espantoso", "Destructivo",
						"Inagotable Energia");
				break;

			case 4:
				// TIGRE PERSONALIZADO
				miTigre = crearTigrePersonalizado();
				break;

			default:
				System.out.println("Debe seleccionar una opcion valida");

		}
		if ((opcion != 0) && (opcion <= 4)) {
			imprimirPoesia(miTigre.getNombre(), miTigre.getFragilidad(), miTigre.getPeligrosidad(),
					miTigre.getBelleza(), miTigre.getTipoAtaque(), miTigre.getVelocidad(), miTigre.getVitalidad());
		}
	*/
	}

	public static void imprimirPoesia(String nombre, String fragilidad, String peligrosidad, String belleza,
			String tipoAtaque, String velocidad, String vitalidad) {

		System.out.println("El Tigre de " + nombre + '\n');
		System.out.println("Iba y venia " + fragilidad
				+ " y " + peligrosidad + ", cargado de " + vitalidad
				+ ", del otro lado de los firmes\n barrotes y todos lo mirabamos. Era el tigre de esa ma�ana, en Palermo, "
				+ "y el tigre del\n Oriente y el tigre de Blake y de Hugo y Shere Khan, y los tigres que fueron y que seran"
				+ " y\n asimismo el tigre arquetipo, ya que el individuo, en su caso, es toda la especie. Pensamos\n que era "

				+ tipoAtaque + " y " + belleza
				+ ". Norah, una ni�a, dijo: Esta hecho para el amor.\n\n\n Jorge Luis Borges\n El oro de los tigres\n\n");
	}

	public static Tigre crearTigrePersonalizado() {
		Tigre tigreMio = new Tigre();

		System.out.println("Ingrese el nombre del Tigre: ");
		String nombre, fragil, peligro, belleza, tipoAtaque, vitalidad;

		Scanner teclado = new Scanner(System.in);
		nombre = teclado.nextLine();
		tigreMio.setNombre(nombre.toString());
		teclado.close();

		System.out.println("Ingrese la fragilidad del Tigre: ");
		teclado = new Scanner(System.in);
		fragil = teclado.nextLine();
		tigreMio.setFragilidad(fragil.toString());
		teclado.close();

		System.out.println("Ingrese la peligrosidad del Tigre: ");
		teclado = new Scanner(System.in);
		peligro = teclado.nextLine();
		tigreMio.setPeligrosidad(peligro.toString());
		System.out.println("Ingrese la belleza del Tigre: ");
		teclado.close();

		teclado = new Scanner(System.in);
		belleza = teclado.nextLine();
		tigreMio.setBelleza(belleza.toString());
		System.out.println("Ingrese el tipo de Ataque del Tigre: ");
		teclado.close();

		teclado = new Scanner(System.in);
		tipoAtaque = teclado.nextLine();
		tigreMio.setTipoAtaque(tipoAtaque.toString());
		System.out.println("Ingrese la vitalidad del Tigre: ");
		teclado.close();

		teclado = new Scanner(System.in);
		vitalidad = teclado.nextLine();
		tigreMio.setVitalidad(vitalidad.toString());
		teclado.close();

		return tigreMio;

	}

	public static int obtenerSeleccionMenu() {
		System.out.println("Bienvenidos al Oro de los Tigres: \n");
		System.out.println("Por favor seleccione el Tigre que desea conocer...\n");
		System.out.println("1. Tigre de Palermo\n");
		System.out.println("2. Tigre de Shere Khan\n");
		System.out.println("3. Tigre de Hugo\n");
		System.out.println("4. Crear un tigre personalizado..\n");
		System.out.println("0. Abandonar el programa\n");

		int opcion = -1;
		try {
			Scanner entrada = new Scanner(System.in);
			System.in.read();
			opcion = entrada.nextInt();
			entrada.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

		return opcion;
	}

	public static Tigre crearTigreElegido(String nombre, String fragilidad, String peligrosidad, String belleza,
			String tipoAtaque, String vitalidad) {
		Tigre tigreElegido = new Tigre();
		tigreElegido.setNombre(nombre);
		tigreElegido.setFragilidad(fragilidad);
		tigreElegido.setPeligrosidad(peligrosidad);
		tigreElegido.setBelleza(belleza);
		tigreElegido.setTipoAtaque(tipoAtaque);
		tigreElegido.setVitalidad(vitalidad);

		return tigreElegido;
	}




}
