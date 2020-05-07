package models

class Wrestler(val name: String, val age: Int, var finisher: String) {
    fun yell(): String {
        return "I'm $name Y'All!"
    }
}