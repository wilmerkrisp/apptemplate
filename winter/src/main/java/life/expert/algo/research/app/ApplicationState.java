package life.expert.algo.research.app;



import lombok.Data;
import lombok.extern.slf4j.Slf4j;

//@Header@
//--------------------------------------------------------------------------------
//
//                          winter  life.expert.algo.research.app
//                           wilmer 2019/07/25
//
//--------------------------------------------------------------------------------
@Data
@Slf4j
public class ApplicationState
	{
	private int memory;
	
	public void clear()
		{
		memory = 0;
		}
	}
