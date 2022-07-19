package Task4;

import javax.swing.JOptionPane;

public class Calculo {

	public void operacion() {
		int opcion = 0;
		try {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"que operación quiere realizar? \n1 - suma\n2 - resta\n3 - multiplicación\n4 - división\n5 - potencia\n6 - raíz cuadrada\n7 - raíz cubica"));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		switch (opcion) {
		case 1:
			suma();
			break;
		case 2:
			resta();
			break;
		case 3:
			multiplica();
			break;
		case 4:
			divide();
			break;
		case 5:
			potencia();
			break;
		case 6:
			raizCuadrada();
			break;
		case 7:
			raizCubica();
			break;
		default:
			JOptionPane.showMessageDialog(null, "la opción introducida no es correcta");
			break;
		}
	}

	public void suma() {

	}

	public void resta() {

	}

	public void multiplica() {
	}

	public void divide() {

	}

	public void potencia() {

	}

	public void raizCuadrada() {
	}

	public void raizCubica() {
	}

}
