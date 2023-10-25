package Objetos;

public interface iTigreDAO{

    public abstract void imprimirListadoTigres();
    public abstract Tigre obtenerTigreByID(int id);
    public abstract void insertarTigre();
    public abstract void actualizarTigre(Tigre tigreMod);
    public abstract void eliminarTigre(int id);
    
}