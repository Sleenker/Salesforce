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
 *				Extension para extraer la lista de todos los registros 'Estudiante__c' disponibles en la base de datos.
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

public with sharing class AllStudents
{
	public List < Estudiante__c > estudiantes {get;set;}
	//------------------------------------------------------------------------------------------------------------------------------------------------

	public AllStudents( ApexPages.StandardController controller )
	{
		estudiantes = [ select Nombres__c, Apellidos__c, Telefono__c from Estudiante__c ];
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------

	public String getTitle()
	{
		return 'Estudiantes Registrados';
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------
}
//----------------------------------------------------------------------------------------------------------------------------------------------------