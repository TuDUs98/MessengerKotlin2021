class User (var userId: Int?, var passHash: Int?, var name: String?){

    override fun toString(): String {
        return "$userId~$passHash~$name"
    }
}