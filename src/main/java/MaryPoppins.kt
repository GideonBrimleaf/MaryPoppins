import io.javalin.Javalin

fun main(){
    val app = Javalin.create {
        it.addStaticFiles("/public")
    }.start(7000)

    app.routes {
        app.get("/") { ctx -> ctx.render("templates/index.peb", mapOf("message" to "I'm Mary Poppins Y'All!")) }
        app.get("/speak-chewie") { ctx -> ctx.render("templates/speakChewie.peb") }
        app.get("/textie") { ctx -> ctx.result("I'm Mary Poppins Y'All!") }
        app.get("/jsonarama") {ctx -> ctx.json(mapOf("data" to "I'm Mary Poppins Y'All"))}
    }
}