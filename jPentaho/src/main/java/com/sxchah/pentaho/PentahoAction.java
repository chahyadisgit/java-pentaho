/**
 * 
 */
package com.sxchah.pentaho;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

/**
 * @author SXCHAH
 *
 */
public class PentahoAction extends AbstractPentaho {
	public void execute() {
		try {
			KettleEnvironment.init();
			TransMeta metaData = new TransMeta("C:\\Directory\\Programming\\Pentaho\\repository\\trans_text_file_input.ktr");
			Trans trans = new Trans(metaData);
			trans.execute(null);
			trans.waitUntilFinished();
			if (trans.getErrors() > 0) {
				System.out.println(">> transaction failed: " + trans.getErrors());
			} else {
				System.out.println(">> transaction success, data has been transfered");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
