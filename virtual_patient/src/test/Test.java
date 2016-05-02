package test;

import virtual_patient.paramGen.Params;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.print("asdf");
		Params p=new Params();
		Params d=p;
		p.a=12.0;
		d=p;
		System.out.print(d.a);
	}

}
