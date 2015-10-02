//----------------------------------------------------------------------------------------------------------------------------------------------------

/**
 * Engineered and developed by Jhonny Trejos Barrios.
 * Technology: Apex for the Force.com platform.
 * Development Environment: Sublime Text 3.
 * ---------------------------------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------------------------------
 *
 * Additional Information.
 *
 *
 * Code Target:
 *				Extension para extraer campos del objeto 'Estudiante__c'; Como tambien el tamaño de la lista 'estudiantes' y gestionar las referencias
 *				de pagina para navegar entre una pagina de inicio (/apex/startPage) y otra de edicion de datos (/apex/editPage).
 *
 * Licence: 
 *			This software was coded for commercial use of Home Business Company only.
 *			Unauthorized copy or use in other companies is extrictly prohibited.
 *
 *
 * Developer Contact: jtrejosb@gmail.com || jtrejosb@live.com || jtrejosb@icloud.com
 * Mobile: (+57) 317 311 3223
 * © 2015
 */
//----------------------------------------------------------------------------------------------------------------------------------------------------

public with sharing class Items
{
	public List < Estudiante__c > estudiantes {get;set;}
	//------------------------------------------------------------------------------------------------------------------------------------------------

	public Items( ApexPages.StandardController controller )
	{
		estudiantes = [ select Nombres__c, Apellidos__c, Telefono__c from Estudiante__c ];
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------

	public Integer getStudentSize()
	{
		return estudiantes.size();
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------
	
	PageReference goBack()
	{
		PageReference back = new PageReference( '/apex/startPage');
		back.setRedirect( true );
		return back;
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------
	
	public PageReference saveAll()
	{
		update estudiantes;

		return goBack();
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------
	
	public PageReference cancel()
	{
		return goBack();
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------
}
//----------------------------------------------------------------------------------------------------------------------------------------------------