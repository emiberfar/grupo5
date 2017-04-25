package juegos;

public class Verborrea {
		
	/**
	 * <p>Atributo con una lisa de String de verbos</p>
	 * @author EBF10
	 *  
	 */
	private	String verbos[] = {"acelerar", "acoplar", "adoptar","agregar","alimentar","analizar","articular","compatibilizar","complementar","conceptualizar","construir","contextualizar","cultivar","desarrollar","desplegar","dise�ar","encapsula","engranar","ensamblar","escalar","estimular","evaluar","evolucionar","explotar","extender","facilitar","favorecer","generar","gestionar","habilitar","implementar","impulsar","incentivar","incubar","integrar","maximizar","nivelar","objetivizar","optimizar","orquestar","propulsar","racionalizar","reinventar","reconvertir","reformatear","sinergizar","sintetizar","sistematizar","transformar"};
    
	/**
	 * <p>Atributo con una lisa de String de conceptos</p>
	 * @author EBF10
	 * 
	 */
	private String conceptos[] = {"actuaciones","ajustes","aplicaciones","arquitecturas","asociaciones","canales","comunidades","conectividades","contenidos","convergencias","din�micas","esquemas","estructuras","experiencias","funcionalidades","indicadores","infraestructuras","iniciativas","interfaces","mecanismos","mercados","metodolog�as","modelos","nichos","paradigmas","plataformas","pol�ticas","portales","protocolos","proyecciones","proyectos","redes","relaciones","servicios electr�nicos","sinergias","sistemas","soluciones","tecnolog�as","tendencias","topolog�as"};
   
	/**
	 * <p>Atributo con una lisa de String de adjetivadores</p>
	 * @author EBF10
	 * 
	 */
	private String adjetivadores[] = {"de activaci�n","afines","de banda ancha","business-to-business","business-to-consumer","conceptuales","con capacidades","din�micas","con capacidades Web","de c�digo abierto","de colaboraci�n","de contorno","de convergencia","de distribuci�n","escalables","eficientes","globales","granulares","de iniciativa","llave en mano","a medida","modulares","con interactividad","one-to-one","perimetrales","de personalizaci�n","de tipo plug-and-play","punto-com","con proactividad","de re-ingenier�a","de re-posicionamiento","del sector privado","de atenci�n al cliente","de tecnolog�a punta","en tiempo real","de redes sociales","sostenibles", "de la web 2.0","transparentes","de transici�n","de �ltima generaci�n","con centro en el usuario","de valor a�adido","verticales","de visi�n perif�rica","virales"};

	/**
	 * <p>Utiliza una posicion aleatoria de cada uno de los atributos mediante el Math.ramdom() y esa posicion contiene un String donde se le a�ade a una variable String llamada frase</p>
	 * @return String frase
	 * @author EBF10
	 * 
	 */
    public String generarfrase (){

        String frase = this.verbos[(int) (Math.random()*(this.verbos.length))]+ " "+
        		this.conceptos[(int) (Math.random()*(this.conceptos.length))]+ " " +
        this.adjetivadores[(int) (Math.random()*(this.adjetivadores.length))];


        return frase;
		
	}
	
	

}
