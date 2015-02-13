/**
 * 
 */
package ace.life.ina.pentaho.abstracts;

import ace.life.ina.pentaho.DatabaseParam;
import ace.life.ina.pentaho.FileTransferParam;
import ace.life.ina.pentaho.KettleParam;

/**
 * ParamBuilder.
 * 
 * @author Surya Chahyadi.
 * @version 1.0.0
 * @since July 22 July, 2014
 */
public abstract class ParamBuilder {
	protected FileTransferParam ftp;
	protected DatabaseParam db;
	protected KettleParam kettle;

	/**
	 * isi dengan nilai null jika tidak ada proses transfer file.
	 * 
	 * @return {@link FileTransferParam}
	 */
	public abstract FileTransferParam InstanceFileTransferParam();

	/**
	 * isi dengan nilai null jika tidak ada koneksi ke database.
	 * 
	 * @return {@link DatabaseParam}
	 */
	public abstract DatabaseParam instanceDatabaseParam();
	
	/**
	 * 
	 * @return {@link KettleParam}
	 */
	public abstract KettleParam instanceKettleParam();
}
