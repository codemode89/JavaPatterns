package singleton_pattern;

/**
 *There is only one Rudi Voeller. 
 *For this reason, the class must be a singleton class 
 *so that multiple instances can not be created
 *@see <a href="https://www.youtube.com/watch?v=nsXOKOzmHtI">Rudi Voeller</a>
 * 
 * @author Jan Mueller
 */
public class RudiVoeller {
	private static RudiVoeller instance = null;
	
	public static RudiVoeller getInstance() {
		if(instance.equals(null))
			return new RudiVoeller();
		return instance;
	}
	
	private RudiVoeller() {
		
	}
	
}
