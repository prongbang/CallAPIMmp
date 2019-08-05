package todo

interface TodoApi {
	fun getTodo(): List<Todo>
}

expect class DefaultTodoApi : TodoApi

actual class DefaultTodoApi : TodoApi {

	override fun getTodo(): List<Todo> {

		return listOf(
				Todo(id = 1, name = "Todo 1"),
				Todo(id = 2, name = "Todo 2"),
				Todo(id = 3, name = "Todo 3"),
				Todo(id = 4, name = "Todo 4"),
				Todo(id = 5, name = "Todo 5")
		)
	}

}