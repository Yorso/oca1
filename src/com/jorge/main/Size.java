package com.jorge.main;

public class Size {
	static int MAX_LENGTH = 5; //Ésto es una variable de clase. Se inicializaría a cero si no le damos valor
	int length; //Se inicializa a cero porque es variable de instancia de una clase
	
	public void grow(int inches){
		
		System.out.println("AAAA: " + Integer.toString(length));
		
		if (length < MAX_LENGTH) {
			int newSize = length + inches;
			length = newSize;
		}
		
		System.out.println("BBBB: " + Integer.toString(length));
	}
	
public int grow2(String firstName, final String lastName){
		
		System.out.println("CCCC: " + Integer.toString(length));
		
		System.out.println("Div: " + 10 / 3); // Outputs 3
		System.out.println("Mod: " + 10 % 3); // Outputs 1
	
		int y =  6; 
		System.out.println((y > 5) ? 21 : "Zebra"); //No hace falta transformar el número 21 en String para que lo pinte syso
		
		int dayOfWeek = 5;
		
		switch (dayOfWeek) { //Resultado es Saturday auqnue el dafault con break esté el primero
			default:
				System.out.println("Weekday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
		}
		
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		
		switch(firstName) {
			case "Test": //COMPILE: Comparando String con constante String (importante que sea constante y del mismo tipo)
				return 52;
			//case middleName: // DOES NOT COMPILE: Comparando String con otro String pero que no es final (constante)
				//id = 5;
				//break;
			case suffix: //COMPILE: Comparando String con final String (importante que sea final = constante y del mismo tipo)
				id = 0;
				break;
			//case lastName: // DOES NOT COMPILE: Aunque sea final, al ser pasada como parámetro al método, ya no lo es, no puede ser comparada
				//id = 8;
				//break;
			//case 5: // DOES NOT COMPILE: Comparando String con literal (número)
				//id = 7;
				//break;
			//case 'J': // DOES NOT COMPILE: Comparando String con char
				//id = 10;
				//break;
			//case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE: Comparando String con un enum value
				//id=15;
				//break;
		}
		
		
		
		//OPTIONAL LABELS ,BREAK y CONTINUE
		int[][] list = { { 1, 13, 5 }, { 1, 2, 5 }, { 2, 7, 2 } };
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}
		
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.print(" " + a + x);
			}
		}

		
		//Cualquier operación que se haga con dos operands de tipo char, byte o long se castea directamente su resultado a int
		byte b1 = 10;
		//byte b2 = 12;
		short b2 = 12;
		
		//char zchar = b1 + b2; // NO  COMPILA
		//byte zbyte = b1 + b2; // NO COMPILA
		//short zshort = b1 + b2; // NO COMPILA
		int zint = b1 + b2;
		long zlong = b1 + b2;
		float zfloat = b1 + b2;
		double zdouble = b1 + b2;
		
		
		
		//String res = false; //NO COMPILA
		
		//NO COMPILA- no podemos guardar en un int un long..
		//Soluciones:
		/*  Cast l1 on "int i1 = 2 * l1;" to int.
	        Change the data type of l1 on "long l1 = 20;" to short.
			Cast 2 * l1 on "int i1 = 2 * l1;" to int.
			Change the data type of i1 to long.
		*/
		//long l1 = 20;
		//int i1 = 2 * l1;

		//SÍ COMPILA- Sí podemos guardar en un long un int
		int i2 = 20;
		long l2 = 2 * i2;
		
		
		int xQ = 4;
		long yQ = xQ * 4 - xQ++;
		if(yQ<10) System.out.println("Too Low");
		else System.out.println("Just right");
		//else System.out.println("Too High"); //Este else sobra
		
		
		int xxx = 5;
		System.out.println(xxx > 2 ? xxx < 4 ? 10 : 8 : 7); //Fíjate que operador ternario más "chulo": Un ternario dentro de otro ternario.. flipa...
		
		
		
		boolean x25 = true, z25 = true;
		int y25 = 20;
		x25 = (y25 != 10) ^ (z25=false);
		System.out.println(x25+", "+y25+", "+z25);  //SOLUCIÓN: Muestra true, 20 , false
		
		
		byte a = 40, b = 50;
		byte sum = (byte)(a + b); // CORRECTOOOO
		//byte sum2 = (byte) a + b; //INCORRECTO; NO COMPILA
		System.out.println(sum);
		
		
		int xa = 0;
		String s = null;
		//if(xa == s) System.out.println("Success"); //NO COMPILA- No puedes comparar tipos incomplatibles, en este caso un String con un int
		//else System.out.println("Failure");
		
		
		int x1 = 50, x2 = 75;
		boolean b111 = x1 >= x2;
		if(b111 = true) System.out.println("Success"); //Lo que hace es asignar b1 = true, luego es true y su salida es "Success"
		else System.out.println("Failure");
		
		
		
		
		//PREGUNTA DE EXAMEN= Qué muestra este código?
		//OJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
		/*for(int i=0; i<10 ; ) {
			i = i++;
			System.out.println("Hello World");
		}*/
		//INFINITAS VECES HELLO WORLD!!!!!
		/*
		 * i = i++;
		 * i++ es: primero muestra valor (0) y luego suma 1... luego i = primero muestra valor (0)
		 * A i se le estaría asignando infinitamente 0
		 */
		
		
		/*
		do {
			int yaz = 1; //La declaramos dentro del do-while, luego su ámbito de acción es dentro del do-while.. El do while no puede usarla, como en este caso ocurre
			System.out.print(yaz++ + " ");
		} while(yaz <= 10); // yaz está declarada dentro del do-while, luego en "while(yaz <= 10);" no podemos hacer referencia a ella, está fuera de su alcance (SCOPE)
		*/
		
		return id;
	}
}
