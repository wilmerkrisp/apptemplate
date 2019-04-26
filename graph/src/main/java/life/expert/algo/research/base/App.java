package life.expert.algo.research.base;//@Header@
//--------------------------------------------------------------------------------
//
//                          graph  life.expert.algo.research.base
//                           wilmer 2019/01/23
//
//--------------------------------------------------------------------------------









//import static life.expert.common.io.FileUtils.*;

import java.io.InputStream;

import java.util.ResourceBundle;
import java.util.logging.LogManager;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;









/**
 * The type App.
 */
public class App
	{
	
	
	
	private static final Logger logger_ = LoggerFactory.getLogger( App.class );
	
	
	
	private static final void log_( String message )
		{
		logger_.info( message );
		}
	
	
	
	private static final void logAtError_( String message )
		{
		logger_.error( message );
		}
	
	
	
	private static final ResourceBundle bundle_ = ResourceBundle.getBundle( "messages" );
	
	
	
	private static final String START_MESSAGE_ = bundle_.getString( "startProgram" );
	
	
	
 
	
	
	
	/**
	 * *    - пакет задать life.expert.algo.research.base
	 * *
	 * *    - change   rootProject.name  in settings.gradle
	 * project name in project settings
	 * *
	 * *
	 * *    - изменим gradle->use gradle wrapper task configuration
	 * ->delegate IDE build/run actions to gradle
	 * *
	 * *    - ./gradlew wrapper --gradle-version=5.3.1
	 * *
	 * *    - app run config, vm options
	 * *            -javaagent:/Users/wilmer/.flow/resources/javaagent.jar -Dflow.agent.autostart -Dflow.agent.include=life.expert.algo
	 * *
	 * *
	 * *    - создадим новый проект
	 * *               в настройках IDEA select code style = выберем мою схему
	 * *
	 * *    - добавим пакеты life.expert.mainpack и класс VV_main
	 * *
	 * *    - добавим поддержку мевена
	 * *               клик на project -> add framework support = maven
	 * *              ОБЯЗАТЕЛЬНО НАЖАТЬ В ПРАВОМ НИЖНЕМ УГЛУ В ВЫСКОЧИВШЕМ ОКНЕ enable auto import
	 * *              помести внутрь тегов в помке снипет maven
	 * *
	 * *    - добавим файл src/main/java/resources/logging.properties
	 * *
	 * *    - добавим metainf
	 * *               cmd+; -> artifacts -> jar -> from modules -> директорию выберем resources
	 * *               (или перетащить мышкой meta-inf в подпапку resources
	 * *
	 * *    - создать конфигурацию "Application" для запуска
	 * *               выбрать главный класс для запуска
	 * *
	 * *    - проверим: сбилдим цель и провери мавенBUILD
	 * *
	 * *
	 *
	 * @param p_i
	 * 	the p i
	 */
	public static void main( final String... p_i )
		{
		//System.out.println( "VV_main main " );
		log_( START_MESSAGE_ );
		
		
		
		AlgoOne a = AlgoOne.of();
		a.run();
		
		}
		
		
		
	}
