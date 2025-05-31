package pl.polsl.rafalapp

import android.app.Activity
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sqrt


class MainActivity : Activity(), SensorEventListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        val mp = MediaPlayer.create(applicationContext, R.raw.muzyka)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val sm = getSystemService(SENSOR_SERVICE) as SensorManager
        val lista = sm.getSensorList(Sensor.TYPE_ACCELEROMETER)
        sm.registerListener(this, lista[0], SensorManager.SENSOR_DELAY_NORMAL)

    }

    override fun onSensorChanged(probka: SensorEvent?) {
        val x = findViewById<TextView>(R.id.x)
        val y = findViewById<TextView>(R.id.y)
        val z = findViewById<TextView>(R.id.z)

        x.text = probka?.values[0].toString()
        y.text = probka?.values[1].toString()
        z.text = probka?.values[2].toString()

        val ax = probka?.values?.get(0) ?: return
        val ay = probka?.values?.get(1) ?: return
        val az = probka?.values?.get(2) ?: return

        val acc = sqrt(ax*ax + ay*ay + az*az)

        if (acc > 10) {
            val mp = MediaPlayer.create(applicationContext, R.raw.muzyka)
            mp.start()
            Toast.makeText(this,"Nie ruszaj!!!", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }

}