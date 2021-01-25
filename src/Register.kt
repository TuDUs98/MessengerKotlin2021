import java.io.FileWriter
import java.io.FileReader
import User


fun register(user: User)
{
    var str = user.toString()
    val fileName = "NazarLox.txt"
    FileReader(fileName).use{}
    FileWriter(fileName).use{it.write(str + "\n")}
}
