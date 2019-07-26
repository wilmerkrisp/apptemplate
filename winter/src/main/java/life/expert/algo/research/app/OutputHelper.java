package life.expert.algo.research.app;
//@Header@
//--------------------------------------------------------------------------------
//
//                          winter  life.expert.algo.research.app
//                           wilmer 2019/07/25
//
//--------------------------------------------------------------------------------


public interface OutputHelper
	{
	public void printAtSuccess( String message );
	
	public void print( String message );
	
	public void printAtInfo( String message );
	
	public void printAtWarning( String message );
	
	public void printAtError( Throwable error );
	
	public void flush();
	
	public String getBuffer();
	}