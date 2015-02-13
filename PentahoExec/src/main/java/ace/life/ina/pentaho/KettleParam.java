/**
 * 
 */
package ace.life.ina.pentaho;

import java.util.Map;

import ace.life.ina.pentaho.interfaces.InterfaceParamSetup;

/**
 * KettleParam.
 * 
 * @author Surya Chahyadi.
 * @version 1.0.0
 * @since august 05, 2014
 */
public class KettleParam implements InterfaceParamSetup {

	/*
	 * Tidak digunakan, karena parameter untuk kettle bersifat dinamis (sesuai
	 * kebutuhan).
	 * 
	 * @see ace.life.ina.pentaho.interfaces.InterfaceParamSetup#setupParamKey()
	 */
	public Object setupParamKey() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * Tidak digunakan, karena parameter untuk kettle bersifat dinamis (sesuai
	 * kebutuhan).
	 * 
	 * @see
	 * ace.life.ina.pentaho.interfaces.InterfaceParamSetup#setupParamValue()
	 */
	public Object setupParamValue() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Silahkan registrasi parameter-nya disini, sesuai dengan kebutuhan.
	 * 
	 * @return {@link Map}
	 */
	public Map<String, String> getParamMap() {
		// TODO Auto-generated method stub
		return null;
	}

}
