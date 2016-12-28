package com.jorge.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	/*
	 * public static void main(String[] args) { 
	 * 		Size s = new Size(); s.grow(44);
	 * 		s.grow2(); 
	 * }
	 */

	static int MAX_LENGTH = 5;
	private String brand;
	private boolean empty;
	
	int i1 = 1_234;
	//double d1 = 1_234_.0; FALLA
	//double d2 = 1_234._0; FALLA
	//double d3 = 1_234.0_; FALLA
	double d4 = 1_23_4.0_9;
	
	//int amount = 9L; FALLA
	int amount2 = 0b101;
	int amount3 = 0xE;
	double amount4 = 0xE;
	//double amount5 = 1_2_.0_0; FALLA
	//int amount6 = 1_2_; FALLA

	public static void main(String[] $_12args) {
		
		
		Main m1 = new Main();
		Main m2 = new Main();
		Main m3 = m1;
		System.out.println(m1 == m1);//true
		System.out.println(m1 == m2);//false
		System.out.println(m1.equals(m2)); //false
		System.out.println(m1 == m3);//true
		System.out.println(m1.equals(m3));//true
		
		
		String firstName = "John";
		final String lastName = "Smith";
		
		
		//System.out.print("Empty = " + empty); //FALLA!!!! Tendríamos que declararlo como static porque el método es static!!!!!!!
		Main wb = new Main();
		System.out.print("Empty = " + wb.empty); //Aquí ya no falla, hemos instanciado el onjeto (él mismo) y ya podemos acceder a él en un método estático
		System.out.println(", Brand = " + wb.brand);
		
		Size s = new Size(); s.grow(44);
		int resId = s.grow2(firstName, lastName);
		
		
		int x = 5 * 4 % 3;
		System.out.println("MÓDULOOOOO: " + x);
		
		System.out.println("IDDDD: " + resId);
		
		
		
		
		
		
		int count = 0;
		ROW_LOOP: for(int row = 1; row <=3; row++)
			          for(int col = 1; col <=2 ; col++) {
			        	  if(row * col % 2 == 0) continue ROW_LOOP;
			        	  count++;
			          }
		
		System.out.println("MÓDULOOOO222: " + count);
		
		
		//if(boolean xas = false){ //NO PERMITIDO
		//boolean xas; //No se inicializa a nada (ni a true ni a false) y daría un error en cuanto la quisiéramos utilizar sin haberla inicializado antes
		boolean xas = true;
		if(xas = false){ // Le asigna false y no se mete en el if
			System.out.println("Se mete");
		}	
		
		
		
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3"); //No se está asignando a ninguna variable, ni si quiera a s2.. luego s2 seguirá siendo "12"
		System.out.println("STRINGGGG: " + s2);
		
		s2 = s2.concat("3");//Aquí se está asignando a s2, luego s2 será "123"
		System.out.println("STRINGGGG222222: " + s2); 
		
		
		System.out.println("REPLACEEEEE char => 'a' por 'A': " + "abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("REPLACEEEEE CharSequence => \"ab\" por \"SwZ\": " + "abcabc".replace("ab", "SwZ")); // AbcAbc
		System.out.println("Animal".replace('a', 'A')); //AnimAl
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		System.out.println("TRIM: " + "\t	\t	a b\t c\n\te   ".trim()); //a b     c
		                                                                  //    e
		
		
		System.out.println("abcabc".replace('a', 'A')); //Remplaza todas las aes por Aes   AbcAbc
		System.out.println("abcabc".replace("a", "A")); //Lo mismo que arriba     AbcAbc
		//System.out.println("abcabc".replaceAll('a', 'A')); //Falla, replaceAll sólo funciona con String, no con char
		System.out.println("abcabc".replaceAll("a", "A")); //Lo mismo que arriba     AbcAbc
		
		System.out.println("abcabc".replace("ab", "rT")); //Remplaza todas lñas aes por rT   rTcrTc
		System.out.println("abcabc".replaceFirst("a", "opÑ")); //Reemplaza la PRIMERA a por opÑ    opÑbcabc
		
		System.out.println("abcabc".replace("[b|c]", "Unhg")); //Sale   abcabc
		System.out.println("abcabc".replaceAll("[b|c]", "Unhg")); //Sale   aUnhgUnhgaUnhgUnhg
		
		System.out.println("abcabc".replaceFirst("[b|c]", "Unhg")); //El primero que se encuentre entre bes y ces lo reemplaza   aUnhgcabc
		System.out.println("abcabc".replaceFirst("[c|b]", "Unhg")); //El primero que se encuentre entre bes y ces lo reemplaza   aUnhgcabc
		//System.out.println("abcabc".replaceFirst('a', 'A')); //Falla, replaceFirst sólo funciona con String, no con char
		
		System.out.println("abcabc".replace("b", "LK")); // aLKcaLKc
		System.out.println("abcabc".replaceAll("b", "LK")); // aLKcaLKc
		
		
		//FOR con CHAR: Muestra el alfabeto
		String alpha = "";
		for(char current = 'a'; current <= 'z'; current++)
			alpha += current;
		
		System.out.println(alpha);
		
		
		
		
		//No hace falta transformar los números a string!!!
		byte qqq = 3;
		
		//float r = 33.44;//Error!!! falta la f
		float r = 33.44f;
		double rr = 66;
		
		System.out.println(qqq);
		System.out.println(qqq = 24);
		System.out.println(r);
		System.out.println(rr); //Pinta 66.0
		System.out.println(1 + 4 + "pepe"); // Muestra "5pepe"
		System.out.println(1 + "pepe" + 4); //Pinta 1pepe4
		
		
		
		System.out.println("abc" + 's'); // Muestra string + char = abcs
		System.out.println("abc" + "abc".charAt(2)); // Muestra string + char = abcc
		System.out.println(2 + 3 + 's'); //Ojoooooooo: muestra 120... char 's' es numero y se suman
		//System.out.println('aaaa' + 's'); //Error 'aaaa' no es un char
		
		
		
		/*
		    esto
			es una
			cadena seprada-por
			puntos
		 */
		String[] res = "esto.es una.cadena seprada-por.puntos".split("\\.");
		for(String str : res)
			System.out.println(str);
		
		//String[] res = "esto.es una.cadena seprada-por.puntos"; //Ésto no funciona
		
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle"); // sb = "start+middle"
		StringBuilder same = sb.append("+end");	// "start+middle+end"
		
		System.out.println("SB: " + sb + "; SAME: " + same); //Muestran lo mismo
		
		//OJOOOOO: Si instancias un StringBuilder y luego otro y le asignas el primero instanciado,
		//Cualquier cosa que modifique en cualquiera de los dos afectará al otro
		StringBuilder aa = new StringBuilder("abc");
		StringBuilder bb = aa.append("de");
		//StringBuilder bb = new StringBuilder("zxy"); //Si creamos un StringBuilder para bb entonces no quedan ligados,
		                                               //y lo que cambie en aa no afecta a bb y viceversa
		bb = bb.append("f").append("g");
		System.out.println("aa=" + aa);
		System.out.println("bb=" + bb);
		aa = aa.append("h");
		System.out.println("aa=" + aa);
		System.out.println("bb=" + bb);
		aa.append("i");
		System.out.println("aa=" + aa);
		System.out.println("bb=" + bb);
		bb.append("j").append('k'); //Fíjate, le asignamos hasta char y todo
		System.out.println("aa=" + aa);
		System.out.println("bb=" + bb);
		//Tanto aa como bb su resultado es abcdefghijk
		
		
		
		StringBuilder sa = new StringBuilder("animals");
		String sub = sa.substring(sa.indexOf("a"), sa.indexOf("al"));
		int len = sa.length();
		char ch = sa.charAt(6);
		System.out.println(sub + " " + len + " " + ch); // anim 7 s
		
		
		StringBuilder sbq = new StringBuilder().append(1).append('c');
		sbq.append("-").append(true);
		System.out.println(sbq);	// 1c-true
		
		
		StringBuilder sbz = new StringBuilder("animals");
		sbz.insert(7, "-");	// sbz = animals-
		sbz.insert(0, "-");	// sbz = -animals-
		sbz.insert(4, "-RETE");	// sbz = -ani-RETEmals
		System.out.println(sbz); // -ani-RETEmals-
		sbz.insert(0, 'X');	// sbz = -animals-
		System.out.println(sbz); // X-ani-RETEmals-
		
		
		StringBuilder sbx = new StringBuilder("abcdef");
		sbx.delete(1, 3); // sbx = adef
		sbx.deleteCharAt(2); // sbx = adf
		//sbx.deleteCharAt(5);	// throws an exception. No falla en eclipse pero sí al ejecutarse
		System.out.println(sbx); // Muestra adf
		
		
		
		
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		//StringBuilder three = one.append("a");
		StringBuilder three = one;
		System.out.println(one == two); // false
		System.out.println(one == three); // true
		two = one;
		System.out.println(one == two); // true
		
		
		//MORALEJA: Usar equals() para comparar cadenas y no ==. == lo usaremos sólo en el examen
		//In case you are wondering, the authors of
		//StringBuilder did not implement equals() . If you call equals() on two StringBuilder
		//instances, it will check reference equality.
		String xb = "Hello World";
		String yb = "Hello World"; //Al ser EXACTAMENTE la misma cadena que xb, tanto xb como y yb apuntan a la misma localización en memoria
		System.out.println(xb == yb);	// true x e y apuntan a la misma localización en memoria
		
		String xc = "Hello World";
		String zc = " Hello World".trim(); //Aunque el resultado es el mismo que en xc, al ser manipulada para llegar a ello ya no apunta a la misma localización en memoria
		                                   //luego NO son iguales
		System.out.println(xc == zc);	// false  xc y zc no apuntan a la misma localización en memoria
		System.out.println(xc.equals(zc)); //Pero esto es TRUE
		
		String xd = new String("Hello World"); // Since you have specifi cally requested a different String object, the pooled value isn’t shared.
		String yd = "Hello World";
		System.out.println(xd == yd); // false
		
		
		
		//ARRAYS
		
		String [] bugs = { "cricket", "beetle", "ladybug" };
		String [] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		//System.out.println(bugs.toString()); //ERROR
		System.out.println(Arrays.toString(bugs)); // Así se pinta un array desde Java 5
		
		
		String[] strings = { "stringValue" };
		System.out.println(Arrays.toString(strings)); // Muestra [stringValue]
		System.out.println(strings[0]); // // Muestra stringValue sin []
		
		Object[] objects = strings; //Lo convertimos en clase object (todo en java hereda de object)
		System.out.println(Arrays.toString(objects));// Muestra [stringValue]
		
		String[] againStrings = (String[]) objects; //Le hacemos un casteo para convertirlo en String de nuevo
		System.out.println(Arrays.toString(againStrings));// Muestra [stringValue]
		
		//againStrings[0] = new StringBuilder();	// DOES NOT COMPILE - Queremos meter StrinBuilder en un array de String y StringBuilder no es String, por lo que falla
		
		//objects[0] = new StringBuilder();	// careful!  Mirar página 33 por atrás, en el *
		/*
		 From the point of view of the compiler, this is just fine. A StringBuilder object can clearly go in an Object[] . 
		 The problem is that we don’t
		 actually have an Object[] . We have a String[] referred to from an Object[] variable. At
		 runtime, the code throws an ArrayStoreException . You don’t need to memorize the name
		 of this exception, but you do need to know that the code will throw an exception.
		 */
		
		
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print (numbers[i] + " ");
		
		String[] strings2 = { "10", "9", "100" };
		Arrays.sort(strings2);
		for (String string : strings2)
			System.out.print(strings2 + " ");
		
		System.out.println();
		
		
		int[][] vars1; // 2D array
		int vars2 [][];	// 2D array
		int[] vars3[]; // 2D array
		int[] vars4 [], space [][]; // a 2D AND a 3D array
		int[][][] space2; // 3D array
		int space3[][][]; //3D array
		int hiperspace[][][][]; //4D array
		
		String [][] rectangle = new String[3][2];
		
		//Array asimétrico
		int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
		
		//Éste también es array asimétrico
		int [][] args = new int[4][];
		args[0] = new int[5];
		args[1] = new int[3];
		
		int[][] twoD = new int[3][2];
		System.out.println("twoD.length: " + twoD.length); //OJOOOOOOOOOOOOOOOOOOOOOOOO
		System.out.println("twoD[0].length: " + twoD[0].length); //OJOOOOOOOOOOOOOOOOOOOOOOO
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " "); // print element
			System.out.println(); // time for a new row
		}
		
		//Lo mismo que lo de arriba pero con foreach
		//OJJJJIIIIIIIIISIMOOOOOOOOOO
		for (int[] inner : twoD) {
			for (int num : inner) 
				System.out.print(num + " ");
			System.out.println();
		}
		
		
		
		//ArrayList
		//Antes de Java 5 y que aún funcionan
		ArrayList list1 = new ArrayList(); //ArrayList de Objects: almacena de todo menos tipos primitivos y además mezclados
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		//A partir de Java 5
		ArrayList<String> list4 = new ArrayList<String>();
		//A partir de JAva 7
		ArrayList<String> list5 = new ArrayList<>();
		
		List<String> list6 = new ArrayList<>(); //Puedes almacenar un ArrayList en una variable referencia de List
		//ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE  pero no una List en una variable referencia de ArrayList porque
											    //List es una interface y las interfaces no se puedeninstanciar
		
		
		//ArrayList de Objects: almacena de todo menos tipos primitivos y además mezclados como en este ejemplo que mete un String y un boolean
		ArrayList list = new ArrayList();
		list.add("hawk");// [hawk]Understanding an ArrayList
		list.add(Boolean.TRUE); 	// [hawk, true]
		System.out.println(list);	// [hawk, true]
		
		List<String> birds = new ArrayList<>(); //Éste sólo almacena datos de tipo String
		birds.add("hawk");		// [hawk]
		//birds.add(Boolean.TRUE); 	// ERROR: sólo almacena tipos de datos String
		//birds.add(3, "robin");		// ERROR en tiempo de ejecución
		birds.add(1, "robin");		// [hawk, robin]
		birds.add(0, "blue jay");		// [blue jay, hawk, robin]
		birds.add(1, "cardinal");		// [blue jay, cardinal, hawk, robin]
		System.out.println(birds);		// [blue jay, cardinal, hawk, robin]
		System.out.println(birds.toString());		// [blue jay, cardinal, hawk, robin]
		
		
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk");	// [hawk]
		birds2.add("hawk");	// [hawk, hawk]
		System.out.println(birds2.remove("cardinal")); // prints false
		System.out.println(birds2.remove("hawk")); // prints true
		System.out.println(birds2.remove(0)); // prints hawk
		//System.out.println(birds2.remove(4)); // ERROR en tiempo de ejecución
		System.out.println(birds2);		// []
		
		
		
		
		List<String> birds3 = new ArrayList<>();
		birds3.add("hawk");	// [hawk]
		System.out.println(birds3.size());	// 1
		birds3.set(0, "robin");	// [robin]
		System.out.println(birds3.size());	// 1
		//birds3.set(1, "robin");	// ERROR: IndexOutOfBoundsException
		birds3.add("Pepe"); //[robin, Pepe]
		System.out.println(birds3); //[robin, Pepe]
		birds3.set(1,  "robin"); //[robin, robin]
		System.out.println(birds3); //[robin, robin]
		

		
		//Ejemplo backed list
		String[] array = { "hawk", "robin" };// [hawk, robin]
		List<String> list12 = Arrays.asList(array); // returns fixed size list
		System.out.println(list12.size());// 2
		list12.set(1, "test");// [hawk, test]
		array[0] = "new";// [new, test]
		for (String b12 : array) System.out.println(b12 + " "); // new test
		//list12.remove(1);	// throws UnsupportedOperation Exception
		
		
		
		Period wrong = Period.ofYears(1);
		wrong = Period.ofWeeks(7);
		
		
		
		//String qaz = 4 + 1; //ERROR: no puedes asignar int a String pero sí en un syso
		System.out.println(4 + 1); //4+ 1 = 5
		
		
		StringBuilder sbxx = new StringBuilder();
		sbxx.append("aaa").insert(1, "bb").insert(4, "ccc");
		System.out.println(sbxx);
		
		
		String letters = "abcdef";
		System.out.println(letters.length());
		
		String azzz = "";
		azzz += 2;
		azzz+= 'c';
		azzz += false;
		if ( azzz == "2cfalse") System.out.println("==");
		if ( azzz.equals("2cfalse")) System.out.println("equals");
		
		
		StringBuilder numbers1 = new StringBuilder("0123456789");
		numbers1.delete(2, 8);
		numbers1.append("-").insert(2, "+");
		System.out.println(numbers1);
		
		
		//StringBuilder b = "rumble"; => NO COMPILA; NO PUEDES ASIGNAR STRING A UN STRINGBUILDER!!!!
		//b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
		//System.out.println(b);
		
		
		int[][] scores = new int[5][];
		Object[][][] cubbies = new Object[3][0][5];
		Object[][][] cubbies2 = new Object[3][0][];
		//Object[][][] cubbies3 = new Object[3][][5]; //ILEGAL, si no se especifica el valor en la segunda dimensión, tampoco en la tercera... La primera dimensión SIEMPRE se debe especificar
		Object[][][] cubbies4 = new Object[3][][];
		//Object[][][] cubbies5 = new Object[][][]; //ILEGAL, la primera dimensión SIEMPRE se debe especificar
		//String beans[] = new beans[6]; //NO ES UNA DECLARACIÓN LEGAL
		java.util.Date[] dates[] = new java.util.Date[2][];
		//int[][] types = new int[2]; //ILEGAL
		//int[][] types = new int[]; //NO ES UNA DECLARACIÓN LEGAL
		//int[][] java = new int[][]; //NO ES UNA DECLARACIÓN LEGAL, hay que poner algo al menos en el primer [] de new int[][], como new int[3][] o new int[4][2]
		//int[][] java = new int[][4]; //NO ES UNA DECLARACIÓN LEGAL, hay que poner algo al menos en el primer [] de new int[][], como new int[3][] o new int[4][2]
		//int[2][3] java = new int[2][]; //ILEGAL númeroen int[][] java =...  esse int[][] no puede levar números en ninguno de sus [][]
		//int[2][] java = new int[2][]; //ILEGAL númeroen int[][] java =...  esse int[][] no puede levar números en ninguno de sus [][]
		
		
		char[]c = new char[2];
		//int length1 = c.capacity;//NO existe
		//int length2 = c.capacity(); //NO existe
		int length3 = c.length;  //OJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
		//int length4 = c.length(); //OJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
		//int length5 = c.size;//OJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  NO EXISTE SIZE PARA ARRAYS
		//int length6 = c.size();//OJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  NO EXISTE SIZE PARA ARRAYS
		
		ArrayList l = new ArrayList();
		//int length7 = l.capacity;//NO existe
		//int length8 = l.capacity();//NO existe
		//int length9 = l.length;//OJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  NO EXISTE LENGTH PARA ARRAYS
		//int length10 = l.length();//OJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  NO EXISTE LENGTH PARA ARRAYS
		//int length11 = l.size;//OJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
		int length12 = l.size();//OJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
		
		
		List<String> listg = new ArrayList<String>();
		listg.add("one");
		listg.add("two");
		//listg.add(7);//NO COMPILAAAA  NO puedes añadir un int a un String, aunque sea dentro de una lista
		for(String sg : listg) System.out.println(sg);
		
		
		ArrayList<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(5);
		values.set(1, 6);
		values.remove(0);
		for (Integer v : values) System.out.println(v);
		
		
		
		List<Integer> lista = Arrays.asList(10, 4, -1, 5);
		Collections.sort(lista);
		Integer arraya[] = lista.toArray(new Integer[4]);
		System.out.println(arraya[0]); // SOLUCIÓN:  -1
		
		
		
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		Collections.sort(hex);
		int xcc = Collections.binarySearch(hex, "8");
		int ycc = Collections.binarySearch(hex, "3A");
		int zcc = Collections.binarySearch(hex, "4F");
		System.out.println(xcc + " " + ycc + " " + zcc); //SOLUCIÓN: 2 1 -3  =>  pone -3 porque es la posición dentro de la lista donde cree que debería ir, empezando a contar desde 1
		
		
		
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		ages.add(null);
		//for (int age : ages) System.out.print(age); //ERROR EN TIEMPO DE EJECUCIÓN: cuando le llega el "null" casca porque espera un int
		
		
		
		List<String> onew = new ArrayList<String>();
		onew.add("abc");
		List<String> twow = new ArrayList<>();
		twow.add("abc");
		if (onew == twow)
			System.out.println("A");
		else if (onew.equals(twow))
			System.out.println("B");
		else
			System.out.println("C");
		
		
		
		
		
		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2);
		//date.plusHours(3); MALLLLL a un LocalDate no se le puede añadir Horas!!!!
		System.out.println(date.getYear() + " " + date.getMonth() + " "	+ date.getDayOfMonth());
		
		
		//LocalDate date2 = LocalDate.of(2018, Month.APRIL, 40); //ERROR EN TIEMPO DE EJECUCIÓN!!!! DÍA 40??????
		//System.out.println(date2.getYear() + " " + date2.getMonth() + " "	+ date2.getDayOfMonth());
		
		
		
		LocalDate date4 = LocalDate.of(2018, Month.APRIL, 30);
		date4.plusDays(2);
		date4.plusYears(3);
		System.out.println(date4.getYear() + " " + date4.getMonth() + " " + date4.getDayOfMonth());
		
		
		
		
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f));//11:22 AM
		System.out.println(f.format(d));//11:22 AM
		f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		System.out.println(d.format(f));//11:22:33 AM
		System.out.println(f.format(d));//11:22:33 AM
		//f = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG); //ERROR en tiempo de ejecución
		
		f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(d.format(f));//  3/7/2014
		System.out.println(f.format(d));//  3/7/2014
		f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(d.format(f));//Mar 7, 2014
		System.out.println(f.format(d));//Mar 7, 2014
		f = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(d.format(f));//March 7, 2014
		System.out.println(f.format(d));//March 7, 2014
		
		f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(d.format(f));//  3/7/14 11:22 AM
		System.out.println(f.format(d));//  3/7/14 11:22 AM
		f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(d.format(f));//Mar 7, 2014 11:22:33 AM
		System.out.println(f.format(d));//Mar 7, 2014 11:22:33 AM
		//f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG); //ERROR en tiempo de ejecución
		
		
		
		String sas = "Hello";
		String tas = new String(sas);
		if ("Hello".equals(sas)) System.out.println("one"); //SI
		if (tas == sas) System.out.println("two");//NO
		if (tas.equals(sas)) System.out.println("three");//SI
		if ("Hello" == sas) System.out.println("four");//SI
		if ("Hello" == tas) System.out.println("five");
		
		
		
		/*
		String s1a = "java";
		StringBuilder s2a = new StringBuilder("java");
		if (s1a == s2a) //INCOMPATIBLE TYPES--Estás comparando String con StrinBuilder!!!!!
			System.out.print("1");
		if (s1a.equals(s2a))
			System.out.print("2");
		*/
		
		
		
		
		String [] names = {"Tom", "Dick", "Harry"};
		//List<String> listo = names.asList(); //FATALLLLLL sería Arrays.asList(names);
		List<String> listo = Arrays.asList(names); //Así sí
		listo.set(0, "Sue");
		System.out.println(names[0]);
	}
}
