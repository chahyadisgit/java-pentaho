package ace.life.ina.model.fileTransfer;

import javax.validation.constraints.NotNull;

/**
 * FileTransferParamValue<br/>
 * Parameter value for file transfer.
 * 
 * @author Surya Chahyadi.
 * @version 1.0.0
 * @since July 10, 2014
 */
public class FileTransferParamValue {
	@NotNull
	private int port;
	@NotNull
	private String ip;
	@NotNull
	private String username;
	@NotNull
	private String password;

	// directory target
	@NotNull
	private String path;

	/**
	 * constructor.
	 */
	public FileTransferParamValue() {
	}

	/**
	 * constructor.
	 * 
	 * @param port
	 *            {@link Integer}<br/>
	 *            21 for FTP<br/>
	 *            22 for SFTP.
	 * @param ip
	 *            {@link String} <br/>
	 *            target server.
	 * @param username
	 *            {@link String} <br/>
	 *            user login server.
	 * @param password
	 *            {@link String}<br/>
	 *            password server.
	 * @param path
	 *            {@link String}<br/>
	 *            directory target.
	 */
	public FileTransferParamValue(int port, String ip, String username,
			String password, String path) {
		this.port = port;
		this.ip = ip;
		this.username = username;
		this.password = password;
		this.path = path;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip
	 *            the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

}
