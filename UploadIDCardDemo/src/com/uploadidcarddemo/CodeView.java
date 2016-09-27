package com.uploadidcarddemo;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/**
 * ����Ŀ��̷�ʽ������UI����
 * @author DAGONG
 *
 */
public class CodeView extends Activity {

	private static final String TAG="CodeView";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//����һ�����Բ���
		LinearLayout linearLayout = new LinearLayout(this);
		//���ø�Activity��ʾlayout
		super.setContentView(linearLayout);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		//����һ��TextView
		final TextView show=new TextView(this);
		//����һ����ť
		Button btn=new Button(this);
		btn.setText(R.string.hello_world);
		btn.setLayoutParams(new ViewGroup.LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
		//��LinearLayout���������TextView
		linearLayout.addView(show);
		//��linearLayout��������Ӱ�ť
		linearLayout.addView(btn);
		//Ϊ��ť��һ���¼�������
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				show.setText("Hello Android"+new Date());
			};
		});
	}

	
}
