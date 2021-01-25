import java.io.FileWriter
import java.io.FileReader
import java.io.File
import User


fun register(user : User): String {
    val str = user.toString()
    val fileName = "NazarLox.txt"
    val strs = File("NazarLox.txt").readLines()
    if (str.split("~")[0] in File("NazarLox.txt").readLines()[0].split("~")){
        FileWriter(fileName).use{it.write(File("NazarLox.txt").readLines()[0] + "~" + str.split("~")[0] + "\n")}
        FileWriter(fileName).use{it.write(strs.joinToString(separator = "\n"))}
        FileWriter(fileName).use{it.write(str)}
        return "OK"
    } else {
        return "ERROR: this ID locked"
    }
}
