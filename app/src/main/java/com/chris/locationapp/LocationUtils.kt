package com.chris.locationapp

import android.content.Context
import androidx.core.content.ContextCompat
import android.Manifest
import android.content.pm.PackageManager

class LocationUtils (val context : Context) {

    fun hasLocationPermission(context: Context):Boolean{
        return ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
                &&
                ContextCompat.checkSelfPermission(
                    context,
                    Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
    }
}