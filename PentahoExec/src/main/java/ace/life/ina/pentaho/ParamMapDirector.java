/**
 * 
 */
package ace.life.ina.pentaho;

import java.util.Map;
import java.util.TreeMap;

import ace.life.ina.pentaho.abstracts.ParamBuilder;

/**
 * ParamMapDirector.
 * 
 * @author Surya Chahyadi.
 * @version 1.0.0
 * @since July 22, 2014
 */
public class ParamMapDirector {
	public Map<String, String> setupParamMap(ParamBuilder paramBuilder) {
		TreeMap<String, String> map = new TreeMap<String, String>(); 
		
		// setup ftp param
		FileTransferParam ftp = paramBuilder.InstanceFileTransferParam();
		if (null != ftp) {
			map.putAll(ftp.getParamMap());
		}
		
		// setup db param
		DatabaseParam db = paramBuilder.instanceDatabaseParam();
		if (null != db) {
			map.putAll(db.getParamMap());
		}
		
		KettleParam kettle = paramBuilder.instanceKettleParam();
		if (null != kettle) {
			map.putAll(kettle.getParamMap());
		}
		
		return map;
	}
}
