package com.fachry.kareem

import android.content.Intent
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.HorizontalScrollView
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.fachry.kareem.databinding.ActivityMainBinding
import com.fachry.kareem.ui.AdabActivity
import com.fachry.kareem.ui.DoaActivity
import com.fachry.kareem.ui.DzikirActivity
import com.fachry.kareem.ui.SunnahActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import android.Manifest
import com.google.android.gms.location.LocationCallback

class MainActivity : AppCompatActivity() {

    private lateinit var textTime: TextView
    private lateinit var textLocation: TextView
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var locationCallback: LocationCallback

    private val handler = Handler(Looper.getMainLooper())

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textTime = findViewById(R.id.time)
        textLocation = findViewById(R.id.location)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)


        // Cek izin lokasi, dan jika belum diberikan, minta izin
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_PERMISSION_REQUEST_CODE)
        } else {
            // Izin lokasi sudah diberikan, dapatkan lokasi
            getLocation()
        }

//        locationCallback = createLocationCallback()
//        startLocationUpdates()

        handler.post(updateTime)

        NavMenu()

    }

    private fun getLocation() {
        // Cek izin lokasi
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_PERMISSION_REQUEST_CODE)
        } else {
            // Izin lokasi sudah diberikan, dapatkan lokasi
            try {
                fusedLocationClient.lastLocation.addOnSuccessListener(this) { location: Location? ->
                    location?.let {
                        // Ubah koordinat lokasi ke nama kota dan negara
                        val geocoder = Geocoder(this, Locale.getDefault())
                        try {
                            val addresses = geocoder.getFromLocation(it.latitude, it.longitude, 1)
                            if (addresses != null && addresses.isNotEmpty()) {
                                val city = addresses[0]?.locality ?: ""
                                val country = addresses[0]?.countryName ?: ""
                                val locationString = "$city, $country"
                                textLocation.text = locationString
                            }
                        } catch (e: SecurityException) {
                            e.printStackTrace()
                        }
                    }
                }
            } catch (e: SecurityException) {
                e.printStackTrace()
            }
        }
    }

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1001
    }

//    private fun createLocationCallback(): LocationCallback {
//        val locationRequest = LocationRequest.create().apply {
//            interval = 10000 // Interval pembaruan lokasi (dalam milidetik)
//            fastestInterval = 5000 // Interval tercepat
//            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
//        }
//
//        return object : LocationCallback() {
//            override fun onLocationResult(locationResult: LocationResult) {
//                super.onLocationResult(locationResult)
//                val lastLocation = locationResult.lastLocation
//                // Gunakan lokasi terbaru di sini
//                updateLocation(lastLocation)
//            }
//        }
//    }
//
//    private fun startLocationUpdates() {
//        val locationRequest = LocationRequest.create().apply {
//            interval = 10000 // Interval pembaruan lokasi (dalam milidetik)
//            fastestInterval = 5000 // Interval tercepat
//            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
//        }
//
//        fusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, Looper.getMainLooper())
//    }
//
//    private fun updateLocation(location: Location) {
//        val geocoder = Geocoder(this, Locale.getDefault())
//        val addresses = geocoder.getFromLocation(location.latitude, location.longitude, 1)
//        if (addresses != null && addresses.isNotEmpty()) {
//            val city = addresses[0]?.locality ?: ""
//            val country = addresses[0]?.countryName ?: ""
//            val locationString = "$city, $country"
//            textLocation.text = locationString
//        }
//    }

    private val updateTime: Runnable = object : Runnable {
        override fun run() {
            // Dapatkan waktu saat ini dalam format yang Anda inginkan (misalnya, HH:mm:ss).
            val currentTime = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date())

            // Perbarui TextView dengan waktu saat ini.
            textTime.text = currentTime

            // Jadwalkan pembaruan berikutnya setelah 1 detik.
            handler.postDelayed(this, 1000)
        }
    }

    fun NavMenu() {

        binding.iconDoa.setOnClickListener {
            startActivity(Intent(this@MainActivity, DoaActivity::class.java))
        }

        binding.iconDzikir.setOnClickListener {
            startActivity(Intent(this@MainActivity, DzikirActivity::class.java))
        }

        binding.iconAdab.setOnClickListener {
            startActivity(Intent(this@MainActivity, AdabActivity::class.java))
        }

        binding.iconSunnah.setOnClickListener {
            startActivity(Intent(this@MainActivity, SunnahActivity::class.java))
        }
    }
}