package com.platzi.mensaje_app;
import java.sql.Connection;
import java.util.Scanner;

import com.platzi.mensaje_app.service.MensajeService;

public class inicio {
	
	public static  void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		do {
			System.out.println("--------------------");	
			System.out.println("1. Crear mensaje");
			System.out.println("2.listar Mensaje");
			System.out.println("3.editar mensaje");
			System.out.println("4.Eliminar mensaje");
			System.out.println("5. Salir");
			
			//llemos la opcion del usuario
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				MensajeService.CrearMensaje();
				break;
			case 2: 
				MensajeService.ListarMensajes();
				break;
			case 3: 
				MensajeService.editarMensaje();
				break;
			case 4: 
				MensajeService.borrarMensaje();
				break;
			default: 
				break;
			}
		} while (opcion != 5);
		
		
	}
}
