/**
 * 
 */
package ace.life.ina.pentaho.abstracts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.job.Job;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

/**
 * KettleExecutor<br/>
 * Executor module for kettle Jobs and transformation.
 * 
 * @author Surya Chahyadi.
 * @version 1.0.0
 * @since July 10, 2014
 */
public class KettleExecutor {
	Logger log = Logger.getLogger(this.getClass());

	/**
	 * Execute Kettle jobs.
	 * 
	 * @param kettlePath
	 *            {@link String} path of kettle location.
	 * @param kettleParam
	 *            {@link Map} kettle parameter,<br/>
	 *            type NULL if unused.
	 */
	public void kettleJobs(String kettlePath, Map<String, String> kettleParam) {
		try {
			KettleEnvironment.init();
			JobMeta jobMeta = new JobMeta(kettlePath, null);
			log.info("setup parameter");
			// setup transformation parameter
			if (null != kettleParam && kettleParam.size() > 0) {
				for (Map.Entry<String, String> entry : kettleParam.entrySet()) {
					jobMeta.setParameterValue(entry.getKey(), entry.getValue());
				}
			}

			Job job = new Job(null, jobMeta);
			log.info(">> initiate job");
			job.start();
			log.info(">> job in progress....");
			job.waitUntilFinished();
			if (job.getErrors() > 0) {
				log.info(">> " + job.getJobname() + ": transaction failed: "
						+ +job.getErrors());
			} else {
				log.info(">> " + job.getJobname()
						+ ": transaction success, data has been transfered.");
			}
		} catch (Exception e) {
			log.error("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Execute kettle transformation.
	 * 
	 * @param kettlePath
	 *            {@link String}
	 * @param args
	 *            {@link String[]}
	 * @param kettleParam
	 *            {@link Map}
	 */
	public void kettleTransformation(String kettlePath, String[] args,
			Map<String, String> kettleParam) {
		try {
			KettleEnvironment.init();
			TransMeta metaData = new TransMeta(kettlePath);
			Trans trans = new Trans(metaData);
			if (null != kettleParam && kettleParam.size() > 0) {
				for (Map.Entry<String, String> entry : kettleParam.entrySet()) {
					trans.setParameterValue(entry.getKey(), entry.getValue());
				}
			}
			log.info(">> execute transformation....");
			trans.execute(args);
			log.info(">> transformation in progress....");
			trans.waitUntilFinished();
			if (trans.getErrors() > 0) {
				log.info(">> transaction failed: " + trans.getErrors());
			} else {
				log.info(">> transaction success, data has been transfered");
			}
		} catch (Exception e) {
			log.error("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
