package za.co.eblocks.basiclist

import TableListAdapter
import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import za.co.eblocks.basiclist.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val tables = getTables(15)
        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.tableListView)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        val adp = TableListAdapter(tables)
        recyclerview.adapter = adp

    }

    fun getTables(numTables: Int): ArrayList<String>{
        val list = ArrayList<String>()
        for(i in 1..numTables){
            val str = "Table $i"
            Log.i("Name", str )
            list.add(str)
        }

        return list
    }
}