val choice: String by lazy { "Mời bạn chọn :" }
var listStudent = ArrayList<Student>()
lateinit var sv: Student
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
            "1" -> addStudent()

            "2" -> listStudent()

            "0" -> println("Đã thoát !!!")

            else -> println("Vui lòng nhập giá trị thích hợp")
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
        if (name.isEmpty()) {
            println("không để trống")
        }
    } while (name.isEmpty())
    do {
        print("Nhập tuổi :")
        age = readLine().toString()
        if (age.isEmpty()) {
            println("không để trống")
        }
    } while (age.isEmpty())

    sv = Student()
    sv.uName = name
    sv.uAge = age.toInt()
    println("Kết quả nhập : ${sv.uName} - ${sv.uAge}")
    listStudent.add(Student(name, age.toInt()))
}


