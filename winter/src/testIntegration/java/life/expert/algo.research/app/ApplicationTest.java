package life.expert.riso.app;
//@Header@
//--------------------------------------------------------------------------------
//
//                          riso  life.expert.riso.app
//                           wilmer 2019/07/21
//
//--------------------------------------------------------------------------------

import life.expert.riso.InvokeHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.shell.MethodTarget;
import org.springframework.shell.Shell;
import org.springframework.shell.jline.InteractiveShellApplicationRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;
import static org.springframework.util.ReflectionUtils.findMethod;

/**
 * Illustrative integration tests for the Spring Shell Calculator application. These
 * integration tests use Spring Shell auto-wired by the Spring Test Runner.
 *
 * @author Sualeh Fatehi
 */
@RunWith( SpringJUnit4ClassRunner.class )
@SpringBootTest( properties = { InteractiveShellApplicationRunner.SPRING_SHELL_INTERACTIVE_ENABLED + "=" + false } )
public class ApplicationTest
	extends InvokeHelper
	{
	
	private static final Class<ShellCommands> COMMAND_CLASS_UNDER_TEST = ShellCommands.class;
	
	@Autowired private Shell shell;
	
	@Autowired private ApplicationState applicationState;
	
	/**
	 * Test "happy path" or basic addition with positive numbers and zeroes. Use Spring Shell
	 * auto-wired by the Spring Test Runner.
	 */
	@Test
	public void testAdd()
		{
		final String command       = "add";
		final String commandMethod = "add";
		
		final MethodTarget commandTarget = lookupCommand( shell , command );
		assertThat( commandTarget , notNullValue() );
		assertThat( commandTarget.getGroup() , is( "Drawing Commands" ) );
		assertThat( commandTarget.getHelp() , is( "Add two integers" ) );
		assertThat( commandTarget.getMethod() , is( findMethod( COMMAND_CLASS_UNDER_TEST , commandMethod , int.class , int.class ) ) );
		assertThat( commandTarget.getAvailability()
		                         .isAvailable() , is( true ) );
		assertThat( shell.evaluate( () -> command + " 1 2" ) , is( 3 ) );
		////assertThat( state.getMemory() , is( 0 ) );
		}
	
	//	/**
	//	 * Test "happy path" or basic addition with positive numbers and zeroes, using calculator
	//	 * memory (program state). Use Spring Shell and calculator memory auto-wired by the Spring
	//	 * Test Runner.
	//	 */
	//	@Test
	//	public void testAddToMemory()
	//		{
	//		final String command       = "add-to-memory";
	//		final String commandMethod = "addToMemory";
	//
	//		final MethodTarget commandTarget = lookupCommand( shell , command );
	//		assertThat( commandTarget , notNullValue() );
	//		assertThat( commandTarget.getGroup() , is( "Calculator Commands" ) );
	//		assertThat( commandTarget.getHelp() , is( "Add an integer to the value in memory" ) );
	//		assertThat( commandTarget.getMethod() , is( findMethod( COMMAND_CLASS_UNDER_TEST , commandMethod , int.class ) ) );
	//		assertThat( commandTarget.getAvailability()
	//		                         .isAvailable() , is( true ) );
	//
	//		state.setMemory( 1 );
	//		assertThat( shell.evaluate( () -> command + " 2" ) , is( 3 ) );
	//		assertThat( state.getMemory() , is( 3 ) );
	//		}
	
	}
