/**
 * 
 */
package ace.life.ina.model.fileTransfer;

import javax.validation.constraints.NotNull;

/**
 * FileTransferParamkey<br/>
 * parameter key for file transfer.
 * 
 * @author Surya Chahyadi
 * @version 1.0.0
 * @since July 10, 2014
 */
public class FileTransferParamkey {
	@NotNull
	private String keyPort;
	@NotNull
	private String keyIp;
	@NotNull
	private String keyUsername;
	@NotNull
	private String keyPassword;
	@NotNull
	private String keyPath;

	/**
	 * Constructor.
	 */
	public FileTransferParamkey() {
	}

	/**
	 * Constructor.
	 * 
	 * @param keyPort
	 * @param keyIp
	 * @param keyUsername
	 * @param keyPassword
	 * @param keyPath
	 */
	public FileTransferParamkey(String keyPort, String keyIp,
			String keyUsername, String keyPassword, String keyPath) {
		super();
		this.keyPort = keyPort;
		this.keyIp = keyIp;
		this.keyUsername = keyUsername;
		this.keyPassword = keyPassword;
		this.keyPath = keyPath;
	}

	/**
	 * @return the keyPort
	 */
	public String getKeyPort() {
		return keyPort;
	}

	/**
	 * @param keyPort
	 *            the keyPort to set
	 */
	public void setKeyPort(String keyPort) {
		this.keyPort = keyPort;
	}

	/**
	 * @return the keyIp
	 */
	public String getKeyIp() {
		return keyIp;
	}

	/**
	 * @param keyIp
	 *            the keyIp to set
	 */
	public void setKeyIp(String keyIp) {
		this.keyIp = keyIp;
	}

	/**
	 * @return the keyUsername
	 */
	public String getKeyUsername() {
		return keyUsername;
	}

	/**
	 * @param keyUsername
	 *            the keyUsername to set
	 */
	public void setKeyUsername(String keyUsername) {
		this.keyUsername = keyUsername;
	}

	/**
	 * @return the keyPassword
	 */
	public String getKeyPassword() {
		return keyPassword;
	}

	/**
	 * @param keyPassword
	 *            the keyPassword to set
	 */
	public void setKeyPassword(String keyPassword) {
		this.keyPassword = keyPassword;
	}

	/**
	 * @return the keyPath
	 */
	public String getKeyPath() {
		return keyPath;
	}

	/**
	 * @param keyPath
	 *            the keyPath to set
	 */
	public void setKeyPath(String keyPath) {
		this.keyPath = keyPath;
	}

}
