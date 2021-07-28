package gujarprawjal12gmail.com.example.to_do_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.SparseBooleanArray
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var itemlist = arrayListOf<String>()
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, itemlist)

         val add = findViewById<Button>(R.id.add)
         val delete = findViewById<Button>(R.id.delete)
         val clear = findViewById<Button>(R.id.delete)
         val listView = findViewById<ListView>(R.id.listView)
         val editText = findViewById<EditText>(R.id.edittext)




        add.setOnClickListener {
            itemlist.add(editText.text.toString())
            listView.adapter = adapter
            adapter.notifyDataSetChanged()
            // use for clear the extro spae
            editText.text.clear()
        }

        clear.setOnClickListener {

            itemlist.clear()
            adapter.notifyDataSetChanged()

        }


        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "You Selected the item --> "+itemlist.get(i), Toast.LENGTH_SHORT).show()
        }

        delete.setOnClickListener {
            val position: SparseBooleanArray = listView.checkedItemPositions
            val count = listView.count
            var item = count - 1
            while (item >= 0) {
                if (position.get(item))
                {
                    adapter.remove(itemlist.get(item))
                }
                item--
            }
            position.clear()
            adapter.notifyDataSetChanged()
        }

    }
}

