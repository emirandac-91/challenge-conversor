package usuarios;

import java.awt.EventQueue;
import GUI.*;

public class testFuncional {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Usuario enrique = new Usuario();
		enrique.userNamber = "enrique";
		enrique.userPass = "4505762";
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaIngreso vv = new ventanaIngreso();
					vv.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
