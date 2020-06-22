package com.exa.databaseroom

import android.content.Context
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.exa.databaseroom.RoomLayer.DB.AppDatabase
import com.exa.databaseroom.RoomLayer.Entity.User_Entity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    lateinit var db: AppDatabase
    val  context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        db = AppDatabase.getInstance(context)
        fab.setOnClickListener { view ->
        listerner()
    }}

    fun listerner() {


            val user1 = User_Entity("amin asvadi", "amin.asvadi@gmail.com", "09150284545")
            db.users().insert(user1)
            val users = db.users().getAll()
            val builder = StringBuilder()
            for (user in users){
                builder.append(user.displayName + "\t")
                builder.append(user.email + "\t")
                builder.append(user.phone + "\t")
                builder.append("\n")
            }



                test.text = builder.toString()


    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
