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
 *				Clase de prueba para confirmar el funcionamiento optimo de la insercion de un registro 'Estudiante' y a su vez del llamado al metodo 
 *				'getTitle' contenido en las clases 'SingleStudent' y 'AllStudents'.
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

@isTest
public class Test_Students
{
	static testmethod void createTest()
	{
		Estudiante__c estudiante = new Estudiante__c( Nombres__c = 'Jhonny', Apellidos__c = 'Trejos Barrios', Telefono__c = '317 311 3223' );
		
		insert estudiante;

		ApexPages.StandardController controller = new ApexPages.StandardController( estudiante );

		SingleStudent single = new SingleStudent( controller );
		AllStudents all = new AllStudents( controller );

		single.getTitle();
		all.getTitle();
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------
}
//----------------------------------------------------------------------------------------------------------------------------------------------------