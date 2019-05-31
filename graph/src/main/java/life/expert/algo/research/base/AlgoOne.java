package life.expert.algo.research.base;//@Header@
//--------------------------------------------------------------------------------
//
//                          graph  life.expert.algo.research.base
//                           wilmer 2019/02/04
//
//--------------------------------------------------------------------------------










import lombok.extern.slf4j.Slf4j;
import static life.expert.common.async.LogUtils.*;







@Slf4j
public class AlgoOne
	{
	
	
	private AlgoOne()
		{
		
		}
	
	
	
	public static AlgoOne of()
		{
		return new AlgoOne();
		}
	
	
	
	public void run()
		{
		
		try
			{
			Thread.sleep( 100 );
			}
		catch(final InterruptedException p_exception )
			{
			logAtError_("Sleep interrupted");
			}
		
		
		return;
		}
		
		
	}
