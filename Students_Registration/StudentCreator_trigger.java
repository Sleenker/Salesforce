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
 *				Disparar un trigger despues de la insercion de un nuevo registro 'Estudiante__c' para crear otro nuevo registro del tipo
 *				'Persona__c'.
 *
 * Licence: 
 * 			This software was coded for commercial use of Home Business Company only.
 *			Unauthorized copy or use in other companies is extrictly prohibited.
 *
 *
 * Developer Contact: jtrejosb@gmail.com || jtrejosb@live.com || jtrejosb@icloud.com
 * Mobile: (+57) 317 311 3223 
 * © 2015
 */
//----------------------------------------------------------------------------------------------------------------------------------------------------

trigger StudentCreator on Estudiante__c( after insert )
{
	public List < Persona__c > personas = new List < Persona__c >();

	for( Estudiante__c E : Trigger.new )
	{
		personas.add( new Persona__c( Codigo_del_Estudiante__c = E.id ) );
	}

	insert personas;
}
//----------------------------------------------------------------------------------------------------------------------------------------------------