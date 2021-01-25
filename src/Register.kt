import java.io.FileWriter
import java.io.FileReader
import java.io.File
import User


fun register(user : User): Boolean {
val str = user.toString()
    val fileName = "NazarLox.txt"
    val del = "~"
    val userID = str.split(del)[0]
    var strs = File(fileName).readLines().toMutableList()
    val users = strs[0].split(del)
    return if (userID !in users){
        strs[0] = strs[0] + del + userID
        strs.add(str)
        FileWriter(fileName).use{it.write(strs.joinToString(separator = "\n"))}
        true
    } else {
        false
    }
}
