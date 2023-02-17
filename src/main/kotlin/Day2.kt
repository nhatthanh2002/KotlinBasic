import java.util.*

val choice2: String by lazy { "Mời bạn chọn :" }
val intArray: IntArray by lazy { intArrayOf(1, 6, 7, 3, 9, 5, 8, 2, 4) }
lateinit var st: Student
var listStudent2 = ArrayList<Student>()
fun main() {
    menu2()
}

fun menu2() {
    do {
        println("=================================")
        println("1. Sắp xếp mảng")
        println("2. Tính tổng 2 số với lambda function")
        println("3. Thêm sinh viên")
        println("4. Tìm sinh viên đầu và cuối danh sách")
        println("0. Thoát")
        println("=================================")
        print(choice2)
        val input = readLine();
        when (input) {
            "1" -> bubbleSortArray(intArray)
            "2" -> sum()
            "3" -> addSt()
            "4" -> find()
            "0" -> println("Đã thoát")
            else -> println("Vui lòng nhập giá trị phù hợp")
        }
    } while (input != "0")
}

fun sum() {
    var a: String
    var b: String

    do {
        print("Nhập số thứ nhất :")
        a = readLine().toString()
        if (a.isEmpty()) {
            println("không để trống")
        }
    } while (a.isEmpty())

    do {
        print("Nhập số thứ hai : ")
        b = readLine().toString()
        if (b.isEmpty()) {
            println("không để trống")
        }
    } while (b.isEmpty())

    val sumLambda: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println("Tổng = ${sumLambda(a.toInt(), b.toInt())}")
}

fun addSt() {
    var age: String
    var name: String
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
    st = Student().apply {
        uName = name
        uAge = age.toInt()
    }
    listStudent2.let {
        it.add(Student(name, age.toInt()))
    }
    println("Thông tin vừa nhập là : ${st.uName} - ${st.uAge}")
}

fun find() {
    with(listStudent2){
      val svf=first()
      val svl=last()
        println("Sinh viên vị trí đầu là : ${svf.uName} - ${svf.uAge} \n" +
                "Sinh viên vị trí cuối là : ${svl.uName} - ${svl.uAge}")
    }
}

fun bubbleSortArray(a: IntArray) {
    println("Mảng đã cho : ${Arrays.toString(a)}")
    val n = intArray.size
    for (i in 0 until n) {
        var isSorted = true
        for (j in 0 until n - (i + 1)) {
            if (a[j] > a[j + 1]) {
                isSorted = false
                var temp = a[j]
                a[j] = a[j + 1]
                a[j + 1] = temp
            }
        }
        if (isSorted) {
            break
        }
    }
    println("Kết quả sau khi sắp xếp: ${Arrays.toString(a)}")
}
