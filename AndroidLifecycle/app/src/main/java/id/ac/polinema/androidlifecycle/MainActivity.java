package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// TODO: tambahkan callback onStart() di sini

	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText(this, "on Start", Toast.LENGTH_SHORT).show();
	}


	// TODO: tambahkan callback onStop() di sini

	@Override
	protected void onStop() {
		super.onStop();
		Toast.makeText(this, "on Stop", Toast.LENGTH_SHORT).show();
	}

	// TODO: lengkapi callback untuk onRestart() onResume() onPause() onDestroy()

	@Override
	protected void onRestart() {
		super.onRestart();
		Toast.makeText(this, "on Restart", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onPostResume() {
		super.onPostResume();
		Toast.makeText(this, "on Resume", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(this, "on Pause", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(this , "on Destroy", Toast.LENGTH_SHORT).show();
	}

}
