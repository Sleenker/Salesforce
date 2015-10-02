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
 *				Extension para extraer un unico registro 'Estudiante__c' a partir de su ID en la base de datos.
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

public with sharing class SingleStudent
{
	id recordID;
	public List < Estudiante__c > estudiantes {get;set;}
	//------------------------------------------------------------------------------------------------------------------------------------------------

	public SingleStudent( ApexPages.StandardController controller )
	{
		this.recordID = controller.getRecord().id;
		estudiantes = [ select Nombres__c, Apellidos__c, Telefono__c from Estudiante__c where id =: recordID ];
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------

	public String getTitle()
	{
		return 'Detalles del Estudiante';
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------
}
//----------------------------------------------------------------------------------------------------------------------------------------------------