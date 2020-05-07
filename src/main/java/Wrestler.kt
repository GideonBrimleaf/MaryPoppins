class Wrestler(val name: String, val age: Int, var finisher: String) {
    fun finishHim(): String {
        return "Oh my God = $name has done a $finisher"
    }
}