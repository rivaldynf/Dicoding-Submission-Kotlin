fun main() {

    // TODO 1
    val user = mapOf<String, String>(
            "name" to "John",
            "age" to "23",
            "address" to  "St. Petersburg"
    )

    // TODO 2
    val name = user.getValue("name")
    val age = user.getValue("age")
    val address = user.getValue("address")

    // TODO 3
    println("User")
    textCreate(name,age,address)
}

fun textCreate(name: String, age: String, address: String){
    print("Name: $name\nAge: $age\nAddress: $address")
}