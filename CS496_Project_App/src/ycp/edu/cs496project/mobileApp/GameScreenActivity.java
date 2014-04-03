package ycp.edu.cs496project.mobileApp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GameScreenActivity extends Activity {
	
	private final static int NUM_COLS = 4; //the number of columns for the game grid
	
	private GridView gameGrid; //the game grid
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//initialize the grid dimensions
		gameGrid = (GridView)findViewById(R.id.gridView);
		//gameGrid.setNumColumns(NUM_COLS);
		//gameGrid.setColumnWidth(20);
		//gameGrid.setAdapter(new ImageAdapter(this));
		
		setContentView(R.layout.activity_game_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game_screen, menu);
		return true;

	}
	/*
	//method to create an OnClickListener for the ImageButton
	public void createOnImageButtonClick()
	{
		imgButton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(imgNum){
					imgButton.setImageResource(R.drawable.ic_launcher);
					imgNum = false;
				}else{
					imgButton.setImageResource(R.drawable.sample_4);
					imgNum = true;
				}
			}
			
		});
	}
	*/
	
	public void tester(){
		
	}
	
	/**
	 * an implementation of an ArrayAdapter to use ImageView to populate the GridView
	 * instead of the default TextView.
	 * 
	 * @param <T>
	 */
	private class ImageArrayAdapter<T> extends ArrayAdapter<T>{

		/**
		 * constructor
		 * 
		 * @param context
		 * @param resource
		 * @param imageArray
		 */
		public ImageArrayAdapter(Context context, int resource, T[] imageArray) {
			super(context, resource, imageArray);
			
		}
		
		/**
		 * an overwritten implementation of the ArrayAdapter getView() method, to enable the GridView
		 * to be populated with images.
		 */
		public View getView(int position, View convertView, ViewGroup parent){
			ImageView image;
			
			if(convertView == null){
				image = new ImageView(getContext());
				image.setLayoutParams(new GridView.LayoutParams(85, 85));
				image.setScaleType(ImageView.ScaleType.CENTER_CROP);
				if(position == 1)
				{
					image.setPadding(8, 8, 8, 8);
				}
				
				
				
			}else{
				image = (ImageView) convertView;
			}
			
			
			
			//image.setImageResource(imageArray[position]);
			return image;
		}
	}
}


