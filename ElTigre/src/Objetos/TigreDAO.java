package Objetos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TigreDAO implements iTigreDAO{

    AccesoDatos accesoBD = null;
    Connection con = null;
    Statement sentencia = null;
	ResultSet rs = null;

    @Override
    public void imprimirListadoTigres() {
        
        String query = "select * from tigre";
        
        try {
        
        	accesoBD = new AccesoDatos();
            con = accesoBD.getConexion();
            sentencia = con.createStatement();
        
            rs  = sentencia.executeQuery(query);
            System.out.println("\n---LISTADO DE TIGRES EN BD---\n");   	         		
            
            while(rs.next()){                    
            	
            		int idTigre = rs.getInt("idTigre");
					String nombre = rs.getString("nombre");  
					String fragilidad = rs.getString("fragilidad");
					String peligrosidad = rs.getString("peligrosidad");
					String vitalidad = rs.getString("vitalidad");
					String belleza = rs.getString("belleza");
					String tipoAtaque = rs.getString("tipoAtaque");
					String velocidad = rs.getString("velocidad");
					
            		System.out.println("Tigre Nro: " + String.valueOf(idTigre));
            		System.out.println(" Nombre: " + nombre);
					System.out.println(" Fragilidad: " + fragilidad);
					System.out.println(" Peligrosidad: " + peligrosidad);
					System.out.println(" Vitalidad: " + vitalidad);
					System.out.println(" Belleza: " + belleza);
					System.out.println(" Tipo de Ataque: " + tipoAtaque);
					System.out.println(" Velocidad: " + velocidad);
					        
                    System.out.println("\n--------------------------------------\n");   	         		
            	            			
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

    @Override
    public Tigre obtenerTigreByID(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTigreByID'");
    }

    @Override
    public void insertarTigre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertarTigre'");
    }

    @Override
    public void actualizarTigre(Tigre tigreMod) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarTigre'");
    }

    @Override
    public void eliminarTigre(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarTigre'");
    }

}