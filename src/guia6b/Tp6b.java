package guia6b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Tp6b {

	public static void main(String[] args) 
	{
     // List<Character> list =new ArrayList<>();
      Map<Character, Integer> hash=new HashMap<>();
	  Scanner scanner=new Scanner(System.in);
	  ejerc1();
    
	}
	/* private static void ejerc1() 
	 {
		 Map<Character, Integer> hash=new HashMap<>();	
		 Scanner scanner=new Scanner(System.in);
		 System.out.print("ingrese la cadena de caracteres");
		 String chain=scanner.nextLine();
		 scanner.close();
		 
		 for(int i=0;i<chain.length();i++) 
		 {
			 char aux=chain.charAt(i);
			if(hash.containsKey(aux)) {
				hash.put(aux, hash.get(chain)+1);
				
			}else  
			      {
				     hash.put(aux,1);
				
			      }
			 
			 
		 }
		System.out.println("caracteres y cantidad de veces que aparecen");
		for (Character map : hash.keySet()) {
			System.out.println(map +" - "+hash.get(map));
			
		}
	    	
	    	
	 }*/
	private static void ejerc1() 
	{
		Map<Character, Integer> hash=new HashMap<>();
		
		char aux='m';
		char a;
		List<Character> list=new ArrayList<>();
		while(aux !='s') 
		{
			char c;
			
			Scanner scan=new Scanner(System.in);
			System.out.print("ingrese una letra");
			c=scan.next().charAt(0);
			list.add(c);
			
			System.out.print("para terminar ingrese .....s");
			aux=scan.next().charAt(0);
			
		}
		for (int i=0;i<list.size();i++) 
		{
			a=list.get(i);
			if(hash.containsKey(list.get(i)))
			{
				
			hash.put(a, hash.get(list)+1);
			
			}
		}
	}
   private static void ejerc2() 
   {
	   
	   int aux=0;
	   List <Integer> l1=new ArrayList<>();
	   Set<Integer> hashset=new HashSet<>();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("ingrese el numero de notas a ingresar");
	   aux=sc.nextInt();
	   for(int i=0;i<aux;i++) 
	   {
		   
		   l1.add((int)Math.floor(Math.random()*10+1));
	   }
	   Collections.sort(l1);
	   
	   for (Integer array : l1) 
	   {
		   hashset.add(array);
		
	   }
   }
   
   private static void ejerc3() {
	   Person n=new Person();
	   int aux=0;
	   String name;
	   Integer age;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("ingrese el numero de notas a ingresar");
	   aux=sc.nextInt();
	   
	   List<Person>arrayPerson= new ArrayList<>();
	   TreeMap<Integer, String> map=new TreeMap<Integer, String>();
	   for (int i=0;i<aux;i++) 
	   {
		   Scanner sn=new Scanner(System.in);
		   System.out.println("ingrese nombre");
		   name=sn.nextLine();
		   name=arrayPerson.get(i).getName();
		   Scanner si=new Scanner(System.in);
		   System.out.println("ingrese edad");
		   age=si.nextInt();
		   age=arrayPerson.get(i).getEdad();
		   
	  }
	   Collections.sort(arrayPerson); 
	   for (int i=0;i<arrayPerson.size();i++) {
		map.put(arrayPerson.get(i).getEdad(), arrayPerson.get(i).getName());
	}
   }
   
   
}
