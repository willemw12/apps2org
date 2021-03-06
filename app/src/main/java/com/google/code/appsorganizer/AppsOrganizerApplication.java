/*
 * Copyright (C) 2009 Apps Organizer
 *
 * This file is part of Apps Organizer
 *
 * Apps Organizer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Apps Organizer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Apps Organizer.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.google.code.appsorganizer;

import android.app.Application;

import com.google.code.appsorganizer.db.DatabaseHelper;

/**
 * @author fabio
 * 
 */
public class AppsOrganizerApplication extends Application {

	public static final String TAG = "AppsOrganizer";

	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	public void onTerminate() {
		super.onTerminate();
		DatabaseHelper.singleton().close();
	}
}
