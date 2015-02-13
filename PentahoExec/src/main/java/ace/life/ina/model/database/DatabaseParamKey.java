/**
 * 
 */
package ace.life.ina.model.database;

import javax.validation.constraints.NotNull;

/**
 * DatabaseParamKey<br/>
 * Parameter Key for database.
 * 
 * @author Surya Chahyadi.
 * @version 1.0.0
 * @since July 17, 2014
 */
public class DatabaseParamKey {
	@NotNull
	private String dbKeyPort;
	@NotNull
	private String dbKeyHostName;
	@NotNull
	private String dbKeyName;
	@NotNull
	private String dbKeyUsername;
	@NotNull
	private String dbKeyPassword;

	/**
	 * Constructor.
	 */
	public DatabaseParamKey() {
	}

	/**
	 * Constructor.
	 * 
	 * @param dbKeyPort
	 *            {@link Integer}<br/>
	 *            port database.
	 * @param dbKeyHostName
	 *            {@link String} <br/>
	 *            IP database.
	 * @param dbKeyName
	 *            {@link String}<br/>
	 *            database name or SID.
	 * @param dbKeyUsername
	 *            {@link String}<br/>
	 *            database user login.
	 * @param dbKeyPassword
	 *            {@link String}<br/>
	 *            database user password.
	 */
	public DatabaseParamKey(String dbKeyPort, String dbKeyHostName,
			String dbKeyName, String dbKeyUsername, String dbKeyPassword) {
		this.dbKeyPort = dbKeyPort;
		this.dbKeyHostName = dbKeyHostName;
		this.dbKeyName = dbKeyName;
		this.dbKeyUsername = dbKeyUsername;
		this.dbKeyPassword = dbKeyPassword;
	}

	/**
	 * @return the dbKeyPort
	 */
	public String getDbKeyPort() {
		return dbKeyPort;
	}

	/**
	 * @param dbKeyPort
	 *            the dbKeyPort to set
	 */
	public void setDbKeyPort(String dbKeyPort) {
		this.dbKeyPort = dbKeyPort;
	}

	/**
	 * @return the dbKeyHostName
	 */
	public String getDbKeyHostName() {
		return dbKeyHostName;
	}

	/**
	 * @param dbKeyHostName
	 *            the dbKeyHostName to set
	 */
	public void setDbKeyHostName(String dbKeyHostName) {
		this.dbKeyHostName = dbKeyHostName;
	}

	/**
	 * @return the dbKeyName
	 */
	public String getDbKeyName() {
		return dbKeyName;
	}

	/**
	 * @param dbKeyName
	 *            the dbKeyName to set
	 */
	public void setDbKeyName(String dbKeyName) {
		this.dbKeyName = dbKeyName;
	}

	/**
	 * @return the dbKeyUsername
	 */
	public String getDbKeyUsername() {
		return dbKeyUsername;
	}

	/**
	 * @param dbKeyUsername
	 *            the dbKeyUsername to set
	 */
	public void setDbKeyUsername(String dbKeyUsername) {
		this.dbKeyUsername = dbKeyUsername;
	}

	/**
	 * @return the dbKeyPassword
	 */
	public String getDbKeyPassword() {
		return dbKeyPassword;
	}

	/**
	 * @param dbKeyPassword
	 *            the dbKeyPassword to set
	 */
	public void setDbKeyPassword(String dbKeyPassword) {
		this.dbKeyPassword = dbKeyPassword;
	}

}
