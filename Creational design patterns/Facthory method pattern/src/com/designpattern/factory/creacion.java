package com.designpattern.factory;

public class creacion {
	
	public static void main(String[] args)
	{
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////Referencias: https://www.arquitecturajava.com/usando-el-patron-factory/////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		Factura f = FactoryFacturas.getFactura("iva");
		f.setId(1);
		f.setImporte(100);
		System.out.println(f.getImporteIva());
	}
	
	

}