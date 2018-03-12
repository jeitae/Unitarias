package PracticaEclipse.Unitarias.Utilitario;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import ru.yandex.qatools.allure.annotations.Attachment;

public class CapturarLog {

	private FileWriter escribir;

	private PrintWriter escribirEnArchivo;
	private SimpleDateFormat dateFormat;
	
	
	@Attachment(value = "{0}", type = "text/plain")
	private String saveTextLog(String attachName, String message) {

		try {

			dateFormat = new SimpleDateFormat("dd-MMM-yyyy-hh_mm_ssaa");

			String nombreDestino = dateFormat.format(new Date()) + ".txt";

			new File("src/test/resources/Pruebas").mkdirs();

			File archivo = new File("src/test/resources/Pruebas/" + nombreDestino);

			escribir = new FileWriter(archivo, false);

			escribirEnArchivo = new PrintWriter(escribir);

			escribirEnArchivo.println(message);

			return message;

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				escribir.close();

			}

			catch (Exception e2) {

				e2.printStackTrace();

			}
		}

		return message;
	}
	
	
	public String enviarLog(String prueba, String log) {

		return saveTextLog(prueba, log);
	}
	
}
