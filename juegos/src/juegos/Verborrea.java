package juegos;

public class Verborrea {
	
	public void fraseAleatoria(){
		
		String verbos[] = {"acelerar", "acoplar", "adoptar","agregar","alimentar","analizar","articular","compatibilizar","complementar","conceptualizar","construir","contextualizar","cultivar","desarrollar","desplegar","diseñar","encapsula","engranar","ensamblar","escalar","estimular","evaluar","evolucionar","explotar","extender","facilitar","favorecer","generar","gestionar","habilitar","implementar","impulsar","incentivar","incubar","integrar","maximizar","nivelar","objetivizar","optimizar","orquestar","propulsar","racionalizar","reinventar","reconvertir","reformatear","sinergizar","sintetizar","sistematizar","transformar"};
        String conceptos[] = {"actuaciones","ajustes","aplicaciones","arquitecturas","asociaciones","canales","comunidades","conectividades","contenidos","convergencias","dinámicas","esquemas","estructuras","experiencias","funcionalidades","indicadores","infraestructuras","iniciativas","interfaces","mecanismos","mercados","metodologías","modelos","nichos","paradigmas","plataformas","políticas","portales","protocolos","proyecciones","proyectos","redes","relaciones","servicios electrónicos","sinergias","sistemas","soluciones","tecnologías","tendencias","topologías"};
        String adjetivadores[] = {"de activación","afines","de banda ancha","business-to-business","business-to-consumer","conceptuales","con capacidades","dinámicas","con capacidades Web","de código abierto","de colaboración","de contorno","de convergencia","de distribución","escalables","eficientes","globales","granulares","de iniciativa","llave en mano","a medida","modulares","con interactividad","one-to-one","perimetrales","de personalización","de tipo plug-and-play","punto-com","con proactividad","de re-ingeniería","de re-posicionamiento","del sector privado","de atención al cliente","de tecnología punta","en tiempo real","de redes sociales","sostenibles", "de la web 2.0","transparentes","de transición","de última generación","con centro en el usuario","de valor añadido","verticales","de visión periférica","virales"};


        System.out.println( generarfrase(verbos, conceptos, adjetivadores) );
        //System.out.printf("%s", generarfrase(verbos, conceptos, adjetivadores) );
    }
    
    static String generarfrase ( String verbos[], String conceptos [], String adjetivadores []){

        String frase = verbos[(int) (Math.random()*(verbos.length))]+ " "+
        conceptos[(int) (Math.random()*(conceptos.length))]+ " " +
                adjetivadores[(int) (Math.random()*(adjetivadores.length))];


        return frase;
		
	}
	
	

}
