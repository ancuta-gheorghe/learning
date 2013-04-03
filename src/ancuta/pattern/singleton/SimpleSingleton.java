/**
 * 
 */
package ancuta.pattern.singleton;

/**
 * @author Ancuta Gheorghe
 *
 */
public class SimpleSingleton {

	public static SimpleSingleton sSingleton;
	
	private SimpleSingleton(){
		
	}
	
	public static SimpleSingleton getInstance(){
		
		return null;
		
	}
	
	public static void main(String[] args){
		System.out.println("Just a test.");
	}
	
}
