package com.uploadidcarddemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * ��ͼƬ�������Ŀ
 * 
 * @author DAGONG
 *
 */
public class SimpleBrowerActivity extends Activity {

	// ����һ������ͼƬ������
	int[] images = new int[] { R.drawable.ic_launcher, R.drawable.ic_launcher,
			R.drawable.ic_launcher, R.drawable.ic_launcher };
	// ��ǰͼƬ��λ��
	int currentImage = 0;
	private LinearLayout linearLayout;
	private ImageView imageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_brower);
		linearLayout = (LinearLayout) findViewById(R.id.ll_simple_brower);
		// ���򴴽�ImageView���
		imageView = new ImageView(this);
		// ��ImageView�����ӵ�LinearLayout����������
		linearLayout.addView(imageView);
		// ��ʼ��ʱ��ʾ��һ��ͼƬ
		imageView.setImageResource(images[0]);
		imageView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (currentImage >= 3) {
					currentImage = -1;
				}
				// �ı�ImageView����ʾ
				imageView.setImageResource(images[++currentImage]);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.simple_brower, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
