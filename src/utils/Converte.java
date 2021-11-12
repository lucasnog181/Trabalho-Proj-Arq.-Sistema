package utils;

import java.io.BufferedReader;
import java.io.IOException;

public class Converte{

	public static String converteJsonEmString(BufferedReader bufferedReader) {
		 String resposta, json = "";
		 
		 try {
			while ((resposta = bufferedReader.readLine()) != null) {
				  json += resposta;
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json;
	}
	
}
