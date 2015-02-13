package ace.life.ina.model.database;

import javax.validation.constraints.NotNull;

/**
 * DatabaseParamValue<br/>
 * Parameter value for database.
 * 
 * @author Surya Chahyadi.
 * @version 1.0.0
 * @since July 17, 2014
 */
public class DatabaseParamValue {
	@NotNull
	private int dbPort;
	@NotNull
	private String dbHostName;
	@NotNull
	private String dbName;
	@NotNull
	private String dbUsername;
	@NotNull
	private String dbPassword;

	/**
	 * Constructor.
	 */
	public DatabaseParamValue() {
	}

	/**
	 * Constructor.
	 * 
	 * @param dbPort
	 *            {@link Integer}<br/>
	 *            port database.
	 * @param dbHostName
	 *            {@link String} <br/>
	 *            IP database.
	 * @param dbName
	 *            {@link String}<br/>
	 *            database name or SID.
	 * @param dbUsername
	 *            {@link String}<br/>
	 *            database user login.
	 * @param dbPassword
	 *            {@link String}<br/>
	 *            database user password.
	 */
	public DatabaseParamValue(int dbPort, String dbHostName, String dbName,
			String dbUsername, String dbPassword) {
		this.dbPort = dbPort;
		this.dbHostName = dbHostName;
		this.dbName = dbName;
		this.dbUsername = dbUsername;
		this.dbPassword = dbPassword;
	}

	/**
	 * @return the dbPort
	 */
	public int getDbPort() {
		return dbPort;
	}

	/**
	 * @param dbPort
	 *            the dbPort to set
	 */
	public void setDbPort(int dbPort) {
		this.dbPort = dbPort;
	}

	/**
	 * @return the dbHostName
	 */
	public String getDbHostName() {
		return dbHostName;
	}

	/**
	 * @param dbHostName
	 *            the dbHostName to set
	 */
	public void setDbHostName(String dbHostName) {
		this.dbHostName = dbHostName;
	}

	/**
	 * @return the dbName
	 */
	public String getDbName() {
		return dbName;
	}

	/**
	 * @param dbName
	 *            the dbName to set
	 */
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	/**
	 * @return the dbUsername
	 */
	public String getDbUsername() {
		return dbUsername;
	}

	/**
	 * @param dbUsername
	 *            the dbUsername to set
	 */
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	/**
	 * @return the dbPassword
	 */
	public String getDbPassword() {
		return dbPassword;
	}

	/**
	 * @param dbPassword
	 *            the dbPassword to set
	 */
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

}
