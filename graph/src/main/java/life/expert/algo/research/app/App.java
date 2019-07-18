package life.expert.algo.research.base;//@Header@
//--------------------------------------------------------------------------------
//
//                          graph  life.expert.algo.research.base
//                           wilmer 2019/01/23
//
//--------------------------------------------------------------------------------









import java.io.InputStream;

import java.util.ResourceBundle;
import java.util.concurrent.Flow;
import java.util.logging.LogManager;


import life.expert.common.base.ApplicationUtils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import static java.text.MessageFormat.format;           //format string

import java.util.ResourceBundle;

import static com.google.common.base.Preconditions.*;   //checkArgument
import static org.apache.commons.lang3.Validate.*;      //notEmpty(collection)

import org.apache.commons.lang3.StringUtils;            //isNotBlank

import java.util.function.*;                            //producer supplier

import static java.util.stream.Collectors.*;            //toList streamAPI
import static java.util.function.Predicate.*;           //isEqual streamAPI

import java.util.Optional;


import static reactor.core.publisher.Mono.*;
import static reactor.core.scheduler.Schedulers.*;
import static life.expert.common.async.LogUtils.*;
import static life.expert.common.base.Objects.*;        //deepCopyOfObject
//import static life.expert.common.base.Preconditions.*;  //checkCollection


import static io.vavr.API.*;                            //switch
import static io.vavr.Predicates.*;                     //switch - case
import static io.vavr.Patterns.*;                       //switch - case - success/failure

//import java.util.List;                                 //usual list
//import io.vavr.collection.List;                        //immutable List
//import com.google.common.collect.*;                   //ImmutableList









/**
 * The type App.
 */
@Slf4j
public class App
	{
	
	
	
	private static final ResourceBundle bundle_ = ResourceBundle.getBundle( "messages" );
	
	
	
	private static final String START_MESSAGE_ = bundle_.getString( "startProgram" );
	
	
	
	private static final String END_MESSAGE_ = bundle_.getString( "endProgram" );
	
	
	
	/**
	 * - enable annotation processing
	 *
	 * *    - set package name life.expert.algo.research.base
	 * *
	 * *    - change  project name in project settings rootProject.name  in settings.gradle
	 * *
	 * *    - change gradle--use gradle wrapper task configuration
	 * -use autoimport
	 * -create dir for empty content root auto
	 * - using qualified names
	 * -delegate IDE build/run actions to gradle
	 * *
	 * *    - ./gradlew wrapper --gradle-version=5.4
	 * *
	 * *    - app run config, vm options
	 * *            -javaagent:/Users/wilmer/.flow/resources/javaagent.jar -Dflow.agent.autostart -Dflow.agent.include=life.expert.algo
	 * *
	 *
	 * *    - add gradle support
	 * *              you MUST click* on right corner  "enable auto import"
	 * *
	 * *
	 * *    - add file src/main/java/resources/logging.properties
	 * *
	 * *    - add metainf
	 * *               cmd+; -- artifacts -- jar -- from modules -- resources directory
	 * *               (or mouse move meta-inf into resources folder
	 * *
	 * *    - add  "Application" config for running app
	 * *               select main class for run
	 * *
	 * *    - verify project: gradle build
	 * *
	 * *
	 *
	 * @param p_i
	 * 	the p i
	 */
	public static void main( final String... p_i )
		{
		try
			{
			//System.out.println( "VV_main main " );
			log_( START_MESSAGE_ );
			
			
			
			AlgoOne a = AlgoOne.of();
			a.run();
			
			
			log_( END_MESSAGE_ );
			}
		catch( Error error )
			{
			ApplicationUtils.fatalError( error );
			}
			
		}
		
		
		
	}
