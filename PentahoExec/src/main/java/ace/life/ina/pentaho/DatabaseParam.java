/**
 * 
 */
package ace.life.ina.pentaho;

import java.util.HashMap;
import java.util.Map;

import ace.life.ina.model.database.DatabaseParamKey;
import ace.life.ina.model.database.DatabaseParamValue;
import ace.life.ina.pentaho.interfaces.InterfaceDatabaseParam;

/**
 * DatabaseParam.
 * 
 * @author Surya Chahyadi.
 * @version 1.0.0
 * @since July 18, 2014
 */
public class DatabaseParam implements InterfaceDatabaseParam {

	public Object setupParamKey() {
		return new DatabaseParamKey("DB_PORT", "DB_HOSTNAME", "DB_NAME",
				"DB_USERNAME", "DB_PASSWORD");
	}

	public Object setupParamValue() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * setup parameter database.
	 * 
	 * @return {@link Map}
	 */
	public Map<String, String> getParamMap() {
		DatabaseParamValue value = (DatabaseParamValue) setupParamValue();
		Map<String, String> map = new HashMap<String, String>();

		if (null != value) {
			DatabaseParamKey key = (DatabaseParamKey) setupParamKey();

			map.put(key.getDbKeyPort(), String.valueOf(value.getDbPort()));
			map.put(key.getDbKeyHostName(), value.getDbHostName());
			map.put(key.getDbKeyName(), value.getDbName());
			map.put(key.getDbKeyUsername(), value.getDbUsername());
			map.put(key.getDbKeyPassword(), value.getDbPassword());
		}

		return map;
	}

}
