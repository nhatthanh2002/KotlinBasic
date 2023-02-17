class Student {
    constructor()
    constructor(name: String="", age: Int=18) {
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
            field = if (value.length >= 6) {
                value
            } else {
                "tên quá ngắn"
            }
        }
    var uAge = 0
        get() {
            return if (field >= 18) {
                field
            } else {
                0
            }
        }
        set(value) {
            if (value <= 17 || value >= 30) {
                println("Tuổi không phù hợp")
            } else {
                field = value
            }
        }
}