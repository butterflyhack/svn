package cn.phoniex.ssg.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AppLockDBHelper extends SQLiteOpenHelper{


	public AppLockDBHelper(Context context) {
		super(context, "applock.db", null, 1);
	}

	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table applock (_id integer primary key autoincrement , pkgname varchar(20))");	
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}

	
}
