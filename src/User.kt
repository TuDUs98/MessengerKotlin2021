
class User (var userId: String, var password: String, var name: String){

    override fun toString(): String {
        return "$userId~$password~$name"
    }

    fun changeName(newName: String){
        print("Enter your password: ")
        var passInput = readLine().toString()
        if(passInput != password) {
            print("Wrong password, try again.")
        } else {
            name = newName
            print("Your name was successfully changed")
        }
    }
}



