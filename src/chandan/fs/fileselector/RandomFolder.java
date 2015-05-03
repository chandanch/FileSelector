package chandan.fs.fileselector;
/**
 *
 *
 * @author Chandan
 */

import java.io.File;
import android.os.Environment;

public class RandomFolder {
/*@author Chandan */
	public void createRandomfolder(){
		
		File file=new File(Environment.getExternalStorageDirectory() + File.separator +"FileShare/");
		file.mkdirs();
	}
	
}
