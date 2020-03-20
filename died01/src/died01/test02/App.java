package died01.test02;
import java.time.LocalDate;


public class App {

	public static void main(String[] args) {
		
		Boleteria bol1 = new Boleteria();
				
		bol1.setNombre("UTN");
		bol1.setFechaInicio(LocalDate.of(2020, 03, 20));
		
		//vendo 4
		bol1.vender(1);
		bol1.vender(2);
		bol1.vender(3);
		bol1.vender(4);
		bol1.vender(5);
		bol1.vender(1);
		bol1.vender(2);
		bol1.vender(3);
		bol1.vender(4);
		bol1.vender(5);
		bol1.vender(1);
		bol1.vender(2);
		bol1.vender(3);
		bol1.vender(4);
		bol1.vender(5);
		bol1.vender(1);
		bol1.vender(2);
		bol1.vender(3);
		bol1.vender(4);
		bol1.vender(5);



		System.out.println("Ventas: "+bol1.getCantidadDeClientes());
		
		System.out.println("Promedio: "+bol1.promedio());
	}
	
}
