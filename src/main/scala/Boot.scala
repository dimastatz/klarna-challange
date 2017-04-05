import scala.util.Try
import java.io.PrintWriter

case class Input(inputFile:String, outputFile:String, template: Map[String, Int])

object Boot {
  def main(args: Array[String]): Unit = {
    val inputFile = Try(args(0)).getOrElse("C:/temp/input.txt")
    val alphabetFile = Try(args(2)).getOrElse("C:/temp/alphabet.txt")
    val pw = new PrintWriter(Try(args(1)).getOrElse("C:/temp/output.txt"))

    // Load alphabet to map: 0-9 digits
    val alphabet = parseLine(
      io.Source
      .fromFile(alphabetFile)
      .getLines()
      .toSeq)
      .zipWithIndex
      .map(i => i._1 -> i._2)
      .toMap

    // parse input file and write it output
    io.Source
      .fromFile(inputFile)
      .getLines()
      .grouped(4)
      .map(i => parseLine(i, alphabet))
      .foreach(i => pw.println(i.mkString("")))

    pw.close()
  }

  def parseLine(lines: Seq[String], template: Map[String, Int]): Array[Int] = {
    val digits = parseLine(lines, 0)
    val result = digits.map(i => Try(template(i)))
    result.map(i => i.getOrElse(-1))
  }

  def parseLine(lines: Seq[String], index: Int = 0): Array[String] = {
    if(index + 3 > lines.head.length) Array()
    else {
       val key = Range(0, 3).map(i => lines(i).substring(index, index + 3))
       Array(key.mkString(",")) ++ parseLine(lines, index + 3)
    }
  }
}
