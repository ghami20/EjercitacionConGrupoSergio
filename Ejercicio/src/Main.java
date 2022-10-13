import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Aca empieza el programa");
		
		Autor cortazar = new Autor("Julio","Cortazar","1914","masculino","Cortazar2008xd@gmail.com");

		
		
		//String nombre, String año, int cantidad, int costo, Autor autor
		Libro rayuela = new Libro("Rayuela","1940",10,100,cortazar);
		
		JOptionPane.showMessageDialog(null, rayuela);
		
		
	}

}
