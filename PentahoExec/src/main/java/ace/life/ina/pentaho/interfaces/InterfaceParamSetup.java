/**
 * 
 */
package ace.life.ina.pentaho.interfaces;

import java.util.Map;

/**
 * @author Surya Chahyadi.
 * @version 1.0.0
 * @since July 18, 2014
 */
public interface InterfaceParamSetup {
	Object setupParamKey();
	Object setupParamValue();
	Map<String, String> getParamMap();
}
