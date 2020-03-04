package abstracto.domain;

/**
 * 
 * @author USUARIO
 *
 *         A interface is use to define the structure of a class to define the
 *         behavior its implementation is necessary the methods declared in a
 *         class by default are publics abstracts and don´t contain any
 *         implementation
 */
public interface _064InterfacesAccesoDatos {
	public static final int ROW_MAX = 10;

	public abstract void insert();
	
	public abstract void list();
}
