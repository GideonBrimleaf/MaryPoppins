import io.javalin.Javalin

fun main(){
    val app = Javalin.create {
        it.addStaticFiles("/public")
    }.start(7000)

    app.routes {
        app.get("/") { ctx -> ctx.result("I'm Mary Poppins Y'All!") }
    }
}