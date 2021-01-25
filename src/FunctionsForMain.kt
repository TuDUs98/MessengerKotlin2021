import jdk.internal.util.xml.impl.Input

fun greet(): User {
    var flag: Boolean = true
    lateinit var user: User
    println("Hello! Greet you in MesKot!")
    println("""Do you have an account, or you want to create new? 
            |(write NEW to sign up / write your login~password to sign in)""".trimMargin())
    while (flag) {
        when (val msg = readLine()) {
            "NEW" -> {
                user = registerNewUser()
                flag = false
            }
            "" -> println("ERROR: Enter your login or word NEW to continue")
            null -> println("ERROR: Enter your login or word NEW to continue")
            else -> {
                user = loginUser(msg)
                flag = false
            }
        }
    }

    return user
}

fun registerNewUser(): User {
    return User(name = "123", userId = "123", password = "123")
}

fun loginUser(loginPassword: String): User {
    var loginPasswordList: List<String> = loginPassword.split("~")
    return User(name = "123", userId = "123", password = "123")
}