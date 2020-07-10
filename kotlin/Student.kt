package college

class Student() {
    lateinit var roll_number: String
    lateinit var name: String
    constructor(
            roll_number: String,
            name: String): this() {
        this.roll_number = roll_number
        this.name = name
    }
}