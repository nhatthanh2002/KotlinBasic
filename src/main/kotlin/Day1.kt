val choice: String by lazy { "Mời bạn chọn :" }
var listStudent = ArrayList<Student>()
lateinit var sv:Student
fun main() {
    menu()
}

fun menu() {

    do {
        println("=================================")
        println("1. Thêm sinh viên")
        println("2. Danh sách sinh viên")
        println("0. Thoát")
        println("=================================")
        print(choice)
        val input = readLine()

        when (input) {
            "1" -> {
                addStudent()
            }
            "2" -> {
                listStudent()
            }
            "0" -> {
                println("Đã thoát !!!")
            }
        }
    } while (input != "0")


}

fun listStudent() {
    for (sv in listStudent) {
        println("${sv.uName} - ${sv.uAge}")
    }
}

fun addStudent() {
    var name: String
    var age: String
    do {
        print("Nhập tên :")
        name = readLine().toString()
        print("Nhập tuổi :")
        age = readLine().toString()

    } while (name.isEmpty() || age.isEmpty())
    sv=Student()
    sv.uName = name
    sv.uAge = age.toInt()
    println("Kết quả nhập : ${sv.uName} - ${sv.uAge}")
    listStudent.add(Student(name, age.toInt()))
}

class Student {
    constructor()
    constructor(name: String, age: Int) {
        this.uName = name
        this.uAge = age
    }

    var uName = ""
        get() {
            if (field.isEmpty()) {
                println("Tên trống")
            }
            return field
        }
        set(value) {
            if (value.length >= 6) {
                field = value
            } else {
                field="tên quá ngắn"
            }
        }
    var uAge = 0
        get() {
            return if (field >= 18) {
                field
            } else {
                18
            }
        }
        set(value) {
            if (value in 18..30) {
                value
            } else {
                println("Tuổi không phù hợp")
            }
        }
}
