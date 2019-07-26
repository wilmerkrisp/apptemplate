package life.expert.algo.research.app;
//@Header@
//--------------------------------------------------------------------------------
//
//                          graph  life.expert.algo.research.base
//                           wilmer 2019/01/23
//
//--------------------------------------------------------------------------------

import lombok.extern.slf4j.Slf4j;
import org.jline.terminal.Terminal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import java.util.ResourceBundle;

//import static life.expert.common.base.Preconditions.*;  //checkCollection

//import java.util.List;                                 //usual list
//import io.vavr.collection.List;                        //immutable List
//import com.google.common.collect.*;                   //ImmutableList

/**
 * The type App.
 */
@Slf4j
@SpringBootApplication

public class Application
	{
	
	private static final ResourceBundle bundle_ = ResourceBundle.getBundle( "messages" );
	
	private static final String START_MESSAGE_ = bundle_.getString( "startProgram" );
	
	private static final String END_MESSAGE_ = bundle_.getString( "endProgram" );
	
	/**
	 * Main method
	 *
	 * @param args
	 * 	the args
	 */
	public static void main( final String... args )
		{
		/*todo https://github.com/jline/jline3/issues/263*/
		System.setProperty( "org.jline.terminal.dumb" , "true" );
		
		SpringApplication.run( Application.class , args );
		}
	
	@Bean
	public OutputHelper shellHelper( @Lazy Terminal terminal )
		{
		return new ShellOutputHelper( terminal );
		}
	
	/**
	 * Application state application state.
	 *
	 * @return the application state
	 */
	@Bean
	public ApplicationState applicationState()
		{
		return new ApplicationState();
		}
		
	}
