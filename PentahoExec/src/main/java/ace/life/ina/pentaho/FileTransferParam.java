/**
 * 
 */
package ace.life.ina.pentaho;

import java.util.HashMap;
import java.util.Map;

import ace.life.ina.model.fileTransfer.FileTransferParamValue;
import ace.life.ina.model.fileTransfer.FileTransferParamkey;
import ace.life.ina.pentaho.interfaces.InterfaceFileTransfer;

/**
 * FileTransferParam.
 * 
 * @author Surya Chahyadi.
 * @version 1.0.0
 * @since July 18, 2014
 */
public class FileTransferParam implements InterfaceFileTransfer {
	public Object setupParamKey() {
		return new FileTransferParamkey("FTP_PORT", "FTP_IP", "FTP_USERNAME",
				"FTP_PASSWORD", "FTP_PATH");
	}

	public Object setupParamValue() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * setup File Transfer parameter.
	 * 
	 * @return {@link Map}
	 */
	public Map<String, String> getParamMap() {
		FileTransferParamValue value = (FileTransferParamValue) setupParamValue();
		Map<String, String> map = new HashMap<String, String>();
		if (null != value) {
			FileTransferParamkey key = (FileTransferParamkey) setupParamKey();

			map.put(key.getKeyPort(), String.valueOf(value.getPort()));
			map.put(key.getKeyIp(), value.getIp());
			map.put(key.getKeyUsername(), value.getUsername());
			map.put(key.getKeyPassword(), value.getPassword());
			map.put(key.getKeyPath(), value.getPath());
		}

		return map;
	}
}
