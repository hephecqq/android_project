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
 * 以项目编程方式来创建UI界面
 * @author DAGONG
 *
 */
public class CodeView extends Activity {

	private static final String TAG="CodeView";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//创建一个线性布局
		LinearLayout linearLayout = new LinearLayout(this);
		//设置该Activity显示layout
		super.setContentView(linearLayout);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		//创建一个TextView
		final TextView show=new TextView(this);
		//创建一个按钮
		Button btn=new Button(this);
		btn.setText(R.string.hello_world);
		btn.setLayoutParams(new ViewGroup.LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
		//向LinearLayout容器中添加TextView
		linearLayout.addView(show);
		//向linearLayout容器中添加按钮
		linearLayout.addView(btn);
		//为按钮绑定一个事件监听器
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				show.setText("Hello Android"+new Date());
			};
		});
	}

	
}
