package com.me.mygdxgame;

 class B{
	int x;
	void funcion()
	{
		System.out.println("Hola");
	}
	B()
	{
		System.out.print("xD");
	}
	B(int num)
	{
		System.out.println("Parametro:"+num);
	}
}
public class Proyecto {

	int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B mi_objeto=new B();
		mi_objeto.x=10;
		System.out.println(mi_objeto.x);
		
		B mi_otro_objeto=new B();
		mi_otro_objeto.x=20;
		
		System.out.println(mi_objeto.x);
		System.out.println(mi_otro_objeto.x);
		
		B objeto=new B();
		objeto.funcion();
		
		B obj=new B(16);
	}

}
