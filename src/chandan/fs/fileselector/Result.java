package chandan.fs.fileselector;
/*@author Chandan */

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends Activity {
	//String result = null;
    InputStream is = null;
    StringBuilder sb=null;
    //String result=null;
    ProgressDialog progressBar;
    private int progressBarStatus = 0;
	private Handler progressBarbHandler = new Handler();

	private long fileSize = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reslt);
		
		 
		Button b2 = (Button)findViewById(R.id.but);
		final TextView textView = (TextView)findViewById(R.id.textView2);
		final TextView te = (TextView)findViewById(R.id.textView3);
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), 
	                    "Uploading Files....", Toast.LENGTH_LONG).show();
				try{
		            HttpClient httpclient = new DefaultHttpClient();
		            HttpPost httppost = new HttpPost("http://192.168.1.2/upload/index.php");
		            //httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		            HttpResponse response = httpclient.execute(httppost);
		            HttpEntity entity = response.getEntity();
		            is = entity.getContent();
		        }catch(Exception e){
		            Log.e("log_tag", "Error in http connection"+e.toString());
		        }
		     
				// TODO Auto-generated method stub
				progressBar = new ProgressDialog(v.getContext());
				progressBar.setCancelable(true);
				progressBar.setMessage("uploading files ....");
				progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
				//progressBar.setProgress(0);
				//progressBar.setMax(100);
				progressBar.show();

				progressBarStatus = 0;

				fileSize = 0;

				new Thread(new Runnable() {

					public void run() {
						while (progressBarStatus < 100) {

							// process some tasks
							progressBarStatus = downloadFile();

							// sleep 1 second (simulating a time consuming task...)
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}

							// Update the progress bar
							progressBarbHandler.post(new Runnable() {
								public void run() {
									progressBar.setProgress(progressBarStatus);
								}
							});
						}

						// if the file is downloaded,
						if (progressBarStatus >= 100) {

							// sleep 2 seconds, so that you can see the 100%
							try {
								
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}

							// and then close the progressbar dialog
							progressBar.dismiss();
						}
					}
				}).start();
				
				progressBarbHandler.postDelayed(new Runnable() {
					  @Override
					  public void run() {
					    textView.setText("Status: Success");
					    te.setText("File Path -> http://localhost/upload");
					  }
					}, 32000);
			}
		});

	}
	public int downloadFile() {

		while (fileSize <= 100) {

			fileSize++;

			if (fileSize == 1) {
				return 2;
				
			} else if (fileSize == 3) {
				return 3;
				
			} else if (fileSize == 4) {
				return 4;
				

			} else if (fileSize == 5) {
				return 5;

			} else if (fileSize == 7) {
				
				return 7;
			} 
else if (fileSize == 10) {
				
				return 10;
			}

else if (fileSize == 12) {
	
	return 12;
}
else if (fileSize == 15) {
	
	return 15;
}
			
else if (fileSize == 18) {
	
	return 18;
}
else if (fileSize == 19) {
	
	return 19;
}

else if (fileSize == 20) {
	
	return 20;
}
			
else if (fileSize == 23) {
	
	return 23;
}			
			
else if (fileSize == 26) {
	
	return 26;
}		
else if (fileSize == 29) {
	
	return 29;
}
else if (fileSize == 32) {
	
	return 32;
}
else if (fileSize == 35) {
	
	return 35;
}
else if (fileSize == 38) {
	
	return 38;
}
else if (fileSize == 40) {
	
	return 40;
}	
			
else if (fileSize == 45) {
	
	return 45;
}
			
else if (fileSize == 49) {
	
	return 49;
}
else if (fileSize == 52) {
	
	return 52;
}
else if (fileSize == 55) {
	
	return 55;
}
			
else if (fileSize == 60) {
	
	return 60;
}
else if (fileSize == 62) {
	
	return 62;
}
else if (fileSize == 68) {
	
	return 68;
}
			
else if (fileSize == 70) {
	
	return 70;
}
else if (fileSize == 78) {
	
	return 78;
}
else if (fileSize == 82) {
	
	return 82;
}
		
else if (fileSize == 89) {
	
	return 89;
}
else if (fileSize == 95) {
	
	return 95;
}			
			
			



			//...

		}

		return 100;
	

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}

}