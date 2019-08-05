import UIKit
import app

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        label.text = Proxy().proxyHello()
        
        let todoApi: TodoApi = DefaultTodoApi()
        var todos = ""
        for t in todoApi.getTodo() {
            todos += "ID: \(t.id), Name: \(t.name)\n"
        }
        todoList.text = todos
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    @IBOutlet weak var label: UILabel!
    @IBOutlet weak var todoList: UILabel!
}
