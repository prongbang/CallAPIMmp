package sample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import todo.DefaultTodoApi
import todo.TodoApi

actual class Sample {
	actual fun checkMe() = 44
}

actual object Platform {
	actual val name: String = "Android"
}

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		Sample().checkMe()
		setContentView(R.layout.activity_main)
		findViewById<TextView>(R.id.main_text).text = hello()

		val todoApi: TodoApi = DefaultTodoApi()
		var todos = ""
		for (t in todoApi.getTodo()) {
			todos += "ID: ${t.id}, Name: ${t.name}\n"
		}
		todoList.text = todos
	}
}