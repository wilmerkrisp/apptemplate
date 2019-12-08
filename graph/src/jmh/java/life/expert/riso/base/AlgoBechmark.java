package life.expert.riso.base;//@Header@
//--------------------------------------------------------------------------------
//
//                          graph  life.expert.riso.base
//                           wilmer 2019/01/31
//
//--------------------------------------------------------------------------------









import life.expert.algo.research.base.AlgoOne;
import life.expert.algo.research.base.AlgoTwo;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;









public class AlgoBechmark
	{
	
	
	
	@Benchmark
	public void algoOne( ExperimentData data ,
	                     Blackhole hole )
		{
		AlgoOne a = AlgoOne.of();
		a.run();
		
		}
	
	
	
	@Benchmark
	public void algoTwo( ExperimentData data ,
	                     Blackhole hole )
		{
		AlgoTwo a = AlgoTwo.of();
		a.run();
		}
		
	}
